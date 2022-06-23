import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.JavaHome5.services.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({
            "3,200,300",
            "6,100,250",
            "0,1,50",
            "1,-100,101"
    })
    public void calculatingNumberRoots(int expected, int bottomLine, int upperLine) {
        SQRService service = new SQRService();

        //int expected = 3;
        int actual = service.calcSqrt(bottomLine, upperLine);

        Assertions.assertEquals(expected, actual);
    }

}
