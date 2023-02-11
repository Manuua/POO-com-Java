/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package aula.aula11;

/**
 *
 * @author manoela.araujo
 */
public class Aula11 {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Manu");
        a1.setMatricula(1111);
        a1.setCurso("ADS");
        a1.setIdade(23);
        a1.setSexo("F");
        a1.pagarMensalidade();
      
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1234);
        b1.setNome("TESTE");
        b1.setBolsa(12.5f);
        b1.setSexo("f");
        b1.pagarMensalidade();
        
        Professor p1 = new Professor();
        p1.setNome("João");
        p1.receberAumento();
                
        
    }
}
