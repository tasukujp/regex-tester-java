package controllers;

import play.mvc.Controller;

import javax.inject.Inject;

/**
 * ApplicationController
 * @author tasukujp
 */
public class ApplicationController extends Controller {
    @Inject
    WebJarAssets webJarAssets;
}
