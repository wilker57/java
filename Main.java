import java.util.Scanner;

    public class Main {
        
        public static void main (String[] args) {
            
            Scanner scanner = new Scanner(System.in);
            Biblioteca biblioteca = new Biblioteca();
            
            while(true){
                
                System.out.println("\n--Sistema de biblioteca--");
                System.out.println("1 - Adicionar Livro");
                  System.out.println("2 - Listar Livro");
                    System.out.println("3 - Atualizar Livro");
                      System.out.println("4 - Excluir Livro");
                        System.out.println("5 - Sair Livro");
                          System.out.println("Escolha uma opção");
                          
                          int opcao = scanner.nextInt();
                          scanner.nextLine(); //Consumir quebra de linha
                          
                          switch(opcao){
                              
                              case 1:
                                  
                                  System.out.println("Digite o título do livro");
                                  String titulo = scanner.nextLine();
                                  
                                  System.out.println("Digite o autor do livro");
                                  String autor = scanner.nextLine();
                                  
                                  System.out.println("Digite o ano de publicação");
                                  int ano = scanner.nextInt();
                                  
                                  Livro novoLivro = new Livro(titulo, autor, ano);
                                  biblioteca.adicionarLivro(novoLivro);
                                  break;
                                  
                                  case 2:
                                      
                                      //Listar livros
                                      
                                      biblioteca.listarLivros();
                                      break;
                                      
                                    
                                    case 3:
                                        
                                        //Atualizar livros
                                        
                                        System.out.println("Digite o índice do livro que deseja atualizar");
                                        int indexAtualizacao = scanner.nextInt();
                                        scanner.nextLine();
                                        
                                        System.out.println("Digite o novo título");
                                        String novoTitulo = scanner.nextLine();
                                        
                                        System.out.println("Digite o novo autor");
                                        String novoAutor = scanner.nextLine();
                                        
                                        System.out.println("Digite o novo ano de publicação");
                                        int novoAno = scanner.nextInt();
                                        
                                        scanner.nextLine();
                                        break;
                                        
                                        case 4:
                                            
                                            //Excluir livro
                                            
                                            System.out.println("Digite o índice do livro que deseja excluir");
                                            int indexExclusao = scanner.nextInt();
                                            scanner.nextLine();
                                            biblioteca.excluirLivro(indexExclusao);
                                            break;
                                            
                                            case 5:
                                                
                                                //Sair do sistema
                                                
                                                System.out.println("Saindo...");
                                                scanner.close();
                                                return;
                                                
                                                default:
                                                System.out.println("OPÇÃO INVÁLIDA . TENTE NOVAMENTE");
            
                                        
                          }
                
            }
        }
    }