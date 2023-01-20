

package aula05;

public class Aula05 {

    public static void main(String[] args) {
       ContaBanco c1 = new ContaBanco(1234, "C/P", "Manoela", 400 , true );
       c1.status();
       c1.depositar(200);
       c1.pagamentoMensal(15);
       c1.status();
       
     ContaBanco c2 = new ContaBanco(2344, "C/P", "Teste" , 0, true);
     c2.status();
     c2.depositar(200);
     c2.status();
    }
    
    
}