/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOImplementation;

import com.mycompany.jeux_421.bean.Combinaison;
import com.mycompany.jeux_421.bean.De;
import com.mycompany.jeux_421.bean.NomCombinaison;
import com.mycompany.jeux_421.bean.dao.DAO_Combinaison;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public abstract class DAOImp_Combinaison extends DAO_Combinaison {
private List<De> des = new ArrayList<>();
    

    public List<De> initializeCombinaison() {
        
		for (int i=0; i<3; i++) { //trois nouvelles dé
			des.add(new De());
		}	
		return des;
	}

    public NomCombinaison combiToNomCombinaison(int val1,int val2,int val3){
       
        //Combinaison c = new Combinaison(val1, val2, val3);

        if (val1==4 && val2==2 && val3==1){
            return NomCombinaison.FOURHUNDREDTWENYONE;
        }

        if (val1==4 && val2==2 && val3==1){
                    return NomCombinaison.FOURHUNDREDTWENYONE;
        }

        if (val1==val2 && val2==val3){
            return NomCombinaison.SIXAS;
        }

        int [] desVals = {val1,val2,val3};
        int compteur1=0;
        int compteur6=0;
        int compteur2=0;
        int compteur5=0;
        int compteur4=0;
        int compteur3=0;
        for (int i=0;i<desVals.length; i++){
            if(desVals[i] == 1){
                compteur1++;
            }
            if(desVals[i] == 2){
                compteur2++;
            }
            if(desVals[i] == 3){
                compteur3++;
            }
            if(desVals[i] == 4){
                compteur4++;
            }
            if(desVals[i] == 5){
                compteur5++;
            }
            if(desVals[i] == 6){
                compteur6++;
            }
        }

        if (compteur1==2 && compteur6==1){
            return NomCombinaison.SIXFICHE;
        }

        if (compteur6==3){
            return NomCombinaison.BROLANSIX;
        }
    
        if (compteur1==2 && compteur5==1){
            return NomCombinaison.FIVEFICHE;
        }

        if (compteur5==3){
            return NomCombinaison.BROLANFIVE;
        }

        if (compteur1==2 && compteur4==1){
            return NomCombinaison.FOURFICHE;
        }
        if (compteur4==3){
            return NomCombinaison.BROLANFOUR;
        }
        if (compteur1==2 && compteur3==1){
            return NomCombinaison.THREEFICHE;
        }
        if (compteur3==3){
            return NomCombinaison.BROLANTHREE;
        }
        if (compteur1==2 && compteur2==1){
            return NomCombinaison.TWOEFICHE;
        }
        if (compteur2==3){
            return NomCombinaison.BROLANTWO;
        }
        if (compteur6==1 && compteur5==1 && compteur4==1){
            return NomCombinaison.six_five_four;
        }
       if (compteur5==1 && compteur4==1 && compteur3==1){
            return NomCombinaison.five_four_three;
        }
       if (compteur4==1 && compteur3==1 && compteur2==1){
            return NomCombinaison.four_three_two;
        }
       if (compteur3==1 && compteur2==1 && compteur1==1){
            return NomCombinaison.three_two_one;
        }
       if (compteur2==2 && compteur1==1){
            return NomCombinaison.nenet;
        }

    return NomCombinaison.others;
}		
}
