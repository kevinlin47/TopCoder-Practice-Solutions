/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
