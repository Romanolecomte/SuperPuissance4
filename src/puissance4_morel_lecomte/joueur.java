package puissance4_morel_lecomte;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leamo
 */
public class joueur {
    private String nom;
    private String couleur;
    private ArrayList<Jeton> reserveJetons;
    public int nombreJetonsRestants;
    public int nombreDesintegrateurs;    
    
    public joueur (String Nom){
        nom=Nom;
    }
    
    public void affecterCouleur(String lacouleur){
        couleur=lacouleur;
    }
    
    public void ajouterJeton(Jeton jeton){
        reserveJetons.add(jeton);
    } 
    
    public void obtenirDesintegrateur(){
        
    }
}


     

