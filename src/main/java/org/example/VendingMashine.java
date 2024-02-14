package org.example;

import java.util.List;

public interface VendingMashine {

    void initProducts(List<Product> list);
    Product getProduct(String name);

    List<Product> getProductList();

    void setProductList(List<Product> productList);
}
