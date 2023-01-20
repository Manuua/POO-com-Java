
package aula04;


public class Aula04 {

    public static void main(String[] args) {
       Caneta c1 = new Caneta("Stabillo", "Amarela", 0.4f);
       c1.status();
       Caneta c2 = new Caneta ("Bic", "Azul", 0.3f);
       c2.status();
       
//       c1.setModelo("Bic");
//       c1.setPonta(0.7f);
     
       
//        System.out.println("Tenho uma caneta" + c1.getModelo() + "de ponta" 
//        + c1.getPonta());
    }
}
