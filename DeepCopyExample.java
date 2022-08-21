package ArrayConcept;
import java.util.Arrays;

public class DeepCopyExample {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]=a.clone();//changes done in first array does not makes changes in another array
		a[1]++;
		
		System.out.println(Arrays.toString(a));
		 System.out.println(Arrays.toString(b));
	}

}
