package controllers

import models.br.com.xduka.modellegacy._
import play.api._
import play.api.mvc._
import play.db.jpa.{JPA, Transactional}


object Application extends Controller {


  @Transactional
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

}