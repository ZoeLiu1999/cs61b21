public class Sort {
    private static void sort(String[] x, int start){
        if(start==x.length){
            return;
        }
        int smallestIndex = findSmallest(x,start);
        swap(x,start,smallestIndex);
        sort(x,start+1);
    }
    private static void swap(String[] x, int a, int b){
        String temp=x[a];
        x[a]=x[b];
        x[b]=temp;
    }
    private static int findSmallest(String[] x, int start){
        int smallestIndex=start;
        for(int i = 0; i < x.length; i+=1){
            int cmp = x[i].compareTo(x[smallestIndex]);
            if(cmp < 0){
                smallestIndex=i;
            }
        }
        return smallestIndex;
    }
}
