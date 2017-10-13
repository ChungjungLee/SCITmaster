
public class SmartPhone extends Phone {
	private String osType;
	private String osVersion;
	private int memory;
	private boolean camera;
	//private boolean hasCamera;
	// name convention
	// boolean type���� ���� is, has ���� ���δ�
	// �׷��� field�� ���̴°� �ƴϰ� getter�� �ٿ� ����Ѵٰ� ��.
	
	public SmartPhone() {
		
	}
	
	public SmartPhone(String company, int price, String type
					, String osType, String osVersion, int memory
					, boolean camera) {
		super(company, price, type);
		this.osType = osType;
		this.osVersion = osVersion;
		this.memory = memory;
		this.camera = camera;
	}
	
	@Override
	public String toString() {
		return super.toString() + " OSŸ��: " + osType
				+ " OS����: " + osVersion
				+ " �޸�: " + memory
				+ " ī�޶� ����: " + camera;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	// public boolean hasCamera()
	public boolean hasCamera() {
		return camera;
	}

	public void setCamera(boolean camera) {
		this.camera = camera;
	}
	
	
}
