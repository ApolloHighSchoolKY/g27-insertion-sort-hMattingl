import java.util.ArrayList;
import java.util.Arrays;

public class ALInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};
    	ArrayList<Integer> sorted = new ArrayList<Integer>();
    	boolean inserted=false;

		//Add the first number to the array list
		sorted.add(myNumbers[0]);

		//Loop once for all of the remaining numbers in the unsorted list
		for(int remain = 1; remain < myNumbers.length ; remain ++)
		{
			//reset boolen for reuse
			inserted = false;

			//Check with each of the numbers in the sorted list
			for(int check = 0; check < remain; check++)
			{
				//If this number is less than one in the sorted list,
				//insert it there
				if(myNumbers[remain] < sorted.get(check))
				{
					inserted = true;
					sorted.add(check, myNumbers[remain]);
					check = remain;
				}

			}		
			//If it was not inserted, stick it on the end.
			if(!inserted)
				sorted.add(myNumbers[remain]);

			
		//End Loop for unsorted list
		}

		System.out.println(sorted);

		//Move the data back to the array
		for(int move = 0; move < myNumbers.length; move ++)
			myNumbers[move] = sorted.get(move);

		//Print the contents of the array
		System.out.println(Arrays.toString(myNumbers));

    }


}
