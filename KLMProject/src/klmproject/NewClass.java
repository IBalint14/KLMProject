package klmproject;
 class NewClass {

    public NewClass(int szavazat, int szavazat2, String part, String jelolt, String part2) {
        this.szavazat = szavazat;
        this.szavazat2 = szavazat2;
        this.part = part;
        this.jelolt = jelolt;
        this.part2 = part2;
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
    
     private int szavazat;
     private int szavazat2;
     private String part;
     private String jelolt;
     private String part2;

}
