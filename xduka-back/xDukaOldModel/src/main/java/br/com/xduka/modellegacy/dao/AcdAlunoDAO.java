package br.com.xduka.modellegacy.dao;

import br.com.xduka.modellegacy.entities.AcdAluno;

import javax.persistence.EntityManager;

/**
 * Created by clayton on 03/12/14.
 */
public class AcdAlunoDAO extends EntityDAO<AcdAluno>  {
    public AcdAlunoDAO(EntityManager em) throws Exception{
        super(AcdAluno.class,em);
    }
}
