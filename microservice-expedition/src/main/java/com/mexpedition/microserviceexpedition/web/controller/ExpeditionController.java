package com.mexpedition.microserviceexpedition.web.controller;

import com.mexpedition.microserviceexpedition.dao.ExpeditionDao;
import com.mexpedition.microserviceexpedition.model.Expedition;
import com.mexpedition.microserviceexpedition.web.exception.ExpeditionNotFoundException;
import com.mexpedition.microserviceexpedition.web.exception.ImpossibleAjouterExpeditionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ExpeditionController {
    @Autowired
    ExpeditionDao expeditionDao;
    @PostMapping(value = "/expeditions")
    public ResponseEntity<Expedition> ajouterExpedition(@RequestBody Expedition expedition) throws ImpossibleAjouterExpeditionException {

        Expedition nouvelleExpedition = expeditionDao.save(expedition);

        if(nouvelleExpedition == null) throw new ImpossibleAjouterExpeditionException("Impossible d'ajouter cette expedition");

        return new ResponseEntity<Expedition>(expedition, HttpStatus.CREATED);
    }

    @GetMapping(value = "/expeditions/{id}")
    public Optional<Expedition> recupererUneExpedition(@PathVariable int id){

        Optional<Expedition> expedition = expeditionDao.findById(id);

        if(!expedition.isPresent()) throw new ExpeditionNotFoundException("Cette expedition n'existe pas");

        return expedition;
    }
    @PutMapping(value = "/expeditions")
    public void updateExpedition(@RequestBody Expedition expedition) {

        expeditionDao.save(expedition);
    }
}



