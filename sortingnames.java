package assignments;
import java.util.*;
public class sortingnames {

	public static void main(String[] args) {
		String temp;
        Scanner obj = new Scanner(System.in);
         
        System.out.print("Enter number of names: ");
        int N= obj.nextInt();
        obj.nextLine(); 
         
        String names[] = new String[N];
             
       
        for(int i=0; i<N; i++)
        {
            System.out.print("Enter name: ");
            names[i] = obj.nextLine();
        }
             
      obj.close();
         
        for(int i=0; i<5; i++)
        {
            for(int j=1; j<5; j++)
            {
                if(names[j-1].compareTo(names[j])>0)
                {
                    temp=names[j-1];
                    names[j-1]=names[j];
                    names[j]=temp;
                }
            }
        }
         
         
        System.out.println("\nSorted names are in Ascending Order: ");
        for(int i=0;i<N;i++)
        {
            System.out.println(names[i]);
        }

	}

}
