package ru.gb.zimakov;

public class Plate {
    public int food;

    public Plate(int food) {
        if(food < 0) {
            this.food = 0;
        } else {
            this.food = food;
        }
    }

    public void decreaseFood(int n) {
        if (n < 1) {
            return;
        }
        food -= n;
    }
    public void increaseFood(int x) {
        if (x < 1) {
            return;
        }
        food += x;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
}
