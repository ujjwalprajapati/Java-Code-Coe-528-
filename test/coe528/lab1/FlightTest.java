package coe528.lab1;
import org.junit.Test;
import static org.junit.Assert.*;

public class FlightTest {
    
    @Test(expected = IllegalArgumentException.class)    
     public void testInvalidConstructor(){
     Flight f= new Flight(122,"Toronto","Toronto","11:20",250,1200);
}
    @Test
    public void testConstructor(){
        Flight n = new Flight(122,"Toronto","New York","11:30",230,1300);
    }
    
    @Test
    public void testSetflightNumber() {
         System.out.println("setFlightNumber");
         int flightNumber = 122;
          Flight n = new Flight(122,"Toronto","New York","11:30",230,1300);
          n.setflightNumber(flightNumber);
       assertEquals(n.getflightNumber(), flightNumber);
    }
    @Test
    public void testGetflightNumber() {
         System.out.println("getflightNumber");
         Flight n = new Flight(122,"Toronto","New York","11:30",230,1300);
         int expResult = 122;
         n.setflightNumber(122);
         int result = n.getflightNumber();
         assertEquals(expResult, result);
    }

    @Test
    public void testSetOrigin() {
        System.out.println("setOrigin");
         String Origin = "Toronto";
          Flight n = new Flight(122,"Toronto","New York","11:30",230,1300);
          n.setOrigin(Origin);
       assertEquals(n.getOrigin(), Origin);
    }
    
    @Test
    public void testGetOrigin() {
        System.out.println("getOrigin");
         Flight n = new Flight(122,"Toronto","New York","11:30",230,1300);
         String expResult = "Toronto";
         n.setOrigin("Toronto");
         String result = n.getOrigin();
         assertEquals(expResult, result);
    }
    @Test
    public void testSetDestination() {
      System.out.println("setDestination");
         String Destination = "New York";
          Flight n = new Flight(122,"Toronto","New York","11:30",230,1300);
          n.setDestination(Destination);
       assertEquals(n.getDestination(), Destination);  
    }

    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
         Flight n = new Flight(122,"Toronto","New York","11:30",230,1300);
         String expResult = "New York";
         n.setDestination("New York");
         String result = n.getDestination();
         assertEquals(expResult, result);
    }
    @Test
    public void testSetdepartureTime() {
        System.out.println("setdepartureTime");
         String departureTime = "11:30";
          Flight n = new Flight(122,"Toronto","New York","11:30",230,1300);
          n.setdepartureTime(departureTime);
       assertEquals(n.getdepartureTime(), departureTime);  
    }
    @Test
    public void testGetdepartureTime() {
      System.out.println("getdepartureTime");
         Flight n = new Flight(122,"Toronto","New York","11:30",230,1300);
         String expResult = "11:30";
         n.setdepartureTime("11:30");
         String result = n.getdepartureTime();
         assertEquals(expResult, result);  
    }

    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
         int Capacity  = 230;
          Flight n = new Flight(122,"Toronto","New York","11:30",230,1300);
          n.setCapacity(Capacity);
       assertEquals(n.getCapacity(), Capacity);
    }
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
         Flight n = new Flight(122,"Toronto","New York","11:30",230,1300);
         int expResult = 230;
         n.setCapacity(230);
         int result = n.getCapacity();
         assertEquals(expResult, result);
    }

    @Test
    public void testSetoriginalPrice() {
         System.out.println("setoriginalPrice");
         double originalPrice = 1300;
          Flight n = new Flight(122,"Toronto","New York","11:30",230,1300);
          n.setoriginalPrice(originalPrice);
       assertEquals(n.getoriginalPrice(), originalPrice,0.1);
        
    }

    @Test
    public void testGetoriginalPrice() {
        System.out.println("getoriginalPrice");
         Flight n = new Flight(122,"Toronto","New York","11:30",230,1300);
         double expResult = 1300;
         n.setoriginalPrice(1300);
         double result = n.getoriginalPrice();
         assertEquals(expResult, result,0.1);
    }

    @Test
    public void testBookAseat() {
        
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Flight instance = new Flight(122,"Toronto","New York","11:30",230,1300);
        String expResult = "Flight 122, Toronto to New York, 11:30, original price: 1300.0$";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    

    
}
