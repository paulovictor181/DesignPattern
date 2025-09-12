package builder;

public class Main {
    public static void main(String[] args) {
        UserDirector director = new UserDirector();

        LojistaBuilder lojistaBuilder = new LojistaBuilder();
        director.makeLojista(lojistaBuilder, "Paulo Lojista", "paulo.lojista@gmail.com");
        User lojista = lojistaBuilder.getResult();
        System.out.println(lojista);

        System.out.println("\n---");

        ClienteBuilder clienteBuilder = new ClienteBuilder();
        director.makeCliente(clienteBuilder, "Paulo Cliente", "paulo.cliente@gmail.com");
        User cliente = clienteBuilder.getResult();
        System.out.println(cliente);
    }
}