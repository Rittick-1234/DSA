public class SortArrray0s1s2s {
    public static void main(String[] args)
    {
        SortArrray0s1s2s ob=new SortArrray0s1s2s();
        int a[]={0,1,1,0,2,2,1,0,2};
        ob.print(a);
        ob.sort(a);
        ob.print(a);
        
    }
    public void sort(int a[])
    {
        int low,mid,high;
        low=mid=0;
        high=a.length-1;

        while(mid<=high)
        {
            switch (a[mid]) {
                case 0:
                    if(a[low]!=a[mid])
                    {
                        int t=a[low];
                        a[low]=a[mid];
                        a[mid]=t;
                    }
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    if(a[mid]!=a[high])
                    {
                        int t=a[mid];
                        a[mid]=a[high];
                        a[high]=t;
                    }
                    high--;
                    break;
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
