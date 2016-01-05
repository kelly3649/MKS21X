public class Driver{
    public static void main(String[]args){
	int[] ary = {-1,3,-2,-2,-2};
	int[] arry = {8, 6, 7, 5, 3, 0, 9};
	int[] array = {2,124,-5,13,0,0};
	Sorts.insertionSort(arry);
	Sorts.printArray(arry);
	Sorts.selectionSort(arry);
	Sorts.printArray(arry);
	Sorts.insertionSort(ary);
	Sorts.printArray(ary);
	Sorts.selectionSort(ary);
	Sorts.printArray(ary);
	Sorts.insertionSort(array);
	Sorts.printArray(array);
	Sorts.selectionSort(array); //supposed to be the same result as above
	Sorts.printArray(array);
    }
}
