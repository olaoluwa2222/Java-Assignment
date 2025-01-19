import java.util.Arrays;
public class MeanMedianSd {
    public static void main(String[] args) {
        int[] array = {2,5,5,9,4,7,0,9,6,11,12};
        Arrays.sort(array);
        double sum = 0;
        double sum1 = 0;
        for (int i  = 0; i< array.length; i++) {
            sum +=array[i];
        }
        double mean = sum / array.length;
        int medFormulae = ((array.length + 1) /2)  ;
        int med = medFormulae -1;
        int median = array[med];
        for (int i  = 0; i< array.length; i++) {
            sum1 += Math.pow(array[i] - mean , 2);
        }
        double standardDeviation = Math.sqrt(sum1 / array.length);
        System.out.println(Arrays.toString(array));
        System.out.println("mean = " + mean);
        System.out.println("median = " + median);
        System.out.println("standard deviation = " + standardDeviation);
    }
}