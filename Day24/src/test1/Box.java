package test1;

// <> �ȿ� �ִ� �̸��� Ÿ���� �� class ������ ��� ����� ������
// �� class�� instance�� ������ �� �Ѱ��ִ� Ÿ������ V�� ġȯ�Ͽ� ���ȴ�
public class Box<V> {
	private V value;
	
	public V getValue() {
		return this.value;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
}
