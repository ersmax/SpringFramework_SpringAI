package Section6_Hibernate.L141_ChangingTableColNames;

import jakarta.persistence.*;

@Entity//(name="alien_table")
@Table(name="alien_table")
public class Alien {
    @Id
    @Column(name="ID")
    private int aid;
    @Column(name="Alien name")
    private String aname;
    @Transient  // does not show in db
    private String tech;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }
}
