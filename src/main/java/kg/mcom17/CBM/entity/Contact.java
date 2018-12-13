package kg.mcom17.CBM.entity;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "CONTACT")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ContactID")
    private long contactID;
    private String name;
    private String surname;
    private String nickname;
    private String company;
    private Date birthdate;
    private Mobile mobile;
    private Email email;

    //TODO: ConstructorContact


//Foreign Key
    @ManyToOne
    @JoinColumn(name = "ContactBookId")
    private ContactBook contactBook;

//Associations
    @OneToMany(mappedBy = "contact_email")
    private List<Email> emails;

    @OneToMany(mappedBy = "contact_mobile")
    private List<Mobile> mobiles;


//Getters and Setters
    public long getContactID() {
        return contactID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public ContactBook getContactBook() {
        return contactBook;
    }

    public void setContactBook(ContactBook contactBook) {
        this.contactBook = contactBook;
    }
}
