import java.util.Arrays;
import java.util.HashSet;

public class Teodie {
    public static void main(String[] args) {
        int[] grades = {85, 90, 78, 92, 88};

        double average = Arrays.stream(grades).average().orElse(0);
        System.out.println("Average: " + average);

        int max = Arrays.stream(grades).max().orElse(Integer.MIN_VALUE);
        int min = Arrays.stream(grades).min().orElse(Integer.MAX_VALUE);
        System.out.println("Max: " + max + ", Min: " + min);

        for (int i = 0; i < grades.length / 2; i++) {
            int temp = grades[i];
            grades[i] = grades[grades.length - 1 - i];
            grades[grades.length - 1 - i] = temp;
        }
        System.out.println("Reversed Array: " + Arrays.toString(grades));

        int[] additionalGrades = {95, 80};
        int[] mergedArray = new int[grades.length + additionalGrades.length];
        System.arraycopy(grades, 0, mergedArray, 0, grades.length);
        System.arraycopy(additionalGrades, 0, mergedArray, grades.length, additionalGrades.length);
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));

        HashSet<Integer> uniqueGrades = new HashSet<>();
        for (int grade : mergedArray) {
            uniqueGrades.add(grade);
        }
        System.out.println("Unique Grades: " + uniqueGrades);
    }
}
