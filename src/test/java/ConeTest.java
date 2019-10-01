import org.junit.Assert;
import org.junit.Test;

/*
 * Laboratory work 04. Testing.
 * Khatypov V.M.
 * Group BBV-181
 * September 23
 */

public class ConeTest {

    Cone cone = new Cone(7.5, 3.5);

    @Test
    public void whenHeight3_5AndRadius7_5ThenGeneratorLength8_27() {
        Assert.assertEquals(8.27, cone.getGeneratorLength(), 0.01);
    }

    @Test
    public void whenHeight3_5AndRadius7_5ThenBaseArea38_48() {
        Assert.assertEquals(38.48, cone.getBaseArea(), 0.01);
    }

    @Test
    public void whenHeight3_5AndRadius7_5ThenSideArea91() {
        Assert.assertEquals(91, cone.getSideArea(), 0.01);
    }

    @Test
    public void whenHeight3_5AndRadius7_5ThenArea129_48() {
        Assert.assertEquals(129.48, cone.getArea(), 0.01);
    }

    @Test
    public void whenHeight3_5AndRadius7_5ThenVolume96_21() {
        Assert.assertEquals(96.21, cone.getVolume(), 0.01);
    }
}