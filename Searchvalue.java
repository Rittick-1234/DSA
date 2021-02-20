public class Searchvalue{

    public static void main(String[] args)
    {
        int a[]={2,4,1,5,6};
        Searchvalue obj=new Searchvalue();
        int i=obj.SearchIndex(a, 6);
        if(i==-1)
        {
            System.out.println("invalid ");
        }
        else{
            System.out.println(i);
        }
    }
    public int SearchIndex(int a[],int val)
    {
        if(a.length==0)
        {
            return -1;
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==val)
            {
                return i;
            }
        }
        return -1;
    }
}