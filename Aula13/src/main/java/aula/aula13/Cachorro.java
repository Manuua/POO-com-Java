/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.aula13;

/**
 *
 * @author manoela.araujo
 */
public class Cachorro extends Lobo {
    @Override
    public void emitirSom(){
        System.out.println("Au!Au!Au!");
    }
    
    //métodos com mesmo nome porém assisnaturas diferentes
    //assiantura é quantidade e tipo de parametros
    
    public void reagir(String frase){
        if(frase.equals("Toma Comida")|| frase.equals("Olá")){
            System.out.println("Abanar e Latir");
        }else{
            System.out.println("Rosnar");
        }  
    }
    
    public void reagir(int hora, int min){
        if(hora < 12 ){
            System.out.println("Abanar ");
        }else if(hora >= 18){
            System.out.println("ignorar"); 
        }else{
       System.out.println("Abanar e latir");
     }
    }
    
    public void reagir(boolean dono){
        if (dono){
            System.out.println("Abanar");
        }else{
            System.out.println("Rosnar e latir ");
        }
    }
    
    public void reagit(int idade,float peso){
        if(idade <5 ){
            if(peso<10){
                System.out.println("Abanar");
            }else{
                System.out.println("Latir");
            }
        } else {
            if(peso<10 ){
                System.out.println("Rosnar");
            }else{
                System.out.println("Ignorar"); 
            }
        }
    }
}
