package klmproject;
 public class Konst {
    private int szavazat;
    private int szavazat2;
    private String part;
    private String jelolt;
    private String part2;

    public Konst(String be []) {
        this.szavazat = Integer.parseInt(be[0]);
        this.szavazat2 = Integer.parseInt(be[1]);
        this.part = be[2];
        this.jelolt = be[3];
        this.part2 = be[4];
    }

    public int getSzavazat() {
        return szavazat;
    }

    public void setSzavazat(int szavazat) {
        this.szavazat = szavazat;
    }

    public int getSzavazat2() {
        return szavazat2;
    }

    public void setSzavazat2(int szavazat2) {
        this.szavazat2 = szavazat2;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getJelolt() {
        return jelolt;
    }

    public void setJelolt(String jelolt) {
        this.jelolt = jelolt;
    }

    public String getPart2() {
        return part2;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }
    
     
}
