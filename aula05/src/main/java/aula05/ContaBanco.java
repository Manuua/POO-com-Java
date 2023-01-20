/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

/**
 *
 * @author manoela.araujo
 */
public class ContaBanco {
    public float numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(float numConta, String tipo, String dono, float saldo, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
    }

    public float getNumConta() {
        return numConta;
    }

    public void setNumConta(float numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    // metodos
    
    public void abrirConta(){
     this.status = true;
        
    }
    
    public void fecharConta(){
        this.status = false;
    }
    
    public void depositar(float valor){
        if( status == true && saldo > 0 ){
        this.saldo = saldo + valor;
        }else{
            System.out.println("\"sua conta precisa estar aberta e com saldo"
                    + " maior que 0\"");
        }
    }
    
    public void sacar(float valor){
        this.saldo = saldo - valor;
    }
    
    public void pagamentoMensal(float taxa){
        
        if( "C/C".equals(tipo)){
        this.saldo = saldo - 15;
        }else{
            this.saldo = saldo - 20;
        }
    }
    
    public void status(){
        System.out.println("Numero da conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("A conta está aberta :" + this.isStatus());
    }
     
}
