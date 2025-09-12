package builder;

public class ClienteBuilder implements UserBuilder {
    private User user;

    public ClienteBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.user = new User();
        this.user.setRole("Cliente");
    }

    @Override
    public void setName(String name) {
        this.user.setName(name);
    }

    @Override
    public void setEmail(String email) {
        this.user.setEmail(email);
    }

    @Override
    public User getResult() {
        User result = this.user;
        this.reset();
        return result;
    }
}