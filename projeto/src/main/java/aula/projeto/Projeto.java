/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package aula.projeto;

/**
 *
 * @author manoela.araujo
 */
public class Projeto {

    public static void main(String[] args) {
    /// programa principal
    Pessoa p1 = new Pessoa();
    Aluno p2 = new Aluno();
    Professor p3 = new Professor();
    Funcionario p4 = new Funcionario();
 
    
        p1.setNome("Manu");
        p2.setNome("Maria");
	p3.setNome("Cláudio");
	p4.setNome("Fabiana");
		
	p1.setSexo("M");
	p4.setSexo("F");
	p2.setIdade(18);
		
	p2.setCurso("Informática");
	p3.setSalario((float) 2500.75);
	p4.setSetor("Estoque");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }    
}

