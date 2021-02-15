//Class: 1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Practice1

package Practice;


public class Practice1 {

    public static void main(String [] args) {

        int array [] = new int[] {2683, 2654, 3090, 3325, 4881, 3300, 7456, 3780, 3232, 7270,7773, 5553, 2850, 7619, 2762, 6965, 4539, 3131,6066, 5404, 4183, 6830, 2424, 4517, 6599, 3714, 7351, 4243, 6688, 7819, 6449, 3781, 5565, 3283, 7427};

        int sum= 0, min= array[0], max =0;


        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        double average = (double) sum / array.length;
        System.out.printf("Minimum Value:  " + min);
        System.out.printf("\nMaximum Value:  " + max);
        System.out.printf("%naverage:  %.1f", average);
        System.out.println("\nSum Value: " + sum);
    }
}

