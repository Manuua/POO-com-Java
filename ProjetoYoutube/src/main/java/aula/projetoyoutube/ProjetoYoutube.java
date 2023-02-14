/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package aula.projetoyoutube;

/**
 *
 * @author manoela.araujo
 */
public class ProjetoYoutube {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1]= new Video("Aula 1 de Java Script");
        v[2]= new Video("Aula 1 de Java");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("teste", 22,"M", 2,"Manuua" );
        g[1] = new Gafanhoto("Manu", 23,"F", 2,"teste" );

        System.out.println("Vídeos\n***************");
        System.out.println(v[0].toString());
        System.out.println("Gafanhotos\n***************");
        System.out.println(g[0].toString());
        
        Visualizacao vis[]= new Visualizacao[5];
        vis[0]= new Visualizacao(g[1], v[2]);//Manu aula 1 de java
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        
        vis[1]= new Visualizacao(g[0], v[0]);//teste aula 1 POO
        vis[0].avaliar(6.5f);
        System.out.println(vis[1].toString());
        vis[0].avaliar();
        System.out.println(vis[1].toString());

    }
}
