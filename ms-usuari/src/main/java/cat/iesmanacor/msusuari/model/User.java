package cat.iesmanacor.msusuari.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
public @Data class User {

    @Id
    @Column(name = "id_user")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nom")
    private String name;

    @Column(name = "cognoms")
    private String surname;
}
