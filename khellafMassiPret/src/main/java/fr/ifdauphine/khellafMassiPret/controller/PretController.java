package fr.ifdauphine.khellafMassiPret.controller;

import fr.ifdauphine.khellafMassiPret.dao.PretDao;
import fr.ifdauphine.khellafMassiPret.model.Pret;
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
public class PretController {

    @Autowired
    private PretDao pretDao;

    //Prets
    @GetMapping(value = "/Prets")
    public List<Pret> afficherPrets(){
        return pretDao.findAll();
    }

    //Lecteurs/{id}
    @GetMapping(value = "Prets/{id}")
    public Pret afficherUnPret(@PathVariable int id){
        return pretDao.findById(id);
    }

    @PostMapping(value = "/Prets")
    public ResponseEntity<Void> ajouterPret(Pret Pret){

        Pret Pret1 = pretDao.save(Pret);

        if (Pret==null){
            return ResponseEntity.noContent().build();
        }

        URI location = ServletUriComponentsBuilder.
                        fromCurrentRequest().
                        path("/{id}").buildAndExpand(Pret1.getId()).toUri();
        return ResponseEntity.created(location).build();
    }
}
