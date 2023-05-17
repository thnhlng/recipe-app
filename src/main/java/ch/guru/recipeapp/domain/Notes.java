package ch.guru.recipeapp.domain;

import jakarta.persistence.*;
import lombok.*;

@Data
@EqualsAndHashCode(exclude = {"recipe"}) //will exclude property
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne //here no cascade because if delete note we dont want to delete recipe
    private Recipe recipe;
    @Lob //normally max 250 character allowed but with lob more possible
    private String recipeNotes;

}
