import java.util.HashMap;
import java.util.Map;

class twoRepeated {
    //Function to find the minimum element in sorted and rotated array.
    public static int[] twoRepeated(int arr[], int N)
    {
     Map<Integer,Integer> TempMap = new HashMap<>();
     int resultArr[] = new int[arr.length-N];
     int indexCounter =0;

     for(int i=0;i< arr.length;i++){
         if(TempMap.containsKey(arr[i])){
             resultArr[indexCounter] = arr[i];
             indexCounter++;
         }
         else{
             TempMap.put(arr[i], 1);
         }
     }
     return  resultArr;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(twoRepeated(new int[]{1,2,1,3,4,3}, 4));
    }

}
