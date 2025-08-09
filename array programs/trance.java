import java.util.Scanner;
public class trance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the rows and columns of matrix");
      int r1=sc.nextInt();
      int c1=sc.nextInt();
      
   
int mat[][]=new int[r1][c1];
 int transpose[][]=new int[10][10];
System.out.println("Enter the elements of Matrix");
  for(int i=0;i<r1;i++){
  for(int j=0;j<c1;j++){
   mat[i][j]=sc.nextInt();
  }}
System.out.println("Matrix1");
for(int i=0;i<r1;i++){
  for(int j=0;j<c1;j++){
  System.out.print(+mat[i][j]);
  System.out.print("\t"); 
  }
  System.out.print("\n");
}
System.out.println("Tranceposed Matrix");
  for(int i=0;i<c1;i++){
  for(int j=0;j<r1;j++){
   transpose[i][j]=mat[j][i];
  }}

for(int i=0;i<c1;i++){
  for(int j=0;j<r1;j++){
  System.out.print(+transpose[i][j]);
  System.out.print("\t"); 
  }
  System.out.print("\n");
}
}}