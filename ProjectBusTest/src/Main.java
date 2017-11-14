
public class Main {

	public static void main(String[] args) {
		BusList busList = new BusList("3417");
		
		busList.sendRequest();
		
		String busListResult = 
				busList.parseJSON(busList.getJSON(busList.getResponse()));
		new FileSave().saveFile("busList.txt", busListResult);
		
		
		//new FileSave().saveFile("busListRaw.txt", busList.getJSON(busList.getResponse()));
		//System.out.println(busList.getJSON(busList.getResponse()));
		
		
		busList.sendRequestLineStation();
		System.out.println(busList.getResponse());
		
	}

}
