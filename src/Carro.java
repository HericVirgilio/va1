public class Carro {
    public Motor motor;
    public String modelo;
    public String marca;
    public int ano;

    public Carro(Motor motor,String modelo,String marca, int ano ){
        this.motor = motor;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "motor=" + motor +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                '}';
    }
}
