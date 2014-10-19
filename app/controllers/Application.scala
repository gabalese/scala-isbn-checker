package controllers

import model.Isbn
import play.api._
import play.api.mvc._
import controllers._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }


  def check(isbn: String) = Action {
    val isbn_to_check: Isbn = new Isbn(isbn)
    if (isbn_to_check.isValid) Ok("True")
      else Ok("False")
  }

}