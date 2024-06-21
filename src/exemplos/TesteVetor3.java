
package exemplos;

import javax.swing.JOptionPane;

/**
 *
 * @author Wevertton
 */
public class TesteVetor3 {
    public static void main(String[] args) {
        int quantidade = Integer.parseInt
         (JOptionPane.showInputDialog("Digite a quantidade de nomes"));
     String nomes[] = new String[quantidade];
     double medias[] = new double[quantidade];
     for (int i = 0; i < quantidade; i++) {
     String msg = "do " + (i+1) + " aluno";
     nomes[i] = JOptionPane.showInputDialog("Digite o nome "  + msg);
     medias[i] = Double.parseDouble (JOptionPane.showInputDialog("Digite a média " + msg));
     }
     String resultado ="-----------RESULTADO DA TURMA--------------\n";
     for (int i = 0; i < quantidade; i++) {
     resultado += nomes[i] + " média: " + medias[i] + " situação:";
     if (medias[i] > 6) {
     resultado += " aprovado \n";
     } else{
     resultado += " recuperação\n";
     
     }
     JOptionPane.showMessageDialog(null, resultado);
     }
     
    }
}
