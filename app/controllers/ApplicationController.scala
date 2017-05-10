package controllers

import play.api.mvc.{Action, Controller}
import play.api.mvc.Results._

class ApplicationController extends Controller {
  val pageNotFound = NotFound(<h1>Page not found</h1>)

  def index = Action {
    Ok(views.html.page.index())
  }
  def how_it_works = Action {
    Ok(views.html.page.how_it_works())
  }
}