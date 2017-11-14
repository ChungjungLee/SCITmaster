

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class BusList {
	private String busNumber;
	Socket socket;
	Socket socket2;
	/*
	 * Constructor
	 */
	public BusList(String busNumber) {
		try {
			this.busNumber = busNumber;
			socket = new Socket("topis.seoul.go.kr", 80);
			//socket2 = new Socket("m.bus.go.kr", 80);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	// 5�� ���� ���� ��û�� �����ϴ� �Լ�
	public void sendRequest() {
		try {
			String param = "pageIndex=1&pageSize=5&totalSearch=" + busNumber +
							"&recordPerPage=5&jsFunction=fn_searchBus";
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(
							socket.getOutputStream(), "UTF-8"));
			
			bw.write("POST /map/busMap/selectBusList.do HTTP/1.1\r\n" + 
					"Host: " + socket.getInetAddress() + "\r\n" +
					"Content-Length: " + param.length() + "\r\n" +
					"Accept: application/json, text/javascript, */*; q=0.01\r\n" +
					"Content-Type: application/x-www-form-urlencoded; charset=UTF-8\r\n" + 
					"\r\n" +
					param);
			
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// ������ ������ ���� ��û�� �����ϴ� �Լ�
	public void sendRequestStation() {
		try {
			String param = "pageIndex=1&pageSize=5&routName=" + busNumber +
							"&jsFunction=fn_searchBusStn";
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(
							socket.getOutputStream(), "UTF-8"));
			
			bw.write("POST /map/busMap/selectBusStnList.do HTTP/1.1\r\n" + 
					"Host: " + socket.getInetAddress() + "\r\n" +
					"Content-Length: " + param.length() + "\r\n" +
					"Accept: application/json, text/javascript, */*; q=0.01\r\n" +
					"Content-Type: application/x-www-form-urlencoded; charset=UTF-8\r\n" + 
					"\r\n" +
					param);
			
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// ������ ������ ���� ��û�� �����ϴ� �Լ�
	public void sendRequestLineStation() {
		try {
			String param = "routId=" + 100100229;
			
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(
							socket.getOutputStream(), "UTF-8"));
			
			bw.write("POST /map/busMap/selectBusLineStnList.do HTTP/1.1\r\n" + 
					"Host: " + socket.getInetAddress() + "\r\n" +
					"Content-Length: " + param.length() + "\r\n" +
					"Accept: application/json, text/javascript, */*; q=0.01\r\n" +
					"Content-Type: application/x-www-form-urlencoded; charset=UTF-8\r\n" + 
					"\r\n" +
					param);
			
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	// ���� ���ڿ��� ��ȯ�ϴ� �Լ�
	public String getResponse() {
		String result = "";
		
		try {
			BufferedReader br = 
					new BufferedReader(
							new InputStreamReader(socket.getInputStream(), "UTF-8"));
							
			String line;
			
			while(true) {
				line = br.readLine();
				
				System.out.println(line);
				
				if (line.equals("0")) {
					break;
				}
				
				result += line + "\n";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	// JSON �����͸� �̾Ƴ��� �Լ�
	public String getJSON(String input) {
		String result = "";
		String[] data = input.split("\n\n")[1].split("\n");
		
		for (int i = 1; i < data.length; i += 2) {
			result += data[i];
		}
		
		return result;
	}
	
	// JSON �����͸� �Ľ��ϴ� �Լ�
	public String parseJSON(String jsonData) {
		String result = "";
		
		try {
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonData);
			JSONArray busArrayList = (JSONArray) jsonObject.get("rows");
			
			for (int i = 0; i < busArrayList.size(); i++) {
				result += "===" + (i+1) + "��°===\n";
				JSONObject bus = (JSONObject) busArrayList.get(i);
				result += "���� ��ȣ: " + bus.get("routName") + "\n";
				result += "�����: " +bus.get("stnFirst") + "\n";
				result += "������: " +bus.get("stnLast") + "\n";
				result += "routId: " +bus.get("routId") + "\n";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
}






















