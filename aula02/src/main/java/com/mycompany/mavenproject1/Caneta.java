
package com.mycompany.mavenproject1;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    //mostra status do objeto 
   public void status(){
        System.out.println("Uma caneta :" + this.modelo);
        System.out.println("cor : " + this.cor);
        System.out.println("está tamapada?" + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("carga: "+ this.carga);
    }
   public void rabiscar(){
       if (this.tampada == true ){
           System.out.println("ERRO! não posso rabiscar");
       }else {
           System.out.println("Estou rabiscando");
       }
         
    }
    
    protected void tampar(){
        this.tampada = true;
    }
    
    protected void destampar(){
        this.tampada = false;
    }
    
}
