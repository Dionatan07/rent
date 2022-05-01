package application;

import entities.Rent;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = teclado.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("");
            System.out.println("Rent #" + i + ": ");
            System.out.print("Name: ");
            teclado.nextLine();
            String name = teclado.nextLine();

            System.out.print("Email: ");
            String email = teclado.nextLine();

            System.out.print("Room: ");
            int room = teclado.nextInt();

            vect[room] = new Rent(name, email);
        }

        System.out.println("");
        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

    }

}
