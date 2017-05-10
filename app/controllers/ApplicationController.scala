package controllers

import play.api.mvc.{Action, Controller}

class ApplicationController extends Controller {
  def index = Action {
    Ok(views.html.page.index())
  }
  def how_it_works = Action {
    Ok(views.html.page.how_it_works())
  }
}
