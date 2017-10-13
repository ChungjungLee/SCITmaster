
public class SmartPhone extends Phone {
	private String osType;
	private String osVersion;
	private int memory;
	private boolean camera;
	//private boolean hasCamera;
	// name convention
	// boolean type들은 보통 is, has 등을 붙인다
	// 그런데 field에 붙이는게 아니고 getter에 붙여 사용한다고 함.
	
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
		return super.toString() + " OS타입: " + osType
				+ " OS버전: " + osVersion
				+ " 메모리: " + memory
				+ " 카메라 여부: " + camera;
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
