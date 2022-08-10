
//Source: Introduction to Java Programming by Daniel Liang
import java.util.Arrays;
public class MergeSort {
 
 //Here is a test array. You may use it or change it to test with other examples.
 public static void main(String[] args){
  String[] a = {"apple", "orange", "banana", "pear", "grapefruit"};
  System.out.println(Arrays.toString(a));
  a = mergeSort(a);
  System.out.println(Arrays.toString(a));
 }
 
 /*
  * This is the recursive sorting method, mergeSort.
  * Note: We will cover Recursion in detail later. For now, you can use this method.
  */
 public static String[] mergeSort(String[] a){
  if(a.length<2)
   return a;
  int middle = a.length/2;
  String[] left = new String[middle];
  String[] right = new String[a.length-middle];
  int i=0;
  for(i=0; i<middle; i++)
   left[i] = a[i];
  for(int j=0; j<right.length; j++){
   right[j] = a[i];
   i++;
  }
  left = mergeSort(left);
  right = mergeSort(right);
  String[] result = merge(left,right);
  return result;
 }
 
 /*
  * This method merges two sorted arrays. They might be of slightly different lengths.
  * The resulting array should be sorted and should contain all values (including duplicates)
  * from the original two input arrays.
  */
 public static String[] merge(String[] l, String[] r){
 String[] result = new String[l.length+r.length];
	if (result.length==0)
	   return result;
	else if (result.length==1)
	   return result;

	int i=0,j=0,k=0;
	while (i<l.length&&j<r.length)
	{
		if (l[i].compareTo(r[j])<0)
		{
			result[k]=l[i];
			k++;
			i++;
		}
		else if (l[i].compareTo(r[j])>0)
		{
			result[k]=r[j];
			k++;
			j++;
		}
		else
		{
			result[k]=l[i];
			k++;
			i++;
			result[k]=r[j];
			k++;
			j++;
		}
	}
	if (j==r.length)
	{
		while(i<l.length)
		{
			result[k]=l[i];
			k++;
			i++;
		}
	}
	else if (i==l.length)
	{
		while(j<r.length)
		{
			result[k]=r[j];
			k++;
			j++;
		}
	}
	
	return result;
       

    }
  

 
}
