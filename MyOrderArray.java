public class MyOrderArray {

    private long[] arr;

    private int elems;

    public MyOrderArray(){
        arr = new long[50];
    }


    public void insert(long value){
        int i;
        for(i=0;i<elems;i++){
            if(arr[i]>value){
                break;
            }
        }

        for(int j=elems;j>i;j--){
            arr[j]=arr[j-1];
        }

        arr[i]=value;

        elems++;
    }

    //二分法查找
    public int binarySearch(long searchKey){
        int ins=0;
        int low=0;
        int pow = elems;

        while(true){
            ins = (low+pow)/2;
            if (arr[ins] == searchKey) {
                return ins;
            }else if(low>pow){
                return -1;
            }else if(arr[ins]>searchKey){
                pow = ins-1;
            } else if (arr[ins]<searchKey) {
                low=ins+1;
            }
        }
    }

    public void display(){
        for (int i=0;i<elems;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public int search(long searchKey){
        int i;
        for( i=0;i<arr.length;i++){
            if(arr[i] == searchKey){
                break;
            }
        }
        if(i==arr.length){
            return -1;
        }else{
            return i;
        }
    }

    public void delete(long deleteKey){
        if(search(deleteKey) ==-1){
            System.out.println("所要删除的数据不存在");
        }else{
            for(int j=search(deleteKey);j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
        }
    }

    public void change(long value,long newvalue){
        if(search(value) ==-1){
            System.out.println("查找不到指定数据");
        }else{
            arr[search(value)]=newvalue;
        }
    }
}
