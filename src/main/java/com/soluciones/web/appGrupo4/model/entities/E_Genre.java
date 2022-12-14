package com.soluciones.web.appGrupo4.model.entities;



import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "genre")
public class E_Genre {
    
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id_genre")
    private String idGenre;

    @Column(name = "name_genre")
    @NotEmpty(message = "Ingrese un nombre")
    private String nameGenre;


    
    // constructor

    public E_Genre() {
        this.idGenre = "";
        this.nameGenre = "";
    }



    // getters & setters
    
    public String getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(String idGenre) {
        this.idGenre = idGenre;
    }

    public String getNameGenre() {
        return nameGenre;
    }

    public void setNameGenre(String nameGenre) {
        this.nameGenre = nameGenre;
    }

}
