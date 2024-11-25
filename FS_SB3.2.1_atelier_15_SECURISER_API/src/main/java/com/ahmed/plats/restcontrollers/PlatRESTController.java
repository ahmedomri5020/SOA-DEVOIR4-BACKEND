package com.ahmed.plats.restcontrollers;

import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ahmed.plats.entities.Plat;
import com.ahmed.plats.service.PlatService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class PlatRESTController {
	@Autowired
	PlatService produitService;

	@GetMapping("/auth")
	Authentication getAuth(Authentication auth)
	{
		return auth;
	}

	@RequestMapping(path="all",method =RequestMethod.GET)
	public List<Plat> getAllPlats() {
		return produitService.getAllPlats();
	 } 		
	
	@RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
	//@GetMapping("/getbyid/{id}")
	public Plat getPlatById(@PathVariable("id") Long id) {
		return produitService.getPlat(id);
    }
	
	@RequestMapping(value="/addplat",method = RequestMethod.POST)
	//@PostMapping("/addplat")
	public Plat createProduit(@RequestBody Plat produit) {
		return produitService.savePlat(produit);
	}

	@RequestMapping(value="/updateplat",method = RequestMethod.PUT)
	//@PutMapping("/updateplat")
	public Plat updateProduit(@RequestBody Plat produit) {
		return produitService.updatePlat(produit);
	}

	@RequestMapping(value="/delplat/{id}",method = RequestMethod.DELETE)
	//@DeleteMapping("/delplat/{id}")
	public void deleteProduit(@PathVariable("id") Long id)
	{
		produitService.deletePlatById(id);
	}
	
	@RequestMapping(value="/platpays/{idPays}",method = RequestMethod.GET)
	public List<Plat> getProduitsByCatId(@PathVariable("idPays") Long idCat) {
		return produitService.findByPaysIdCat(idCat);
	 }


}
