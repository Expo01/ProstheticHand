import java.util.Scanner;

//contains section 8 content mostly
//Ways to increase functionality:
    //- scaling strength of actions such as strength range from 1 to 5 and -1 to -5 not just "on or off"
    //- Using a double not int would allow for sliding power level, not just large increment increase/decrease
    //- double would also allow for creating a resting zone/range for low level resting electrical impulse/muscle tone
    //- speed of action. not sure how to do this. I suspect it would involve rate of change in signal magnitude
        // considering fast twitch and slow twitch impulse threshold...
    //- safety off for excessive external load
    //- could get freaky and have sensory feedback.
        // if this was nerve integration i'd consider light touch/pressure/pain somehow
        // if this ws just myo-electric I'd basically have a little shock collar where prosthetic monitors force output
            // and then if gets too close to max force range, send TENS tingles to residual limb
    //- kinda boring, but it should have battery functions such as charging, percent remaining/available, etc...


public class Main {

    public static void main(String[] args) {

        FirstDigit firstDigit = new FirstDigit(0);
        SecondDigit secondDigit = new SecondDigit(0);
        ThirdDigit thirdDigit = new ThirdDigit(0);
        FourthDigit fourthDigit = new FourthDigit(0);
        FifthDigit fifthDigit = new FifthDigit(0);
        TransversePlane transversePlane = new TransversePlane(0);
        SagittalPlane sagittalPlane = new SagittalPlane(0);
        FrontalPlane frontalPlane = new FrontalPlane(0);
        Hand hand = new Hand(firstDigit, secondDigit, thirdDigit, fourthDigit, fifthDigit,transversePlane, sagittalPlane, frontalPlane);

        printInstructions();

        setActionStates(hand);

    }

    public static void setActionStates(Hand hand){ //not really necessary, but does hide 'Hand' class from 'main'
        hand.setActionStates();
    }
    public static void printInstructions() {
        System.out.println("""
                -input 5 whole numbers to control action of individual digits of hand
                -1st number will control action of thumb, 5th will control pinky, etc.
                -non-integer input will quit the program
                    '1' will engage digit flexion
                    '-1' will engage digit extension
                    '0' for resting position
                - 3 functional grip options will be available. All other integer combinations produce resting position
                     (11111) is power grip
                     (1-1111) is pointer position
                     (11100) is pincer grip
                -enter 3 more whole numbers to control action of  3 planes of wrist motion
                     (1, -1, 0) for wrist supination, pronation or neutral position
                     (1, -1, 0) for wrist flexion, extension or neutral position
                     (1, -1, 0) for wrist radial deviation, ulnar deviation or neutral position
                - all other integers result in resting state
                """);
        //while the instructions are impractical for a person as the user from the main method, the intention is
        //the user will not input information from a keyboard, but will input numerical data through electrical
        // signals from muscle contraction or nerve impulse which will be converted into appropriate integer values
    }


}









//        for(int i =0; i <5; i++){            //  was trying to create a loop to assign each digit, but it would have to
// be an arrayList such that hand field was actually an ArrayList of the
//subclasses
//           int inputAction = actionScanner.nextInt();
//            int[] digitArray = new int[5];
//           switch (inputAction){
//               case 0: digitArray[i] = 0;
//               break;
//               case 1: digitArray[i] = 1;
//               break;
//               case -1: digitArray[i] = -1;
//            }
//        }


