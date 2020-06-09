package bd.edu.seu.springbootblooddemo.model;



import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class donorTest {
    @Test
    void createDonor() {
        donor don = new donor(1, "sabbir", "Dhaka", "01756******");
        System.out.println(don);
    }
}
