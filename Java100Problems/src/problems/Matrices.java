package problems;

import java.util.Scanner;

public class Matrices {

	
		public static void main(String[]args) {
			
			
			
			Scanner sc = new Scanner(System.in);
			
			//To get number of rows from user
			System.out.print("Enter the no. of rows : ");
			int rows = sc.nextInt();
			
			//To get number of columns from user
			System.out.print("Enter the no. of columns : ");
			int cols = sc.nextInt();
			
			
			//To take elements input from user
			int [][] matrix = new int [rows][cols];
		
			for(int i = 0; i< rows; i++) {
				for (int j = 0; j < cols; j++) {
					System.out.print("Enter the value for [" + i + "][" + j + "]: ");
					matrix[i][j] = sc.nextInt();
				}
				
			}
			
			//To display the matrix in format
			System.out.println("Provided matrix : ");
			for(int i = 0; i < rows; i++) {
				for(int j = 0; j< cols; j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
				
			}
			
			//To display sum of all elements in matrix
			int sum = 0;
			
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					sum = sum + matrix[i][j];
				}
			}
			System.out.println("Sum of all the elements of matrix is : "+ sum);
			
			
			// To display maximum element
			int max = matrix[0][0];
			
			for(int i = 0; i < rows; i++) {
				for(int j = 0; j < cols; j++) {
					if(matrix[i][j] > max) {
						max = matrix[i][j];
					}
				}
			}
			System.out.println("Maximum value is : " + max);
			
			
			//To display minimum element
			int min = matrix[0][0];
			
			for(int i = 0; i < rows; i++) {
				for(int j = 0; j < cols; j++) {
					if(matrix[i][j] < min ) {
						min = matrix[i][j];
					}
				}
			}
			System.out.println("Minimum value is : " + min);
			
			
			//To display even numbers count
			int even = 0;
			
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					if(matrix[i][j] % 2 == 0) {
						even++; 
					}
				}
			}
			System.out.println("Even values : " + even);
			
			
			//To display odd numbers count
			int odd = 0;
			
			for(int i = 0; i < rows; i++) {
				for(int j = 0; j < cols; j++) {
					if(matrix[i][j] % 2 != 0) {
						odd++;
					}
				}
			}
			System.out.println("Odd values : " + odd);
			
			
			//To display row wise sum
			for(int i = 0; i < rows; i++) {
				int rowSum = 0;	
				
				for(int j = 0; j < cols; j++) {
					rowSum = rowSum + matrix[i][j];
				}
				System.out.println("Row " + i + " Sum : " +rowSum);
			}
			
			
			//To display column wise sum
			for(int j = 0; j < cols; j++) {
				int colSum = 0;
				
				for(int i = 0; i < rows; i++) {
					colSum = colSum + matrix[i][j];
				}
				System.out.println("Colum " + j + " sum : " +colSum);
			}
			
			
			//To display highest value row wise
			for(int i = 0; i < rows; i++) {
				int rowHighest = matrix[i][0];
				
				for (int j = 0; j < cols; j++) {
					if (matrix[i][j] > rowHighest) {
						rowHighest = matrix[i][j];
					}
					
				}System.out.println("Row "+ i + " highest value : " + rowHighest);
			}
			
			
			//To display highest value column wise
			for(int j = 0; j < cols; j++) {
				int colHighest = matrix[0][j];
				
				for (int i = 0; i < rows; i++) {
					if(matrix[i][j] > colHighest) {
						colHighest = matrix[i][j];
					}
				}System.out.println("Column "+ j + " highest value : " + colHighest);
			}
			
			
			//To display position of the highest element in matrix
			int maxElement = matrix[0][0];
			int rowPos = 0;
			int colPos = 0;
			
			for(int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					if(matrix[i][j] > maxElement) {
						maxElement = matrix[i][j];
						rowPos = i;
						colPos = j;
					}
				}
			}
			System.out.println("Highest value in matrix is "+ maxElement + ", found at ["+ rowPos + "] ["+ colPos +"]");
			
			
			//To Search an user input Element position in Matrix
			System.out.println("Enter the number to search : ");
			int search = sc.nextInt();
			
			boolean found = false;
			
			for(int i = 0; i < rows; i++) {
				for(int j = 0; j < cols; j++) {
					if(matrix[i][j] == search ) {
						found = true;
						rowPos = i;
						colPos = j;
					}	
				}
			}
			if(found) {
				System.out.println("Entered number is found at [" + rowPos +"]["+ colPos+ "]");
			}
			else {
				System.out.println("Entered number is not found!");
			}
			
			
			
			
			
		}
	}

	

