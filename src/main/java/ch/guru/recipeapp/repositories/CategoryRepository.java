package ch.guru.recipeapp.repositories;

import ch.guru.recipeapp.domain.Category;
import ch.guru.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);

}
