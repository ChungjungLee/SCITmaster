package step3;
import java.io.*;
import java.util.*;

/**
 * <pre>
 * SES(Soft Engineer School) ���� ���α׷��� ���������� �����ϴ� Ŭ����
 * �ֿ� ������δ� ������ ����.
 * 1. �ű� �����ο� ���
 * 2. ����ο� �˻�
 * 3. ����ο� ����
 * 4. ��ü ����ο� ���
 * </pre>
 * */
public class SESManager {
	private final String FILE_NAME = "human.dat";	// ���ϸ� ���
	private ArrayList<Human> list;	// Human ��ü�� ���� ����Ʈ
	
	private FileInputStream fis;	//������ �б����� ��Ʈ��
	private FileOutputStream fos;	//������ �������� ��Ʈ��
	private ObjectInputStream ois;	//��ü�� �б����� ��Ʈ��
	private ObjectOutputStream oos;	//��ü�� �������� ��Ʈ��
	
	/**
	 * ������
	 */
	public SESManager(){
		// ������ �����ϸ� �о���δ�. ������ ArrayList�� �����Ѵ�.
		File f = new File(FILE_NAME);
		
		if (f.exists()) {
			getFile();
		} else {
			list = new ArrayList<>();
		}
	}
	
	/**
	 * ���ο� Human ��ü�� ����Ѵ�.
	 * @param human ����� Professor, Trainee, Staff Ŭ������ ��ü
	 * @return ���� ����
	 * */
	public boolean insertHuman(Human human) {
		// ���޵� ��ü�� �ֹε�Ϲ�ȣ�� �˻��Ѵ�.
		Human find_h = findHuman(human.getJumin());
		
		// ��ϵ� �ֹι�ȣ���� üũ�Ѵ�. �̹� �ִ� �ֹε�Ϲ�ȣ�� ���� false�� �����Ѵ�.
		if (find_h != null) {
			return false;
		}
		
		//����Ʈ�� ���ο� Human ��ü�� �߰��Ѵ�.
		//���Ͽ� ���� ����Ʈ�� �����
		//true�� �����Ѵ�.
		boolean isAdded = list.add(human);
		
		setFile();
		
		return isAdded;
	}

	/**
	 * ��ϵ� Human ��ü�� �˻��Ѵ�.
	 * @param jumin �˻��� Human�� �ֹι�ȣ
	 * @return Human �迭�� ��ϵ� ��ü�� �� �Ķ���ͷ� ���޵� �ֹι�ȣ�� ��ġ�Ǵ� Human ��ü, �˻� ����� ���� �� null�� ��ȯ�Ѵ�.
	 * */
	public Human findHuman(String jumin) {
		//���޵� �ֹι�ȣ�� ����Ʈ���� �˻��Ͽ� ������ �ش� ��ü�� �����Ѵ�.
		//������ null�� �����Ѵ�.
		for (Human h : list) {
			if (h.getJumin().equals(jumin)) {
				return h;
			}
		}
		
		return null;
	}

	/**
	 * ��ϵ� Human ��ü�� �����Ѵ�.
	 * @param jumin ������ Human�� �ֹι�ȣ
	 * @return �־��� �ֹι�ȣ�� ��ġ�Ǵ� Human ��ü�� ���� ���, Human �迭�� ��ϵ� ��ü�� �� �Ķ���ͷ� ���޵� �ֹι�ȣ�� ��ġ�Ǵ� Human ��ü�� �߰ߵǾ� ������ �����ϸ� true�� �׷��� ������ false�� ��ȯ
	 * */
	public boolean deleteHuman(String jumin){
		//���޵� �ֹι�ȣ�� ã�� �ش� ��ü�� �����Ѵ�.
		//���� ���� ���θ� �����Ѵ�.
		Human found = findHuman(jumin);
		
		if (found == null) {
			return false;
		}
		
		boolean isDeleted = list.remove(found);
		
		setFile();
		
		return isDeleted;
	}

	/**
	 * ��ϵ� ��� Human ��ü ������ ����Ѵ�.
	 * */
	public void showAll() {
		//����Ʈ�� ��� ��ü ���
		if (list.isEmpty()) {
			System.out.println("[��ϵ� �����Ͱ� �����ϴ�.]");
		} else {
			for (Human h : list) {
				System.out.println(h);
			}
		}
	}
	
	/**
	 * ����Ʈ�� ��ϵ� ��� Human ��ü ������ ���Ͽ� ����.
	 * @return ���� ���� ���� ����
	 * */
	public boolean setFile(){
		boolean result = true;
		try {
			fos = new FileOutputStream(FILE_NAME);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(list);
			oos.flush();
			
		} catch (Exception e) {
			System.out.println("error in setFile()");
			result = false;
			e.printStackTrace();
			
		} finally {
			closeStreams();
			
		}
		
		return result;
	}
	
	/**
	 * ���Ͽ� ������ ��� Human ��ü ������ ArrayList�� �о���δ�.
	 * */
	public void getFile() {
		try {
			fis = new FileInputStream(FILE_NAME);
			ois = new ObjectInputStream(fis);
			
			Object o = ois.readObject();
			list = (ArrayList<Human>) o;
			
		} catch (Exception e) {
			System.out.println("error in getFile()");
			e.printStackTrace();
			
		} finally {
			closeStreams();
			
		}
	}
	
	/**
	 * ��Ʈ�� ��ü�� ��� close �Ͽ� �ڿ��� ��ȯ�Ѵ�.
	 * */
	private void closeStreams() {
		if (ois != null) {
			try {
				ois.close();
			} catch (IOException e) {
				System.out.println("close error in ObjectInputStream");
				e.printStackTrace();
			}
		}
		
		if (oos != null) {
			try {
				oos.close();
			} catch (IOException e) {
				System.out.println("close error in ObjectOutputStream");
				e.printStackTrace();
			}
		}
		
		if (fis != null) {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println("close error in FileInputStream");
				e.printStackTrace();
			}
		}
		
		if (fos != null) {
			try {
				fos.close();
			} catch (IOException e) {
				System.out.println("close error in FileOutputStream");
				e.printStackTrace();
			}
		}
		
	}
}
