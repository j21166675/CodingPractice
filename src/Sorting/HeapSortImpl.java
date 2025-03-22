package Sorting;

class HeapSortImpl {
    int[] arr;
    int size;
    HeapSortImpl(int[] arr){
        this.arr = arr;
        this.size = arr.length;
        buildHeap();
    }

    public int getSize(){
        return size;
    }

    public void buildHeap(){
        for(int i=size/2-1;i>=0;i--){
            heapify(i);
        }
    }

    public void heapify(int root_node){
        int max_node = root_node;
        int left_child = root_node * 2+1 ;
        int right_child = left_child + 1;

        if(left_child < size){
            if(arr[left_child] > arr[max_node]){
                max_node = left_child;
            }
        }
        if(right_child < size){
            if(arr[right_child] > arr[max_node]){
                max_node = right_child;
            }
        }

        if(max_node != root_node){
            int temp = arr[max_node];
            arr[max_node] = arr[root_node];
            arr[root_node] = temp;
            heapify(max_node);
        }
    }

    public int poll(){
        int max = arr[0];
        arr[0] = arr[--size];
        heapify(0);
        return max;
    }
    public static void main(String a[]){
        HeapSortImpl obj = new HeapSortImpl(new int[]{1,2,3,4,5});
        while(obj.getSize() > 0){
            System.out.print(obj.poll() + ",");
        }
    }
}