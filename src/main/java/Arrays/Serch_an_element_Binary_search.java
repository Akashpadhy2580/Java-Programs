package Arrays;

public class Serch_an_element_Binary_search
{
        public static void main(String[] args)
        {
                //Search an element in Array using BINARY SEARCH
                //Only applicable on sorted array
                int[] a={1,2,3,4,5,6,7,8,9};
                int ele=3;
                boolean flag=false;
                int l=0;
                int h=a.length-1;
                while(l<=h)
                {
                    int m=(l+h)/2;
                    if (a[m]==ele) {
                            flag=true;
                            System.out.println("Element found at: "+m);
                            break;
                    }
                    else if (a[m]>ele)
                    {
                            h=m-1;
                    }
                    else if (a[m]<ele){
                            l=m+1;
                    }
                }
                if(flag==false)
                        System.out.println("Element not found");
        }
}
