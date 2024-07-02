import java.util.Random;

public class Die {

    // Instance variables
    private int faceValue;

    // No argument constructor
    public Die () {
        this.faceValue = 1;
    }

    // faceValue getter method
    public int getFaceValue() {
        return this.faceValue;
    }

    // faceValue setter method
    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    // Roll method
    public void roll (){
        Random rand = new Random();
        this.faceValue = rand.nextInt(6) + 1; // [1, 6]
    }
}
