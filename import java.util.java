import java.util.Scanner;
class JaggedArray { 
    public static void main(String args[]) {
        int[][] jaggedArray; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row of jaggedarray: ");
        int numRows = sc.nextInt(); 
        jaggedArray = new int[numRows][];
        for (int i = 0; i < numRows; i++) {
            System.out.print("Enter the number of column for Rows " + i + ": ");
            int numCol = sc.nextInt(); 
            jaggedArray[i] = new int[numCol]; 
        }
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print("Enter the elements at [" + i + "][" + j + "]: ");
                jaggedArray[i][j] = sc.nextInt(); 
            }
        }
        System.out.println("JaggedArray Elements:"); 
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); 
        }
        
        sc.close();
    }
}
