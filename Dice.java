public class Dice {

    // Instance variables
    private Die myDice1 = new Die();
    private Die myDice2 = new Die();

    // Sum of faceValues method
    public int sum () {
        int sum = 0;
        int dieFace1 = myDice1.getFaceValue();
        int dieFace2 = myDice2.getFaceValue();
        sum = dieFace1 + dieFace2;
        return sum;
    }

    // Roll method
    public void roll () {
        myDice1.roll();
        myDice2.roll();
    }
}
