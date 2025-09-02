package com.estoic.api.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="OBRA")
public class ObraModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private Date ano_publicacao;

    private String descricao;

    @ManyToOne
    @JoinColumn(name = "pensador_id")
    private PensadorModel pensador;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getAno_publicacao() {
        return ano_publicacao;
    }

    public void setAno_publicacao(Date ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public PensadorModel getPensador() {
        return pensador;
    }

    public void setPensador(PensadorModel pensador) {
        this.pensador = pensador;
    }
}
