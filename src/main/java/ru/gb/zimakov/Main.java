package ru.gb.zimakov;
import java.util.Scanner;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int action;
        Cat allCats [] = new Cat [3];
        allCats[0] = new Cat("Barsic",15, false);
        allCats[1] = new Cat("Murzic", 10, false);
        allCats[2] = new Cat("Karatel",35, false);

        Plate plate = new Plate(100);

        plate.info();
        for (int i = 0; i < allCats.length; i++) {
            if(allCats[i].GetSatiety() == false && allCats[i].GetAppetite() < plate.food){
                allCats[i].eat(plate);
                allCats[i].SetSatiety(true);
                System.out.println("Cat " + allCats[i].GetName() + " eat!");
            } else {
                System.out.println("Cat " + allCats[i].GetName() + " not eat!");
            }
        }
        plate.info();
        System.out.println("How much food to add?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();
    }
}
