import java.util.Scanner;
public class SumMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the rows and columns of matrix1");
      int r1=sc.nextInt();
      int c1=sc.nextInt();
   System.out.println("Enter the rows and columns of matrix2");
      int r2=sc.nextInt();
      int c2=sc.nextInt();
int mat[][]=new int[r1][c1];
 int mat1[][]=new int[r2][c2];
 int add[][]=new int[r1][c2];

 if(r1!=r2 && c1!=c2){
  System.out.println("addition not possible");
}
 else{
  System.out.println("Enter the elements of Matrix1");
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
System.out.println("Enter the elements of Matrix2");
  for(int i=0;i<r2;i++){
  for(int j=0;j<c2;j++){
  mat1[i][j]=sc.nextInt();
  }}
System.out.println("Matrix2");
for(int i=0;i<r2;i++){
  for(int j=0;j<c2;j++){
  System.out.print(+mat1[i][j]);
  System.out.print("\t");
  }
  System.out.print("\n");
}
for(int i=0;i<r2;i++){
  for(int j=0;j<c2;j++){
add[i][j]=mat[i][j]+mat1[i][j];
}}
   System.out.println("sum of matrix is");
for(int i=0;i<r2;i++){
  for(int j=0;j<c2;j++){
  System.out.print(+add[i][j]);
System.out.print("\t");
}
  System.out.print("\n");
}
}}}


  
