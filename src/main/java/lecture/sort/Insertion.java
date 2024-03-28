package lecture.sort;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] array = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        sortAnswer(array);
        System.out.println(Arrays.toString(array));
    }

    private static void sortMine(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int target = array[i];
            int insertedIndex = i;
            // 삽입될 인덱스
            for(int j = 0; j < i; j ++) {
                if(target < array[j]) {
                    insertedIndex = j;
                    break;
                }
            }
            // 삽입될 인덱스 ~ (i - 1) 배열 복사 -> (삽입될 인덱스 + 1) ~ i 범위로 밀기
            System.arraycopy(array, insertedIndex, array, insertedIndex + 1, i - insertedIndex);
            array[insertedIndex] = target;
        }
    }

    private static void sortAnswer(int[] array) {
        for(int i = 1; i < array.length; i++) {
            for(int j = i; j > 0; j --) {
                int temp;
                if(array[j] < array[j - 1]) {
                    // 자리 바꿈
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }else {
                    break;
                }
            }
        }
    }
}
