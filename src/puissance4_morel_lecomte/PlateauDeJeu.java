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

    public  PlateauDeJeu() {
        boolean a = true;
        boolean b = false;
        Jeton c = null;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; i < 7; j++) { 
                grille [i][j] = new CelluledeGrille(c,a,b);
            }   
        }
    }
    public void AjouterJetonDansColonne(Jeton jeton, int j) {
        for( int i = 0; i <= 6; i++) {
            if (grille [i][j] == null) {
                break;                        
            }
            grille[i][j].affecterJeton(jeton);
        }
    }
    public boolean grilleRemplie() {
        boolean u = true;
      
        for (int i = 0; i < 6; i++) {
            for (int j = 0; i < 7; j++) {
                if (grille [i][j] == null) {
                    u = false;
                }
            }            
        }
        return u;
    }
    public void afficherGrilleSurConsole(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; i < 7; j++) { 
                System.out.print(grille [i][j].avoirJeton().toString());
                if (i == 6) {
                    System.out.println("");
                }
                
                
            }
        }
    }
    
}
    
    
    
    
    

