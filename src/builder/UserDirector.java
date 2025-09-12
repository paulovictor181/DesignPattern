package builder;

public class UserDirector {
    public void makeLojista(UserBuilder builder, String name, String email) {
        builder.reset();
        builder.setName(name);
        builder.setEmail(email);
    }

    public void makeCliente(UserBuilder builder, String name, String email) {
        builder.reset();
        builder.setName(name);
        builder.setEmail(email);
    }
}