package org.example;

public class App {
    // Méthode récursive pour calculer le n-ième terme de Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // Nombre de termes à afficher

        System.out.println("Les 10 premiers nombres de la suite de Fibonacci (récursif) sont :");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
