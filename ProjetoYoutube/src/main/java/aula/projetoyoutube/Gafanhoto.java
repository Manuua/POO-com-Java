/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.projetoyoutube;

/**
 *
 * @author manoela.araujo
 */
public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, float experiencia, String login) {
        super(nome, idade, sexo, experiencia);
        this.login = login;
        this.totAssistido = 0; 
    }

    
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String Login) {
        this.login = Login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{"+ super.toString() + "login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
}
