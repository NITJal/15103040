package assignments;
import java.util.*;

public class matrixmulti {

	public static void main(String[] args) {
		int m,n,p,q,sum=0;
		System.out.println("enter number of rows and column of first matrix:");
		Scanner obj = new Scanner(System.in);
		m=obj.nextInt();
		n=obj.nextInt();
		
	int matrix1[][]= new int[m][n];
			System.out.println("enter elements of matrix1:");
	
	for(int i=0;i<m;i++){
	  for(int j=0;j<n;j++){
		  matrix1[i][j]=obj.nextInt();
		  }
	  }
	
	System.out.println("enter number of rows and column of second matrix:");
	p=obj.nextInt();
	q=obj.nextInt();
	int matrix2[][]=new int[p][q];

	
	System.out.println("enter elements of matrix2:");
	
	for(int i=0;i<p;i++){
		  for(int j=0;j<q;j++)
			  matrix2[i][j]=obj.nextInt();
			  }
	obj.close();
	

	if(n!=p){
		System.out.println("matrix can't be multiplied");
		
	}
	
	else{
		int result[][]=new int[m][q];
		for(int i=0;i<m;i++){
			for(int j=0;j<q;j++){
				for(int k=0;k<n;k++){
	
				sum=sum+matrix1[i][k]*matrix2[k][j];
				
				
				}
				
				result[m][q]=sum;
				sum=0;
				
			}
			}
		
		System.out.println("resulr of matrix multiplication is:");
		
		for(int i=0;i<m;i++){
			  for(int j=0;j<q;j++){
				  System.out.print(result[i][j]);
				  }
			  System.out.print("\n");
			  }
				
				
}
	
	
	}

}
