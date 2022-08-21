package ArrayConcept;

public class TwoDimentionalArrayEx {

	public static void main(String[] args) {
        int a[][]=new int[2][2];
        a[0][0]=13;
        a[0][1]=14;
        a[1][0]=15;
        a[1][1]=16;
        for(int i=0;i<2;i++)//0<2 1<2
        {
            for(int j=0;j<2;j++)//0<2 1<2 2<2=f
            {
                System.out.print(a[i][j]+" ");//a[0][0]=13 a[0][1]=14
                                              //a[1][0]=15  a[1][1]=16;
            }
            System.out.println();
        }

    }

}