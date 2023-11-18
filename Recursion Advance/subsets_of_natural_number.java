import java.util.*;
public class subsets_of_natural_number {
    public static void getSubsets(int n, ArrayList<Integer> subset){
        if(n==0){
            for (int i = 0; i < subset.size(); i++) {
                System.out.print(subset.get(i));
            }
            System.out.println();
            return;
        }
        //add
        subset.add(n);
        getSubsets(n-1, subset);

        //remove
        subset.remove(subset.size()-1);
        getSubsets(n-1, subset);
    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<Integer>();
        getSubsets(n, subset);
    }
}
