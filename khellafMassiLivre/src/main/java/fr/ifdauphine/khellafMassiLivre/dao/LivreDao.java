package fr.ifdauphine.khellafMassiLivre.dao;
import fr.ifdauphine.khellafMassiLivre.model.Livre;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface LivreDao  extends JpaRepository<Livre, Integer>{
    Livre findById(int id);
}
