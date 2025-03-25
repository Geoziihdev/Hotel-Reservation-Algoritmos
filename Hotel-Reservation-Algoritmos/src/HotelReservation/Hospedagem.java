package HotelReservation;

import java.util.Scanner;

public class Hospedagem {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o valor padrão da diária: ");
            double diaria = scanner.nextDouble();
            scanner.nextLine(); // Consumir quebra de linha
            int gratuidades = 0, meias = 0;
            double total = 0;
            while (true) {
                System.out.print("Digite o nome do hóspede (ou 'PARE' para encerrar): ");
                String nome = scanner.nextLine();
                
                if (nome.equalsIgnoreCase("PARE")) break;
                
                System.out.print("Digite a idade do hóspede: ");
                int idade = scanner.nextInt();
                scanner.nextLine(); // Consumir quebra de linha
                
                if (idade < 4) {
                    System.out.println(nome + " possui gratuidade.");
                    gratuidades++;
                } else if (idade > 80) {
                    System.out.println(nome + " paga meia.");
                    meias++;
                    total += diaria / 2;
                } else {
                    total += diaria;
                }
            }   System.out.println("Total de hospedagens: R$" + total);
            System.out.println(gratuidades + " gratuidade(s); " + meias + " meia(s).");
        }
    }
}
