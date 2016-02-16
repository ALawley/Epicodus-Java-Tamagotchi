import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class TamagotchiTest {

  @Test
  public void addTamagotchi_initiateCorrectly() {
    Tamagotchi testTamagotchi = new Tamagotchi("Tester");
    assertEquals(true, testTamagotchi instanceof Tamagotchi);
    assertEquals("Tester", testTamagotchi.getName());
    assertEquals(10, testTamagotchi.getFoodLevel());
    assertEquals(5, testTamagotchi.getPlayLevel());
    assertEquals(10, testTamagotchi.getRestLevel());
    assertEquals(10, testTamagotchi.getHappinessLevel());
    assertEquals(10, testTamagotchi.getHealthLevel());
    assertEquals(0, testTamagotchi.getAge());
  }

  @Test
  public void timePasses_foodPlayRestLevelsDecrease() {
    Tamagotchi testTamagotchi = new Tamagotchi("Tester");
    testTamagotchi.timePasses();
    assertTrue(testTamagotchi.getFoodLevel() < 10);
    assertTrue(testTamagotchi.getPlayLevel() < 5);
    assertTrue(testTamagotchi.getRestLevel() < 10);
  }
  @Test
  public void setFood_foodLevelSetToInput_5() {
    Tamagotchi testTamagotchi = new Tamagotchi("Tester");
    testTamagotchi.setFood(5);
    assertEquals(5, testTamagotchi.getFoodLevel());
  }
  @Test
  public void feedPet_foodLevelWillIncreasebyFive() {
    Tamagotchi testTamagotchi = new Tamagotchi("Tester");
    testTamagotchi.setFood(2);
    testTamagotchi.feedPet();
    assertEquals(7, testTamagotchi.getFoodLevel());
  }
  @Test
  public void setPlay_playLevelSetToInput_8() {
    Tamagotchi testTamagotchi = new Tamagotchi("Tester");
    testTamagotchi.setPlay(8);
    assertEquals(8, testTamagotchi.getPlayLevel());
  }
  @Test
  public void playPet_playLevelWillIncreasebyFive() {
    Tamagotchi testTamagotchi = new Tamagotchi("Tester");
    testTamagotchi.setPlay(3);
    testTamagotchi.playPet();
    assertEquals(8, testTamagotchi.getPlayLevel());
  }
  @Test
  public void setRest_restLevelSetToInput_6() {
    Tamagotchi testTamagotchi = new Tamagotchi("Tester");
    testTamagotchi.setRest(6);
    assertEquals(6, testTamagotchi.getRestLevel());
  }
  @Test
  public void restPet_restLevelWillIncreasebyFive() {
    Tamagotchi testTamagotchi = new Tamagotchi("Tester");
    testTamagotchi.setRest(3);
    testTamagotchi.restPet();
    assertEquals(8, testTamagotchi.getRestLevel());
  }
  @Test
  public void setAge_ageSetToInput_4() {
    Tamagotchi testTamagotchi = new Tamagotchi("Tester");
    testTamagotchi.setAge(4);
    assertEquals(4, testTamagotchi.getAge());
  }
  @Test
  public void isMature_playerWinsWhenAgeIs50_true() {
    Tamagotchi testTamagotchi = new Tamagotchi("Tester");
    testTamagotchi.setAge(50);
    assertEquals(true, testTamagotchi.isMature());
  }
  @Test
  public void setHealth_healthSetToInput_4() {
    Tamagotchi testTamagotchi = new Tamagotchi("Tester");
    testTamagotchi.setHealth(4);
    assertEquals(4, testTamagotchi.getHealthLevel());
  }
  @Test
  public void isDead_diesWhenHealthIsZero_true() {
    Tamagotchi testTamagotchi = new Tamagotchi("Tester");
    testTamagotchi.setHealth(0);
    assertEquals(true, testTamagotchi.isDead());
  }
  @Test
  public void setHappiness_happinessSetToInput_4() {
    Tamagotchi testTamagotchi = new Tamagotchi("Tester");
    testTamagotchi.setHappiness(4);
    assertEquals(4, testTamagotchi.getHappinessLevel());
  }
  @Test
  public void isRunAway_diesWhenHealthIsZero_true() {
    Tamagotchi testTamagotchi = new Tamagotchi("Tester");
    testTamagotchi.setHappiness(0);
    assertEquals(true, testTamagotchi.isRunAway());
  }
}
