package HotelReservation;

import java.util.Scanner;

public class TrocaDeQuartos {
    public static void main(String[] args) {
        // Recebe dados do primeiro hóspede
        try (Scanner scanner = new Scanner(System.in)) {
            // Recebe dados do primeiro hóspede
            System.out.print("Digite o nome do primeiro hóspede: ");
            String nome1 = scanner.nextLine();
            System.out.print("Digite a idade do primeiro hóspede: ");
            int idade1 = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha
            // Recebe dados do segundo hóspede
            System.out.print("Digite o nome do segundo hóspede: ");
            String nome2 = scanner.nextLine();
            System.out.print("Digite a idade do segundo hóspede: ");
            int idade2 = scanner.nextInt();
            String quartoA, quartoB;
            double desconto = 0;
            // Define quem fica no quarto A e quem fica no quarto B
            if (idade1 > idade2) {
                quartoA = nome1;
                quartoB = nome2;
                if (idade1 >= 60) desconto = 40;
            } else {
                quartoA = nome2;
                quartoB = nome1;
                if (idade2 >= 60) desconto = 40;
            }   System.out.println("Quarto A: " + quartoA + (desconto > 0 ? " com desconto de 40%" : ""));
            System.out.println("Quarto B: " + quartoB);
        }
    }
}
