package HotelReservation;

import java.util.Scanner;


public class OcupacaoHotel {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean[][] hotel = new boolean[4][3];
            
            while (true) {
                System.out.print("Informe Andar (1-4) e Quarto (1-3), ou 0 para sair: ");
                int andar = scanner.nextInt();
                if (andar == 0) break;
                int quarto = scanner.nextInt();
                
                hotel[andar - 1][quarto - 1] = true;
                
                System.out.print("Deseja informar outra ocupação? (S/N): ");
                if (scanner.next().equalsIgnoreCase("N")) break;
            }

            System.out.println("\nOcupação do hotel:");
            for (int i = 0; i < 4; i++) {
                System.out.print((i + 1) + "º andar: ");
                for (int j = 0; j < 3; j++) {
                    System.out.print("Quarto " + (j + 1) + (hotel[i][j] ? " ocupado | " : " desocupado | "));
                }
                System.out.println();
            }
        }
    }
}
