public class Digit {
    public int action;


    public Digit(int action) {
        if (action >= -1 && action <= 1) {
            this.action = action;
        } else {
            this.action = 0;
        }

    }

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }
}

class FirstDigit extends Digit {
    public FirstDigit(int action) {
        super(action);
    }

}

class SecondDigit extends Digit {
    public SecondDigit(int action) {
        super(action);
    }
}

class ThirdDigit extends Digit {
    public ThirdDigit(int action) {
        super(action);
    }
}

class FourthDigit extends Digit {
    public FourthDigit(int action) {
        super(action);
    }
}

class FifthDigit extends Digit {
    public FifthDigit(int action) {
        super(action);
    }
}








