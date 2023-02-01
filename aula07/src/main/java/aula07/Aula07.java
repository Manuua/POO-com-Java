/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package aula07;

public class Aula07 {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6]; 
                
      l[0] = new Lutador("Pretty Boy", "França", 31 , 1.75f, 68.9f,
       11, 2,1 );
      
      l[1]= new Lutador("Putscript", "Brasil", 29 , 1.68f, 57.8f,
       14, 2,1 );
      
      l[2]= new Lutador("Java", "EUA", 35 , 1.65f, 80.8f,
       12, 2,1 );
      
      l[3]= new Lutador("Nest", "Austrália", 28 , 1.93f, 81.6f,
       13, 0, 2 );
      
      l[4]= new Lutador("JavaScript", "Brasil", 35 , 1.70f, 119.8f,
       5, 4,3 );
      
       l[5]= new Lutador("Next", "Brasil", 30 , 1.81f, 105.8f,
       12, 2,4 );
        
       Luta UEC01 = new Luta();
       UEC01.marcarLuta(l[4],l[5]);
       UEC01.lutar();
       
    }
}
