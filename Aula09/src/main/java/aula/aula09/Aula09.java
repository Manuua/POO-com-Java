/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package aula.aula09;

/**
 *
 * @author manoela.araujo
 */
public class Aula09 {

    public static void main(String[] args) {
       Pessoa one = new Pessoa("Manu",23, "mulher");
       one.fazerAniver();
       one.fazerAniver();
       
        Livro prince = new Livro("Pequeno Princípe","Antonie",96, 10,one);
        prince.detalhes();
        prince.abrir();
   
       
    }
    
    
  
         
}
