/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    
    //Métodos
    public void marcarLuta(Lutador l1 , Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria())
                && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante=l2;    
        }else{
            this.aprovada = false;
            this.desafiado=null;
            this.desafiante= null;
        }
    }
    public void lutar(){
      if(this.aprovada){
          System.out.println("###DESAFIADO####");
          this.desafiado.apresentar();
          System.out.println("###DESAFIANTE###");
          this.desafiante.apresentar();
          System.out.println("###RESULTADO DA LUTA###");
          Random aleatorio = new Random();
          int vencedor = aleatorio.nextInt(3);//0 1 2 
          System.out.println("-------------");
          
          switch(vencedor){
              case 0: //empate
                  System.out.println("Empatou!");
                  this.desafiado.empatarLuta();
                  this.desafiante.empatarLuta(); 
                break;
                
              case 1: //Desafiado Vence
                  System.out.println("Vitória do " + this.desafiado.getNome());
                  this.desafiado.ganharLuta();
                  this.desafiado.perderLuta();
                  
                  break;
                  
              case 2://Desafiante vence
                  System.out.println("Vitória do " + this.desafiante.getNome());
                  this.desafiante.ganharLuta();
                  this.desafiado.perderLuta();
                  break;
          }
          
      }else{
          System.out.println("A luta não pode acontecer!");
      }
    }
    
    //métodos especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
