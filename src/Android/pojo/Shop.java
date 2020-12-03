package Android.pojo;

public class Shop {
    private int id;
    private String type;
    private String pname;
    private int pnum;
    private double psprice;

    public Shop(int id, String type, String pname, int pnum, double psprice) {
        this.id = id;
        this.type = type;
        this.pname = pname;
        this.pnum = pnum;
        this.psprice = psprice;
    }

    public Shop() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPnum() {
        return pnum;
    }

    public void setPnum(int pnum) {
        this.pnum = pnum;
    }

    public double getPsprice() {
        return psprice;
    }

    public void setPsprice(double psprice) {
        this.psprice = psprice;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", pname='" + pname + '\'' +
                ", pnum=" + pnum +
                ", psprice=" + psprice +
                '}';
    }
}
