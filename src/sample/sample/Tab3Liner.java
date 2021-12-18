package sample;
public class Tab3Liner {

    private int id;
    private int kp;
    private int prod;
    private int kz;
    private int ky;
    private int kr;
    private int max_raz;
    private int sumTime;
    private int srTime;

    public Tab3Liner(int id, int kp, int prod, int kz, int ky, int kr, int max_raz, int sumTime, int srTime) {
        this.id = id;
        this.kp = kp;
        this.prod = prod;
        this.kz = kz;
        this.ky = ky;
        this.kr = kr;
        this.max_raz = max_raz;
        this.sumTime = sumTime;
        this.srTime = srTime;
    }

    public Tab3Liner() {
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

    public int getKr() {
        return kr;
    }

    public void setKr(int kr) {
        this.kr = kr;
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


}