import java.util.Arrays;
public class PairOfGivenSum {
      public static void main(String[] args) {
            int a[]={12,3,5,1,9};
            int sum=110;
			 PairOfGivenSum ob=new PairOfGivenSum();
             System.out.println(ob.findpair(a, 110));
        //  System.out.println(f);
        }

    public void sort(int a[])
    {
		int j;
        for(int i=1;i<a.length;i++)
        {
            int key=a[i];
            for(j=i-1;j>=0 && key>a[j];j--)
            {
                a[j+1]=a[j];
            }
            a[j+1]=key;
        }
    }
    public boolean findpair(int a[],int sum)
    {
        if(a.length==0)
        {
            return false;
        }
        Arrays.sort(a);
		 int start=0,end=a.length-1;
        while(start<=end)
        {
            int s=a[start]+a[end];
            if(s==sum)
            {
                return true;
            }
            else if(s>sum)
            {
                end--;
            }
            else
            {
                start++;
            }
        }
        return false;
    }
    
}
