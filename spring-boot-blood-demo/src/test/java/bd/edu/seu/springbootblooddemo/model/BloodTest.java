package bd.edu.seu.springbootblooddemo.model;



import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BloodTest {
    

    @Test
    void createDonor() {
        donor don = new donor(1, "sabbir", "dhaka", "01756******");

        Blood blood1 = new Blood(don, 1, "sabbir", "erythrocytes");
        Blood blood2 = new Blood(don, 2, "Aftab", "thrombocytes");



        System.out.println(blood1);
    }
}
