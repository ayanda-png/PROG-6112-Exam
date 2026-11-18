/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesreport;

/**
 *
 * @author mamelodi
 */
public class PrintProduct {
   

    private final Product product;

    // Constructor
    public PrintProduct(Product product) {
        this.product = product;
    }

    // Print total sales
    public void PrintTotalProductSales() {
        System.out.println("Total Product Sales: "
                + product.GetTotalProductsSold());
    }

    // Print average sales
    public void PrintAverageProductSales() {
        System.out.println("Avarage Product Sales: "
                + product.GetAverageProductSold());
    }

    // Print most popular product
    public void PrintMostPopularProduct() {
        System.out.println("Most popular Product: "
                + product.GetMostPopularProduct());
    }

    // Print the complete report
    public void PrintReport() {

        System.out.println();
        System.out.println("Product Sales Report of 2026");
        System.out.println("**************");

        PrintTotalProductSales();
        PrintAverageProductSales();
        PrintMostPopularProduct();
    }
}
    
    
    



