import java.util.Scanner;

public class MaxWater {

    static int find(int[] height){
        int max = 0, area =0;
        int i=0, j=height.length-1;
        while(i<j){
            if(height[i]<height[j]){
                area = height[i]* (j-i);
                max = Math.max(max, area);
                i++;
            }
            else{
                area = height[j] * (j-i);
                max = Math.max(max, area);
                j--;
            }
        }
        
        return max;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        for(int i=0;i<n;i++){
            height[i] = sc.nextInt();
        }
        System.out.println(find(height));

        sc.close();
    }
    
}
