/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jeux_421.bean;

import com.sun.istack.internal.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PC MAROC
 */
@Entity
@Table(name = "combinaison")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Combinaison_1.findAll", query = "SELECT c FROM Combinaison_1 c"),
    @NamedQuery(name = "Combinaison_1.findById", query = "SELECT c FROM Combinaison_1 c WHERE c.id = :id"),
    @NamedQuery(name = "Combinaison_1.findByNomCombi", query = "SELECT c FROM Combinaison_1 c WHERE c.nomCombi = :nomCombi")})
public class Combinaison implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 90)
    @Column(name = "nom_combi")
    private String nomCombi;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCombi")
    private List<De> des = new ArrayList<>();
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCombi")
    private Set<Lancer> lancers;
    

   
    public Combinaison() {
    }

    public Combinaison(int val1,int val2,int val3) {
        des.add(new De(val1));
        des.add(new De(val2));
        des.add(new De(val3));
    }

    public Combinaison(Integer id) {
        this.id = id;
    }

    public Combinaison(Integer id, String nomCombi) {
        this.id = id;
        this.nomCombi = nomCombi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomCombi() {
        return nomCombi;
    }

    public void setNomCombi(String nomCombi) {
        this.nomCombi = nomCombi;
    }
    public Set<Lancer> getLancers() {
        return lancers;
    }

    public List<De> getDes() {
        return des;
    }

    public void setDes(List<De> des) {
        this.des = des;
    }

    public void setLancers(Set<Lancer> lancers) {
        this.lancers = lancers;
    }
// initialisation de la liste des dés
  /* public Combinaison (int value1, int value2, int value3) {
		des.add(new De(value1));
		des.add(new De(value2));
		des.add(new De(value3));
	}*/

	public List<De> initializeCombinaison() {

		for (int i=0; i<3; i++) { //trois nouvelles dé
			des.add(new De());

		}	
		return des;
	}

        
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Combinaison)) {
            return false;
        }
        Combinaison other = (Combinaison) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.jeux_421.bean.Combinaison_1[ id=" + id + " ]";
    }
    
}
