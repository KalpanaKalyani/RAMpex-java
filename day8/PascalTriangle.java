import java.util.Scanner;
import java.util.ArrayList;
public class PascalTriangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a rows:");
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }
                else{
                    int val=ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                    row.add(val);
                }
            }
            ans.add(row);
        }
        System.out.println("Pascals Tiangle:");
        for(ArrayList<Integer> row:ans){
            System.out.println(row);
        }
        sc.close();
    }
}