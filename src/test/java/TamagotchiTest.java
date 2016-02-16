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
  public void addTamagotchi_initiateTamagotchiNameCorrectly() {
    Tamagotchi testTamagotchi = new Tamagotchi("Tester");

  }
}
