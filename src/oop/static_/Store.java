package oop.static_;

public class Store {
    private static int totalSales = 0;

    static void addSale(int amount){
        Store.totalSales += amount;
    }

    static int getTotalSales(){
        return Store.totalSales;
    }
}
