import java.util.*;
class LinearSearch
{
    int ar[];
    int search;
    LinearSearch(int l, int s)
    {
        ar = new int[l];
        search = s;
    }

    public void inputArray()
    {
        Scanner br = new Scanner(System.in);
        int i;
        System.out.println("Enter the numbers --> \n");
        for(i = 0; i < ar.length; i++)
        {
            ar[i] = br.nextInt();
        }
    }

    public void searchNumber() //<- This method searches only 1st occurrence of the number
    {
        int i, flag = 0;
        for(i = 0; i < ar.length; i++)
        {
            if (ar[i] == search)
            {
                flag = 1;
                break;
            }
        }

        if (flag == 1)
            System.out.println("Number Found at "+(i + 1));
        else
            System.out.println("Number Not Found!");
    }

    public void searchMore() //<- This method counts the number of occurrences of the number
    {
        int i, count = 0;
        for (i = 0; i < ar.length; i++)
        {
            if (ar[i] == search)
            {
                count++;
            }
        }

        System.out.println(search +" has occured "+ count + " times");
    }

    public static void main(String args[])
    {
        Scanner br = new Scanner(System.in);
        int len, x;
        System.out.println("Enter the limit of the array : ");
        len = br.nextInt();

        System.out.println("Enter the number to be searched : ");
        x = br.nextInt();

        LinearSearch obj = new LinearSearch(len, x);
        obj.inputArray();
        obj.searchNumber();
        obj.searchMore();
    }
}