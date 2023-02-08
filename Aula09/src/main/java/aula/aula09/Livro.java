/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.aula09;

/**
 *
 * @author manoela.araujo
 */
public class Livro implements Publicacao{
    //atributos 
    
    private String titulo;
    private String autor;
    private int paginas;
    private int paginaAtual;
    private boolean aberto; 
    private Pessoa leitor;

    public Livro(String titulo, String autor, int paginas, int paginaAtual, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.paginaAtual = paginaAtual;
        this.leitor = leitor ;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
     return leitor;
    }

    public void setLeitor(Pessoa leitor) {
       this.leitor = leitor ;
    }
    
    //métodos 
    
    public void detalhes(){
        System.out.println("************************");
        System.out.println("SOBRE O LIVRO");
        System.out.println("Autor é : " + this.getAutor());
        System.out.println("O título é " + this.getTitulo());
        System.out.println("Número de páginas:" + this.getPaginas());
        System.out.println("O leitor do livro é :" + this.getLeitor());
    }
    
    @Override
     public void abrir() {
        this.aberto = true;
        System.out.println("O livro está aberto" );
    }
     
     @Override 
     public void fechar(){
         this.aberto = false;
         System.out.println("O livro está fechado");
     }
     
     @Override 
     public void folhear(){
         if(this.aberto == true){
             this.setPaginaAtual(this.paginaAtual + 7) ;
             System.out.println("Você está na página " + this.paginaAtual);
         }else{
             System.out.println("O livro está fechado não consigo folhear");
         }
     }
     
        @Override
    public void avancarPag() {
        if (this.aberto == true){
           this.setPaginaAtual(this.paginaAtual + 1) ;
            System.out.println("A página atual é : " + this.paginaAtual);
        }else{
            System.out.println("Impossível avançar a página");
        }
    }
         @Override
          public void voltarPag() {
        if (this.aberto == true){
            this.setPaginaAtual(this.paginaAtual -1 );
            System.out.println("A página atual é " + this.paginaAtual);
        }else{
            System.out.println("Impossível voltar a página");
        }
    }
}
