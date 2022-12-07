package puissance4_morel_lecomte;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author romai
 */
public class PlateauDeJeu {

    CelluledeGrille[][] grille = new CelluledeGrille[6][7];

    public PlateauDeJeu() {
        boolean a = true;
        boolean b = false;
        Jeton c = null;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                grille[i][j] = new CelluledeGrille(c, a, b);
            }
        }
    }

    public int AjouterJetonDansColonne(Jeton jeton, int j) {
        for (int i = 0; i < 6; i++) {
            if (grille[i][j].presenceJeton()==false) {
                grille[i][j].affecterJeton(jeton);
                return i;
            }
       }
        return -1;
    }

    public boolean grilleRemplie() {
        boolean u = true;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (grille[i][j] == null) {
                    u = false;
                }
            }
        }
        return u;
    }

    public void afficherGrilleSurConsole() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(grille[i][j].toString());
                if (j == 6) {
                    System.out.println("");
                }

            }
        }
    }

    public boolean presenceJeton(int x, int y) {
        if (grille[x][y].presenceJeton() == true) {
            return true;
        } else {
            return false;
        }
    }

    public String lireCouleurDuJeton(int x, int y, String couleur) {
        couleur = grille[x][y].lireCouleurDuJeton();
        return couleur;
    }

    public boolean ligneGagnantePourCouleur(String couleur) {

        boolean verif = false;
        int win = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (grille[i][j].lireCouleurDuJeton().equals(couleur)) {
                    if (grille[i][j + 1].lireCouleurDuJeton().equals(couleur)) {
                        if (grille[i][j + 2].lireCouleurDuJeton().equals(couleur)) {
                            if (grille[i][j + 3].lireCouleurDuJeton().equals(couleur)) {
                                win = 1;
                            }
                        }
                    }
                }
                if (win == 1) {
                    verif = true;

                }
            }
        }
        return verif;
    }

    public boolean colonneGagnantePourCouleur(String couleur) {

        boolean verif = false;
        int win = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (grille[i][j].lireCouleurDuJeton().equals(couleur)) {
                    if (grille[i + 1][j].lireCouleurDuJeton().equals(couleur)) {
                        if (grille[i + 2][j].lireCouleurDuJeton().equals(couleur)) {
                            if (grille[i + 3][j].lireCouleurDuJeton().equals(couleur)) {
                                win = 1;
                            }
                        }
                    }
                }
                if (win == 1) {
                    verif = true;

                }
            }
        }
        return verif;
    }

    public boolean diagonaleMontanteGagnantePourCouleur(String couleur) {

        boolean verif = false;
        int win = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (grille[i][j].lireCouleurDuJeton().equals(couleur)) {
                    if (grille[i + 1][j + 1].lireCouleurDuJeton().equals(couleur)) {
                        if (grille[i + 2][j + 2].lireCouleurDuJeton().equals(couleur)) {
                            if (grille[i + 3][j + 3].lireCouleurDuJeton().equals(couleur)) {
                                win = 1;
                            }
                        }
                    }
                }
                if (win == 1) {
                    verif = true;

                }
            }
        }
        return verif;
    }

    public boolean diagonaleDescendanteGagnantePourCouleur(String couleur) {

        boolean verif = false;
        int win = 0;

        for (int i = 5; i > 3; i--) {
            for (int j = 0; j < 4; j++) {
                if (grille[i][j].lireCouleurDuJeton().equals(couleur)) {
                    if (grille[i - 1][j + 1].lireCouleurDuJeton().equals(couleur)) {
                        if (grille[i - 2][j + 2].lireCouleurDuJeton().equals(couleur)) {
                            if (grille[i - 3][j + 3].lireCouleurDuJeton().equals(couleur)) {
                                win = 1;
                            }
                        }
                    }
                }
                if (win == 1) {
                    verif = true;

                }
            }
        }
        return verif;
    }

    public void tasserColonne(int c) {
        for (int i = 0; i < 5; i++) { 
                 if (grille[i][c] == null){
                     for (int j = i; j < 5; j++) {
                         grille[j][c] = grille[j+1][c];
                     }
                grille[5][c] = null;   
            }
        }    
    }

    public void placerTrouNoir(int x, int y) {
        grille[x][y].placerTrouNoir();
    }

    public boolean presenceTrouNoir(int x, int y) {
        return grille[x][y].presenceTrouNoir();
    }

    public void supprimerTrouNoir(int x, int y) {
        grille[x][y].supprimerTrouNoir();
    }

    public void placerDesintegrateur(int x, int y) {
        grille[x][y].placerDesintegrateur();
    }

    public boolean presenceDesintegrateur(int x, int y) {
        return grille[x][y].presenceDesintegrateur();
    }

    public void supprimerJeton(int x, int y) {
        grille[x][y].supprimerJeton();
    }

    public Jeton recupererJeton(int x, int y) {
        Jeton jeton = grille[x][y].recupererJeton();
        tasserColonne(y);
        return jeton;
    }
    
    public void supprimerDesintegrateur (int x, int y){
        grille[x][y].supprimerDesintegrateur();
    }

}
