public class Motor {
    public String tipo;
    //Horsepower Unidade de medida de potencia conhecida como HP
    public int horsepower;
    public String combustivel;

    public Motor(String tipo, int Horsepower, String combustivel){
            this.tipo = tipo;
            this.horsepower = Horsepower;
            this.combustivel = combustivel;
    }
    @Override
    public String toString() {
        return "Motor{" +
                "tipo='" + tipo + '\'' +
                ", Horsepower=" + horsepower +
                ", combustivel='" + combustivel + '\'' +
                '}';
    }
}
