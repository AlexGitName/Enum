public class Store {
    String storName, URL;
    User[] stor;
    User authorize;
    boolean pres;

    Store(String storName, String URL, User[] stor) {
        setStorName(storName);
        setURL(URL);
        setStor(stor);
    }

    public String getStorName() {
        return storName;
    }

    public void setStorName(String storName) {
        this.storName = storName;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public User[] getStor() {
        return stor;
    }

    public void setStor(User[] stor) {
        this.stor = stor;
    }

    public boolean login(String login, String possword) {
        for (int i = 0; i < stor.length; i++) {
            if (stor[i].login.equals(login) && stor[i].possword.equals(possword)) {
                authorize = stor[i];
                return true;
            }
        }
        return false;
    }

    public void logOut() {
        authorize = null;
    }

    public void getCurrentUserRights() {
        switch (authorize.getRole()) {
            case DIRECTOR:
                System.out.println("Director of store, can control employers and prices");
                break;
            case ADMINISTRATOR:
                System.out.println("Administrator of store, can add goods and  edit thar description");
                break;
            case MENEGER:
                System.out.println("Manager of store, can talk to a client");
                break;
            case CLIENT:
                System.out.println("Clint of store, can buy goods or/and authorize ");
                break;
            case ANONYMUS:
                System.out.println("Anonymous user, can but goods or/and authorize");
                break;
        }
    }
}
