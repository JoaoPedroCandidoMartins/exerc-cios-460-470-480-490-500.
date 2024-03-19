import java.util.Scanner;

public class Dobro {

    // Função para calcular o dobro de um número
    public static int calcularDobro(int numero) {
        return numero * 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[3];
        
        // Entra com três números
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o número " + (i+1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        // Imprime o dobro de cada número
        for (int i = 0; i < 3; i++) {
            int dobro = calcularDobro(numeros[i]);
            System.out.println("O dobro de " + numeros[i] + " é " + dobro);
        }

        scanner.close();
    }
}