package l8q1;

public class Number {

    private int[] numbers;
    public Number() {
        this(10);
    }

    public Number (int N) {
        this(N, 100);
    }

    public Number(int N, int max) {
        numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = (int)(Math.random() * max + 1);
        }
    }

    public void displayAll() {
        displayAllNumbers();
        displayEvenNumbers();
        displayPrimeNumbers();
        displayMaximumNumber();
        displayMinimumNumber();
        displayAverageNumber();
        displaySquareNumber();
    }

    private void displayAllNumbers() {
        System.out.print("All numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    private void displayEvenNumbers() {
        System.out.print("Even numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }
    private boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;
    }
    private void displayPrimeNumbers() {
        System.out.print("Prime numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i]) == true) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }

    private void displayMaximumNumber() {
        int max = numbers[0];
        System.out.print("Maximum number: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.print(max);
        System.out.println("");
    }

    private void displayMinimumNumber() {
        int min = numbers[0];
        System.out.print("Minimum number: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.print(min);
        System.out.println("");
    }

    private void displayAverageNumber() {
        double average = 0;
        System.out.print("Average number: ");
        for (int i = 0; i < numbers.length; i++) {
            average += numbers[i];
        }
        System.out.println(average/numbers.length);
    }

    static boolean checkPerfectSquare(double number)
    {
        double sqrt=Math.sqrt(number);
        return ((sqrt - Math.floor(sqrt)) == 0);
    }
    private void displaySquareNumber() {
        System.out.print("Square number: ");
        for (int i = 0; i < numbers.length; i++) {
            if (checkPerfectSquare(numbers[i])) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println("");
    }
  
}