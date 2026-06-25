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
			
			//create matrix 
			int [][] matrix = new int [rows][cols];
		
			for(int i = 0; i< rows; i++) {
				for (int j = 0; j < cols; j++) {
					System.out.print("Enter the value for [" + i + "][" + j + "]: ");
					matrix[i][j] = sc.nextInt();
				}
				
			}
			
			System.out.println();
			//To call matrix display function
			displayMatrix(matrix);
			
			System.out.println();
			//To call sum display function
			displaySum(matrix);
		
			System.out.println();
			//To call highest element display function
			displayMaxElement(matrix);
			
			//To call lowest element display function
			displayMinElement(matrix);
			
			System.out.println();
			//To call even elements count function
			displayEvenCount(matrix);
			
			//To call odd elements count function
			displayOddCount(matrix);
			
			System.out.println();
			//To call row wise sum function
			displayRowSum(matrix);
			
			System.out.println();
			//To call column wise sum function
			displayColumnSum(matrix);
			
			System.out.println();
			//To call Row wise highest value function
			rowHighestValue(matrix);
			
			System.out.println();
			//To call column wise highest value function
			columnHighestValue(matrix);
			
			System.out.println();
			//To call highest element position function
			highestElementPosition(matrix);
			
			System.out.println();
			//To call element position search function
			displayElementPosition(matrix);
			
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			
		}
		
			
			//To display the matrix in format
			static void displayMatrix(int matrix [][]) {
			System.out.println("Provided matrix : ");
			for(int i = 0; i < matrix.length; i++) {
				for(int j = 0; j < matrix[0].length; j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
				
			}
		}
	

			
			//To display sum of all elements in matrix
			static void displaySum(int matrix[][]) {
			int sum = 0;
			
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[0].length; j++) {
					sum = sum + matrix[i][j];
				}
			}
			System.out.println("Sum of all the elements of matrix is : "+ sum);
			
		}
			
			
			
			// To display maximum element
			static void displayMaxElement(int matrix[][]) {
			int max = matrix[0][0];
			
			for(int i = 0; i < matrix.length; i++) {
				for(int j = 0; j < matrix[0].length; j++) {
					if(matrix[i][j] > max) {
						max = matrix[i][j];
					}
				}
			}
			System.out.println("Maximum value is : " + max);
		}
			
			
			
			//To display minimum element
			static void displayMinElement(int matrix[][]) {
			int min = matrix[0][0];
			
			for(int i = 0; i < matrix.length; i++) {
				for(int j = 0; j < matrix[0].length; j++) {
					if(matrix[i][j] < min ) {
						min = matrix[i][j];
					}
				}
			}
			System.out.println("Minimum value is : " + min);
		}
			
			
			//To display even numbers count
			static void displayEvenCount(int matrix[][]) {
			int even = 0;
			
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[0].length; j++) {
					if(matrix[i][j] % 2 == 0) {
						even++; 
					}
				}
			}
			System.out.println("Even values : " + even);
		}
			
			
			
			//To display odd numbers count
			static void displayOddCount(int matrix[][]) {
			
			int odd = 0;
			
			for(int i = 0; i < matrix.length; i++) {
				for(int j = 0; j < matrix[0].length; j++) {
					if(matrix[i][j] % 2 != 0) {
						odd++;
					}
				}
			}
			System.out.println("Odd values : " + odd);
		}
			
			
			//To display row wise sum
			static void displayRowSum(int matrix[][]) {
			
			for(int i = 0; i < matrix.length; i++) {
				int rowSum = 0;	
				
				for(int j = 0; j < matrix[0].length; j++) {
					rowSum = rowSum + matrix[i][j];
				}
				System.out.println("Row " + i + " Sum : " +rowSum);
			}
		}
			
			
			
			//To display column wise sum
			static void displayColumnSum(int matrix[][]) {
			for(int j = 0; j < matrix[0].length; j++) {
				int colSum = 0;
				
				for(int i = 0; i < matrix.length; i++) {
					colSum = colSum + matrix[i][j];
				}
				System.out.println("Colum " + j + " sum : " +colSum);
			}
		}		
			
			
			
			//To display highest value row wise
			static void rowHighestValue(int matrix[][]) {
			for(int i = 0; i < matrix.length; i++) {
				int rowHighest = matrix[i][0];
				
				for (int j = 0; j < matrix[0].length; j++) {
					if (matrix[i][j] > rowHighest) {
						rowHighest = matrix[i][j];
					}
					
				}System.out.println("Row "+ i + " highest value : " + rowHighest);
			}
		}
			
			
			
			//To display highest value column wise
			static void columnHighestValue(int matrix[][]) {
			for(int j = 0; j < matrix[0].length; j++) {
				int colHighest = matrix[0][j];
				
				for (int i = 0; i < matrix.length; i++) {
					if(matrix[i][j] > colHighest) {
						colHighest = matrix[i][j];
					}
				}System.out.println("Column "+ j + " highest value : " + colHighest);
			}
		}
			
			
			
			//To display position of the highest element in matrix
			static void highestElementPosition(int matrix[][]) {
			int maxElement = matrix[0][0];
			int rowPos = 0;
			int colPos = 0;
			
			for(int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[0].length; j++) {
					if(matrix[i][j] > maxElement) {
						maxElement = matrix[i][j];
						rowPos = i;
						colPos = j;
					}
				}
			}
			System.out.println("Highest value in matrix : "+ maxElement);
			System.out.println("found at ["+ rowPos + "]["+ colPos +"]");
		}
			
			
			//To Search an user input Element position in Matrix
			static void displayElementPosition(int matrix[][]) {
			
			System.out.println("Enter the number to search : ");
			Scanner sc = new Scanner(System.in);
			int search = sc.nextInt();
			int rowPos = 0;
			int colPos = 0;
			
			boolean found = false;
			
			for(int i = 0; i < matrix.length; i++) {
				for(int j = 0; j < matrix[0].length; j++) {
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
	

	

