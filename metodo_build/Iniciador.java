public class Iniciador {
    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes.MercedesConstructor("Mercedes Benz 1675V6T", "Goodyear R16")
            .setTurbo("AGM 115E")
            .setColor("Negro Azabache")
            .construir();
        String fabricado = mercedes.Resultado();
        System.out.println(fabricado);
    }
}
