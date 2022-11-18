package puissance4_morel_lecomte;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leamo
 */
public class CelluledeGrille {
    private Jeton jetonCourant;
    private boolean avoirTrouNoir;
    private boolean avoirDesintegrateur;
    
    //constructeur
    public CelluledeGrille(Jeton j,boolean TN, boolean Des){
        j=null;
        jetonCourant=j;
        TN=false;
        avoirTrouNoir=TN;
        Des=false;
        avoirDesintegrateur=Des;          
    }
    
    public boolean presenceJeton(){
        if (jetonCourant==null){
        }
        return false;
    }

    public void affecterJeton(Jeton jetonCourant) {
        this.jetonCourant = jetonCourant;
    }
    
    public String lireCouleurDuJeton(){
        if(jetonCourant!=null){            
            return jetonCourant.getCouleur();
        }else{
            return "vide";
        }
    }
    
    public void placerTrouNoir(){
        avoirTrouNoir=true;
    }
    
    public void supprimerTrouNoir(){
        avoirTrouNoir=false;
    }
    
    public boolean presenceTrouNoir(){
        if(avoirTrouNoir==true){
            return true;            
        }else{
            return false;
        }
    }

    
}
