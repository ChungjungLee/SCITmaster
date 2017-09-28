/* 221page question3*/
public class Box {
	private int length;
	private int width;
	private int height;
	private boolean empty;
	
	public Box() {
		this.length = 1;
		this.width = 1;
		this.height = 1;
		this.empty = false;
	}
	
	//this. : 객체 자신을 가리키는 것
	public Box(int length, int width, int height, boolean empty) {
		this.length = length;
		this.width = width;
		this.height = height;
		this.empty = empty;
	}
	
}
