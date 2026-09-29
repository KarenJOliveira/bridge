public class Moto extends Veiculo{
    public Moto(float distanciaPercorrida) {
        super(distanciaPercorrida);
    }

    public float calcularCustoViagem() {
        return (this.distanciaPercorrida * this.combustivel.custoPorKm()) * 0.8f;
    }
}
