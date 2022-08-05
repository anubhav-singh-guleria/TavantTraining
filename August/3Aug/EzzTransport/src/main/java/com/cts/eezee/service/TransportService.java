package com.cts.eezee.service;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.expression.ParseException;

import com.cts.eezee.model.Booking;
import com.cts.eezee.model.Vehicle;

public class TransportService {
	   private Vehicle vehicle;
	   private ArrayList<Booking> bookings=new ArrayList<>();
	   
	   public Vehicle getVehicle() {
	      return vehicle;
	   }

	   public void setVehicle(Vehicle vehicle) {
	      this.vehicle = vehicle;
	   }

	   public void registerBooking(Booking booking) throws ParseException {
		   bookings.add(booking);
	   }

	   public void calculateTravelCost(String source, String destination, String doj) {
		   if(checkAvailableDateForTravel(doj))
				System.out.println("Total travel cost is "+getCost(destination));
	   }

	   public boolean checkAvailableDateForTravel(String doj) {
		   for(Booking b:bookings)
			{
				if(doj.equals(b.getDateOfJourney()))
					return false;
			}
			return true;
	   }
	   public double getCost(String destination) {
		   
		   return vehicle.getDestinationMap().get(destination);
	   }

}
	