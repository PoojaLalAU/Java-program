import java.util.Scanner;
public class ZeroRem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int arr[]=new int[10];
System.out.println("enter the limit");
int n=sc.nextInt();
System.out.println(" Enter the elements");
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}

System.out.println("array is");
for(int i=0;i<n;i++){
System.out.print(+arr[i]);
System.out.print("\n");
}
System.out.println("non zero array is");
for(int i=0;i<n;i++){
if(arr[i]!=0){

System.out.print(+arr[i]);
System.out.print("\n");
}
}}}