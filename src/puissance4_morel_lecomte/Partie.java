package puissance4_morel_lecomte;

import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author leamo
 */
public class Partie {

    private joueur[] listeJoueurs;
    private joueur joueurCourant;
    private PlateauDeJeu plateau;

    public Partie(joueur Joueur1, joueur Joueur2) {
        listeJoueurs[0] = Joueur1;
        listeJoueurs[1] = Joueur2;
        // new plateau();
    }

    public void attribuerCouleurAuxJoueurs(joueur Joueur1, joueur Joueur2) {
        Random rand = new Random();
        int max = 2;
        int min = 1;
        int var = rand.nextInt(max - min + 1) + min;
        if (var == 1) {
            Joueur1.affecterCouleur("jaune");
            Joueur2.affecterCouleur("rouge");       
        }
        else{
            Joueur1.affecterCouleur("rouge");
            Joueur2.affecterCouleur("jaune");  
        }
    }
    
    public void creerEtAffecterJeton(joueur Joueur){
        String couleur_joueur=Joueur.getCouleur();
        for(int i=0;i<30;i++){
           Jeton jeton_joueur=  new Jeton(couleur_joueur);
           Joueur.ajouterJeton(jeton_joueur);
        }       
    }
    
    //public void
}
