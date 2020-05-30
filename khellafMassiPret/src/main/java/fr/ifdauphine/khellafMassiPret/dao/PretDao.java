package fr.ifdauphine.khellafMassiPret.dao;

import fr.ifdauphine.khellafMassiPret.model.Pret;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PretDao extends JpaRepository<Pret,Integer> {

    Pret findById(int id);
}
