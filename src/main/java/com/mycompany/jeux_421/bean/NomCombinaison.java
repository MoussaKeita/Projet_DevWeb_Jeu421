/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jeux_421.bean;

/**
 *
 * @author PC MAROC
 */
public enum NomCombinaison {
        FOURHUNDREDTWENYONE(10),
	SIXAS(7),
	SIXFICHE(6),
	BROLANSIX(6),
	FIVEFICHE(5),
	BROLANFIVE(5),
	FOURFICHE(4),
	BROLANFOUR(4),
	THREEFICHE(3),
	BROLANTHREE(3),
	TWOEFICHE(2),
	BROLANTWO(2),
        six_five_four(2),
        five_four_three(2),
        four_three_two(2),
        three_two_one(2),
	SUITE(2),
	nenet(2),
	others(1);

	private int valeur;

    private NomCombinaison(int valeur) {
        this.valeur = valeur;
    }
    
    public static boolean contenu(NomCombinaison nomCombinaisons){
        for (NomCombinaison nc: NomCombinaison.values()){//pour chaque valeur de cominaison si 
            if(nc.name().equals(nomCombinaisons)){
                return true;
            }
                
        }
        return false;
    }
        
}
