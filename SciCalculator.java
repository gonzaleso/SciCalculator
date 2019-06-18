import java.util.Scanner;
public class SciCalculator
{
    public static void main(String[] args)
    {
        // Variables
        // f = first, s = second
        double currentResult = 0.0;
        double fOperand = 0.0;
        double sOperand = 0.0;
        String fnum = "";
        String snum = "";
        int numCalcs = 0;
        double sum = 0.0;
        String line = "";
        boolean running = true;
        int selection = 0;

        Scanner scanner = new Scanner(System.in);

        while (running)
        {

            if (numCalcs > 0)
            {
                line = "\n";
            }

            if (selection >= 0 && selection < 7)
            {
                System.out.println(line + "Current Result: " + currentResult);

                System.out.println("\nCalculator Menu");
                System.out.println("---------------");
                System.out.println("0. Exit Program");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exponentiation");
                System.out.println("6. Logarithm");
                System.out.println("7. Display Average");
            }

            System.out.print("\nEnter Menu Selection: "); //user input selection

            selection = scanner.nextInt();

            //set user input equal to operands; define input of "RESULT"
            if (1 <= selection && 6 >= selection)
            {
                System.out.print("\nEnter first operand: ");
                fnum = scanner.next();

                System.out.print("Enter second operand: ");
                snum = scanner.next();

                if (fnum.equals("RESULT"))
                {
                    fOperand = currentResult;
                }
                else
                {
                    fOperand = Double.parseDouble(fnum);
                }

                if (snum.equals("RESULT"))
                {
                    sOperand = currentResult;
                }
                else
                {
                    sOperand = Double.parseDouble(snum);
                }
            }

            switch (selection)
            {
                case 0:
                    // Exit Program
                    running = false;
                    break;

                case 1:
                    // Addition
                    currentResult = fOperand + sOperand;
                    numCalcs += 1;
                    sum += currentResult;
                    break;

                case 2:
                    // Subtraction
                    currentResult = fOperand - sOperand;
                    numCalcs += 1;
                    sum += currentResult;
                    break;

                case 3:
                    // Multiplication
                    currentResult = fOperand * sOperand;
                    numCalcs += 1;
                    sum += currentResult;
                    break;

                case 4:
                    // Division
                    currentResult = fOperand / sOperand;
                    numCalcs += 1;
                    sum += currentResult;
                    break;

                case 5:
                    // Exponents
                    currentResult = Math.pow(fOperand, sOperand);
                    numCalcs += 1;
                    sum += currentResult;
                    break;

                case 6:
                    // Logarithms
                    fOperand = Math.log(fOperand);
                    sOperand = Math.log(sOperand);
                    currentResult = sOperand / fOperand;
                   numCalcs += 1;
                    sum += currentResult;
                    break;

                case 7:
                    // Statistics
                    if (numCalcs > 0)
                    {
                        double calcAverage = sum / numCalcs;
                        calcAverage = Math.round(calcAverage * 100) / 100.00;
                        System.out.println("\nSum of calculations: " + sum);
                        System.out.println("Number of calculations: " + numCalcs);
                        System.out.println("Average of calculations: " + calcAverage);
                    }
                    else
                    {
                        System.out.println("\nError: No calculations yet to average!");
                    }
                    break;

                default:
                    // Invalid Selection
                    System.out.println("\nError: Invalid selection!");
                    break;
            }


        }
        System.out.print("\nThanks for using this calculator. Goodbye!");
    }
}