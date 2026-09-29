public class Caminhao extends Veiculo{
    public Caminhao(float distanciaPercorrida) {
        super(distanciaPercorrida);
    }

    public float calcularCustoViagem() {
        return (this.distanciaPercorrida * this.combustivel.custoPorKm()) * 1.5f;
    }
}
