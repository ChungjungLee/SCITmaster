
public class Food {
	private int kcal;
	private int price;
	private double weight;
	
	public Food(int kcal, int price, double weight) {
		this.kcal = kcal;
		this.price = price;
		this.weight = weight;
	}
	
	public void print() {
		System.out.println("열량: " + kcal);
		System.out.println("가격: " + price);
		System.out.println("무게: " + weight);
	}
	
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
