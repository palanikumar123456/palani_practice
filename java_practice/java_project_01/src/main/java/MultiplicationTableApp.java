import java.util.*;

public class MultiplicationTableApp {
    public static void main(String[] args) {
        int tableNum=0;
        MultiplicationTable table = new MultiplicationTable();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the table number: ");
        tableNum = scanner.nextInt();
        table.displayTable(tableNum);
    }
}