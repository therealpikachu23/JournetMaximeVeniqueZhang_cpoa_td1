package Application;

import java.sql.*;

public class Categorie {
    
    public static void add(int id_categorie, String titre, String visuel){
        try {
            Connection laConnexion = Connexion.creeConnexion();
            Statement requete= laConnexion.createStatement();
            String query="INSERT INTO categorie VALUES("+id_categorie+",'"+titre+"', '"+visuel+"')";
            requete.executeUpdate(query);
            System.out.println("Ligne de categorie ajoutee");
        } catch(SQLException sqle){
            System.out.println("Probleme select:" +sqle.getMessage());
        }
    }

    public static void delete(int id_categorie){
    	try {
            Connection laConnexion = Connexion.creeConnexion();
            Statement requete= laConnexion.createStatement();
            String query="delete from categorie where id_categorie="+id_categorie;
            requete.executeUpdate(query);
            System.out.println("categorie supprimee");
        	} catch(SQLException sqle){
            System.out.println("Probleme select:" +sqle.getMessage());
            }  
        }

    public static void update(int id_categorie){
        try {
            Connection laConnexion = Connexion.creeConnexion();
            Statement requete= laConnexion.createStatement();
            String query="update from categorie";
            requete.executeUpdate(query);
            System.out.println("Ligne de categorie mise a jour");
        	} catch(SQLException sqle){
            System.out.println("Probleme select:" +sqle.getMessage());
        	}  
    }

}