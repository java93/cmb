package kg.mcom17.CBM.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class ContactBook {

    @Id
    @Column(name = "ContactBookId", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long contactBookId;

    @OneToOne
    @JoinColumn(name = "UserId")
    private User user;

    //Associations
    @OneToMany(mappedBy = "contactBook")
    private List<Contact> contacts;


//TODO: ConstructorContactBook

//Getters and Setters
    public long getContactBookId() {
        return contactBookId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
