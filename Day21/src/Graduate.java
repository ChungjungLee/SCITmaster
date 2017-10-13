
public class Graduate extends Student {
	// ���� ����, ���б� ����
	private String ta;
	private double scholarship;
	private int assistType;
	
	public Graduate(String name, int id, String major) {
		super(name, id, major);
		this.assistType = TEACHING_ASSIST;
		this.scholarship = 0.0;
	}
	
	/*
	 * ���� Ÿ���� ��Ÿ���� ���
	 * ���ڿ��� ������ ���ϴ� ���� �Ϻ��� ������ ��쿡��
	 * ���� �ٸ� ����� ���� �� �����Ƿ� ������ ����ϴ°� ����.
	 * 
	 * ��� ��ü�� ������ ���� �ʿ� ���� ������ static���� ����
	 * �� Ŭ������ ����ϴ� Ŭ���������� Ÿ���� ����ϴ°� �ξ� ����
	 * �������� ����
	 */
	public static final int TEACHING_ASSIST = 1,
							RESEARCH_ASSIST = 2;
	
	public Graduate(String name, int id, 
					String major, int year, 
					int credit, int assistType, double scholarship) {
		super(name, id, major, year, credit);
		this.assistType = assistType;
		
		/*
		 * �����ڿ��� ������ ���Ͽ� �ƿ� ��ü�� ������ ���ϰԴ� ���� ���Ѵ�.
		 * �׷��Ƿ� default ������ �����ؼ� ��ü�� ����� ��ȯ��� �Ѵ�.
		 * 
		 * �����ڿ��� setter�� ȣ���� setter ������ ���� ��&default�� ������
		 * �ϵ��� ��Ű�� �ξ� ������ �ڵ尡 �ȴ�.
		 */
		setScholarship(scholarship);
	}
	
	public String toString() {
		return super.toString() + "\n"
				+ "���� ����: " + ta + "\n"
				+ "���б� ����: " + scholarship;
	}
	
	public int getAssistType() {
		return assistType;
	}
	public void setTa(int assistType) {
		this.assistType = assistType;
	}
	
	public double getScholarship() {
		return scholarship;
	}
	public void setScholarship(double scholarship) {
		if (scholarship < 0.0) {
			this.scholarship = 0.0;
		} else if (scholarship > 1.0) {
			this.scholarship = 1.0;
		} else {
			this.scholarship = scholarship;
		}
	}
	
}
