import java.util.Scanner;
public class LinearSearch {

    public static int search(int arr[],int key){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){

                count=count+1;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the key ");
        int key=sc.nextInt();
        int ans=search(arr,key);
        System.out.println("the occurences is : "+ans);
    }
}