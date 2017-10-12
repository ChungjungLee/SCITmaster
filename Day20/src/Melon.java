
public class Melon extends Food {
	private String farm;
	
	public Melon(int kcal, int price, double weight, String farm) {
		super(kcal, price, weight);
		this.farm = farm;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("³ó¿ø Á¤º¸: " + getFarm());
	}
	
	public String getFarm() {
		return farm;
	}

	public void setFarm(String farm) {
		this.farm = farm;
	}
	
	
}
