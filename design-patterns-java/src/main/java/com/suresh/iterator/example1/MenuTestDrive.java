package com.suresh.iterator.example1;

public class MenuTestDrive {
    public static void main(String[] args) {
        /*
         * 1. Create the new menu
         * 2. Create the Waitress and pass the menu
         * 3. Print the menu
         */

        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();

    }

}
