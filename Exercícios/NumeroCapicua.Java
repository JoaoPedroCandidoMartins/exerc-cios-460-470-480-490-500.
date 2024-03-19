public class NumeroCapicua {
    
    // Função para verificar se um número é capicua
    public static boolean ehCapicua(int numero) {
        String numeroString = String.valueOf(numero); // Transforma o número em uma string
        
        // Verifica se a string é igual à sua inversa
        String numeroInvertido = new StringBuilder(numeroString).reverse().toString();
        
        // Compara se o número original é igual ao número invertido
        return numeroString.equals(numeroInvertido);
    }

    public static void main(String[] args) {
        // Exemplos
        int[] numerosParaTestar = {12321, 2002, 12345, 1221};
        
        for (int numero : numerosParaTestar) {
            if (ehCapicua(numero)) {
                System.out.println(numero + " é um número capicua.");
            } else {
                System.out.println(numero + " não é um número capicua.");
            }
        }
    }
}