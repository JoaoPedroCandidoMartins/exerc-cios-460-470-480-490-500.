public class Main {
    public static void main(String[] args) {
        char[] vetor = {'a', 'b', 'c', 'a', 'd', 'e', 'a'};
        char caractere = 'a';
        
        System.out.print("Vetor original: ");
        for (char c : vetor) {
            System.out.print(c + " ");
        }
        System.out.println();
        
        int totalRetirado = substituirCaractere(vetor, vetor.length, caractere);
        
        System.out.print("Vetor modificado: ");
        for (char c : vetor) {
            System.out.print(c + " ");
        }
        System.out.println("\nTotal de caracteres retirados: " + totalRetirado);
    }
    
    public static int substituirCaractere(char[] vetor, int tamanho, char caractere) {
        int totalRetirado = 0;
        
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == caractere) {
                vetor[i] = '*';
                totalRetirado++;
            }
        }
        
        return totalRetirado;
    }
}