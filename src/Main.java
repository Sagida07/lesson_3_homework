import java.util.Arrays;

public class Main {
    public static void selectionSort(double[] myNumbers) {
        int a = myNumbers.length;
        for (int i = 0; i < a - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a; j++) {
                if (myNumbers[j] < myNumbers[minIndex]) {
                    minIndex = j;
                }
            }

            double temp = myNumbers[i];
            myNumbers[i] = myNumbers[minIndex];
            myNumbers[minIndex] = temp;


            System.out.println(Arrays.toString(myNumbers));
        }
    }

    public static void main(String[] args) {
        double[] myNums = {0.78, -673.987, -0.35, 936.7, 342.988, 811.3, 64.2, -52.8, -4.87, -5.987, 12.60542, 273.609, 778.99, -349.0002, -694.607};

        for (int i = 0; i < myNums.length; i++) {
            System.out.println(myNums[i] + "\n");
        }
        double result = 0;
        int s = 0;
        boolean negativeNumber = false;


        for (double forNow : myNums) {


            if (!negativeNumber) {
                if (forNow < 0) {
                    negativeNumber = true;
                }
            } else {
                if (forNow > 0) {
                    result += forNow;
                    s++;
                }
            }

        }
        System.out.println(result / s);


        double[] myNumbers = {0.56, 9.99, -43.62, 0.004, 9384.5, -9.77081, 3.66, -2.9, 6.733332, -88.33};
        System.out.println(Arrays.toString(myNumbers));

        selectionSort(myNumbers);

        System.out.println(Arrays.toString(myNumbers));
    }
}