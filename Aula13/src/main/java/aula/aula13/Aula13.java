/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package aula.aula13;

/**
 *
 * @author manoela.araujo
 */
public class Aula13 {

    public static void main(String[] args) {
// programa principal

       Lobo lobinho = new Lobo();
       
       lobinho.emitirSom();
       
       Cachorro doguinho = new Cachorro();
       doguinho.emitirSom();
       
       doguinho.reagir("Olá");
       doguinho.reagir("Vai apanhar");
       doguinho.reagir(true);
       doguinho.reagir(2, (int) 12.5f);
    }
}
