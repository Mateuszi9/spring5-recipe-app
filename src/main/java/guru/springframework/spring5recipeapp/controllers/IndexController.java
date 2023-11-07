package guru.springframework.spring5recipeapp.controllers;

import guru.springframework.spring5recipeapp.domain.Category;
import guru.springframework.spring5recipeapp.domain.UnitOfMeasure;
import guru.springframework.spring5recipeapp.repositories.CategoryRepository;
import guru.springframework.spring5recipeapp.repositories.UnitOfMeasureRepository;
import guru.springframework.spring5recipeapp.services.RecipeServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;
@Slf4j
@Controller
public class IndexController {


    private final RecipeServices recipeServices;

    public IndexController(RecipeServices recipeServices) {
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
