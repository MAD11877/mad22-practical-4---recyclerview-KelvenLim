package sg.edu.np.mad.wk4practical;

public class User {
    private String name;
    private String description;
    private boolean followed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isFollowed() {
        return followed;
    }

    public void setFollowed(boolean followed) {
        this.followed = followed;
    }

    public User() {
    }

    public User(String name, String description, boolean followed) {
        this.name = name;
        this.description = description;
        this.followed = followed;
    }
}
