/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2.pkg2;

/**
 *
 * @author 2277120
 */
public class Task22 {


    public static void main(String[] args) {
        System.out.printf("%-10s %-10s %-10s%n", "Side 1", "Side 2", "Hypotenuse");
        for (int side1 = 1; side1 <= 500; side1++) {
            for (int side2 = 1; side2 <= 500; side2++) {
                for (int hypotenuse = 1; hypotenuse <= 500; hypotenuse++) {
                    if (side1 * side1 + side2 * side2 == hypotenuse * hypotenuse) {
                        System.out.printf("%-10d %-10d %-10d%n", side1, side2, hypotenuse);
                    }
                }
            }
        }               
    }
}   
