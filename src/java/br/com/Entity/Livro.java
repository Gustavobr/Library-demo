/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Entity;

import java.io.Serializable;
import javax.persistence.Entity;

import javax.persistence.Id;
import br.com.Controller.*;
/**
 *
 * @author gustavoscipiao
 */
@Entity
public class Livro implements Serializable {
    
    
    

    private static final long serialVersionUID = 1L;
    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private String livro ;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    private String autor;
    private double preco;

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

}
