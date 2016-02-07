/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allfordeal.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fatouh
 */
public class MyConnexion {
     private static Connection connection;
    private String url="jdbc:mysql://localhost:3306/dbdeal";
    private String login="root";
    private String pwd="";
   private  MyConnexion()
   {
        try {
            Class.forName("com.mysql.jdbc.Driver");
          connection=DriverManager.getConnection(url, login, pwd) ; 
        } catch (SQLException ex) {
            Logger.getLogger(MyConnexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur des paramètres");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyConnexion.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("chargement de driver failed ");
        }
   }
   public static Connection getInstance()
   {if(connection==null) new MyConnexion();
       
       return connection;}
}
