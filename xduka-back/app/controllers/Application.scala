package controllers

import br.com.xduka.modellegacy.dao._
import play.api._
import play.api.mvc._


object Application extends Controller {


  def index = Action {
    val em = xDevEntityManager.em()
    val alunoDAO = new AcdAlunoDAO(em)
    val x = alunoDAO.all()
    em.close()




    Ok(views.html.index("Your new application is ready."))
  }

}