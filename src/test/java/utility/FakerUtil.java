package utility;
import java.util.Locale;

import com.github.javafaker.Faker;
public class FakerUtil {
    public static Faker faker = new Faker(Locale.US);

   public static String getFirstName(){
        return faker.name().firstName();
    }

    public static void main(String[] args) {
        System.out.println(getFirstName());
    }
    

}
