package tn.esprit.foyer.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
@Entity
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre ;
    @Column(unique = true)
    private long numeroChambre;
    @Enumerated(value = EnumType.STRING)
    private TypeChambre TypeC;
    @ManyToOne
    private Bloc bloc;
    @OneToMany
    private List<Reservation>reservations;
}
