package com.dio.catalogoproduto.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

@Document(indexName = "produto", type = "catalogo")
@Setting(settingPath = "static/es-settings.json")
public class Produto {

    @Id
    @Field(type = FieldType.Keyword)
    private Integer id;

    @Field(type = FieldType.Text)
    private String nome;

    @Field(type = FieldType.Integer)
    private Integer quantidade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}