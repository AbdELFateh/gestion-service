/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allfordeal.DAO;

import com.allfordeal.entities.Service;
import com.allfordeal.interfaces.IServiceDAO;
import com.allfordeal.utils.MyConnexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fatouh
 */
public class ServiceDAO implements IServiceDAO{
 
    private Connection cnx;
    public ServiceDAO(){
        this.cnx=MyConnexion.getInstance();
    }
    @Override
    public void addService(Service s) {
        String req ="insert into service (nom,categorie,description,difficulte) values (?,?,?,?)";
        try {
            PreparedStatement ps=cnx.prepareStatement(req);
            ps.setString(1, s.getNom());
            ps.setString(2, s.getCategorie());
            ps.setString(3, s.getDescription());
            ps.setString(4, s.getDifficulte());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }

    @Override
    public void removeService(int id) {
    String req ="DELETE FROM service Where idService=?";
    
        try {
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    @Override
    public void updateService(Service s) {
     String req="update service set nom=?,categorie=?,description=?,difficulte=? where idService=?";
     
        try {
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setString(1,s.getNom() );
            ps.setString(2,s.getCategorie());
            ps.setString(3, s.getDescription());
            ps.setString(4, s.getDifficulte());
            ps.setInt(5, s.getIdService());
            ps.executeUpdate();
            System.out.println("la mise à jour a était effectuer avec succes");
        } catch (SQLException ex) {
            Logger.getLogger(ServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

   
    @Override
    public Service findServiceById(int id) {
       
       Service s=new Service();
        try {
            String req="select * from service where idService=?";
            
            PreparedStatement ps =cnx.prepareStatement(req);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
              s.setIdService(rs.getInt(1));
              s.setCategorie(rs.getString(3));
              s.setDescription(rs.getString(4));
              s.setDifficulte(rs.getString(7));
              s.setNom(rs.getString(2));
              s.setNbPoint(rs.getInt(6));
              s.setValidation(rs.getBoolean(5));
              
              
              
                            

            }
        
              return s;
        } catch (SQLException ex) {
            Logger.getLogger(ServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
        
    }

    @Override
    public List<Service> findServiceByNom(String nom) {
      List<Service> lst =new ArrayList<>();
        try {
            String req="select * from service where nom=?";
            
            PreparedStatement ps =cnx.prepareStatement(req);
            ps.setString(1, nom);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Service s = new Service();
              s.setIdService(rs.getInt(1));
              s.setCategorie(rs.getString(3));
              s.setDescription(rs.getString(4));
              s.setDifficulte(rs.getString(7));
              s.setNom(rs.getString(2));
              s.setNbPoint(rs.getInt(6));
              s.setValidation(rs.getBoolean(5));
             lst.add(s);
            }
        
              return lst;
        } catch (SQLException ex) {
            Logger.getLogger(ServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public List<Service> findServiceByCategorie(String categorie) {
          List<Service> lst =new ArrayList<>();
        try {
            String req="select * from service where categorie=?";
            
            PreparedStatement ps =cnx.prepareStatement(req);
            ps.setString(1, categorie);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Service s = new Service();
              s.setIdService(rs.getInt(1));
              s.setCategorie(rs.getString(3));
              s.setDescription(rs.getString(4));
              s.setDifficulte(rs.getString(7));
              s.setNom(rs.getString(2));
              s.setNbPoint(rs.getInt(6));
              s.setValidation(rs.getBoolean(5));
             lst.add(s);
            }
        
              return lst;
        } catch (SQLException ex) {
            Logger.getLogger(ServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public List<Service> findServiceInvalid() {
         List<Service> lst =new ArrayList<>();
        try {
            String req="select * from service where validation=?";
            
            PreparedStatement ps =cnx.prepareStatement(req);
            ps.setBoolean(1, false );
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Service s = new Service();
              s.setIdService(rs.getInt(1));
              s.setCategorie(rs.getString(3));
              s.setDescription(rs.getString(4));
              s.setDifficulte(rs.getString(7));
              s.setNom(rs.getString(2));
              s.setNbPoint(rs.getInt(6));
              s.setValidation(rs.getBoolean(5));
             lst.add(s);
            }
        
              return lst;
        } catch (SQLException ex) {
            Logger.getLogger(ServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public List<Service> findServicePoint(int point) {
               List<Service> lst =new ArrayList<>();
        try {
            String req="select * from service where nbPoints=?";
            
            PreparedStatement ps =cnx.prepareStatement(req);
            ps.setInt(1, point );
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Service s = new Service();
              s.setIdService(rs.getInt(1));
              s.setCategorie(rs.getString(3));
              s.setDescription(rs.getString(4));
              s.setDifficulte(rs.getString(7));
              s.setNom(rs.getString(2));
              s.setNbPoint(rs.getInt(6));
              s.setValidation(rs.getBoolean(5));
             lst.add(s);
            }
        
              return lst;
        } catch (SQLException ex) {
            Logger.getLogger(ServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public List<Service> findServiceDifficulte(String Difficulte) {
               List<Service> lst =new ArrayList<>();
        try {
            String req="select * from service where difficulte=?";
            
            PreparedStatement ps =cnx.prepareStatement(req);
            ps.setString(1, Difficulte );
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Service s = new Service();
              s.setIdService(rs.getInt(1));
              s.setCategorie(rs.getString(3));
              s.setDescription(rs.getString(4));
              s.setDifficulte(rs.getString(7));
              s.setNom(rs.getString(2));
              s.setNbPoint(rs.getInt(6));
              s.setValidation(rs.getBoolean(5));
             lst.add(s);
            }
        
              return lst;
        } catch (SQLException ex) {
            Logger.getLogger(ServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
       @Override
    public List<Service> findServiceValid() {
         List<Service> lst =new ArrayList<>();
        try {
            String req="select * from service where validation=?";
            
            PreparedStatement ps =cnx.prepareStatement(req);
            ps.setBoolean(1, true );
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Service s = new Service();
              s.setIdService(rs.getInt(1));
              s.setCategorie(rs.getString(3));
              s.setDescription(rs.getString(4));
              s.setDifficulte(rs.getString(7));
              s.setNom(rs.getString(2));
              s.setNbPoint(rs.getInt(6));
              s.setValidation(rs.getBoolean(5));
             lst.add(s);
            }
        
              return lst;
        } catch (SQLException ex) {
            Logger.getLogger(ServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public List<Service> findAll() {
     List<Service> lst =new ArrayList<>();
        try {
            String req="select * from service";
            
            PreparedStatement ps =cnx.prepareStatement(req);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Service s = new Service();
              s.setIdService(rs.getInt(1));
              s.setCategorie(rs.getString(3));
              s.setDescription(rs.getString(4));
              s.setDifficulte(rs.getString(7));
              s.setNom(rs.getString(2));
              s.setNbPoint(rs.getInt(6));
              s.setValidation(rs.getBoolean(5));
             lst.add(s);
            }
        
              return lst;
        } catch (SQLException ex) {
            Logger.getLogger(ServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }  
    }
    
}
