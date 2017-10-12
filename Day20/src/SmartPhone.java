
public class SmartPhone extends Phone {
	private String osType;
	private String osVersion;
	private int memory;
	private boolean hasCamera;
	
	public SmartPhone() {
		
	}
	
	public SmartPhone(String company, int price, String type
					, String osType, String osVersion, int memory
					, boolean hasCamera) {
		super(company, price, type);
		this.osType = osType;
		this.osVersion = osVersion;
		this.memory = memory;
		this.hasCamera = hasCamera;
	}
	
	@Override
	public String toString() {
		return super.toString() + " OS타입: " + osType
				+ " OS버전: " + osVersion
				+ " 메모리: " + memory
				+ " 카메라 여부: " + hasCamera;
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

	public boolean isHasCamera() {
		return hasCamera;
	}

	public void setHasCamera(boolean hasCamera) {
		this.hasCamera = hasCamera;
	}
	
	
}
