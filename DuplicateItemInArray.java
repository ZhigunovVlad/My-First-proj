import java.util.HashMap;

public class DuplicateItemInArray {
    DuplicateItemInArray() {}

    public int findDuplicateItemInArray(int[] array) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (hashMap.containsValue(array[i])) {
                return array[i];
            } else {
                hashMap.put(String.valueOf(i), array[i]);
            }
        }
                return -1;
    }
}
