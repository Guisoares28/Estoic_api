package com.estoic.api.models;

import jakarta.persistence.*;

@Entity
@Table(name = "FRASE")
public class FraseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String frase;

    private String tema;

    @ManyToOne()
    @JoinColumn(name = "pensador_id")
    private PensadorModel pensador;

    public FraseModel() {
    }

    public FraseModel(String frase, String tema, PensadorModel pensador) {
        this.frase = frase;
        this.tema = tema;
        this.pensador = pensador;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public PensadorModel getPensador() {
        return pensador;
    }

    public void setPensador(PensadorModel pensador) {
        this.pensador = pensador;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
