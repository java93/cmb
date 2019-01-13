package kg.mcom17.CBM.entity;

import javax.persistence.*;

@Entity
public class ContactBook {

    @Id
    @Column(name = "ContactBookId", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long contactBookId;

    @OneToOne
    @JoinColumn(name = "UserId")
    private User user;



//TODO: ConstructorContactBook


    public ContactBook(User user) {
        this.user = user;
    }

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
