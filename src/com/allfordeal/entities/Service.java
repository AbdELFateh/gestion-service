/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allfordeal.entities;

/**
 *
 * @author fatouh
 */
public class Service {
    private int idService;
     private String nom;
    private String categorie;
    private String description;
    private boolean validation;
    private int nbPoint;
    private String difficulte;

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isValidation() {
        return validation;
    }

    public void setValidation(boolean validation) {
        this.validation = validation;
    }

    public int getNbPoint() {
        return nbPoint;
    }

    public void setNbPoint(int nbPoint) {
        this.nbPoint = nbPoint;
    }

    public String getDifficulte() {
        return difficulte;
    }

    public void setDifficulte(String difficulte) {
        this.difficulte = difficulte;
    }

    public Service(String nom, String categorie, String description, String difficulte) {
        this.nom = nom;
        this.categorie = categorie;
        this.description = description;
        this.difficulte = difficulte;
    }

    public Service(int idService, String nom, String categorie, String description, String difficulte) {
        this.idService = idService;
        this.nom = nom;
        this.categorie = categorie;
        this.description = description;
        this.difficulte = difficulte;
    }

    public Service(int idService, String nom, String categorie, String description, boolean validation, int nbPoint, String difficulte) {
        this.idService = idService;
        this.nom = nom;
        this.categorie = categorie;
        this.description = description;
        this.validation = validation;
        this.nbPoint = nbPoint;
        this.difficulte = difficulte;
    }
    
    
    public Service() {
    }

    @Override
    public String toString() {
        return "Service{" + "nom=" + nom + ", categorie=" + categorie + ", description=" + description + ", validation=" + validation + ", nbPoint=" + nbPoint + ", difficulte=" + difficulte + '}';
    }
}
