import java.util.ArrayList;
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.fluentlenium.core.filter.FilterConstructor.*;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("Create your tamagotchi!");
  }

  @Test
  public void checkIfNameDisplayed() {
      goTo("http://localhost:4567/");
      fill("#petName").with("Bunny");
      submit(".btn");
      assertThat(pageSource()).contains("Bunny");
  }
  @Test
  public void checkIfFeedTamagotchiDisplayedCorrectly() {
      goTo("http://localhost:4567/");
      fill("#petName").with("Bunny");
      submit(".btn");
      submit("#feed");
      assertThat(pageSource()).contains("Age - 1");
  }
  @Test
  public void checkIfPlayTamagotchiDisplayedCorrectly() {
      goTo("http://localhost:4567/");
      fill("#petName").with("Bunny");
      submit(".btn");
      submit("#play");
      assertThat(pageSource()).contains("Age - 1");
  }
  @Test
  public void checkIfRestTamagotchiDisplayedCorrectly() {
      goTo("http://localhost:4567/");
      fill("#petName").with("Bunny");
      submit(".btn");
      submit("#rest");
      assertThat(pageSource()).contains("Age - 1");
  }
}
