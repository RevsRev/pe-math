package rev.pe.math.modular;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
public class TestMod
{
    @Test
    public void testPow() {
        Assertions.assertEquals(0, Mod.pow(5,3,25));
        Assertions.assertEquals(0, Mod.pow(6, 4, 48));
        Assertions.assertEquals(1, Mod.pow(2,0,6));
        Assertions.assertEquals(1, Mod.pow(5, 4, 3));
        Assertions.assertEquals(1, Mod.pow(7, 4, 5));
        Assertions.assertEquals(1, Mod.pow(9, 6, 13));
        Assertions.assertEquals(1, Mod.pow(25, 30, 31));
        Assertions.assertEquals(4, Mod.pow(2, 5, 7));
        Assertions.assertEquals(1, Mod.pow(145, 7918, 7919));
    }

}
