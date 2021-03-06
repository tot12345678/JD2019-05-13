package by.it.kobrinets.calc11;

import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line;

        Parser parser = new Parser();
        Printer printer = new Printer();

        while (!(line = scan.nextLine()).equals("end")) {
            if (line.equals("printvar")) {
                Var.printvar();
                continue;
            }
            if (line.equals("sortvar")) {
                Var.sortvar();
                continue;
            }
            try {
                Var result = parser.calc(line);
                printer.print(result);
            } catch (CalcException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
