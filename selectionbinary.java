import java.util.*;
class selectionbinary{
    public static void main(String[] args) {
        
    int [] arr = {5,4,3,2,1};
    selectionsort(arr);

    }
    public static void selectionsort(int arr[]){
        int min;
        int n = arr.length - 1;
        for(int i=0;i<=n;i++){
            min = i;
            for(int j=i+1;j<=n;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }

            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for(int i=0;i<=n;i++){
            System.out.println("%d",arr[i]);
        }
    }
}
