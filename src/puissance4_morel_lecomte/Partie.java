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
        int var = rand.nextInt(2);
        if (var == 0) {
            Joueur1.affecterCouleur("jaune");
            Joueur2.affecterCouleur("rouge");
        } else {
            Joueur1.affecterCouleur("rouge");
            Joueur2.affecterCouleur("jaune");
        }
    }

    public void creerEtAffecterJeton(joueur Joueur) {
        String couleur_joueur = Joueur.getCouleur();
        for (int i = 0; i < 30; i++) {
            Jeton jeton_joueur = new Jeton(couleur_joueur);
            Joueur.ajouterJeton(jeton_joueur);
        }
    }

    public void placerTrousNoirsEtDesintegrateurs(PlateauDeJeu plateau){
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {                        
            int var_x = rand.nextInt(7);
            int var_y = rand.nextInt(6);
            if(plateau.presenceTrouNoir(var_x, var_y)==false)
            plateau.placerTrouNoir(var_x,var_y);
            }
            plateau.placerDesintegrateur(var_x,var_y);
        }
        for(int i=0; i<2;i++){
            
        }
       
        

    }
}
