import java.util.Random;

public class Tamagotchi {
  Random myRandomGenerator = new Random();
  private String mName;
  private int mFood;
  private int mPlay;
  private int mRest;
  private int mHealth;
  private int mHappiness;
  private int mAge;

  public Tamagotchi(String tamagotchiName) {
    mName = tamagotchiName;
    mFood = 10;
    mPlay = 5;
    mRest = 10;
    mHealth = 10;
    mHappiness = 10;
    mAge = 0;
  }
  public String getName() {
    return mName;
  }
  public int getFoodLevel() {
    return mFood;
  }
  public int getPlayLevel() {
    return mPlay;
  }
  public int getRestLevel() {
    return mRest;
  }
  public int getHealthLevel() {
    return mHealth;
  }
  public int getHappinessLevel() {
    return mHappiness;
  }
  public int getAge() {
    return mAge;
  }
  public Boolean setFood(int newFood) {
    mFood = newFood;
    return true;
  }
  public Boolean timePasses() {
    mFood -= (myRandomGenerator.nextInt(2) + 1);
    mPlay -= (myRandomGenerator.nextInt(2) + 1);
    mRest -= (myRandomGenerator.nextInt(2) + 1);
    return true;
  }
  public Boolean feedPet() {
    mFood += 5;
    return true;
  }

  public Boolean playPet() {
    mPlay +=5;
    return true;
  }

  public Boolean setPlay(int newPlay) {
    mPlay = newPlay;
    return true;

  }

  public Boolean setRest(int newRest) {
    mRest = newRest;
    return true;
  }
  public Boolean restPet() {
    mRest +=5;
    return true;
  }

}
