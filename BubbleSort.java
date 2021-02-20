public class BubbleSort {
    public static void main(String[] args)
    {
        int a[]={54,32,1,78,9};
        BubbleSort ob=new BubbleSort();
        ob.print(a);
        ob.bubblesort(a);
        ob.print(a);
    }
    public void bubblesort(int a[])
    {
        int temp;
        if(a.length==0 || a.length==1)
        {
            return;
        }
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    
                }
            }
            
        }
    }
    public void print(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
}
