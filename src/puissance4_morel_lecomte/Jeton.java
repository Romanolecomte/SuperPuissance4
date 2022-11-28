package puissance4_morel_lecomte;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author romai
 */
public class Jeton {
    
    private String couleur;

    public Jeton(String couleur) {
        this.couleur = couleur;
    }
    
    public String getCouleur() {
        return couleur;
    }
    
    @Override
    public String toString() {
        
        if (couleur == "rouge"){
            System.out.println("R");
        }
        else{
            System.out.println("J");
        }
        return "Jeton{" + "couleur du jeton =" + couleur + '}';
    }
    
    
    
    
    
    
    
}

