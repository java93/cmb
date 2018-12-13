package kg.mcom17.CBM.entity;

import javax.persistence.*;

@Entity
@Table(name = "Mobile")
public class Mobile {
    @Id
    @Column(name = "MobileID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long mobileID;

    @Column(name = "PhoneNumber" ,nullable = false)
    private String phoneNumber;

    //TODO: ConstructorMobile

    //Foreign Keys
    @ManyToOne
    @JoinColumn(name = "ContactId")
    private Contact contact_mobile;

    @ManyToOne
    @JoinColumn(name = "MobileTypeId")
    private MobileType mobileType;


    //Getters and Setters


    public long getMobileID() {
        return mobileID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Contact getContact_mobile() {
        return contact_mobile;
    }

    public void setContact_mobile(Contact contact_mobile) {
        this.contact_mobile = contact_mobile;
    }

    public MobileType getMobileType() {
        return mobileType;
    }

    public void setMobileType(MobileType mobileType) {
        this.mobileType = mobileType;
    }
}
