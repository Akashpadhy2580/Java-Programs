package Others;

public class No_of_digits_in_Number
{
    public static void main(String[] args)
    {
        int num=445689;
        int count=0;
        while(num>0)
        {
            num/=10;
            count++;
        }
        System.out.println("No. od Digits: "+count);
    }
}
