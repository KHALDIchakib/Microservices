package fr.ifdauphine.khellafMassiLecteur.controller;

import fr.ifdauphine.khellafMassiLecteur.dao.LecteurDao;
import fr.ifdauphine.khellafMassiLecteur.model.Lecteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class LecteurController {

    @Autowired
    private LecteurDao lecteurDao;

    //Lecteurs
    @GetMapping(value = "/Lecteurs")
    public List<Lecteur> afficherLecteurs(){
        return lecteurDao.findAll();
    }

    //Lecteurs/{id}
    @GetMapping(value = "Lecteurs/{id}")
    public Lecteur afficherUnLecteur(@PathVariable int id){
        return lecteurDao.findById(id);
    }

    @PostMapping(value = "/Lecteurs")
    public ResponseEntity<Void> ajouterLcteur(Lecteur lecteur){

        Lecteur lecteur1 = lecteurDao.save(lecteur);

        if (lecteur==null){
            return ResponseEntity.noContent().build();
        }

        URI location = ServletUriComponentsBuilder.
                        fromCurrentRequest().
                        path("/{id}").buildAndExpand(lecteur1.getId()).toUri();
        return ResponseEntity.created(location).build();
    }
}
