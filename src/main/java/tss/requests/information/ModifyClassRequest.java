package tss.requests.information;

public class ModifyClassRequest {
    private Long cid;
    private String uid;
    private Integer capacity;
    private Integer year;

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
