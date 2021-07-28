/*************************************************************************
 *  {@code SelectionSort} class.
 *
 *  @version 28/7/21
 *
 *  @author Brian Whelan
 *
 *************************************************************************/
public class SelectionSort 
{
    /**
     * Don't let anyone instantiate this class.
     */
    private SelectionSort() {}
	
    /**
     * Sorts the specified array in ascending order using selection sort.
     * 
     * @param array the unsorted array
     */
    public static void sort(Comparable[] array)
    {
    	if(array != null)
    	{   		
            //Moves the boundary of unsorted part of array one by one
            for(int i = 0; i < array.length - 1; i++)
            {
                //Finds the minimum element in the unsorted part of the array
                int minIndex = i;
                for(int j = i + 1; j < array.length; j++)
                {
                    if(array[j].compareTo(array[minIndex]) < 0)
                    {
                        minIndex = j;
                    }
                }
	
                //Swaps the found minimum element with the first element in the unsorted part of the array
                Comparable temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
    	}
    }
}