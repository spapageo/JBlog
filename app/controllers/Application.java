package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
  public static Result index() {
    return ok(main.render(new String("Hello World"),new String("				<div class=\"post\">" + 
					"<h1 class=\"title\"> Title </h1>" +
					"<div class=\"divider\"></div>" +
					"<p class=\"date\">2 April 2010</p>" +
					"<div class=\"divider\"></div>" +
					"<div class=\"post_entry\"" +
					"	<p> Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a Testa asd a </p>" +
					"</div>" +
					"<div class=\"divider\"></div>" +
					"<br />" +
				"</div>")));
  }
  
}