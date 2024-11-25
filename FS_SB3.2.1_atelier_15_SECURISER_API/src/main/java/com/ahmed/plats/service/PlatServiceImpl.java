package com.ahmed.plats.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahmed.plats.entities.Pays;
import com.ahmed.plats.entities.Plat;
import com.ahmed.plats.repos.PlatRepository;

@Service
public class PlatServiceImpl implements PlatService {

	@Autowired
	PlatRepository produitRepository;
	
	@Override
	public Plat savePlat(Plat p) {
		return produitRepository.save(p);
		
	}

	@Override
	public Plat updatePlat(Plat p) {
		return produitRepository.save(p);
		
	}

	@Override
	public void deletePlat(Plat p) {
		produitRepository.delete(p);

	}

   @Override
	public void deletePlatById(Long id) {
		produitRepository.deleteById(id);
		
	}

	@Override
	public Plat getPlat(Long id) {
		return  produitRepository.findById(id).get();
	
	}

	@Override
	public List<Plat> getAllPlats() {
		return produitRepository.findAll();
	}
	
    @Override
	public List<Plat> findByNomPlat(String nom) {
		return produitRepository.findByNomPlat(nom);
	}

	@Override
	public List<Plat> findByNomPlatContains(String nom) {
		return produitRepository.findByNomPlatContains(nom);
	}

	@Override
	public List<Plat> findByNomPrix(String nom, Double prix) {
		return produitRepository.findByNomPrix(nom, prix);
	}
	
	@Override
	public List<Plat> findByPays(Pays categorie) {
		return produitRepository.findByPays(categorie);
	}

	@Override
	public List<Plat> findByPaysIdCat(Long id) {
		return produitRepository.findByPaysIdPays(id);
	}

	@Override
	public List<Plat> findByOrderByNomPlatAsc() {
		return produitRepository.findByOrderByNomPlatAsc();
	}

	@Override
	public List<Plat> trierPlatsNomsPrix() {
		return produitRepository.trierPlatsNomsPrix();
	}


}
