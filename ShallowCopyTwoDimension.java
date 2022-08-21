package ArrayConcept;
import java.util.Arrays;


public class ShallowCopyTwoDimension {

	public static void main(String[] args) {
		 
				int a[][]= {{1,1},{2,2}};
				int b[][]=a.clone();
				/* a[0][0]=1;
				  a[0][1]=1;
				  a[1][0]=2;
				  a[1][1]=2;
				 */
				a[0][0]++;
				for(int i=0;i<b.length;i++)
				{
					for(int j=0;j<b.length;j++)
					{
						System.out.println(b[i][j]);
					}
				}
	}
}
	


