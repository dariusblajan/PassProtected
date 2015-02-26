import java.io.Serializable;

/**
 * Created by condor on 10/02/15.
 * FastTrackIT, 2015
 */
class Item implements Serializable {
    private String user;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }


    public void setUser(String name) {
        this.user = name;
    }
}