package com.campusdual.classroom;

public class Exercise13 {
    public static void main(String[] args) {
        FuelTank ft = new FuelTank();
        ft.showDetails();
        System.out.println("Actualización capacidad");
        ft.setActualFuel(15);
        ft.showDetails();
        ft.setActualFuel(-8);
        ft.showDetails();
    }
}