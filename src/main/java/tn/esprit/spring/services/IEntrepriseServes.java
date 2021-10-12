package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Entreprise;

public interface IEntrepriseServes {
	List<Entreprise> retrieveAllEntreprise(); 
	Entreprise addEntreprise(Entreprise en);
	void deleteEntreprise(int id);
	
}

