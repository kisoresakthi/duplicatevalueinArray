import java.util.Scanner;
import java.util.Arrays;
public class duplicatevalue{
public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int arr[] = {1,2,3,4,2,3,4};
    System.out.println(Arrays.toString(arr));
    for(int i=0; i<=arr.length-1;i++){
        for(int j=i+1; j<=arr.length-1;j++){
            if(arr[i]==arr[j] && (i!=j)){
                System.out.println(arr[j]);
            }
        }
    }
}
}