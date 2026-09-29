public class Carro extends Veiculo{
    public Carro(float distanciaPercorrida) {
        super(distanciaPercorrida);
    }

    public float calcularCustoViagem() {
        return this.distanciaPercorrida * this.combustivel.custoPorKm();
    }
}
