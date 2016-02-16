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
  public void setFood(int newFood) {
    mFood = newFood;
  }
  public void setPlay(int newPlay) {
    mPlay = newPlay;
  }
  public void setRest(int newRest) {
    mRest = newRest;
  }
  public void setAge(int newAge) {
    mAge = newAge;
  }
  public void setHealth(int newHealth) {
    mHealth = newHealth;
  }
  public void setHappiness(int newHappiness) {
    mHappiness = newHappiness;
  }
  public void timePasses() {
    mFood -= (myRandomGenerator.nextInt(2) + 1);
    mPlay -= (myRandomGenerator.nextInt(2) + 1);
    mRest -= (myRandomGenerator.nextInt(2) + 1);
    mAge +=1;
    if (mFood <= 0) {
      mFood = 0;
      mHealth -=1;
    }
    if (mPlay <= 0) {
      mPlay = 0;
      mHappiness -=1;
    }
    if (mRest <= 0) {
      mRest = 0;
      mHealth -=1;
      mHappiness -=1;
    }
  }
  public void feedPet() {
    mFood += 5;
    if (mFood > 10) {
      mFood = 10;
    }
  }
  public void playPet() {
    mPlay +=5;
    if (mPlay > 10) {
      mPlay = 10;
    }
  }
  public void restPet() {
    mRest +=5;
    if (mRest > 10) {
      mRest = 10;
    }
  }
  public Boolean isMature() {
    if (mAge >= 100) {
      return true;
    } return false;
  }
  public Boolean isDead() {
    if (mHealth <= 0) {
      return true;
    } return false;
  }
  public Boolean isRunAway() {
    if (mHappiness <= 0) {
      return true;
    } return false;
  }
}
