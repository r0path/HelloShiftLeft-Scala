package controllers

import play.api.mvc.Controller
import play.api.mvc.Action
import play.api.mvc.Result

/**
  * Search controller
  */
class SearchController extends Controller {

  // get /search/user
  def doGetSearch = Action { implicit request =>
    request.getQueryString("q") match {
      case Some(q) => Ok("Search: " + q)
      case None    => NotFound
    }
  }
}
