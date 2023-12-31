package guru.springframework.spring5recipeapp.controllers;

import guru.springframework.spring5recipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {


    private final RecipeService recipeServices;

    public IndexController(RecipeService recipeServices) {
        this.recipeServices = recipeServices;
    }

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(Model model)
    {
        log.debug("Getting Index page");

        model.addAttribute("recipes", recipeServices.getRecipes());

        return "index";
    }


}
