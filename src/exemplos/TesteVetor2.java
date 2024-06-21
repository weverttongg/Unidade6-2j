
package exemplos;
import javax.swing.JOptionPane;
public class TesteVetor2 {
    public static void main(String[] args) {
        
    
     int quantidade = Integer.parseInt
         (JOptionPane.showInputDialog("Digite a quantidade de nomes"));
     String nomes[] = new String[quantidade];
     
     for (int i = 0; i < quantidade; i++) {
nomes[i] = JOptionPane.showInputDialog("Digite o " + (i+1) + "º nome");
}
   System.out.println("Lista de chamada");
   for (String nome: nomes) {
       System.out.println(nome);
   }
   
}
 }
