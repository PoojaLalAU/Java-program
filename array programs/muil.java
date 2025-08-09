import java.util.Scanner;
public class muil {
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
 int resultMatrix[][]=new int[10][10];

 if(c1!=r2){
  System.out.println("multiplication not possible");
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
System.out.print("result is :");
System.out.print("\n");
for(int i=0;i<r1;i++){
  for(int j=0;j<c2;j++){
for (int k = 0; k<c1; k++) { 
                    resultMatrix[i][j] += mat[i][k] * 
mat1[k][j]; 
                } 
                System.out.print(+resultMatrix[i][j]); 
System.out.print("\t");
            } 
          System.out.println(); 
        } 
    } 
} }