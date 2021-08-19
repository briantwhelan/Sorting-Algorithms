import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
/*************************************************************************
 *  Class to enable the comparison of the performance of sorting algorithms.
 *
 *  @version 19/8/21
 *
 *  @author Brian Whelan
 *
 *************************************************************************/
public class CompareSortingAlgorithms 
{
    public static void main(String[] args)
    {
	    runSortingTests("BubbleSort");
	    runSortingTests("HeapSort");
	    runSortingTests("InsertionSort");
	    runSortingTests("MergeSort");
	    runSortingTests("Quicksort");
	    runSortingTests("SelectionSort");
	    runSortingTests("ShellSort");
    }
	
    /**
     * Sorts the test files using the specified sorting algorithms and prints out the time taken to sort each {@code File}.
     * 
     * @param sortingMethod the sorting method with which to sort the test files
     */
    public static void runSortingTests(String sortingMethod)
    {
        String numbers1000Path = "./numbers1000.txt";
        Double[] numbers1000 = readFile(numbers1000Path, 1000);
		
        String numbers10000Path = "./numbers10000.txt";
        Double[] numbers10000 = readFile(numbers10000Path, 10000);
	
        String numbers1000DuplicatesPath = "./numbers1000Duplicates.txt";
        Double[] numbers1000Duplicates = readFile(numbers1000DuplicatesPath, 1000);
		
        String numbersNearlyOrdered1000Path = "./numbersNearlyOrdered1000.txt";
        Double[] numbersNearlyOrdered1000 = readFile(numbersNearlyOrdered1000Path, 1000);
		
        String numbersReverse1000Path = "./numbersReverse1000.txt";
        Double[] numbersReverse1000 = readFile(numbersReverse1000Path, 1000);
		
        String numbersSorted1000Path = "./numbersSorted1000.txt";
        Double[] numbersSorted1000 = readFile(numbersSorted1000Path, 1000);
		
        if(sortingMethod.equals("BubbleSort"))
        {
            long start = System.nanoTime();
            BubbleSort.sort(numbers1000);
            long end = System.nanoTime();
            long timeElapsed1 = (end - start);
			
            start = System.nanoTime();
            BubbleSort.sort(numbers10000);
            end = System.nanoTime();
            long timeElapsed2 = (end - start);
			
            start = System.nanoTime();
            BubbleSort.sort(numbers1000Duplicates);
            end = System.nanoTime();
            long timeElapsed3 = (end - start);
			
            start = System.nanoTime();
            BubbleSort.sort(numbersNearlyOrdered1000);
            end = System.nanoTime();
            long timeElapsed4 = (end - start);
			
            start = System.nanoTime();
            BubbleSort.sort(numbersReverse1000);
            end = System.nanoTime();
            long timeElapsed5 = (end - start);
			
            start = System.nanoTime();
            BubbleSort.sort(numbersSorted1000);
            end = System.nanoTime();
            long timeElapsed6 = (end - start);
			
            System.out.println("BubbleSort Times:\n\tnumbers1000: " + timeElapsed1 + " nanoseconds"
											  + "\n\tnumbers10000: " + timeElapsed2 + " nanoseconds"
											  + "\n\tnumbers1000Duplicates: " + timeElapsed3 + " nanoseconds"
											  + "\n\tnumbersNearlyOrdered1000: " + timeElapsed4 + " nanoseconds"
											  + "\n\tnumbersReverse1000: " + timeElapsed5 + " nanoseconds"
											  + "\n\tnumbersSorted1000: " + timeElapsed6 + " nanoseconds\n");
	    }
		else if(sortingMethod.equals("HeapSort"))
		{
			long start = System.nanoTime();
			HeapSort.sort(numbers1000);
			long end = System.nanoTime();
			long timeElapsed1 = (end - start);
			
			start = System.nanoTime();
			HeapSort.sort(numbers10000);
			end = System.nanoTime();
			long timeElapsed2 = (end - start);
			
			start = System.nanoTime();
			HeapSort.sort(numbers1000Duplicates);
			end = System.nanoTime();
			long timeElapsed3 = (end - start);
			
			start = System.nanoTime();
			HeapSort.sort(numbersNearlyOrdered1000);
			end = System.nanoTime();
			long timeElapsed4 = (end - start);
			
			start = System.nanoTime();
			HeapSort.sort(numbersReverse1000);
			end = System.nanoTime();
			long timeElapsed5 = (end - start);
			
			start = System.nanoTime();
			HeapSort.sort(numbersSorted1000);
			end = System.nanoTime();
			long timeElapsed6 = (end - start);
			
			System.out.println("HeapSort Times:\n\tnumbers1000: " + timeElapsed1 + " nanoseconds"
											+ "\n\tnumbers10000: " + timeElapsed2 + " nanoseconds"
											+ "\n\tnumbers1000Duplicates: " + timeElapsed3 + " nanoseconds"
											+ "\n\tnumbersNearlyOrdered1000: " + timeElapsed4 + " nanoseconds"
											+ "\n\tnumbersReverse1000: " + timeElapsed5 + " nanoseconds"
											+ "\n\tnumbersSorted1000: " + timeElapsed6 + " nanoseconds\n");
		}
		else if(sortingMethod.equals("InsertionSort"))
		{
			long start = System.nanoTime();
			InsertionSort.sort(numbers1000);
			long end = System.nanoTime();
			long timeElapsed1 = (end - start);
			
			start = System.nanoTime();
			InsertionSort.sort(numbers10000);
			end = System.nanoTime();
			long timeElapsed2 = (end - start);
			
			start = System.nanoTime();
			InsertionSort.sort(numbers1000Duplicates);
			end = System.nanoTime();
			long timeElapsed3 = (end - start);
			
			start = System.nanoTime();
			InsertionSort.sort(numbersNearlyOrdered1000);
			end = System.nanoTime();
			long timeElapsed4 = (end - start);
			
			start = System.nanoTime();
			InsertionSort.sort(numbersReverse1000);
			end = System.nanoTime();
			long timeElapsed5 = (end - start);
			
			start = System.nanoTime();
			InsertionSort.sort(numbersSorted1000);
			end = System.nanoTime();
			long timeElapsed6 = (end - start);
			
			System.out.println("InsertionSort Times:\n\tnumbers1000: " + timeElapsed1 + " nanoseconds"
												 + "\n\tnumbers10000: " + timeElapsed2 + " nanoseconds"
												 + "\n\tnumbers1000Duplicates: " + timeElapsed3 + " nanoseconds"
												 + "\n\tnumbersNearlyOrdered1000: " + timeElapsed4 + " nanoseconds"
												 + "\n\tnumbersReverse1000: " + timeElapsed5 + " nanoseconds"
												 + "\n\tnumbersSorted1000: " + timeElapsed6 + " nanoseconds\n");
		}
		else if(sortingMethod.equals("MergeSort"))
		{
			long start = System.nanoTime();
			MergeSort.sort(numbers1000);
			long end = System.nanoTime();
			long timeElapsed1 = (end - start);
			
			start = System.nanoTime();
			MergeSort.sort(numbers10000);
			end = System.nanoTime();
			long timeElapsed2 = (end - start);
			
			start = System.nanoTime();
			MergeSort.sort(numbers1000Duplicates);
			end = System.nanoTime();
			long timeElapsed3 = (end - start);
			
			start = System.nanoTime();
			MergeSort.sort(numbersNearlyOrdered1000);
			end = System.nanoTime();
			long timeElapsed4 = (end - start);
			
			start = System.nanoTime();
			MergeSort.sort(numbersReverse1000);
			end = System.nanoTime();
			long timeElapsed5 = (end - start);
			
			start = System.nanoTime();
			MergeSort.sort(numbersSorted1000);
			end = System.nanoTime();
			long timeElapsed6 = (end - start);
			
			System.out.println("MergeSort Times:\n\tnumbers1000: " + timeElapsed1 + " nanoseconds"
											 + "\n\tnumbers10000: " + timeElapsed2 + " nanoseconds"
											 + "\n\tnumbers1000Duplicates: " + timeElapsed3 + " nanoseconds"
											 + "\n\tnumbersNearlyOrdered1000: " + timeElapsed4 + " nanoseconds"
											 + "\n\tnumbersReverse1000: " + timeElapsed5 + " nanoseconds"
											 + "\n\tnumbersSorted1000: " + timeElapsed6 + " nanoseconds\n");
		}
		else if(sortingMethod.equals("Quicksort"))
		{
			long start = System.nanoTime();
			Quicksort.sort(numbers1000);
			long end = System.nanoTime();
			long timeElapsed1 = (end - start);
			
			start = System.nanoTime();
			Quicksort.sort(numbers10000);
			end = System.nanoTime();
			long timeElapsed2 = (end - start);
			
			start = System.nanoTime();
			Quicksort.sort(numbers1000Duplicates);
			end = System.nanoTime();
			long timeElapsed3 = (end - start);
			
			start = System.nanoTime();
			Quicksort.sort(numbersNearlyOrdered1000);
			end = System.nanoTime();
			long timeElapsed4 = (end - start);
			
			start = System.nanoTime();
			Quicksort.sort(numbersReverse1000);
			end = System.nanoTime();
			long timeElapsed5 = (end - start);
			
			start = System.nanoTime();
			Quicksort.sort(numbersSorted1000);
			end = System.nanoTime();
			long timeElapsed6 = (end - start);
			
			System.out.println("Quicksort Times:\n\tnumbers1000: " + timeElapsed1 + " nanoseconds"
											 + "\n\tnumbers10000: " + timeElapsed2 + " nanoseconds"
											 + "\n\tnumbers1000Duplicates: " + timeElapsed3 + " nanoseconds"
											 + "\n\tnumbersNearlyOrdered1000: " + timeElapsed4 + " nanoseconds"
											 + "\n\tnumbersReverse1000: " + timeElapsed5 + " nanoseconds"
											 + "\n\tnumbersSorted1000: " + timeElapsed6 + " nanoseconds\n");
		}
		else if(sortingMethod.equals("SelectionSort"))
		{
			long start = System.nanoTime();
			SelectionSort.sort(numbers1000);
			long end = System.nanoTime();
			long timeElapsed1 = (end - start);
			
			start = System.nanoTime();
			SelectionSort.sort(numbers10000);
			end = System.nanoTime();
			long timeElapsed2 = (end - start);
			
			start = System.nanoTime();
			SelectionSort.sort(numbers1000Duplicates);
			end = System.nanoTime();
			long timeElapsed3 = (end - start);
			
			start = System.nanoTime();
			SelectionSort.sort(numbersNearlyOrdered1000);
			end = System.nanoTime();
			long timeElapsed4 = (end - start);
			
			start = System.nanoTime();
			SelectionSort.sort(numbersReverse1000);
			end = System.nanoTime();
			long timeElapsed5 = (end - start);
			
			start = System.nanoTime();
			SelectionSort.sort(numbersSorted1000);
			end = System.nanoTime();
			long timeElapsed6 = (end - start);
			
			System.out.println("SelectionSort Times:\n\tnumbers1000: " + timeElapsed1 + " nanoseconds"
												 + "\n\tnumbers10000: " + timeElapsed2 + " nanoseconds"
												 + "\n\tnumbers1000Duplicates: " + timeElapsed3 + " nanoseconds"
												 + "\n\tnumbersNearlyOrdered1000: " + timeElapsed4 + " nanoseconds"
												 + "\n\tnumbersReverse1000: " + timeElapsed5 + " nanoseconds"
												 + "\n\tnumbersSorted1000: " + timeElapsed6 + " nanoseconds\n");
		}
		else if(sortingMethod.equals("ShellSort"))
		{
			long start = System.nanoTime();
			ShellSort.sort(numbers1000);
			long end = System.nanoTime();
			long timeElapsed1 = (end - start);
			
			start = System.nanoTime();
			ShellSort.sort(numbers10000);
			end = System.nanoTime();
			long timeElapsed2 = (end - start);
			
			start = System.nanoTime();
			ShellSort.sort(numbers1000Duplicates);
			end = System.nanoTime();
			long timeElapsed3 = (end - start);
			
			start = System.nanoTime();
			ShellSort.sort(numbersNearlyOrdered1000);
			end = System.nanoTime();
			long timeElapsed4 = (end - start);
			
			start = System.nanoTime();
			ShellSort.sort(numbersReverse1000);
			end = System.nanoTime();
			long timeElapsed5 = (end - start);
			
			start = System.nanoTime();
			ShellSort.sort(numbersSorted1000);
			end = System.nanoTime();
			long timeElapsed6 = (end - start);
			
			System.out.println("ShellSort Times:\n\tnumbers1000: " + timeElapsed1 + " nanoseconds"
												 + "\n\tnumbers10000: " + timeElapsed2 + " nanoseconds"
												 + "\n\tnumbers1000Duplicates: " + timeElapsed3 + " nanoseconds"
												 + "\n\tnumbersNearlyOrdered1000: " + timeElapsed4 + " nanoseconds"
												 + "\n\tnumbersReverse1000: " + timeElapsed5 + " nanoseconds"
												 + "\n\tnumbersSorted1000: " + timeElapsed6 + " nanoseconds\n");
		}
		else
		{
		    System.out.println("Invalid sort method.");
		}
	}
	
    /**
     * Reads the specified {@code File} (if it exists) into a {@code Double} array.
     * 
     * @param filename the name of the {@code File}
     * @param size the size of the {@code File}
     * @return a {@code Double} array containing the contents of the specified {@code File} (or {@code null) if {@code fileName} is invalid
     */
    private static Double[] readFile(String fileName, int size)
    {
        Double[] array = null;
        if(size > 0)
        {
            try
            {
                File numbers = new File(fileName);
                FileReader fileReader = new FileReader(numbers);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
				
                array = new Double[size];
                int arrayIndex = 0;
				
                String line = null;
                while((line = bufferedReader.readLine()) != null)
                {
                    Double number = Double.parseDouble(line.trim());
                    array[arrayIndex] = number;
                    arrayIndex++;
                }
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
	    
        return array;
    }
}