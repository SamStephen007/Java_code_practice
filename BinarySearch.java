import java.util.*;
class BinarySearch{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the elements:");
        for(int i=0;i<num;i++){
            arr[i] = obj.nextInt();
        }
        int tar = obj.nextInt();
        int ind  = binary(arr,tar);
        if(ind == -1){
            System.out.println("Element can't be found");
        }else{
            System.out.println("Element found at the postion" +ind );
        }
    }
    public static int binary(int[]arr,int x){
        int left = 0;
        int right = arr.length;
        while(left<=right){
           int mid = left-(left+right)/2;
           if(arr[mid] == x){
            return mid;
           } else if(arr[mid]>x){
            left = mid-1;
           }else if(arr[mid]<x){
            right = mid+1;
           }
        }
        return -1;
    }
}