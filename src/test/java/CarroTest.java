import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {
    @Test
    void deveCalcularCustoViagemGasolina() {
        Veiculo carro = new Carro(100);
        carro.setCombustivel(new Gasolina());
        assertEquals(50.0f, carro.calcularCustoViagem());
    }

    @Test
    void deveCalcularCustoViagemEtanol() {
        Veiculo carro = new Carro(100);
        carro.setCombustivel(new Etanol());
        assertEquals(40.0f, carro.calcularCustoViagem());
    }
}
