
public class MergeSort{

public static void main (String [] args){
	int arr [] = new int []{1,2,4,6,3,5,7,8,0};
	MergeSort(arr);
	for (int i=0; i<arr.length;i++)
		System.out.println(arr[i]);
}
	
public static void MergeSort(int []arr){
	if(arr.length<2) return;
	int mid=(arr.length)/2;
	int arr_left[] = new int[mid]; int arr_right[]=new int [arr.length-mid];
	for (int i=0; i<mid;i++){
		arr_left[i]=arr[i];
	}
	for (int j=0; j<arr.length-mid;j++){
		arr_right[j]=arr[j+mid];
	}
	MergeSort(arr_left);
	MergeSort(arr_right);
	Merge(arr_left,arr_right, arr);		
}
/*
Mereg two sorted array together 
*/
public static void Merge(int left[], int right[], int arr[]){
		int id_left=0; int id_right=0; int id=0;
		while (id_left<left.length && id_right<right.length){
			if (left[id_left]<right[id_right]){
				arr[id++]=left[id_left++];
			}
			else if (left[id_left]>=right[id_right]){
				arr[id++]=right[id_right++];
			}
		}
		// after the while loop there might be left overs
		while (id_left<left.length){
			arr[id++]=left[id_left++];
		}
		while (id_right<right.length){
			arr[id++]=right[id_right++];
		}		
	
	}

}