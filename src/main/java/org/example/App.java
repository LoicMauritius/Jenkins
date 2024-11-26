package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Bienvenue dans le quiz Jenkins !");
        System.out.println("Voici votre énigme :");
        System.out.println("Jenkins est un outil d'intégration et de livraison continue. " +
                "Comment s'appelle la fonctionnalité utilisée pour organiser des étapes comme 'Build', 'Test', et 'Deploy' ?");
        
        System.out.println("1. Job");
        System.out.println("2. Pipeline");
        System.out.println("3. Node");
        System.out.println("4. Workspace");
        
        System.out.print("Entrez le numéro de votre réponse : ");
        
        Scanner scanner = new Scanner(System.in);
        int choix = scanner.nextInt();
        
        if (choix == 2) {
            System.out.println("Vous êtes un vrai Tran !");
        } else {
            System.out.println("Vous avez faux.");
        }
        
        scanner.close();
    }
}
