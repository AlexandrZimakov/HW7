package ru.gb.zimakov;

public class Cat {
    private String name;
    public String GetName() { return name; }

    private int appetite;
    public int GetAppetite() { return appetite; }

    private boolean satiety;
    public boolean GetSatiety() { return satiety; }
    public void SetSatiety(boolean newVal) { satiety = newVal; }

    public Cat (String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public void eat (Plate p) {
        p.decreaseFood (appetite);
    }
}
