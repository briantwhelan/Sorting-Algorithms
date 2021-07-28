/*************************************************************************
 *  {@code HeapSort} class.
 *  Adapted from Sedgewick and Wayne's Algorithms Textbook.
 *  @see <a href="https://algs4.cs.princeton.edu/">Algorithms Textbook</a>
 *
 *  @version 28/7/21
 *
 *  @author Brian Whelan
 *
 *************************************************************************/
public class HeapSort 
{
    /**
     * Don't let anyone instantiate this class.
     */
    private HeapSort() {}
	
    /**
     * Sorts the specified array in ascending order using heap sort.
     * 
     * @param array the unsorted array
     */
    public static void sort(Comparable[] array)
    {
    	if(array != null)
        {
    		//Builds a max binary heap with all elements in the array
    	    for(int index = array.length/2; index >= 1; index--)
    	    {
    	    	sink(array, index, array.length);
    	    }
    	    
    	    //Repeatedly removes the maximum element
    	    int index = array.length;
    	    while(index > 1)
    	    {
    	    	exchange(array, 1, index--);
    	    	sink(array, 1, index);
    	    }
    	}
    }
    
	/**
     * Sinks node down the binary heap.
     * 
     * @param array the array containing the max binary heap
     * @param index the index of element to sink down the binary heap
     * @param size the number of elements in the max binary heap
     */
	private static void sink(Comparable[] array, int index, int size)
	{
		boolean isSinking = true;
		while((2 * index <= size) && isSinking)
		{
			int j = 2 * index;
			if((j < size) && less(array, j, j + 1))
			{
				j++;
			}
			
			if(!less(array, index, j))
			{
				isSinking = false;
			}
			else
			{
				exchange(array, index, j);
				index = j;
			}
		}
	}
    
    /**
     * Compares two specified elements in the specified array to find if one is less than the other.
     * 
     * @param array the array containing the max binary heap
     * @param index1 the index of first element (the index is off-by-one to support 1-based indexing)
     * @param index2 the index of second element (the index is off-by-one to support 1-based indexing)
     * @return {@code true} if the element at {@code index1 - 1} is less than the element at {@code index2 - 1} and {@code false} otherwise
     */
	private static boolean less(Comparable[] array, int index1, int index2)
	{
		return (array[index1 - 1].compareTo(array[index2 - 1]) < 0);
	}
	
	/**
     * Exchanges two specified elements in the specified array.
     * 
     * @param array the array containing the max binary heap
     * @param index1 the index of first element (the index is off-by-one to support 1-based indexing)
     * @param index2 the index of second element (the index is off-by-one to support 1-based indexing)
     */
	private static void exchange(Object[] array, int index1, int index2)
	{
		Object temp = array[index1 - 1];
		array[index1 - 1] = array[index2 - 1];
		array[index2 - 1] = temp;
	}
}