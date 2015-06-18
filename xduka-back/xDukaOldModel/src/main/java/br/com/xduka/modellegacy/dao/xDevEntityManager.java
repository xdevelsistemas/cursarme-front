package br.com.xduka.modellegacy.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by clayton on 06/06/15.
 */
public class xDevEntityManager {

    //TODO analisar se e possivel verificar se a conexao esta aberta antes de realizar a persistencia
    public static EntityManager em() throws Exception{
        return em("default");
    }

    public static EntityManager em(String name) throws Exception{
        Map properties = new HashMap();
        try {
            properties.put("hibernate.dialect", getProp("db."+ name  +".dialect"));
            properties.put("javax.persistence.jdbc.driver", getProp("db."+ name +".driver"));
            properties.put("javax.persistence.jdbc.url", getProp("db."+ name +".url"));
            properties.put("javax.persistence.jdbc.user", getProp("db."+ name +".user"));
            properties.put("javax.persistence.jdbc.password", getProp("db."+ name +".password"));
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }

        return Persistence.createEntityManagerFactory("default",properties).createEntityManager();
    }




    private static String getProp(String key) throws Exception{
        String value = System.getProperty(key);
        if (value.equals("")){
            throw new Exception("key missing: " + key);
        }else{
            return value;
        }
    }
}
