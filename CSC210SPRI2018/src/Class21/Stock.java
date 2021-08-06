/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class21;

/**
 *
 * @author lkhan
 */
public class Stock {
    private String date;
    private double open;
    private double close;
    private double low;
    private double high;
    private int volume;
    
    public Stock(double open, double close, double high, double low,int volume){
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.volume = volume;
       
    }
    public Stock(){
        
    }
    
    //my setters
//    public void setOpen(double a){
//        this.open = a;
//    }
//    public void setClose(double a){
//        this.close = a;
//    }
//    public void setLow(double a){
//        this.low = a;
//    }
//    public void setHigh(double a){
//        this.high = a;
//    }
      public void setDate(String date){
          this.date = date;
      }
    
    
    //getters
    public double getOpen() {
        return open;
    }

    public double getClose() {
        return close;
    }

    public double getLow() {
        return low;
    }

    public double getHigh() {
        return high;
    }

    public int getVolume() {
        return volume;
    }
    public String getDate(){
        return date;
    }
    //computed methods
    public double getAverage(){
        return (this.open+this.close+this.low+this.high)/4;
    }
    public double getMid(){
        return (this.high+this.low)/2;
    }
}
