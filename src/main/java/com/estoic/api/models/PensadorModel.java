package com.estoic.api.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="PENSADOR")
public class PensadorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String nome;

    private String nome_completo;

    private Integer anoNascimento;

    private Integer anoMorte;

    private String localNascimento;

    private String biografia;

    @OneToMany(mappedBy = "pensador", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<ObraModel> obras = new HashSet<>();

    @OneToMany(mappedBy = "pensador", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<FraseModel> frases = new HashSet<>();

    public PensadorModel() {
    }

    public PensadorModel(String nome, String nome_completo, Integer anoNascimento, Integer anoMorte, String localNascimento, String biografia) {
        this.nome = nome;
        this.nome_completo = nome_completo;
        this.anoNascimento = anoNascimento;
        this.anoMorte = anoMorte;
        this.localNascimento = localNascimento;
        this.biografia = biografia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(Integer anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public Integer getAnoMorte() {
        return anoMorte;
    }

    public void setAnoMorte(Integer anoMorte) {
        this.anoMorte = anoMorte;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public Set<ObraModel> getObras() {
        return obras;
    }

    public void setObras(Set<ObraModel> obras) {
        this.obras = obras;
    }

    public Set<FraseModel> getFrases() {
        return frases;
    }

    public void setFrases(Set<FraseModel> frases) {
        this.frases = frases;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }
}
