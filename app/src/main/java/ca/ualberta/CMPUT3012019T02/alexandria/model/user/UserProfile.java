package ca.ualberta.CMPUT3012019T02.alexandria.model.user;

public class UserProfile {

    private String name;
    private String email;
    private String phone;
    private String picture;

    public UserProfile(String name, String email, String phone, String picture) {
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if(email == null || email.isEmpty()){
            throw new IllegalArgumentException("Email cannot be null or empty");
        }
        if(phone == null || phone.isEmpty()){
            throw new IllegalArgumentException("Phone cannot be null or empty");
        }

        this.name = name;
        this.email = email;
        this.phone = phone;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email == null || email.isEmpty()){
            throw new IllegalArgumentException("Email cannot be null or empty");
        }

        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if(phone == null || phone.isEmpty()){
            throw new IllegalArgumentException("Phone cannot be null or empty");
        }

        this.phone = phone;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

}
