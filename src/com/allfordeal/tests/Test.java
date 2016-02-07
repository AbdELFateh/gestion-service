/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allfordeal.tests;

import com.allfordeal.DAO.ServiceDAO;
import com.allfordeal.entities.Service;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fatouh
 */
public class Test {
      public static void main(String[] args) {
        
     Service s = new Service("rapide", "etud", "excellent", "moyenne");
     Service s1 = new Service(6, "lente", "bida", "qqqq", "faciles");
     Service s2 = new Service("lavage", "bida", "ay hkaya", "faciles");
          
     ServiceDAO iservice = new ServiceDAO();
          
     //iservice.addService(s);
     
     //iservice.removeService(7);
     //iservice.updateService(s1);
     //System.out.println(iservice.findServiceById(6));
       List<Service> lst = new ArrayList<>();  
     //lst=iservice.findServiceByNom("lente");
      // lst = iservice.findServiceByCategorie("bida");
       //lst = iservice.findServicePoint(100);
      // lst = iservice.findServiceDifficulte("faciles");
       //lst = iservice.findServiceInvalid();
       //lst = iservice.findServiceValid();
       lst = iservice.findAll();
          for (Service lst1 : lst) {
              System.out.println(lst1);
          }
    }
}
