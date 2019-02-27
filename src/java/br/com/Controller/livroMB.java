/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controller;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.com.Entity.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
/**
 *
 * @author gustavoscipiao
 */
@ManagedBean(name = "livroMB")
@RequestScoped
public class livroMB {

    private String livro;
    private String autor;
    private double preco;

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

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
    /**
     * Creates a new instance of livroMB
     */
    public livroMB() {
       
        Livro l = new Livro();
    }
    
    public void add_livro()throws EntityExistsException,Exception{
        
      java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/livraria", "root", "A51forte!");
        PreparedStatement pst = con.prepareStatement("INSERT INTO LIVRO(LIVRO,AUTOR,PRECO)VALUES(?,?,?);");
        pst.setString(1, "MACHADO DE ASSIS");
        pst.setString(2, "DOM CASMURRO");
        pst.setDouble(3, 200.0);
        
        pst.execute();
        
    }
    
}
