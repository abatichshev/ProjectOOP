public class User {
    private String userName;
    private String password;
    private int id;
    private String email;
    private boolean isActive;
    private UserRole role;


    public User(String userName, String password, int id, String email, boolean isActive) {
        this.userName = userName;
        this.password = password;
        this.id = id;
        this.email = email;
        this.isActive = isActive;
        this.role=role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
    public void login(){
        System.out.println(userName);
    }
    public void logout(){
        System.out.println(userName);
    }
    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
    public void updateProfile(String newUserName, String newPassword) {
        this.userName = newUserName;
        this.password = newPassword;
        System.out.println("updated");
    }

    @Override
    public String toString() {
        return "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                ", email='" + email;
    }
    public boolean verifyPassword(String password, User user) {
        return user.getPassword().equals(password);
    }

    public void addUser(String userName) {
        System.out.println("User " + userName + " added.");
    }

    public String searchUser(User user) {
        return "Searching for user: " + user.getUserName();
    }

    public void deleteUser(User user) {
        System.out.println("User " + user.getUserName() + " deleted.");
    }
    public void viewMenu() {
        System.out.println("Displaying menu for " + userName);
    }
}
