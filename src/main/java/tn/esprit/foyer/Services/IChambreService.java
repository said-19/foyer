package tn.esprit.foyer.Services;

import tn.esprit.foyer.entities.Chambre;

import java.util.List;

public interface IChambreService {

    public List<Chambre>getAllChambres();
    public Chambre addChambre(Chambre chambre);
    public Chambre updateChambre  (Chambre chambre);
    public void deleteChambre(long idChambre);
    public Chambre getChambreById(long idChambre);
}
