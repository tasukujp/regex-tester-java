package controllers;

import play.mvc.*;

import views.html.*;

/**
 * RegexController
 * @author tasukujp
 */
public class RegexController extends ApplicationController {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render(webJarAssets, "Your new application is ready."));
    }

}
