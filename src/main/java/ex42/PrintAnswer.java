package ex42;

public class PrintAnswer {

    public static void printArray(String[] arr) {
        System.out.printf("%-17s%-17s%-17s\n----------------------------------------\n", "Last", "First", "Salary");
        for (int i = 0; i < arr.length; i++) {
            String[] temp = arr[i].split(","); //splits each element
            System.out.printf("%-17s%-17s%-17s\n", temp[0], temp[1], temp[2]);

        }


    }
}