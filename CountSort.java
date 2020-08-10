public class CountSort {

    public static void main(String[] args) {
        int a[]={2,1,1,0,2,5,4,0,2,8,7,7,9,2,0,1,9};
        a=CountSort(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        
    }
    static int[] CountSort(int a[])
    {
        int n=a.length;
        int max=a[0];
        for(int i=0;i<n;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        int k=max;
        int count[]=new int[k+1];
        System.out.println(k+ " is max");
        for(int i=0;i<n;i++)
        {
            count[a[i]]++;
        }
        for(int i=1;i<k+1;i++)
        {
            count[i]=count[i]+count[i-1];
        }

        int b[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            b[--count[a[i]]]=a[i];
        }

        for(int i=0;i<n;i++)
        {
            a[i]=b[i];
        }
        return a;

    }
    
}
