import java.io.*;
public class LargestContiguousSubarray {
    public static void main(String[] args)
    {
        int a[]={-3,-4,4,-1,-2,1,5,-3};
         LargestContiguousSubarray ob=new LargestContiguousSubarray();
         int max=ob.largestContiguousSubarray(a);
         System.out.println("Max is ="+ max);
        ob.largestContiguousSubarrayIndexes(a);
    }
    public int largestContiguousSubarray(int a[])
    {
        int max_so_far,current_max;
        max_so_far=current_max=a[0];
        for(int i=0;i<a.length;i++)
        {
            current_max=Math.max(current_max+a[i], a[i]);
            max_so_far=Math.max(current_max, max_so_far);
        }
        return max_so_far;
    }
    public void largestContiguousSubarrayIndexes(int a[])
    {
        int max_so_far,current_max;
        max_so_far=current_max=a[0];
        int start,end,s;
  
        start=end=s=0;

        for(int i=1;i<a.length;i++)
        {
            if(a[i]>current_max+a[i])
            {
                current_max=a[i];
                s=i;
            }
            else
            {
                current_max=current_max+a[i];
            }
            if(current_max>max_so_far)
            {
                max_so_far=current_max;
                start=s;
                end=i;
            }
        }
       // System.out.println("Max: "+ max_so_far);
        System.out.println("Indexes from:" + start + " to: " + end);

    }
}
