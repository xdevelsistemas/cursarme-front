package controllers;

import models.br.com.xduka.modellegacy.*;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.mvc.*;

/**
 * Created by clayton on 03/12/14.
 */


public class Persistence extends Controller {
    @Transactional
    public static Result index(){

        AcdAlunoPK pk = new AcdAlunoPK();
        pk.setCodUnidade(215);
        pk.setMatrícula(2154404);
        String  saida = ((Integer)JPA.em().find(AcdAluno.class,pk).getCodUnidade()).toString();
        return ok(views.html.index.render(saida));
    }
}
