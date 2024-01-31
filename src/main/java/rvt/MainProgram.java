package rvt;
public class MainProgram {

    public static int smallest(int[] intArr) {
        int smallest = intArr[0];
        for (int i = 0; i < intArr.length; i++){
            if (intArr[i] < smallest){
                smallest = intArr[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int smallest = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
                index = i;
            }
        }            
        return index;
    }
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int mazakais = table[startIndex];
        int index = startIndex;
        for (int i = startIndex; i < table.length; i++){
            if ((table[i] < mazakais)){
                mazakais = table[i];
                index = i;
            }
        }
        return index;
    }

    public static int[] swap(int[] array, int index1, int index2) {
            //  {3, 2, 5, 4, 8}

        int num = array[index1]; 
        array[index1] = array[index2]; 
        array[index2] = num;
        return array;
    }

}
