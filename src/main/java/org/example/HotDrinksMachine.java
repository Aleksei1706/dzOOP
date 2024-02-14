package org.example;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksMachine implements VendingMashine{
    List<Product> productList = new ArrayList<>();

    public void addHotDrink(HotDrink drink){
        productList.add(drink);
    }

    public HotDrinksMachine() {
    }

    @Override
    public void initProducts(List<Product> list) {
        productList = list;
    }

    @Override
    public Product getProduct(String name) {
        for (Product i : productList) {
            if(i.getName().equals(name)){
                return i;
            }

        }
        return null;
    }

    @Override
    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
