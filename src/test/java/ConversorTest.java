import org.example.Conversor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorTest {

    private Conversor conversor = new Conversor();

    @Test
    public void deCelciusPositivoAKelvin(){
        double result = conversor.deCelciusAKelvin(20);
        assertEquals(293.15, result);
    }

    @Test
    public void deCelciusNegativoAKelvin(){
        double result = conversor.deCelciusAKelvin(-10);
        assertEquals(263.15, result);
    }

    @Test
    public void deCelciusPositivoAFahrenheit(){
        double result = conversor.deCelciusAFahrenheit(20);
        assertEquals(68, result);
    }

    @Test
    public void deCelciusNegativoAFahrenheit(){
        double result = conversor.deCelciusAFahrenheit(-10);
        assertEquals(14, result);
    }

    @Test
    public void deFahrenheitACelcius(){
        double result = conversor.deFahrenheitACelciusOKelvin(68,true);
        assertEquals(20,result);
    }

    @Test
    public void deFahrenheitAKelvin(){
        double result = conversor.deFahrenheitACelciusOKelvin(68,false);
        assertEquals(293.15000000000003,result);
    }

}
