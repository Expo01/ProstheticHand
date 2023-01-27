import java.util.Scanner;

public class Hand {
    public FirstDigit firstDigit;
    public SecondDigit secondDigit;
    public ThirdDigit thirdDigit;
    public FourthDigit fourthDigit;
    public FifthDigit fifthDigit;

    public TransversePlane transversePlane;
    public SagittalPlane sagittalPlane;
    public FrontalPlane frontalPlane;


    public Hand(FirstDigit firstDigit, SecondDigit secondDigit, ThirdDigit thirdDigit, FourthDigit fourthDigit,
                FifthDigit fifthDigit,TransversePlane transversePlane, SagittalPlane sagittalPlane, FrontalPlane frontalPlane) {
        this.firstDigit = firstDigit;
        this.secondDigit = secondDigit;
        this.thirdDigit = thirdDigit;
        this.fourthDigit = fourthDigit;
        this.fifthDigit = fifthDigit;
        this.transversePlane = transversePlane;
        this.sagittalPlane = sagittalPlane;
        this.frontalPlane = frontalPlane;

    }

    public static Scanner actionScanner = new Scanner(System.in);

   public void setActionStates() {
       while (actionScanner.hasNextInt()) { //need a new infinite while loop criteria
           firstDigit.setAction(actionScanner.nextInt()); // want to make user input all one line for terminal readability. setAction would then just equal
           // the element value of an array index and scanner would only be called once for String of numbers. Downside is the while loop is contigent
           // on int input.
           secondDigit.setAction(actionScanner.nextInt());
           thirdDigit.setAction(actionScanner.nextInt());
           fourthDigit.setAction(actionScanner.nextInt());
           fifthDigit.setAction(actionScanner.nextInt());
           transversePlane.setAction(actionScanner.nextInt());
           sagittalPlane.setAction(actionScanner.nextInt());
           frontalPlane.setAction(actionScanner.nextInt());


           doActionHand(firstDigit.getAction(), secondDigit.getAction(), thirdDigit.getAction(), fourthDigit.getAction(),
                   fifthDigit.getAction());

           doActionWrist(transversePlane.getAction(),sagittalPlane.getAction(), frontalPlane.getAction());



           //need to assign to an array of strings then convert or something.
//           Scanner scanner = new Scanner(System.in);
//           System.out.println("Enter a list of integers, separated by commas:");
//           String input = scanner.nextLine();
//
//           String[] splits = input.split(",");
//           int[] values = new int[splits.length]; //has not yet assigned values to the array, just the length
//
//           for (int i = 0; i < splits.length; i++) {
//               values[i] = Integer.parseInt(splits[i].trim());
           //new section 9: MinimumElementVersion2: scanner input string of numbers, '.split' into String array. Parsed ints
           // to convert to int[] with use of '.trim' java method


       }
   }

   public void doActionWrist(int transversePlane,int sagittalPlane, int frontalPlane){ //something isn't working right here
       switch (transversePlane) {
           case 1 -> System.out.println("wrist supination engaged");
           case -1 -> System.out.println("wrist pronation engaged");
           case 0 -> System.out.println("transverse plane resting position engaged");
       }
       switch (sagittalPlane) {
           case 1 -> System.out.println("wrist flexion engaged");
           case -1 -> System.out.println("wrist extension engaged");
           case 0 -> System.out.println("sagittal plane resting position engaged");
       }
       switch (frontalPlane) {
           case 1 -> System.out.println("wrist radial deviation engaged");
           case -1 -> System.out.println("wrist ulnar deviation engaged");
           case 0 -> System.out.println("frontal plane resting position engaged");
       }

   }
    public void doActionHand(int firstDigitAction, int secondDigitAction, int thirdDigitAction,
                       int fourthDigitAction, int fifthDigitAction) {

        if (firstDigitAction == 1 && secondDigitAction == 1 && thirdDigitAction == 1 && fourthDigitAction == 1 && fifthDigitAction == 1) {
            powerGrip();
        } else if (firstDigitAction == 1 && secondDigitAction == -1 && thirdDigitAction == 1 && fourthDigitAction == 1 && fifthDigitAction == 1) {
            pointerPosition();
        } else if (firstDigitAction == 1 && secondDigitAction == 1 && thirdDigitAction == 1 && fourthDigitAction == 0 && fifthDigitAction == 0) {
            pincerGrip();
        } else {
            restingStateHand();
        }
    }

    public void restingStateHand() {
        System.out.println("digits resting position engaged");
    }

    public void powerGrip() {
        System.out.println("power grip engaged");
    }

    public void pointerPosition() {
        System.out.println("pointer position engaged");
    }

    public void pincerGrip() {
        System.out.println("pincer grip engaged");

    }


}
