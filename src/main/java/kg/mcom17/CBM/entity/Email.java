package kg.mcom17.CBM.entity;



import javax.persistence.*;

@Entity
public class Email {

    @Id
    @GeneratedValue
    @Column(name = "EmailId")
    private long emailId;

    @Column(name = "Email",nullable = false)
    private String email;


    //Foreign Key
    @ManyToOne
    @JoinColumn(name = "ContactId")
    private Contact contact_email;


    //TODO: ConstructorEmail

    //Getter and Setters


    public long getEmailId() {
        return emailId;
    }

    public String getEmail() {
        return email;
    }

    public Contact getContact() {
        return contact_email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
