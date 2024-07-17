import java.util.*;
class searchbinary{
    public static void main(String[]args){
        int arr[] = {1,3,5,7,9,11,34};
        Scanner obj = new Scanner(System.in);
        int key = obj.nextInt();
        int result = binary(arr,key);
        if(result != 1){
            System.out.println("Element "+key+"found at the index"+result);
        }
        else{
            System.out.println("element not found");
        }
        obj.close();
    }
    public static int binary(int arr[],int key){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == key){
                return key;
            }
            else if(arr[mid]<key){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
}
