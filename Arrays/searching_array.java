import java.util.Scanner;

public class searching_array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be found");
        int found = sc.nextInt();
        boolean f = false;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==found){
                f = true;
                j = i;
                break;
            }
        }
        if(f){
            System.out.println("Element found and its position is "+(j+1));
        }
        else{
            System.out.println("Not found");
        }
        sc.close();
    }
}