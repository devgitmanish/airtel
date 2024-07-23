package interview.Aristrocat;

import java.util.Arrays;

public class MovingOneAndZeros {


    public static void movingZeros(int [] arr){

        int start = 0;
        int last = arr.length-1;

        while(start<last){

            while(arr[start]==0 && start<last){
                start++;
            }
            while(arr[last]==1 && start<last){
                last--;
            }
            if(start<last){
                int temp = arr[start];
                arr[start] = arr[last];
                arr[last] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr [] = {1, 0, 1, 0, 1, 0, 1};

        movingZeros(arr);
    }
}
