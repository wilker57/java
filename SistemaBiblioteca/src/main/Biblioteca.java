import java.util.ArrayList;
import java.util.List;

public class Biblioteca{
    
    private List <Livro> livros; //lista que armazenara os livros
    
    public Biblioteca(){
        
        this.livros = new ArrayList<>();
    }
        //Adicionar Livro (criar)
        
        public void adicionarLivro (Livro livro){
            livros.add(livro);
            
            System.out.println("Livro adicionado com sucesso!");
        }
        
        //Lista todos os livros (ler)
        
        public void listarLivros(){
            if(livros.isEmpty()){
                System.out.println("Não há livros na Bibioteca");
                return;
            }
            
            System.out.println("Lista de Livros");
            for(Livro livro : livros){
                System.out.println(livro);
            }
        }
        //Atualizar  Livro (Atualizar)
        
        public void atualizarLivro (int index, String novoTitulo, String novoAutor, int novoAno){
            if(index >= 0 && index<livros.size()){
                
                Livro livro = livros.get(index);
                livro.setTitulo(novoTitulo);
                livro.setAutor(novoAutor);
                livro.setAnoPublicacao(novoAno);
                
                System.out.println("Livro atualizado com sucesso");
                
            }else{
                
                System.out.println("Índice de Livro inválido");
            }
                
            }
            
            //Excluir livro (Deletar)
            
            public void excluirLivro (int index){
                if(index >=0 && index < livros.size()){
                    livros.remove(index);
                    System.out.println("Livro Excluído com sucesso!");
                }else{
                    System.out.println("Índice de livro inválido");
                    
                }
               
    }
}