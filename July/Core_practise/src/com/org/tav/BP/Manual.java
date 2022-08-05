package com.org.tav.BP;

public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    public Manual(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer,
            GPSNavigator gpsNavigator) {
        super();
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }
public String print() {
    String info = "";
    info += "Type of Car "+carType+"\n";
    info += "Count of seats "+seats +"\n";
    info += "Engine "+ engine.getVolume();
    info += "Transmission "+transmission +"\n";

    if(this.tripComputer != null) {
        info += "tripcomputer : Functionla "+"\n";

    }else {
        info += "trip comp "+"\n";

    }if(this.gpsNavigator != null) {
info += "GPSNavigator : Functionla "+"\n";

    }else {
        info += "GPS"+"\n";
    }

    return info;        
}
}