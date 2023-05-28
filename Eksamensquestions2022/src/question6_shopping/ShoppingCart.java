package question6_shopping;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Item> itemList = new ArrayList<Item>();
    private int discount = 0;

    public ShoppingCart(){

    }

    public void addItem(Item i){
        itemList.add(i);
    }

    public void removeItem(Item i){
        if(itemList.contains(i)){
            itemList.remove(i);
        }
    }

    public int getTotalPrice(){
        int output = 0;
        for(Item i: itemList){
            output += i.getPrice();
        }
        if(discount > 0){
            return output-discount;
        }
        return output;
    }

    public ArrayList<Item> getItems(){
        for(Item i: itemList){
            System.out.println(i.getName()+" "+i.getPrice());
        }
        return itemList;
    }

    public void setDiscount(int i){
        this.discount = i;
    }
}
