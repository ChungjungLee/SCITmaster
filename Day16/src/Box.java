
public class Box {
	int width;
	int length;
	int height;
	
	int getWidth() {
		return width;
	}
	
	void setWidth(int width) {
		this.width = width;
	}
	
	int getLength() {
		return length;
	}
	
	void setLength(int length) {
		this.length = length;
	}
	
	int getHeight() {
		return height;
	}
	
	void setHeight(int height) {
		this.height = height;
	}
	
	int getVolume() {
		return width * length * height;
	}
	
	void print() {
		System.out.println("width: "+ width + "length: " + length + "height: " + height);
	}
	
	
}
