package com.cts.eezee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.eezee.model.Booking;
import com.cts.eezee.service.TransportService;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
    	TransportService ts=context.getBean("transportService",TransportService.class);
    	Booking book=context.getBean("booking",Booking.class);
    	book.setCustomername("Reethik");
    	book.setDestination("Bangalore");
    	book.setMobileNumber(7008830278L);
        book.setDateOfJourney("25-06-2000");
    	ts.registerBooking(book);
    	ts.calculateTravelCost("Chennai", "Pune", "26-07-2001");
    	System.out.println(ts.checkAvailableDateForTravel("25-06-2001"));
    	System.out.println("The total cost is "+ts.getCost("Hyderabad"));
    }
}
