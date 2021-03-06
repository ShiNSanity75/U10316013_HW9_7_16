public class SortTwoDimensionalArray {
	
	//Main method
	public static void main(String[] args) {
		
		int m [][] = { {4,2}, {1,7}, {4,5}, {1,2}, {1,1}, {4,1} };
		
		sort(m);
		displayArray(m);
	}
	
	//A method that sort the two-dimensional array
	public static void sort(int m[][]) {
		
		for(int i = 0; i < m.length; i++) {
			int minimum = m[i][0]; //The smallest number of the ahead number
			int index = i; //The index of the smallest number
			
			for(int j = i + 1; j < m.length; j++) {
				
				//Change the minimum and index if the ahead number small than minimum
				//or the ahead number is the same but the hinder number is smaller
				if(minimum > m[j][0] || (minimum == m[j][0] && m[index][1] > m[j][1])) {
					
					minimum = m[j][0];
					index = j;
				}
			}
			
			//Switch the m[i] and m[index]
			if(index != i) {
				
				//exchange the ahead number
				int temp0 = m[index][0];
				m[index][0] = m[i][0];
				m[i][0] = temp0;
				
				//exchange the hinder number
				int temp1 = m[index][1];
				m[index][1] = m[i][1];
				m[i][1] = temp1;
			}
		}
	}
	
	//A method that print the array
	public static void displayArray(int m[][]) {
		
		System.out.print("{ ");
		
		for(int i = 0; i < m.length; i++) {
			
			System.out.print("{" + m[i][0] + "," + m[i][1] + "} ");
		}
		
		System.out.print("}");
	}
}
