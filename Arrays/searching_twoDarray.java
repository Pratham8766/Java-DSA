import java.util.Scanner;

public class searching_twoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the columns: ");
        int columns = sc.nextInt();
        int [] [] myArr= new int [rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                myArr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number to found: ");
        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(myArr[i][j]==x){
                    System.out.println("Element found at row: "+i+
                " and column: "+j);
                }
            }
        }
        sc.close();
    }
}
