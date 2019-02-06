import java.util.*;
class BubbleSorting
{
    public void sort()
    {
        Scanner br = new Scanner(System.in);
        int l, i, j, temp;
        System.out.println("Enter the limit of the array --> ");
        l = br.nextInt();

        int ar[] = new int[l];

        System.out.println("Enter the array elements --> ");
        for (i = 0; i < l; i++)
        {
            ar[i] = br.nextInt();
        }

        // The sorting Algorithm
        for (i = 0; i < l - 1; i++)
        {
            for (j = 0; j < l - i - 1; j++)
            {
                if (ar[j] > ar[j + 1])
                {
                    temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }

        // Printing the array
        System.out.println("The required array is --> ");
        for (i = 0; i < l; i++)
            System.out.print(" " +ar[i]);
    }

    public static void main(String args[])
    {
        BubbleSorting obj = new BubbleSorting();
        obj.sort();
    }
}