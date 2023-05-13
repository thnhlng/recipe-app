package ch.guru.recipeapp.repositories;

import ch.guru.recipeapp.domain.Category;
import ch.guru.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
