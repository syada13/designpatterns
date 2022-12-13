package com.suresh.iterator.example1;

public class Waitress {

    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;

    }

    public void printMenu() {
        Iterator pancackeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("MENU\n---- \nBREAKFAST");
        printMenu(pancackeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);

    }

    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " --- ");
            System.out.println(menuItem.getDescription());

        }
    }

}
