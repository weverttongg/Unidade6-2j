
package exemplos;

import javax.swing.JOptionPane;


public class TesteVetor4 {
    public static void main(String[] args) {
        int quantidade = Integer.parseInt
         (JOptionPane.showInputDialog("Digite a quantidade de funcionarios"));
        
        Funcionario funcionarios[] = new Funcionario[quantidade];
        
        for (int i = 0; i < quantidade; i++) {
            
            Funcionario f = new Funcionario();
            f.setNome(JOptionPane.showInputDialog("Digite o nome"));
            f.setSalario(Double.parseDouble(
                    JOptionPane.showInputDialog("Digite o salario")));
            funcionarios[i] = f;
        }
        
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}
