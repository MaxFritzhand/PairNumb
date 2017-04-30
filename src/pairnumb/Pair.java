/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pairnumb;
import java.lang.Math;
/**
 *
 * @author MaxFritzhand
 */
public class Pair {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    
    public double first;
    public double second;
    public void Pair(double aFirst, double aSecond){
        first = aFirst;
        second = aSecond;
        
    }
    public double getSum(){
        return first + second;
    }
    public double getDifference(){
        return first - second;
    }
    public double getProduct(){
        return first * second;
    }
    public double getAverage(){
        return (first+second)/2;
        
    }
    public double getDistance(){
        return Math.abs(Math.abs(first) - Math.abs(second));
    }
    public double getMax(){
        return Math.max(first, second);
    }
    public double getMin(){
        return Math.min(first, second);
    }
    
    
}

