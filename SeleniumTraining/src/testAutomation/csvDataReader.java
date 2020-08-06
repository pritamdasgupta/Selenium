package testAutomation;

import java.util.List;

public class csvDataReader {
	public static void main (String [] Args) {
		//readFile();
		readExcelFile();
	}
	
	public static void readFile() {
		
		String filename = "D:\\SeleniumTraining_Udemy\\Data\\UserAccounts.csv";
		
		List <String[]> records = utilities.csvReader.getCSVFile(filename);
		
		//Iterating through the list
		for(String[] record : records) {
			for (String field : record) {
				System.out.println(field);
			}
		}
		
	}
	
	public static void readExcelFile() {
		String filename = "D:\\SeleniumTraining_Udemy\\Data\\UserLogin.xls";
		
		String[][] data = utilities.excelReader.getExcelFile(filename);
		
		for (String[] record : data) {
			System.out.println(record[0]);
			System.out.println(record[1]);
			System.out.println(record[2]);
		}
	}

}


