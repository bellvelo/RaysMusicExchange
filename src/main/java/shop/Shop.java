package shop;

import Instruments.Guitar;
import Instruments.Instrument;
import interfaces.ISell;
import misc_items.Item;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;
    private double till;

    public Shop(String name, ArrayList<ISell> stock, double till) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
        this.till = till;
    }

    public double getTill() {
        return this.till;
    }

    public ArrayList<ISell> getStock(){
        return stock;
    }

    public int getStockCount() {
        return this.stock.size();
    }

    public void buyItem(ISell stockItem) {
        this.stock.add(stockItem);
        this.till -= stockItem.getBuyPrice();
    }

    public void sellItem(ISell stockItem) {
        this.stock.remove(stockItem);
        this.till += stockItem.getSellPrice();

    }

    public int getTotalProfit() {
        int totalProfit = 0;
        for(ISell stockItems : stock){
            totalProfit += stockItems.calculateMarkUp();
        } return totalProfit;
    }

}

