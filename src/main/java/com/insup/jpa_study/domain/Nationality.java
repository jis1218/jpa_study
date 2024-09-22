package com.insup.jpa_study.domain;

import jakarta.persistence.*;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.BatchSize;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
public class Nationality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    @OneToMany(mappedBy = "nationality")
    @BatchSize(size = 10)
    private List<Player> players;

    @Enumerated(EnumType.STRING)
    private Continent continent;

}
