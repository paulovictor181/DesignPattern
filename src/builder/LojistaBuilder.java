package builder;

public class LojistaBuilder implements UserBuilder {
    private User user;

    public LojistaBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.user = new User();
        this.user.setRole("Lojista");
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