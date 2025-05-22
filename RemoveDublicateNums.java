import java.util.*;

class RemoveDublicateNums {
    static int remove(int[] arr){
        int k = 1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] != arr[k-1]){
                arr[k] = arr[i];
                k++;
            }
            
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(remove(nums));
        sc.close();
    }
}