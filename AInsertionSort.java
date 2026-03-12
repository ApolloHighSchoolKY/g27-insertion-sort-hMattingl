import java.util.Arrays;

public class AInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};

        //temp for storing the val to place into array
        int temp = 0;

        //starting at the 2nd num, check ending at the last pos in the array
        for(int current = 1; current < myNumbers.length; current ++)
        {
            //checking all behind the current val of the out loop
            for(int check = 0; check < current; check ++)
            {
                // if the current val is less than a val behind it
                if(myNumbers[current] < myNumbers[check])
                {
                    //save that val, move the ones in between ahead one, and place the val in the spot it would be in assending order
                    temp = myNumbers[current];
                    for(int replace = current; replace > check; replace--)
                    {
                        
                        myNumbers[replace] = myNumbers[replace - 1];

                    }
                    myNumbers[check] = temp;
                }
                     
            }
            //print for testing 
            System.out.println(Arrays.toString(myNumbers));
        }
    }
}
