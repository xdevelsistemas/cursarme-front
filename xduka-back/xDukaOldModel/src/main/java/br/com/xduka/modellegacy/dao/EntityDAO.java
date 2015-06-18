package br.com.xduka.modellegacy.dao;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by clayton on 30/10/14.
 */
public class EntityDAO <T extends Object>  {


    protected final Class<T> classType;
    protected final T metaclass;
    protected final EntityManager em;
    protected final CriteriaBuilder cb;


    protected EntityDAO(Class<T> classType,EntityManager em) throws Exception{

        this.em = em;
        this.cb = this.em.getCriteriaBuilder();
        this.classType = classType;
        try {
            this.metaclass = classType.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }




    public List<T> all() {
        CriteriaQuery<T> cq = cb.createQuery(classType);
        return this.em.createQuery(cq).getResultList();
    }







//    public T findOne(Object pk) {
//        CriteriaQuery<T> cq = cb.createQuery(classType);
//        Root<T> root = cq.from(classType);
//        cq.where(cb.equal(root.get("uuid"),id.toString().toUpperCase()));
//        try {
//            return em.createQuery(cq).getSingleResult();
//        } catch (javax.persistence.NoResultException e) {
//            return null;
//        }
//    }



    public <A> List<T> findManyUnidade(String field, A value , int codUnidade) {
        CriteriaQuery<T> cq = cb.createQuery(classType);
        Root<T> root = cq.from(classType);
        cq.where(cb.and(cb.equal(root.get(field), value), (cb.equal(root.get("codUnidade"), codUnidade))));
        return em.createQuery(cq).getResultList();
    }


    public <A> List<T> findMany(String field, A value) {
        CriteriaQuery<T> cq = cb.createQuery(classType);
        Root<T> root = cq.from(classType);
        cq.where(cb.equal(root.get(field), value));
        return em.createQuery(cq).getResultList();
    }



    public T insert(T o){
        em.persist(o);
        return o;

    }

    public T update(T o){
        return em.merge(o);
    }

    public void delete(T o) {
        if (o != null) {
            em.remove(o);
            em.flush();
        }

    }
}
