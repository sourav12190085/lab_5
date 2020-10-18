public class quicksort {
    public static void sort(int[] a) {
        
        sort(a, 0, a.length - 1);
    
    }
    private static void sort(int[] a, int lo, int hi) { 
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }
    private static int partition(int[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        int v = a[lo];
        while (true) { 

          
            while (less(a[++i], v)) {
                if (i == hi) break;
            }

            
            while (less(v, a[--j])) {
                if (j == lo) break;      
            }

           
            if (i >= j) break;

            exch(a, i, j);
        }

        
        exch(a, lo, j);


        return j;
        
    }
    private static boolean less(Comparable v, Comparable w) {
        if (v == w) return false;   
        return v.compareTo(w) < 0;
        
     }

    private static void exch(int[] a, int i, int j) {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;  
    }
    private static boolean isSorted(int[] a) {
        return isSorted(a, 0, a.length - 1);   
    }
    private static boolean isSorted(int[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (less(a[i], a[i-1])) return false;
        return true;  
    }
    
    private static void show(int[] a) {
        for (int i=0; i<a.length ;i++ ) {
            System.out.print(a[i]);  
        }
    }

    public static void main(String[] args) {
        int[] a = {2,7,9,8};
        System.out.println("Before :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        } 
        quicksort.sort(a);
        System.out.println("");
        System.out.println("After : ");
        show(a);
        System.out.println("");
       assert isSorted(a);

    }

}