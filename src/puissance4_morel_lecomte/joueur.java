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
    private ArrayList<Jeton> reserveJetons=new ArrayList<Jeton>();
    private int nombreDesintegrateurs;    
    

    
    public joueur (String Nom){
        nom=Nom;
        nombreDesintegrateurs=0;
    }
    
    public void affecterCouleur(String lacouleur){
        couleur=lacouleur;
    }
    
    public int nombreDeJetons(){
        int var;
        var=reserveJetons.size();
        return var;
    }
    
    public void ajouterJeton(Jeton jeton){
        reserveJetons.add(jeton);
    } 
    
    public void jouerJeton(){
         reserveJetons.remove(0);
    }
    
    public void obtenirDesintegrateur(){
        nombreDesintegrateurs+=1;
    }
    
    public boolean utiliserDesintegrateur(){
        if(nombreDesintegrateurs>0){           
        nombreDesintegrateurs-=1;
        return true;       
    }
        else{
            return false;
                 }
}

    public String getCouleur() {
        return couleur;
    }
    
    
}

     

