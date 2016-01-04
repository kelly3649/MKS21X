public class Driver{
    public static void main(String[]args){
	int[] ary = {-1,3,-2,-2,-2};
	int[] arry = {8, 6, 7, 5, 3, 0, 9};
	int[] array = {2,124,-5,13,0,0};
	Sorts.printArray(arry);
	Sorts.insertionSort(arry);
	Sorts.printArray(arry);
	Sorts.printArray(ary);
	Sorts.insertionSort(ary);
	Sorts.printArray(ary);
	Sorts.printArray(array);
	Sorts.insertionSort(array);
	Sorts.printArray(array);
    }
}