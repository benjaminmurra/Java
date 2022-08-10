import java.util.*;
import java.io.*;
import java.util.Scanner;

public class DataAnalysis {
	public static void main(String[] args) throws FileNotFoundException {
		// Read the file representing the data set line by line.
		// (See the File Read/Write example program from lab 3)
		Scanner keyboard = new Scanner(System.in);
		String filename = "C:\\Users\\benja\\IdeaProjects\\Assignment2\\src\\Institute-Scores-Cleaned.csv";
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);
		ArrayList<Institute> list = new ArrayList<Institute>();

		StringTokenizer token;

		while (inputFile.hasNext()) {
			String line2 = inputFile.nextLine();

			token = new StringTokenizer(line2, ",");

			String strUnitId = token.nextToken();
			long unitId = Long.parseLong(strUnitId);
			String institutionName = token.nextToken();
			String city = token.nextToken();
			String stateAbreviation = token.nextToken();
			String zip = token.nextToken();
			String accredagency = token.nextToken();
			String institutionURL = token.nextToken();
			String strLat = token.nextToken();
			double latitude = Double.parseDouble(strLat);
			String strLong = token.nextToken();
			double longitude = Double.parseDouble(strLong);

			String ccUndergradProfile = token.nextToken();

			Institute first = new Institute(unitId, institutionName, city, stateAbreviation, zip, accredagency, institutionURL,
					latitude, longitude, ccUndergradProfile);

			list.add(first);
		}



		ArrayList<Institute> arrayListBubble =  (ArrayList<Institute>) list.clone();

		long bubStartTime, bubEndTime, bubExecutionTime;
		bubStartTime = System.currentTimeMillis();

		//call to the sort method
		bubbleSort(arrayListBubble);

		bubEndTime = System.currentTimeMillis();
		bubExecutionTime = bubEndTime - bubStartTime;
		System.out.println("The Bubble Sort execution time is: " + bubExecutionTime + " milliseconds.");

		ArrayList<Institute> arrayListMerge =  (ArrayList<Institute>) list.clone();

		long merStartTime, merEndTime, merExecutionTime;
		merStartTime = System.currentTimeMillis();

		//call to the sort method
		mergeSort(arrayListMerge);

		merEndTime = System.currentTimeMillis();
		merExecutionTime = merEndTime - merStartTime;
		System.out.println("The Bubble Sort execution time is: " + merExecutionTime + " milliseconds.");







	}



	// Generate the random keys in the range 1,000,000 and 5,000,000 and store them in an ArrayList

	// Search the initial ArrayList for each of the generated keys using linearSearch
	// Record the execution times for the linear searches.

	// Search the initial ArrayList for the same set of keys using binarySearch
	// Record the execution times for the binary searches.


	public static ArrayList<Institute> bubbleSort(ArrayList<Institute> inst){
			Institute temp;
			if (inst.size()>1){
				for (int x=0; x<inst.size(); x++) {
					for (int i=0; i < inst.size()-i; i++) {
						if (inst.get(i).compareTo(inst.get(i+1)) > 0){
							temp = inst.get(i);
							inst.set(i,inst.get(i+1) );
							inst.set(i+1, temp);
						}
					}
				}
			}
			return inst;
	}

	//mergeSort method
	public static ArrayList<Institute> mergeSort(ArrayList<Institute> inst)	{
		if(inst.size()<2) {
			return inst;
		}
		int middle = inst.size()/2;
		ArrayList<Institute> left = new ArrayList<Institute>();
		ArrayList<Institute> right = new ArrayList<Institute>();
		int i=0;
		for(i=0; i<middle; i++)
			left.set(i, inst.get(i));
		for(int j=0; j<right.size(); j++){
			right.set(i, inst.get(i));
			i++;
		}
		left = mergeSort(left);
		right = mergeSort(right);
		ArrayList<Institute> result = merge(left,right);
		return result;
	}
	//merge lists
	static ArrayList<Institute> merge( ArrayList<Institute> left, ArrayList<Institute> right ) {
		int l=0, r=0, i=0;
		ArrayList<Institute> merged = new ArrayList<Institute>();

		while(l<left.size() || r<right.size()) {
			if(l >= left.size()) { // check if left array is done
				merged.set(i++, right.get(r++) );
			}
			else if( r >= right.size() ) { // check if right array is done
				merged.set(i++, left.get(l++) );
			}
			else { // compare and get the smaller element
				if( left.get(l).compareTo( right.get(r) ) <= 0 ) {
					merged.set(i++, left.get(l++) );
				}
				else {
					merged.set(i++, right.get(r++) );
				}
			}
		}
		return merged;
	}
	//linear search method
	public static boolean linearSearch(ArrayList<Institute> inst, String key){
		long keyLong = Long.parseLong(key);
		for (int j = 0; j < inst.size(); j++){

			if (inst.get(j).getUnitId() == keyLong) {
				return true;
			}
		}
		return false;
	}
	//binary search method
	public static boolean binarySearch(ArrayList<Institute> inst, String key) {
		long keyLong = Long.parseLong(key);

		int first = 0;
		int last = inst.size() - 1;
		int mid = (first + last) / 2;

		while (first <= last) {
			if (key.compareTo(Long.toString(inst.get(mid).getUnitId())) < 0)
				last = mid - 1;
			else if (key.compareTo(Long.toString(inst.get(mid).getUnitId())) > 0)
				first = mid + 1;
			else
				//key found
				break;
			mid = (first + last) / 2;
		}
		if (first > last) {
			return false;
		} else {
			return true;
		}
	}
}
