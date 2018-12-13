package kg.mcom17.CBM.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class MobileType {

    @Id
    @GeneratedValue
    @Column(name ="TypeId")
    private long mobileTypeId;

    @Column(nullable = false,name = "Type")
    private String mobileType;


    //TODO: Constructor
    public MobileType(String mobileType) {
        this.mobileType = mobileType;
    }

    //Association
    @OneToMany(mappedBy = "mobileType")
    private List<Mobile> mobiles;

    //Getters and Setters
    public long getMobileTypeId() {
        return mobileTypeId;
    }

    public String getMobileType() {
        return mobileType;
    }

    public void setMobileType(String type) {
        this.mobileType = type;
    }
}
