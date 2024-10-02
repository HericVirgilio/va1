import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo do motor:");
        String tipoMotor = scanner.nextLine();

        System.out.println("Digite a potência do motor (em HP):");
        int horsepowerMotor = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o combustível do motor:");
        String combustivelMotor = scanner.nextLine();

        Motor motor = new Motor(tipoMotor, horsepowerMotor, combustivelMotor);

        System.out.println("Digite o modelo do carro:");
        String modeloCarro = scanner.nextLine();

        System.out.println("Digite a marca do carro:");
        String marcaCarro = scanner.nextLine();

        System.out.println("Digite o ano do carro:");
        int anoCarro = scanner.nextInt();

        Carro carro = new Carro(motor, modeloCarro, marcaCarro, anoCarro);

        System.out.println("\nInformações do Carro:");
        System.out.println("\n--------- Motor ---------");
        System.out.println("\n Tipo: " + carro.motor.combustivel);
        System.out.println("\n Horsepower: " + carro.motor.combustivel);
        System.out.println("\n Combustivel: " + carro.motor.combustivel);

        System.out.println("\n--------- Carro ---------");
        System.out.println("\n Modelo: " + carro.modelo);
        System.out.println("\n Marca: " + carro.marca);
        System.out.println("\n Ano: " + carro.ano);

        scanner.close();

    }
}