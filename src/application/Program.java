package application;

import boardgam.Board;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Board board = new Board(8, 8);
        System.out.println();

        sc.close();
    }
}
