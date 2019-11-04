package com.prashant;

public class Main {

    public static void main(String[] args) {
	BayerischeMotorenWerke bayerischeMotorenWerke = new BayerischeMotorenWerke(36);
	bayerischeMotorenWerke.steer(10); //this method is from vehicle
    bayerischeMotorenWerke.accelerate(30);
    bayerischeMotorenWerke.accelerate(10);
    bayerischeMotorenWerke.accelerate(-32);
    }
}
