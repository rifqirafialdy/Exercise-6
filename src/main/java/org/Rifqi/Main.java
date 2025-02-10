package org.Rifqi;

import org.Rifqi.utils.ArraysNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        String choice;
        do {
            System.out.println("input your number : ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid Input please put number");
                scanner.next();

            }
            numbers.add(scanner.nextInt());
            System.out.println("Do u want to Continue? (y/n)");
            choice = scanner.next().toLowerCase();
        } while (choice.equalsIgnoreCase("y"));
        scanner.close();
        System.out.println("Your Number " + numbers);
        ArraysNumber arraysNumber = new ArraysNumber();
        List<Integer> rotatedList = arraysNumber.rotate(numbers, 2);

        System.out.println("Your rotated Number :" + rotatedList);
        System.out.println("Removed All Duplicate : " + arraysNumber.removeAllDuplicate(numbers));
        System.out.println("Is there Duplicate :" + arraysNumber.isDuplicate(numbers));
        System.out.println("Your Array without Duplicate :" + arraysNumber.removeDuplicate(numbers));
        System.out.println("Your Sorted Array :" + arraysNumber.sortArray(numbers, "desc"));
        System.out.println("Your Removed Occurance : " + arraysNumber.removeAllOccurance(numbers, 1));
    }
}