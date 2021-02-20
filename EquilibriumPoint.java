public class EquilibriumPoint {
    public static void main(String[] args) {
        EquilibriumPoint ob = new EquilibriumPoint();
        int a[]={6,0,2,1,5};
        int equi=ob.getEquilibriumPoint(a);
        System.out.println("Equilibrium pont is ="+ equi);
    } 
    public int getEquilibriumPoint(int a[])
    {
        int sum=0,i;
        int sum_so_far=0;
        for(i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        for(i=0;i<a.length;i++)
        {
            sum=sum-a[i];
            if(sum==sum_so_far)
                return i;
            sum_so_far=sum_so_far+a[i];
        }
        return -1;
    }

}
