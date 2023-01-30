

package coe528.lab1;

public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsLeft;
    private double originalPrice;
    
     public Flight(int fl,String or,String des,String dep,int cap,double op){
         this.flightNumber =fl; 
         this.capacity = cap;
         this.originalPrice = op;
         this.departureTime = dep;
         if(or.equals(des)){
             throw new IllegalArgumentException("Origin and destination can't be the same");
         }
         else{
              this.destination=des;
              this.origin=or;
         }
         numberOfSeatsLeft= capacity;
         
} 
     public int getnumberOfSeatsLeft(){
         return numberOfSeatsLeft;
     }
    public void setflightNumber(int flightNumber){
        this.flightNumber=flightNumber;
    } 
    public int getflightNumber(){
        return flightNumber;
    }
    public void setOrigin(String origin){
        this.origin = origin;
    }
    public String getOrigin(){
        return origin;
    }
    public void setDestination(String destination){
        this.destination = destination;
    }
    public String getDestination(){
        return destination;
    }
    public void setdepartureTime(String departureTime){
        this.departureTime = departureTime;
    }
    public String getdepartureTime(){
        return departureTime;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity; 
    }
    public int getCapacity(){
        return capacity;
    }
    public void setoriginalPrice(double originalPrice){
       this.originalPrice = originalPrice;
    }
    public double getoriginalPrice(){
        return originalPrice;
    }
    public boolean bookAseat(){
        if(numberOfSeatsLeft>0){
            numberOfSeatsLeft--;
          return true; 
}
        else{
            return false;}
}


    
    @Override
    public String toString(){
     return "Flight "+flightNumber+", "+origin+" to "+destination+", "+departureTime+", original price: $"+originalPrice;  
    }
    /*public static void main(String[] args){
        Flight yeas = new Flight(901,"New Delhi","Kolkata","21:09",150,40);
       System.out.println(yeas.getnumberOfSeatsLeft());
    }*/
    
}

