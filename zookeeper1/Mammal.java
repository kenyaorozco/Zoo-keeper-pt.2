package com.kenya.zookeeper1;

public class Mammal {
//	-------Member variables-------
	private int energyLevel;

// -------Create Constructor--------
	public Mammal() {
		this.energyLevel = 100;
	}
	
// ----Create another constructor for our Bat class to override ------	
	public Mammal(int energy) {
		this.energyLevel = energy;
	}

	// ------Get Energy Level------
	public int getEnergyLevel() {
		return energyLevel;
	}

	//-------- Set Energy Level------
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
//	---------- Method ---------
	public int displayEnergy() {

//		System.out.println(displayEnergy());
		return getEnergyLevel();
	}

}
