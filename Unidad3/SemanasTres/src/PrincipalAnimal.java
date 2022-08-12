public class PrincipalAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal perro = new Perro();
        Animal gato = new Gato();
        animal.sonidoAnimal();
        perro.sonidoAnimal();
        gato.sonidoAnimal();
    }
}
