public class Main
{
    public static void main(String[] args)

    {
        int intOperandA = 25;
        int intOperandB = 17;

        int intSum = 0;
        int intProduct = 0;
        int intQuotient = 0;
        int intDifference = 0;
        int intModulo = 0;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum of " + intOperandA + " and " + intOperandB + " is " + intSum);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product of " + intOperandA + " and " + intOperandB + " is " + intProduct);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient of " + intOperandA + " and " + intOperandB + " is " + intQuotient);

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference of " + intOperandA + " and " + intOperandB + " is " + intDifference);

        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        //This section now complete

        double doubleOperandA = 23.55;
        double doubleOperandB = 12.49;

        double doubleSum = 0;
        double doubleProduct = 0;
        double doubleQuotient = 0;
        double doubleDifference = 0;
        double doubleModulo = 0;

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);

        doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println("The modulo of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo);
        //This section now complete

        double myLunchCost = 12.50;
        int siblingCount = 1;
        boolean isRaining = false;
        double pricePerGallon = 2.99;
        int favNumber = 17;
        double shoeSize = 11.5;
        String birthMonth = "March";
        String fullName = "Tommy DeSalvo";

        System.out.println("The cost of my lunch is: $" + myLunchCost);
        System.out.println("My number of siblings is: " + siblingCount);
        System.out.println("If it is currently raining " + isRaining);
        System.out.println("The price for a gallon of gas is: " + pricePerGallon);
        System.out.println("My favorite number is: " + favNumber);
        System.out.println("My shoe size is: " + shoeSize);
        System.out.println("My birth month is: " + birthMonth);
        System.out.println("My name is: " + fullName);
    }

}