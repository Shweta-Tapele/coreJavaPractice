package com.learn.java8.streams.filterdemos;


import java.util.ArrayList;
import java.util.List;

class Product
{
    int prod_num;
    String prod_name;
    int price;

    Product(int prod_num, String prod_name, int price)
    {
        this.prod_num= prod_num;
        this.prod_name= prod_name;
        this.price= price;
    }
}
public class FilterDemo4 {
    public static void main(String[] args) {


        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"lenovo",25000));
        productList.add(new Product(2,"hp",50000));
        productList.add(new Product(3,"dell",34000));
        productList.add(new Product(4,"chromebook",90000));


        productList.stream().filter(p->p.price>25000).forEach(p->System.out.println(p.price));



    }
}
