public class MultiplicationTable {
    public void displayTable(int tableNum) {
        System.out.println("============= Multiplication Table of " + tableNum + " =======================");
        for(int i=1; i<=10; i++){
            System.out.println("\t" + tableNum + "   *   " + i + "    =    " + tableNum *i);

        }
    }
}