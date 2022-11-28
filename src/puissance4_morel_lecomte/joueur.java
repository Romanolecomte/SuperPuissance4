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
    //public int nombreJetonsRestants;
    private int nombreDesintegrateurs;    
    
    public joueur (String Nom){
        nom=Nom;
        nombreDesintegrateurs=0;
    }
    
    public void affecterCouleur(String lacouleur){
        couleur=lacouleur;
    }
    
    public void nombreDeJetons(){
        int var;
        var=reserveJetons.size();
        return var;
    }
    
    public void ajouterJeton(Jeton jeton){
        reserveJetons.add(jeton);
    } 
    
    public void jouerJeton(){
        
    }
    
    public void obtenirDesintegrateur(){
        
    }
}


     

