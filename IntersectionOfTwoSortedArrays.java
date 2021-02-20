import java.util.*;
public class IntersectionOfTwoSortedArrays {
    public static void main(String args[])
    {
        IntersectionOfTwoSortedArrays a=new IntersectionOfTwoSortedArrays();
        int arr1[]={2,2,2,3,3,4};
        int arr2[]={1,2,4,4,6,6,7,8,10};
		ArrayList<Integer> finalIntersection=new ArrayList<Integer>();            
        a.IntersectionOfTwoSortedarrays(arr1, arr2, finalIntersection);
        System.out.println(finalIntersection);

    }
		public void IntersectionOfTwoSortedarrays(int arr1[],int arr2[],ArrayList<Integer> finalList1)
    {
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length)
        {
            while((i<arr1.length-1) && (arr1[i]==arr1[i+1]))
            {
                i++;
            }
            while((j<arr2.length-1) && (arr2[j]==arr2[j+1]))
            {
                j++;
            }
            if(arr1[i]<arr2[j])
            {
                i++;
            }else if(arr1[i]>arr2[j])
            {
                j++;
            }
            else{
                finalList1.add(arr2[j]);
                    i++;
                    j++;
            }
        }
    }
}
