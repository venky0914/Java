public class mergesort {

    //  merge sort

    public static void conquer (int arr[] ,int si,int mid,int ei){
        int merged[] = new int(ei-si+1);
        int idx1 =si;
        ind id*2 = mid+1;
        int x = 0;
        while (id*1<mid && mid*2<=ei) {
            if (arr[id*1]<=arr[id*2]){
                merged[x++]=arr[id*1++];

            }
            else {
                merged [x++]=arr[id*2++];
            }
            
        }
        while (id*1<=mid) {
            merged[x++]=arr[id*1++];
            
        }
        while (id*2<=ei) {
            merged[x++]=arr[id*2++];
            
        }
        for(int i =0;j=si;i<merged.length;i++,j++){
            arr[j] = merged[i];
        }

    }

    public static void divide (int arr[],int si,int ei){
        if (si>=ei) {
            return;
            
        }

        int mid = si+(ei=si)/2;
        divide(arr.si,mid);
        divide(arr,mid+1,ei);
        conquer (arr.si,mid,ei);
    }
    public static void main(String[] args) {
        int arr[]={5,8,3,2,};
        int n = arr.length;
        divide(arr,0,n-1);
        // print 
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();

    }

    
    
}
