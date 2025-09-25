public class NumberGuessingGame{
    private String difficultyString;
    private final String difficulties;
    private int chances;
    private final int number_guess;
    private int attempts;
    private boolean game_state;
    

    public NumberGuessingGame(){
        difficulties = new String[3];
        difficulties[0] ="Easy";
        difficulties[1] ="Medium";
        difficulties[0] ="Hard";

        game_state = false;
        number_guess = (int) (Math.random() *100)+1;
    }


    public boolean isGame_state(){
        return game_state;
    }
    public void setGame_state(boolean game_state) {
        this.game_state = game_state;
    }
  public void setDifficultyString(int difficulty){
    this.difficulties = difficulties[difficulty-1];
  }

  public String getDifficultyString(){
    return difficulties;
  }

  
  public int getChances() {
    return chances;
}

public void setChances(int chances) {
    this.chances = chances;
}



public static void main(String[] args){
    System.out.println();
    System.out.println("Welcome to the Number Guessing Game!");
    System.out.println("I'm thinking of a number between 1 and 100.");
    System.out.println("You have 5 chances to guess the correct number.");






}

    }

