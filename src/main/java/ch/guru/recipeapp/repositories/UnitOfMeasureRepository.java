package ch.guru.recipeapp.repositories;

import ch.guru.recipeapp.domain.Recipe;
import ch.guru.recipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
