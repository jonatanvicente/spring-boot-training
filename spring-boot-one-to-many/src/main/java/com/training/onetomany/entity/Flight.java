package com.training.onetomany.entity;


import javax.persistence.*;

@Entity
@Table(name = "Flights")
public class Flight {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="flightID")
    private int flightId;
/*    @Column(name="Dest")
    private String dest;*/


    @ManyToOne()
    @JoinColumn(name="origin")
    //@Column(name="Origin")
    private Airport origin;

        public Airport getOrigin() {
        return origin;
    }

     public void setOrigin(Airport origin) {
        this.origin = origin;
    }




    @Column(name="FlightNum")
    private String flightNum;
    @Column(name="Distance")
    private int distance;


    public int getFlightId() {
        return flightId;
    }

/*    public String getDest() {
        return dest;
    }*/



    public String getFlightNum() {
        return flightNum;
    }

    public int getDistance() {
        return distance;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

/*    public void setDest(String dest) {
        this.dest = dest;
    }*/



    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
