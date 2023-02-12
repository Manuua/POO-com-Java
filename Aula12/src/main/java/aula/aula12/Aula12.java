/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package aula.aula12;

/**
 *
 * @author manoela.araujo
 */
public class Aula12 {

    public static void main(String[] args) {
        
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        m.setPeso(35.6f);
        m.setCorPelo("Amarelo");
        
        m.locomover();
        m.emitirSom();
        
        Canguru c = new Canguru();
        Cachorro k = new Cachorro(); 
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara blue = new Arara();
        
        c.locomover();//canguru
        k.locomover();//cachorro
        k.emitirSom();
    }
}
