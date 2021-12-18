package sample;
public class Tab2Liner {

    private int id;
    private int kp;
    private int prod;
    private int kz;
    private int ky;
    private int ob;
    private int cp;
    private int max_raz;
    private int sumTime;
    private int srTime;

    public Tab2Liner(int id, int kp, int prod, int kz, int ky, int ob, int max_raz, int sumTime, int srTime, int cp) {
        this.id = id;
        this.kp = kp;
        this.prod = prod;
        this.kz = kz;
        this.ky = ky;
        this.ob = ob;
        this.cp = cp;
        this.max_raz = max_raz;
        this.sumTime = sumTime;
        this.srTime = srTime;
    }

    public Tab2Liner() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKp() {
        return kp;
    }

    public void setKp(int kp) {
        this.kp = kp;
    }

    public int getProd() {
        return prod;
    }

    public void setProd(int prod) {
        this.prod = prod;
    }

    public int getKz() {
        return kz;
    }

    public void setKz(int kz) {
        this.kz = kz;
    }

    public int getKy() {
        return ky;
    }

    public void setKy(int ky) {
        this.ky = ky;
    }

    public int getOb() {
        return ob;
    }

    public void setOb(int ob) {
        this.ob = ob;
    }

    public int getMaxRaz() {
        return max_raz;
    }

    public void setMaxRaz(int max_raz) {
        this.max_raz = max_raz;
    }

    public int getSumTime() {
        return sumTime;
    }

    public void setSumTime(int sumTime) {
        this.sumTime = sumTime;
    }

    public int getSrTime() {
        return srTime;
    }

    public void setSrTime(int srTime) {
        this.srTime = srTime;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

}