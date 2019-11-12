package com.mexpedition.microserviceexpedition.dao;

import com.mexpedition.microserviceexpedition.model.Expedition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpeditionDao extends JpaRepository<Expedition, Integer> {

}
