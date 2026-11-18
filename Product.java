/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesreport;

/**
 *
 * @author mamelodi
 */
public class Product {
    

    private final String[] productNames;

    
    private final int[][] sales;

    
    public Product(String[] productNames, int[][] sales) {
        this.productNames = productNames;
        this.sales = sales;
    }

    
    public int GetTotalProductsSold() {

        int total = 0;

        for (int[] sale : sales) {
            for (int j = 0; j < sale.length; j++) {
                total += sale[j];
            }
        }

        return total;
    }

    public double GetAverageProductSold() {

        int total = GetTotalProductsSold();
        int numberOfSales = 0;

        for (int[] sale : sales) {
            numberOfSales += sale.length;
        }

        if (numberOfSales == 0) {
            return 0;
        }

        return (double) total / numberOfSales;
    }

   
    public String GetMostPopularProduct() {

        int highestTotal = 0;
        int popularIndex = 0;

        for (int i = 0; i < sales.length; i++) {

            int productTotal = 0;

            for (int j = 0; j < sales[i].length; j++) {
                productTotal += sales[i][j];
            }

            if (productTotal > highestTotal) {
                highestTotal = productTotal;
                popularIndex = i;
            }
        }

        int highestMonthlySale = 0;

        for (int j = 0; j < sales[popularIndex].length; j++) {
            if (sales[popularIndex][j] > highestMonthlySale) {
                highestMonthlySale = sales[popularIndex][j];
            }
        }

        return productNames[popularIndex]
                + "(" + highestMonthlySale + ")";
    }
}

