
package exemplos;


public class TesteVetor1 {
    public static void main(String[] args) {
        double notas[] = { 6 , 7, 8.5,5.5, 5 ,9};
    notas[0] = 9.35;
        System.out.println("notas[0]");
        System.out.println(notas[0]);
        System.out.println("--------------------");

 for (int i = 0; i < notas.length; i++) {
     System.out.println(i + " | " + notas[i]);
 }   
 
        System.out.println("---------------------------");
        for(double nota : notas) {
            System.out.println("Nota: " + nota);
        }
        System.out.println("----------------------");
        System.out.println("Total de notas: " + notas.length);
    }
   
}