package com.calculator.frasefilmes.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "frases")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FrasesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String frase;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String personagem;

    @Column(nullable = false)
    private String poster;
}
