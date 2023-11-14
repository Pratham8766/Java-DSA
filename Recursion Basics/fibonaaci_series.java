public class fibonaaci_series {
    // 1, 2, 3, 5, 8, 13, 21, 34, 

    public static void printFibo(int n){
        int firstNo = 0;
        int secondNo = 1;
        for (int i = 2; i <= n; i++) {
            int thirdNo = firstNo+secondNo;
            firstNo = secondNo;
            secondNo=thirdNo;
            System.out.print(thirdNo+" ");
        }
    }
    public static void printFiboRecursion(int a, int b, int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        printFiboRecursion(b, c, n-1);
    }
    public static void main(String[] args) {
        // printFibo(10);
        System.out.println(0+" "+1);
        printFiboRecursion(0, 1, 5);
    }
}
