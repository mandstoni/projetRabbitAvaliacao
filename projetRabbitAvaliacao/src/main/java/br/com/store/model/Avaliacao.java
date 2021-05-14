package br.com.store.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
public class Avaliacao implements Serializable {

    @Id
    private int _id;
    private String name;
    private String descricao;
    private double nota;

    public Avaliacao() {
    }

    public Avaliacao(int id, String name) {
        this.name = name;
        this._id = id;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setName(String name) {
        this.name = name;
    }
}
