package Section12_SpringBootWeb.L216_UseModelAttribute;

public class Alien {

    private int aid;
    private String aname;

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

    @Override
    public String toString() {
        return "Alien{" +
                "alienId=" + aid +
                ", alienName='" + aname + '\'' +
                '}';
    }
}
