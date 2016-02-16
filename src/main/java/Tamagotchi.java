public class Tamagotchi {
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
}
