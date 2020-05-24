package at.diwh.maventest002.Impl;

import at.diwh.maventest002.raw.Vehicle;

public class Car implements Vehicle{

	@Override
	public void makeNoise() {
		System.out.println("Brumm Brumm Brumm");
		
	}

}
