public class SelectionSort {
    public static void main(String[] args)
    {
        int a[]={2,44,1,-5,6};
        SelectionSort ob=new SelectionSort();
        ob.print(a);
        ob.selectionsort(a);
        ob.print(a);

    }
    public void selectionsort(int a[])
    {
        int i,j;
        if(a.length<=1)
        {
            return;
        }
        for(i=0;i<a.length-1;i++)
        {
            int min_index=i;
            for(j=i+1;j<a.length;j++)
            {
                if(a[j]<a[min_index])
                {
                    min_index=j;
                }
            }
            if(min_index!=i)
            {
                int temp;
                temp=a[min_index];
                a[min_index]=a[i];
                a[i]=temp;
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