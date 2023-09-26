package com.learn.java8.functionalinterfaces.defaultmethods;


import java.time.LocalDate;
import java.util.function.Supplier;
import java.util.spi.LocaleNameProvider;

/*class SupplierImpl implements Supplier{

    @Override
    public LocalDate get() {
        return LocalDate.now();
    }
}*/
public class SupplierDemo {
    public static void main(String[] args) {
        //Supplier<LocalDate> supp = new SupplierImpl();
        //System.out.println(supp.get());

        Supplier<LocalDate> supp = () -> LocalDate.now();
        System.out.println(supp.get());

    }
}
