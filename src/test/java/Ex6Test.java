import org.example.Ex6;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex6Test {

    Ex6 calcEx6;
    @BeforeEach
    public void setUp(){
        calcEx6 = new Ex6();
    }

    @Test
    @DisplayName("Teste")
    public void avgDigits(){
        double avg = calcEx6.avgDigits(123);
        assertEquals(2,avg,"Caso 1:Média errada");
    }

}
