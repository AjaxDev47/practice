
import java.util.ArrayList;

public class SubArrayWithSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int s = 12;

        subarraySum(arr, arr.length, s);
    }


    static void subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int left, right, currSum;
        left = right = currSum = 0;
        
        while(right < n && left < n){

            if(currSum != s && currSum < s){
                int ele = arr[right];
                right = right + 1;
                currSum = currSum + ele;
            }
            
            if(currSum != s && currSum > s){
                int ele = arr[left];
                left = left + 1;
                currSum = currSum - ele;
            }

            if(currSum == s){
                System.out.println("Value: "+ ++left + " "+ right);
                return;
            }
        }
    }
}
