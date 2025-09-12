package builder;

public class User {
    private String name;
    private String email;
    private String role;

    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setRole(String role) { this.role = role; }

    @Override
    public String toString() {
        return "Usuário criado: \n- Nome: " + name + "\n- Email: " + email + "\n- Papel: " + role;
    }
}