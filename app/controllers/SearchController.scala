package controllers

import io.ebean.Ebean
import io.ebean.EbeanServer
import play.api.mvc.Controller
import play.api.mvc.Action
import play.api.mvc.Result

/**
  * Search login
  */
class SearchController extends Controller {

  // get /search/user
  def doGetSearch = Action { implicit request =>
    try {
      request.getQueryString("q") match {
        case Some(q) =>
          Ok(q)
        case None =>
          InternalServerError("oops")
      }

    } catch {
      case ex: Exception =>
        System.out.println(ex.getMessage)
        InternalServerError("oops")
    }
  }
}
