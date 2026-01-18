package tn.esprit.foyer.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer.entities.Chambre;
import tn.esprit.foyer.repositories.ChambreRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreService {


    ChambreRepository chrep;

    @Override
    public List<Chambre> getAllChambres() {
        return chrep.findAll();
    }

    @Override
    public Chambre addChambre(Chambre chambre) {
        return null;
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return null;
    }

    @Override
    public void deleteChambre(long idChambre) {

    }

    @Override
    public Chambre getChambreById(long idChambre) {
        return null;
    }
}
