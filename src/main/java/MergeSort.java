/*
 * Count the seconds of writing a mergeSort
 */
public class MergeSort {
    public void mergeSort(int[] array){
        if(array == null || array.length <= 1){
            return;
        }
        int[] helper = new int[array.length];
        mergeSort(array,0,array.length - 1,helper);
    }

    private void mergeSort(int[] array,int left ,int right,int[] helper){
        if(left >= right) {
            return;
        }
        int mid = left + (right - left)/2;
        mergeSort(array,left,mid,helper);
        mergeSort(array,mid + 1,right,helper);
        merge(array, left,mid,right,helper);
    }

    private void merge(int[] array, int left, int mid, int right, int[] helper) {
        for(int i = left; i <= right;i++){
            helper[i] = array[i];
        }
        int leftBound = left;
        int rightBound = mid + 1;
        while(leftBound <= mid && rightBound <= right){
            if(helper[leftBound] <= helper[rightBound]){
                array[left++] = helper[leftBound++];
            }else{
                array[left++] = helper[rightBound++];
            }
        }
        while(leftBound <= mid){
            array[left++] = helper[leftBound++];
        }

    }

}
