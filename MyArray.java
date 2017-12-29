import org.omg.CORBA.PUBLIC_MEMBER;

public class MyArray {

    private long[] arr;

    private int elems;

    public MyArray(){
        arr = new long[50];
    }


    public void insert(long value){
        arr[elems] = value;
        elems++;
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

    //冒泡
    public void BobArray(){
        long swap = 0;
        for(int i=0;i<elems-1;i++){
            for(int j=0;j<elems-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }
            }
        }
    }

    //选择排序
    public void SelectArray(){
        int flag =0;
        long swap;
        for(int i=0;i<elems;i++){
            flag=i;
            for(int j=i+1;j<elems;j++){
                if(arr[j]<arr[flag]){
                    flag = j;
                }
            }
            swap = arr[flag];
            arr[flag]=arr[i];
            arr[i]=swap;
        }
    }
}
