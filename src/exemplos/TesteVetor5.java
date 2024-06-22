
package exemplos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import util.Tela;
public class TesteVetor5 {
    public static void main(String[] args) {
        
        String menu = "ESCOLHA UMA DAS OPÇÕES ABAIXO:\n"
                + "1 - Cadastrar Funcionario\n"
                + "2 - Listar Funcionario\n"
                + "3 - Sair";
        
        int opcao;
        do{
            opcao = Tela.nextInt(menu);
            
            switch (opcao) {
                case 1: //cadastro 
                    break;
                    
                case 2: //cadastro  
                    break;
                        
                case 3:
                    Tela.showMesssage("Você escolheu sair!"); 
                    break;
                            
                
                default:
                    Tela.showMesssage("Opção invalida!");
                    
                    
            }
            
        } while (opcao != 3);
        
    }
}
