import java.util.HashSet;

public class solutions_HashSet {
    public static void main(String args[]) {
        int[] myArray = new int[10];
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 6;
        myArray[4] = 5;
        myArray[5] = 2;
        myArray[6] = 7;
        myArray[7] = 1;
        myArray[8] = 5;
        myArray[9] = 6;
        int[] duplicates = returnDuplicates(myArray);
        printDuplicates(duplicates);
    }


    public static int[] returnDuplicates(int[] listOfNums) {
        HashSet<Integer> tempList = new HashSet<Integer>();
        int[] outputDuplicateList = new int[listOfNums.length];
        int index =0;
        for (int i = 0; i < listOfNums.length; i++) {
            if (!tempList.add(listOfNums[i])) {
                outputDuplicateList[index] = (listOfNums[i]);
                index++;
            }
        }
        return outputDuplicateList;
    }

    public static void printDuplicates(int[] listNums) {
        for (int i = 0; i < listNums.length; i++) {
            System.out.println(listNums[i]);
        }
    }

}

