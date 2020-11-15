package de.broscientist.myfirstproject;

public class FitzQuark {
    public void fitzQuark(int howManyTimes) {
        String resultString;
        for (int index = 1; index <= howManyTimes; index++) {
            resultString = "";
            if ((index % 5 != 0) && (index % 7 != 0)){
                resultString = Integer.toString(index);
            }
            else {
                if (index % 5 == 0) {
                    resultString = resultString + "Fitz";
                }
                if (index % 7 == 0) {
                    resultString = resultString + "Quark";
                }
            }
            System.out.println(resultString);
        }
    }
}
