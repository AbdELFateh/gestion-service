/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allfordeal.interfaces;

import com.allfordeal.entities.Service;
import java.util.List;


/**
 *
 * @author fatouh
 */
public interface IServiceDAO {
    public void addService(Service s);
    public void removeService(int id);   
    public void updateService(Service s);
    public Service findServiceById(int id);
    public List<Service> findServiceByNom(String nom );
    public List<Service> findServiceByCategorie( String categorie);
    public List<Service> findServiceInvalid( );
    public List<Service> findServicePoint( int point);
    public List<Service> findServiceDifficulte(String Difficulte);
    public List<Service> findServiceValid( );
    public List<Service> findAll( );
}
