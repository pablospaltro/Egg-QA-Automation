import org.example.entities.Rectangulo;
import org.example.services.RectanguloService;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectanguloTest {

    private static Rectangulo rectangulo1;

    private static RectanguloService rectanguloService;

    public RectanguloTest(){}

    @BeforeClass
    public static void setUp(){
        rectangulo1 = new Rectangulo(5, 20);
        rectanguloService = new RectanguloService();
    }

    @Test
    public void testRectanguloEstaActivo() {
        assertTrue(rectangulo1.isActive());
        rectangulo1.setActive(false);
        assertFalse(rectangulo1.isActive());
    }

    @Test
    public void testAnchoRectangulo() {
        assertEquals(5, rectangulo1.getAncho(), 0);
    }

    @Test
    public void testLargoRectangulo() {
        assertEquals(20, rectangulo1.getLargo(), 0);
    }

    @Test
    public void testExistenciaRectangulo() {
        assertNotNull(rectangulo1);
    }

    @Test
    public void testCalcularArea(){
        assertEquals(100, rectanguloService.calcularArea(new Rectangulo(10, 10)), 0);
        assertEquals(20, rectanguloService.calcularArea(new Rectangulo(4, 5)), 0);
        assertEquals(1, rectanguloService.calcularArea(new Rectangulo(1, 1)), 0);
    }

    @Test
    public void testCalcularPerimetro(){
        assertEquals(40, rectanguloService.calcularPerimetro(new Rectangulo(10, 10)), 0);
        assertEquals(24, rectanguloService.calcularPerimetro(new Rectangulo(2, 10)), 0);
        assertEquals(10, rectanguloService.calcularPerimetro(new Rectangulo(2, 3)), 0);
    }
}
