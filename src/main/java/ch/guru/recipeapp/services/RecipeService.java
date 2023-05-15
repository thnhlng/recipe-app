package ch.guru.recipeapp.services;

import ch.guru.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
