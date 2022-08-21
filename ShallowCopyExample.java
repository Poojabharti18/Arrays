package ArrayConcept;

import java.util.Arrays;


public class ShallowCopyExample {

	public static void main(String[] args) {
        int a[]= {1,2,3,4};
        int b[]=a;//changes done in first array makes changes in anoother array
        a[3]++;
        System.out.println(Arrays.toString(b));

    }

}
