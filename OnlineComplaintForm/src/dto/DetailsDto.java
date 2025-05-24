package dto;

public class DetailsDto {
    String username ;
    String email ;
    Long contact ;
    String complaint ;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContact(Long contact) {
        this.contact = contact;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public double getContact() {
        return contact;
    }

    public String getComplaint() {
        return complaint;
    }
}
