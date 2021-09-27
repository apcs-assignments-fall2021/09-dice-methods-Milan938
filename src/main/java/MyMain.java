public class MyMain {
    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        int roll = (int) (Math.random() * 6) + 1;
        return roll;
    }

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        double count = 0.0;

        // Your code should roll 6 dice 10,000 times, so you should have a
        // for loop such as:
        for (int i = 0; i < 10000; i++) {
            for(int j = 0; j < 6; j++) {
                rollDie();
                if(rollDie() == 6){
                    count = count + 1;
                    break;
                }
            }
        }
        count = (count / 100.0);
        return count;
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {

        int sixcount = 0;
        double count = 0.0;
        for (int i = 0; i < 10000; i++) {
            for(int j = 0; j < 12; j++) {
                rollDie();
                if(rollDie() == 6){
                    sixcount += 1;
                    if(sixcount == 2) {
                        sixcount = 0;
                        count += 1;
                        break;
                    }
                }
            }
        }
        count = (count / 100);
        return count;
    }

    // Calculate the probability of rolling at least three 6's when rolling
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int sixcount = 0;
        double count = 0.0;
        for (int i = 0; i < 10000; i++) {
            for(int j = 0; j < 18; j++) {
                rollDie();
                if(rollDie() == 6){
                    sixcount += 1;
                    if(sixcount == 3) {
                        sixcount = 0;
                        count += 1;
                        break;
                    }
                }
            }
        }
        count = (count / 100);
        return count;
    }

    public static void main(String[] args) {
        System.out.println(rollDie());
        System.out.println(probabilityOneSix());
        System.out.println(probabilityTwoSixes());
        System.out.println(probabilityThreeSixes());
    }
}
