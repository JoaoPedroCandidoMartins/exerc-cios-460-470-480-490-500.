import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        boolean dadosVetorAInseridos = false;
        boolean dadosVetorBInseridos = false;
        
        int opcao;
        do {
            System.out.println("VETORES");
            System.out.println("1. Dados do VETOR A");
            System.out.println("2. Dados do VETOR B");
            System.out.println("3. Imprime VETORES");
            System.out.println("4. Soma VETORES");
            System.out.println("5. Subtrai VETORES");
            System.out.println("6. Sai do programa");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Entrada do VETOR A");
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Digite número " + (i + 1) + ": ");
                        vetorA[i] = scanner.nextInt();
                    }
                    dadosVetorAInseridos = true;
                    break;
                case 2:
                    System.out.println("Entrada do VETOR B");
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Digite número " + (i + 1) + ": ");
                        vetorB[i] = scanner.nextInt();
                    }
                    dadosVetorBInseridos = true;
                    break;
                case 3:
                    if (!dadosVetorAInseridos || !dadosVetorBInseridos) {
                        System.out.println("Escolha primeiro opções 1 e 2.");
                    } else {
                        System.out.println("VETOR A:");
                        for (int num : vetorA) {
                            System.out.println(num);
                        }
                        System.out.println("VETOR B:");
                        for (int num : vetorB) {
                            System.out.println(num);
                        }
                    }
                    break;
                case 4:
                    if (!dadosVetorAInseridos || !dadosVetorBInseridos) {
                        System.out.println("Escolha primeiro opções 1 e 2.");
                    } else {
                        System.out.println("Soma dos VETORES:");
                        for (int i = 0; i < 5; i++) {
                            System.out.println(vetorA[i] + vetorB[i]);
                        }
                    }
                    break;
                case 5:
                    if (!dadosVetorAInseridos || !dadosVetorBInseridos) {
                        System.out.println("Escolha primeiro opções 1 e 2.");
                    } else {
                        System.out.println("Subtração dos VETORES:");
                        for (int i = 0; i < 5; i++) {
                            System.out.println(vetorA[i] - vetorB[i]);
                        }
                    }
                    break;
                case 6:
                    System.out.println("Saindo do Algoritmo");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha uma opção entre 1 e 6.");
                    break;
            }
        } while (opcao != 6);
        
        scanner.close();
    }
}