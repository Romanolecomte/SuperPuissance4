/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package puissance4_morel_lecomte;

/**
 *
 * @author romai
 */
public class Puissance4_MOREL_LECOMTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        joueur joueur1 = new joueur ("Romain");
        joueur joueur2 = new joueur ("Léa");
        
        Partie partie1 = new Partie (joueur1,joueur2);
        
        partie1.initialiserPartie();
        
        partie1.lancerPartie();
        
       
    }
    
}
