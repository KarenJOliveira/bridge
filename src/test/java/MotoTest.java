import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MotoTest {
    @Test
    void deveCalcularCustoViagemEletrico() {
        Veiculo moto = new Moto(100);
        moto.setCombustivel(new Eletrico());
        assertEquals(16.0f, moto.calcularCustoViagem());
    }
}
