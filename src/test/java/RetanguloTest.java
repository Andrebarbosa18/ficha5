import org.example.Retangulo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RetanguloTest {

    Retangulo retangulo;
    @BeforeEach
    public void setUp(){
        retangulo = new Retangulo();
    }

    @Test
    public void area(){
        int resultado = retangulo.area(3,5);
        assertEquals(15, resultado, "3*5=15");
        resultado = retangulo.area(5,8);
        assertEquals(40, resultado, "5*8=40");
        resultado = retangulo.area(2,4);
        assertEquals(8, resultado, "2*4=8");
        //assertEquals(7, resultado, "2*4=8");
    }

    @Test
    public void perimetro(){
        int resultado = retangulo.perimetro(3,5);
        assertEquals(16,resultado, "(2*3)+(2*5)=16");
        resultado = retangulo.perimetro(5,8);
        assertEquals(16,resultado, "(2*5)+(2*8)=26");
        resultado = retangulo.perimetro(2,4);
        //assertEquals(35,resultado, "(2*2)+(2*4)=12");
        assertEquals(16,resultado, "(2*2)+(2*4)=12");
    }
}
