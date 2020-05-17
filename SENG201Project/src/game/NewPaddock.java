package game;

public class NewPaddock implements Item {
	private int amount;
	
	public NewPaddock(int initialAmount) {
		amount = initialAmount;
	}
	
	public void useItem(Farm inputFarm, int typeIndex) {
		for (Animal animal: inputFarm.getAnimalList().get(typeIndex)) {
			animal.updateHappiness(2);
		}
		this.changeAmount(-1);
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void changeAmount(int change) {
		amount += change;
	}
	
}
