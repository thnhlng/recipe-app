package ch.guru.recipeapp.domain;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;

    @ManyToOne //no cascade because when deleting ingredient, recipe should not be deleted
    private Recipe recipe;

    @OneToOne(fetch = FetchType.EAGER) //uom will be loaded everytime ingredient is loaded
    private UnitOfMeasure unitOfMeasure;


    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom) {
        this.description = description;
        this.amount = amount;
        this.unitOfMeasure = uom;
    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom, Recipe recipe) {
        this.description = description;
        this.amount = amount;
        this.unitOfMeasure = uom;
        this.recipe = recipe;
    }

}
