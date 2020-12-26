/**
*   Author : Zhigunov Vladislav
*/
public class Main {
    public static void main(String[] args) {
    int[] array={3,4,7,8,9,2,5,3,1,0}; // element "3" is duplicate
    DuplicateItemInArray duplicateItemInArray=new DuplicateItemInArray();
        System.out.println("Duplicate : "+duplicateItemInArray.findDuplicateItemInArray(array)); // Duplicate : 3
    }
}
