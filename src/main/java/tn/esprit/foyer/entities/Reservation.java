package tn.esprit.foyer.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
@Entity
public class Reservation {
    @Id
    private long idReservation;
    private Date anneUniversitaire;
    private boolean estValide;
    @ManyToMany
    private List<Etudiant>etudiants;
}
