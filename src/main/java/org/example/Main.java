package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.addNumero(1);
        manager.addNumero(2);
        manager.addNumero(3);
        System.out.println("La suma es: " + manager.getSuma());
    }
}