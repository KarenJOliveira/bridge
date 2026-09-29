import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaminhaoTest {
    @Test
    void deveCalcularCustoViagemGasolina() {
        Veiculo caminhao = new Caminhao(100);
        caminhao.setCombustivel(new Gasolina());
        assertEquals(75.0f, caminhao.calcularCustoViagem());
    }
}
