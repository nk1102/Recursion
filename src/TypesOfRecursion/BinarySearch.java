package TypesOfRecursion;

/**
 * Created Binary search program using recursion technique
 *
 */

public class BinarySearch {
    public static boolean binarySearch(int[] elementToBeSearched, int target, int low, int high) { // boolean method to return true or false whether element is found or not

        if (low>high)   // this method will tell us there is no match
            return false;
        else {
            int mid = (low+high)/2;    // this will be used to find the middle element of the array
            if (target == elementToBeSearched[mid])    // this condition will check if element matches or not
                return true;
            else if (target<=elementToBeSearched[mid])  // this condition will  recur left of the middle element of the array
                return binarySearch(elementToBeSearched,target,low,mid-1);
            else
                return binarySearch(elementToBeSearched,target,mid+1,high); // this condition  will recur right of the middle element of the array
        }
    }

}
