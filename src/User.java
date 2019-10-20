public class User {

    String login;
    String possword;
    String name;
    Responsobl role = Responsobl.ANONYMUS;

    User(String login, String possword, String name, Responsobl role){
        setLogin(login);
        setName(name);
        setPossword(possword);
        setRole(role);

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPossword() {
        return possword;
    }

    public void setPossword(String possword) {
        this.possword = possword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Responsobl getRole() {
        return role;
    }

    public void setRole(Responsobl role) {
        this.role = role;
    }

    enum Responsobl {
        DIRECTOR,
        ADMINISTRATOR,
        MENEGER,
        CLIENT,
        ANONYMUS
    }

}
