/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOImplementation;

import com.mycompany.jeux_421.bean.dao.DAO_De;

/**
 *
 * @author hp
 */
public abstract class DAOImp_De extends DAO_De{
    
public int rouler(){
    return 1 + (int)(Math.random() * 6);
}

}
