package classesAndObjects;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browsers objChr = new Chrome();
		objChr.openBrowser();
		objChr.closeBrowser();
		Browsers objFF = new Firefox();
		objFF.openBrowser();
		objFF.closeBrowser();
	}

}
