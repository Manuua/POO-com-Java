/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author manoela.araujo
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
     
        c1.modelo= "BIC";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
         c1.tampada= true;
         c1.tampar();
         c1.status();
         
         c1.rabiscar();
//        
//        c1.status();
//        c1.rabiscar();
//        
//        Caneta c2 = new Caneta();
//        c2.modelo = "Loft";
//        c2.cor = "preta";
//        c2.ponta = 1.0f;
//        c2.tampada = true;
//        c2.destampar();
//        c2.status();
//        c2.rabiscar();
                

    }
}
