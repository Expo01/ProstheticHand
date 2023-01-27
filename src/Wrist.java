public class Wrist {
  public int action;

    public Wrist(int action) {
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

class TransversePlane extends Wrist{
    public TransversePlane(int action) {
        super(action);
    }
}

class SagittalPlane extends Wrist{
    public SagittalPlane(int action) {
        super(action);
    }
}

class FrontalPlane extends Wrist{
    public FrontalPlane(int action) {
        super(action);
    }
}

