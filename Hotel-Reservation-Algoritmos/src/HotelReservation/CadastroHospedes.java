package HotelReservation;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroHospedes {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<String> hospedes = new ArrayList<>();
            
            OUTER:
            while (true) {
                System.out.println("Digite 1- cadastrar; 2- pesquisar; 3- sair");
                int opcao = scanner.nextInt();
                scanner.nextLine();
                switch (opcao) {
                    case 1 -> {
                        if (hospedes.size() >= 15) {
                            System.out.println("Máximo de cadastros atingido.");
                        } else {
                            System.out.print("Digite o nome do hóspede: ");
                            hospedes.add(scanner.nextLine());
                        }
                    }
                    case 2 -> {
                        System.out.print("Digite o nome para pesquisa: ");
                        String nome = scanner.nextLine();
                        int index = hospedes.indexOf(nome);
                        if (index != -1) {
                            System.out.println("Hóspede " + nome + " foi encontrado no índice " + index);
                        } else {
                            System.out.println("Hóspede não encontrado.");
                        }
                    }
                    case 3 -> {
                        break OUTER;
                    }
                    default -> System.out.println("Opção inválida.");
                }
            }
        }
    }
}
