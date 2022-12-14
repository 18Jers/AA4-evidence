package com.soluciones.web.appGrupo4.model.entities;



import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "country")
public class E_Country {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id_country")
    private String idCountry;

    @Column(name = "name_country")
    private String nameCoutnry;

    @Column(name = "url_icon_country")
    private String iconCountry;


    
    // constructor 

    public E_Country() {
        this.idCountry = "";
        this.nameCoutnry = "";
        this.iconCountry = "";
    }



    // getters & setters

    public String getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(String idCountry) {
        this.idCountry = idCountry;
    }

    public String getNameCoutnry() {
        return nameCoutnry;
    }

    public void setNameCoutnry(String nameCoutnry) {
        this.nameCoutnry = nameCoutnry;
    }

    public String getIconCountry() {
        return iconCountry;
    }

    public void setIconCountry(String iconCountry) {
        this.iconCountry = iconCountry;
    }
    
}
