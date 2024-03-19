public class NumeroPrimo {

    // Função para verificar se um número é primo
    public static boolean ehPrimo(int numero) {
        // Caso especial para números menores que 2
        if (numero < 2) {
            return false;
        }
        
        // Verifica se o número é divisível por algum número menor que ele
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Exemplos
        int[] numerosParaTestar = {2, 3, 4, 17, 20};
        
        for (int numero : numerosParaTestar) {
            if (ehPrimo(numero)) {
                System.out.println(numero + " é primo.");
            } else {
                System.out.println(numero + " não é primo.");
            }
        }
    }
}