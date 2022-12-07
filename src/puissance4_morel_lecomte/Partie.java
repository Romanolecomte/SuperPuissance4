package puissance4_morel_lecomte;

import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author leamo
 */
public class Partie {

    private joueur listeJoueurs[] = new joueur[2];
    private joueur joueurCourant;
    private PlateauDeJeu plateau;
    

    public Partie(joueur Joueur1, joueur Joueur2) {
        listeJoueurs[0] = Joueur1;
        listeJoueurs[1] = Joueur2;
        plateau = new PlateauDeJeu();
    }

    public void attribuerCouleurAuxJoueurs() {
        Random rand = new Random();
        int var = rand.nextInt(2);
        if (var == 0) {
            listeJoueurs[0].affecterCouleur("jaune");
            listeJoueurs[1].affecterCouleur("rouge");
        } else {
            listeJoueurs[0].affecterCouleur("rouge");
            listeJoueurs[1].affecterCouleur("jaune");
        }
    }

    public void creerEtAffecterJeton(joueur Joueur) {
        String couleur_joueur = Joueur.getCouleur();
        for (int i = 0; i < 30; i++) {
            Jeton jeton_joueur = new Jeton(couleur_joueur);
            Joueur.ajouterJeton(jeton_joueur);
        }
    }

    public void placerTrousNoirsEtDesintegrateurs() {
        Random x = new Random();
        Random y = new Random();
        for (int i = 0; i < 3; i++) {
            int ligne = x.nextInt(5);
            int colonne = y.nextInt(6);
            if (plateau.presenceTrouNoir(ligne, colonne) == false && plateau.presenceDesintegrateur(ligne, colonne) == false) {
                plateau.placerTrouNoir(ligne, colonne);
                plateau.placerDesintegrateur(ligne, colonne);
            } else {
                i -= 1;
            }
        }
        for (int j = 0; j < 2; j++) {
            int ligne = x.nextInt(5);
            int colonne = y.nextInt(6);
            if (plateau.presenceDesintegrateur(ligne, colonne) == false) {
                plateau.placerDesintegrateur(ligne, colonne);
            } else {
                j -= 1;
            }
        }
        for (int k = 0; k < 2; k++) {
            int ligne = x.nextInt(5);
            int colonne = y.nextInt(6);
            if (plateau.presenceDesintegrateur(ligne, colonne) == false && plateau.presenceTrouNoir(ligne, colonne) == false) {
                plateau.placerTrouNoir(ligne, colonne);
            } else {
                k -= 1;
            }

        }
    }

    public void initialiserPartie() {
        attribuerCouleurAuxJoueurs();
        creerEtAffecterJeton(listeJoueurs[0]);
        creerEtAffecterJeton(listeJoueurs[1]);
        placerTrousNoirsEtDesintegrateurs();
    }

    public void lancerPartie() {
        joueurCourant = listeJoueurs[0];
        Scanner sc = new Scanner(System.in);
        while (plateau.ligneGagnantePourCouleur(joueurCourant.getCouleur())==false || plateau.grilleRemplie() == false || plateau.colonneGagnantePourCouleur(joueurCourant.getCouleur()) || plateau.diagonaleDescendanteGagnantePourCouleur(joueurCourant.getCouleur()) || plateau.diagonaleMontanteGagnantePourCouleur(joueurCourant.getCouleur())) {
            int coup;
            do {
                System.out.println("Quel est votre coup ? Tapez 1 si vous voulez placer un jeton, 2 pour un desintégrateur, 3 pour récupérer un jeton");
                coup = sc.nextInt();

                if (coup == 1) {
                    System.out.println("Dans quelle colonne voulez vous placer votre jeton?");
                    int colonne_jeton = sc.nextInt();
                    do {
                        Jeton jeton = new Jeton(joueurCourant.getCouleur());
                        plateau.AjouterJetonDansColonne(jeton, colonne_jeton);
                        if (plateau.presenceDesintegrateur(plateau.AjouterJetonDansColonne(jeton, colonne_jeton), colonne_jeton)) {
                            plateau.supprimerDesintegrateur(plateau.AjouterJetonDansColonne(jeton, colonne_jeton), colonne_jeton);
                            joueurCourant.obtenirDesintegrateur();
                        }
                        if (plateau.presenceTrouNoir(plateau.AjouterJetonDansColonne(jeton, colonne_jeton), colonne_jeton)) {
                            plateau.supprimerJeton(plateau.AjouterJetonDansColonne(jeton, colonne_jeton), colonne_jeton);
                            plateau.supprimerTrouNoir(plateau.AjouterJetonDansColonne(jeton, colonne_jeton), colonne_jeton);
                        }
                    } while (colonne_jeton > 7 || colonne_jeton < 0);

                }

                if (coup == 2) {
                    System.out.println("Dans quelle colonne voulez vous placer votre désintégrateur?");
                    int colonne_des = sc.nextInt();
                    System.out.println("Dans quelle ligne voulez vous placer votre désintégrateur?");
                    int ligne_des = sc.nextInt();
                    do {
                        plateau.supprimerJeton(ligne_des, colonne_des);
                        plateau.tasserColonne(colonne_des);
                    } while (colonne_des > 7 || colonne_des < 1 || plateau.presenceJeton(ligne_des, colonne_des)==false);

                }

                if (coup == 3) {
                    System.out.println("Quelle est la colonne du jeton que vous voulez récupérer");
                    int colonne_recup = sc.nextInt();
                    System.out.println("Quelle est la ligne du jeton que vous voulez récupérer");
                    int ligne_recup = sc.nextInt();
                    do {
                        plateau.recupererJeton(ligne_recup, colonne_recup);
                        plateau.tasserColonne(colonne_recup);
                    } while (colonne_recup > 7 || colonne_recup < 1 || plateau.presenceJeton(ligne_recup, colonne_recup)==false);

                }
            } while (coup != 1 && coup != 2 && coup != 3);
            //System.out.println("coup non valide");
        
        plateau.afficherGrilleSurConsole();
        if (joueurCourant==listeJoueurs[0]){
            joueurCourant=listeJoueurs[1];
        }else 
            joueurCourant=listeJoueurs[0];
        }
    }
}
