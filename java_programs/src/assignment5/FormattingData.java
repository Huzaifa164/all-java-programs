package assignment5;

public class FormattingData {

	public static void displayPartition(int colLength[]) {
		for(int i = 0; i < colLength.length; i++) {
			System.out.print("+");
			for(int j = 1; j <= colLength[i]; j++) {
				System.out.print("-");
			}
		}
		System.out.println("+");
	}
	
	public static void main(String[] args) {
		String[][] data = {
				{"P101", "Nokia Handset", "Some Description", "2000.0"},
				{"P102", "Samsung Handset", "Description", "20000.0"},
				{"P103", "Sony Ericsson Handset", "Again Some Description", "1500.0"},
				{"P104", "LG Handset", "No Description", "1000.0"}
		};
		
		String[] colNames = {"ID", "Name", "Description", "Price"};
		
		int colLength[] = {6, 23, 24, 9};
		
		displayPartition(colLength);
		
		for(int i = 0; i < colLength.length; i++) {
			System.out.print("|");
			int countSpaceAfter = 0;
			int countChars = 0;
			for(int j = 0; j < colNames[i].length(); j++) {
				countChars++;
			}
			countSpaceAfter = colLength[i] - countChars - 1;
			System.out.print(" " + colNames[i]);
			for(int j = 1; j <= countSpaceAfter; j++) {
				System.out.print(" ");
			}
		}
		System.out.println("|");
		
		displayPartition(colLength);
		
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[0].length; j++) {
				System.out.print("|");
				int countSpaceAfter = 0;
				int countChars = 0;
				for(int k = 0; k < data[i][j].length(); k++) {
					countChars++;
				}
				countSpaceAfter = colLength[j] - countChars - 1;
				System.out.print(" " + data[i][j]);
				for(int k = 1; k <= countSpaceAfter; k++) {
					System.out.print(" ");
				}
			}
			System.out.println("|");
		}
		
		displayPartition(colLength);
	}
}
