public class mergeSort{
	int [] array;
	int [] temparray;
	int length;

		public static void main(String[] args) {
			int [] arraytosort={2,3,45,75,34};
			for (int i:arraytosort){
				System.out.print(i);
			}
			System.out.println(" is the unsorted array");
			mergeSort arr= new mergeSort();
			arr.sort(arraytosort);
			System.out.print("Sorted array is: ");
			for(int i:arraytosort){
				System.out.print(i);
				System.out.print("");
			}

		}
		public void sort(int [] arraytosort){
			this.array=arraytosort;
			this.length=arraytosort.length;
			this.temparray=new int[length];
			merge_sort(0,length-1);
		}
		public void merge_sort(int low,int high){
			if(low<high){
				int mid=low +(high-low)/2;
				merge_sort(low,mid);
				merge_sort(mid+1,high);
				merge(low,mid,high);
			}
		}
		public void merge(int low,int mid,int high){
			for (int i=low;i<=high;i++){
				temparray[i]=array[i];
			}
			int i=low;
			int j=mid+1;
			int k=low;
			while(i<=mid && j<=high){
				if(temparray[i]<=temparray[j]){
					array[k]=temparray[i];
					i++;
				}
				else{
					array[k]=temparray[j];
					j++;
				}
				k++;
			}
			while(i<=mid){
				array[k]=temparray[i];
				i++;
				k++;
			}
		}

}