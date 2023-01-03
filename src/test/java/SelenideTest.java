import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {
    @Test
    public  void unsplash(){
        open("https://unsplash.com/login");
        $("#user_email")
                .setValue("boss.rus@gmail.com").shouldBe(Condition.value("boss.rus@gmail.com"));

        $("#user_password")
                .setValue("12345").shouldBe(Condition.value("12345"));

        $x("//input[@type='submit']")
                .shouldBe(Condition.visible)
                .click();
//       $("[class='col-xs-10 col-sm-6 center-block flash__message']")
//               .shouldBe(Condition.visible);
        $("[class='col-xs-10 col-sm-6 center-block flash__message']")
                .shouldBe(Condition.exactText("Invalid email or password."));
    }
    @Test
    public  void unsplash1(){
        open("https://unsplash.com/login");
        $("#user_email")
                .setValue("boss.rus@gmail.com").shouldBe(Condition.value("boss.rus@gmail.com"));

        $("#user_password")
                .setValue("12345").shouldBe(Condition.value("12345"));

        $x("//input[@type='submit']")
                .shouldBe(Condition.visible)
                .click();
//       $("[class='col-xs-10 col-sm-6 center-block flash__message']")
//               .shouldBe(Condition.visible);
        $("[class='col-xs-10 col-sm-6 center-block flash__message']")
                .shouldBe(Condition.exactText("Invalid email or."));
    }
}
