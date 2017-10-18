package test1;

// <> 안에 있는 이름은 타입을 이 class 내에서 어떻게 사용할 것인지
// 이 class의 instance를 생성할 때 넘겨주는 타입으로 V를 치환하여 사용된다
public class Box<V> {
	private V value;
	
	public V getValue() {
		return this.value;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
}
