package com.ahmed.plats.service;

import java.util.List;

import com.ahmed.plats.entities.Pays;
import com.ahmed.plats.entities.Plat;

public interface PlatService {
	
	 Plat savePlat(Plat p);
	 Plat updatePlat(Plat p);
	 void deletePlat(Plat p);
     void deletePlatById(Long id);
	 Plat getPlat(Long id);
	 List<Plat> getAllPlats();
	 
	 List<Plat> findByNomPlat(String nom);
	 List<Plat> findByNomPlatContains(String nom);
	 List<Plat> findByNomPrix (String nom, Double prix);
	 List<Plat> findByPays (Pays categorie);
	 List<Plat> findByPaysIdCat(Long id);
	 List<Plat> findByOrderByNomPlatAsc();
	 List<Plat> trierPlatsNomsPrix();

}
