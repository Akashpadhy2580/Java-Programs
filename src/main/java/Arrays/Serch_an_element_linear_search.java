package Arrays;

public class Serch_an_element_linear_search
{
        public static void main(String[] args)
        {
                //Serch an element using linear search
                int[] a={1,8,9,8,5,78,5,6,7,5};
                int ele=87;
                boolean flag=false;
                if (a.length==0) {
                        System.out.println("Element found at: " + 0);
                        flag=true;
                }
                else {
                        for(int i=0;i<a.length;i++){
                                if (a[i]==ele)
                                {
                                        flag=true;
                                        System.out.println("Element found at: "+i);
                                        break;
                                }
                        }
                }
                if(flag==false)
                        System.out.println("Element not found");



        }
}
