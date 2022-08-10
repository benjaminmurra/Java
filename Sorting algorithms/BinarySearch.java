//Binary Search
//Searches a sorted array for a given key
//The code given here searches for a given String (key) on an array of Strings
//Change it to suit the assignment solution
public class BinarySearch{
	public static void binSearch(String arr[], String key, int first, int last){
		int mid = (first+last)/2;
		while (first<=last){
			if (key.compareTo(arr[mid])<0)
				last = mid-1;
			else if (key.compareTo(arr[mid])>0)
				first = mid+1;
			else
				//key found
				break;
			mid = (first+last)/2;
		}
		if (first > last)
			System.out.println(key + " not found");
		else
			System.out.println(key + " found at " + mid);
	}
	//Wrapper method that will call the above method
	public static void binSearch(String arr[], String key){
		binSearch(arr, key, 0, arr.length-1);
	}
	//Simple test method
	public static void main(String[] args){
		String arr[] = {"apple", "banana", "clementine", "orange"};
		binSearch(arr,"apple");
		binSearch(arr,"potato");
	}
}
