public class InsertionSort {
    public static void main(String args[])
    {
        int a[]={3,-1,-6,5,4};
        InsertionSort ob=new InsertionSort();
        ob.print(a);
        ob.insertionsort(a);
        ob.print(a);
    }    
    public void insertionsort(int a[])
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
    public void print(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}