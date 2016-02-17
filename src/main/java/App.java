import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap<String, Object>model =  new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/tamagotchi", (request, response) -> {
      HashMap<String, Object>model = new HashMap<String, Object>();
      String tamagotchiName = request.queryParams("petName");
      Tamagotchi newTamagotchi = new Tamagotchi(tamagotchiName);
      request.session().attribute("tamagotchi", newTamagotchi);
      model.put("tamagotchi", newTamagotchi);
      model.put("template", "templates/tamagotchi.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/feed", (request, response) -> {
      HashMap<String, Object>model = new HashMap<String, Object>();
      Tamagotchi tempTamagotchi = request.session().attribute("tamagotchi");
      tempTamagotchi.feedPet();
      tempTamagotchi.timePasses();
      request.session().attribute("tamagotchi", tempTamagotchi);
      model.put("tamagotchi", tempTamagotchi);
      model.put("template", "templates/game.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/play", (request, response) -> {
      HashMap<String, Object>model = new HashMap<String, Object>();
      Tamagotchi tempTamagotchi = request.session().attribute("tamagotchi");
      tempTamagotchi.playPet();
      tempTamagotchi.timePasses();
      request.session().attribute("tamagotchi", tempTamagotchi);
      model.put("tamagotchi", tempTamagotchi);
      model.put("template", "templates/game.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/rest", (request, response) -> {
      HashMap<String, Object>model = new HashMap<String, Object>();
      Tamagotchi tempTamagotchi = request.session().attribute("tamagotchi");
      tempTamagotchi.restPet();
      tempTamagotchi.timePasses();
      request.session().attribute("tamagotchi", tempTamagotchi);
      model.put("tamagotchi", tempTamagotchi);
      model.put("template", "templates/game.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
