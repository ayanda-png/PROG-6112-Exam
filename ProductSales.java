/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesreport;

import java.util.Scanner;

/**
 *
 * @author mamelodi
 */
public class ProductSales {
    

public class ProductSalesApp {

    public static void main(String[] args) {

        // Product names
        try (Scanner input = new Scanner(System.in)) {
            // Product names
            String[] productNames = {
                "Cozy  mattress",
                "Rest easy mattress",
                "King size mattress"
            };
            
            // Store sales for three months
            int[][] sales = new int[3][3];
            
            // Enter sales information
            for (int a = 0; a < productNames.length; a++) {
                
                for (int j = 0; j < 3; j++) {
                    
                    System.out.print(
                            "Enter number of sales for month "
                                    + (j + 1) + " for "
                                    + productNames[a] + ": "
                    );
                    
                    sales[a][j] = input.nextInt();
                }
                
                System.out.println();
            }
            
            // Create Product object
            Product product = new Product(productNames, sales);
            
            // Create PrintProduct object
            PrintProduct printer = new PrintProduct(product);
            
            // Display report
            printer.PrintReport();
        }
    }
    
