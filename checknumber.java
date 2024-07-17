import java.util.*;
public class checknumber {
    public static int check(int x,int[] arr,int num){
        for(int i=0;i<num;i++){
            if(arr[i] == x){
                return i;
            }
        }
        return 0;
    }
public static void main(String[] args){
    int x,num;
    System.out.println("Enter the number of values : ");
    Scanner obj = new Scanner(System.in);
    num = obj.nextInt();
    int arr[] = new  int[num];
    for(int i=0;i<num;i++){
        arr[i] = obj.nextInt();
    }
    System.out.println("Enter the number to check:");
    x = obj.nextInt();
    int res = check(x, arr, num);
    if(res!=0){
        System.out.println("Element present atindex: "+res);
    }
}
}