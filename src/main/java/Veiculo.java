public abstract class Veiculo {
    protected Combustivel combustivel;
    protected float distanciaPercorrida; // em km

    public Veiculo(float distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    public abstract float calcularCustoViagem();
}
