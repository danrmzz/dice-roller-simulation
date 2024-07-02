public class Main {

    public static void main(String[] args) {

        // Create new Dice object
        Dice myDice = new Dice();

        // Create an integer array
        int[] arr = new int[1000];

        // Roll dice 1,000 times and update array
        for (int i = 0; i < arr.length; i++) {
            myDice.roll();
            arr[i] = myDice.sum();
        }

        // Create arrays to help create histogram
        int[] histData = new int[13]; // [0 to 12 index]
        boolean[] histBool = new boolean[13]; // [0 to 12 index]


        // Go through array and print values starting from 2 to 12
        for (int faceNumber = 2; faceNumber <= 12; faceNumber++) {
            int counter = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == faceNumber) {
                    counter++;
                }
            }

            histData[faceNumber] = counter;
            System.out.println("Number of " + faceNumber + "s are " + counter);
        }

        System.out.println("Graph");

        int y = 150;

        // Print y axis values
        for (int i = 0; i < 7; i++) {

            if (y < 100 && y != 0) {
                System.out.print(" " + y + "|");
            }
            else if (y == 0) {
                System.out.print("  " + y + "|");
            }
            else {
                System.out.print(y + "|");
            }

            // Update helper arrays based on y values
            for (int faceNumber = 2; faceNumber <= 12; faceNumber++) {
                if ((histData[faceNumber] >= y && histData[faceNumber] < (y+25)) || (y == 150 && histData[faceNumber] > y)) {
                    histBool[faceNumber] = true;
                }
            }

            // Print *'s in graph
            for (int faceNumber = 2; faceNumber <= 12; faceNumber++) {
                if (histBool[faceNumber]) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                System.out.print("  ");
            }

            // Decrease y value and go down a line
            y -= 25;
            System.out.println();
        }

        System.out.println("    --------------------------------");
        System.out.println("    2  3  4  5  6  7  8  9 10 11 12");


    }
}
