/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jeux_421.bean.dao;

import com.mycompany.jeux_421.bean.De;
import com.mycompany.jeux_421.bean.NomCombinaison;
import java.util.List;

/**
 *
 * @author hp
 */
public abstract class DAO_Combinaison <D>{
    
public abstract List<D> initializeCombinaison();
public abstract NomCombinaison combiToNom ();

}
