/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.aula11;

/**
 *
 * @author manoela.araujo
 */
public class Professor extends Pessoa {
    private String especialidade;
    private int salario;
    
    public void receberAumento(){
        System.out.println( this.getNome() +  "Recebeu um aumento de 100 reais");
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}
