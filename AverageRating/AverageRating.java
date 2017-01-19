/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* Problem Statement
You are creating a website where people can rate the quality of products. 
Each rating is a number from 1 to 5, inclusive. 
An average rating of a product is defined as the arithmetic average of all individual ratings that it received. 
In other words, the average rating is the sum of all ratings divided by their count. 
It is known that some product has received n1 ratings of 1, n2 ratings of 2, n3 ratings of 3, n4 ratings of 4 and n5 ratings of 5. 
Return the average rating of this product.
*/

/**
 *
 * @author Kevin Lin
 */
public class AverageRating {
    
    public double calculate(int n1,int n2,int n3,int n4,int n5)
    {
        double oneRating=(double)n1*1;
        double twoRating=(double)n2*2;
        double threeRating=(double)n3*3;
        double fourRating=(double)n4*4;
        double fiveRating=(double)n5*5;
        
        double sum=oneRating+twoRating+threeRating+fourRating+fiveRating;
        double average=sum/(n1+n2+n3+n4+n5);
        
        return average;
    }
}
