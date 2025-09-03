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

    private Integer ano_nascimento;

    private Integer ano_morte;

    private String local_nascimento;

    private String biografia_resumida;

    @OneToMany(mappedBy = "pensador", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<ObraModel> obras = new HashSet<>();

    @OneToMany(mappedBy = "pensador", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<FraseModel> frases = new HashSet<>();

    public PensadorModel(String nome, String nome_completo, Integer ano_nascimento, Integer ano_morte, String local_nascimento, String biografia_resumida) {
        this.nome = nome;
        this.nome_completo = nome_completo;
        this.ano_nascimento = ano_nascimento;
        this.ano_morte = ano_morte;
        this.local_nascimento = local_nascimento;
        this.biografia_resumida = biografia_resumida;
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

    public Integer getAno_nascimento() {
        return ano_nascimento;
    }

    public void setAno_nascimento(Integer ano_nascimento) {
        this.ano_nascimento = ano_nascimento;
    }

    public Integer getAno_morte() {
        return ano_morte;
    }

    public void setAno_morte(Integer ano_morte) {
        this.ano_morte = ano_morte;
    }

    public String getLocal_nascimento() {
        return local_nascimento;
    }

    public void setLocal_nascimento(String local_nascimento) {
        this.local_nascimento = local_nascimento;
    }

    public String getBiografia_resumida() {
        return biografia_resumida;
    }

    public void setBiografia_resumida(String biografia_resumida) {
        this.biografia_resumida = biografia_resumida;
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
