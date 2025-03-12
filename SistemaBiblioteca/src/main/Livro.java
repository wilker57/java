public class Livro{
    
    private String titulo;
    private String autor;
    private int anoPublicacao;
    
    
    //construtor
    
    public Livro (String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    
    //Getters e Setters
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo ){
        this.titulo = titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public int getAnoPublicacao(){
        return anoPublicacao;
    }
    
    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao ;
    }
    
    @Override
    
    public String toString(){
        return "Titulo: " + titulo + ", Autor " + autor + ", Ano de Publicacão: " + anoPublicacao;
    }
}