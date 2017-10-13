
public class Graduate extends Student {
	// ���� ����, ���б� ����
	private String ta;
	private double scholarship;
	
	public Graduate(String name, int id, String major) {
		super(name, id, major);
		this.ta = "����";
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
					int credit, String ta, double scholarship) {
		super(name, id, major, year, credit);
		// TODO: parameter condition check
		if (ta.equals("���� ����") || ta.equals("���� ����")) {
			this.ta = ta;
		} else {
			this.ta = "����";
		}
		
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
	
	public String getTa() {
		return ta;
	}
	public void setTa(String ta) {
		this.ta = ta;
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
