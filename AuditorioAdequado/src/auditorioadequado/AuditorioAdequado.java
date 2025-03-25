package auditorioadequado;

import java.util.Scanner;

public class AuditorioAdequado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de convidados: ");
        int convidados = scanner.nextInt();

        if (convidados < 0 || convidados > 350) {
            System.out.println("Número de convidados inválido.");
        } else if (convidados <= 150) {
            System.out.println("Use o auditório Alfa.");
        } else if (convidados <= 220) {  // 150 + 70 cadeiras extras
            int cadeirasExtras = convidados - 150;
            System.out.println("Use o auditório Alfa.");
            System.out.println("Inclua mais " + cadeirasExtras + " cadeiras.");
        } else {
            System.out.println("Use o auditório Beta.");
        }

        scanner.close();
    }
}
