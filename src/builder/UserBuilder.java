package builder;

public interface UserBuilder {
    void reset();
    void setName(String name);
    void setEmail(String email);
    User getResult();
}