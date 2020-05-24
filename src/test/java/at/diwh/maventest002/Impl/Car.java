package at.diwh.maventest002.Impl;

import at.diwh.maventest002.raw.IVehicle;

public class Car implements IVehicle{

	@Override
	public void makeNoise() {
		System.out.println("Brumm Brumm Brumm");
		
	}

}
