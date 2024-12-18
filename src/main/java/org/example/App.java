package org.example;

public class App {
    // Méthode récursive pour calculer un terme de la suite de Fibonnacci
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // Nombre de termes à afficher
        //Modification
        System.out.println("Nous sommes l'équipe 4");

        System.out.println("Les 10 premiers nombres de la suite de Fibonacci (récursif) sont :");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
