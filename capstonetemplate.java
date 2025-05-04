/* CS 0401 Capstone Project
You can use this as a starter template to make a new java program from scratch
150pts Due by end of day on your final exam. No exceptions or extention will be allowed
This is the capstone project for our class, it can be submitted as your final exam or you can choose to do the actual exam.

Tasks:
1. Convert your starter array into an ArrayList (25pts)

2. Take the supplied array and perform your own selection sort on the array. You can reuse your previous selection sort(You may NOT use Arrays.sort or any java supplied sorting methods (25pts)

3. Create a file reading loop to read the supplied file "CapstoneInput.txt". The scanner for this MUST take the name from the args array you may not hardcode it. (25pts)

4. In the file reading loop call the insertionsort method you created prior to insert each value into the ArrayList you made in step 1. Remember insertsort will ONLY place a value into the arraylist in the exact location it will fit in sorted order. ie you cannot just add them in any order to the arraylist then do another selectionsort(way too inefficient!) (25pts)

5 Print out the following. (25pts)
Size of the Arraylist is: [size of the arraylist after all values are properly inserted]
Lowest value in the Arraylist is: [lowest value]
Highest value in the arrayList is: [highest value] Both of these are easy to obtain from a sorted arraylist without any additional testing

(25pts)
You will need to supply required imports and throws flags on main to allow file reading, array/arraylist use, scanner use
You need to upload the Capstone.java source file(not the .class) and a screenshot showing the output of the print statements

*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class capstonetemplate{

	public static void main (String [] args) throws FileNotFoundException{
		if (args.length == 0) {
	 	throw new IllegalArgumentException("No file name provided");
 	}
		int[] myArray = {16,53,7,2,56,103,583,24,1,9,8298,23,1,4567,875,32,55,975,13,356,421}; //Starter Array
			ArrayList<Integer> myArrayList = new ArrayList<>();

				for (int i : myArray)
					myArrayList.add(i);
					selectionSort(myArrayList);

		Scanner input = new Scanner(new File(args[0]));
				while (input.hasNextInt()) {
					int e = input.nextInt();
					insertIntoArrayList(myArrayList, e);
}
		input.close();

	 	System.out.println("Size of the Arraylist is: " + myArrayList.size());
	 	System.out.println("Lowest value in the Arraylist is: " + myArrayList.get(0));
	 	System.out.println("Highest value in the arrayList is: " + myArrayList.get(myArrayList.size() - 1));
}
	 public static void selectionSort(ArrayList<Integer> arrayList) {

			int minIndex, temp;

			for (int i = 0; i < arrayList.size(); i++) {
					minIndex = i;
					for (int j = i + 1; j < arrayList.size(); j++) {
							if (arrayList.get(j) < arrayList.get(minIndex)) {
									minIndex = j;
							}
						}
						if (minIndex != i) {
						 temp = arrayList.get(i);
						 arrayList.set(i, arrayList.get(minIndex));
						 arrayList.set(minIndex, temp);
				 }
		}
}
		public static void insertIntoArrayList(ArrayList<Integer> arrayList, int element) {
			int i;
				for (i = 0; i < arrayList.size(); i++)
					if (element < arrayList.get(i))
						break;

						arrayList.add(i, element);
	}
}
