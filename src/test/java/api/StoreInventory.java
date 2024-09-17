package api;

public class StoreInventory {
    private Integer sold;
    private Integer string;
    private Integer pending;
    private Integer available;
    private Integer peric;
    private Integer status;

    public StoreInventory(Integer sold, Integer string, Integer pending, Integer available, Integer peric, Integer status) {
        this.sold = sold;
        this.string = string;
        this.pending = pending;
        this.available = available;
        this.peric = peric;
        this.status = status;
    }

    public Integer getSold() {
        return sold;
    }

    public Integer getString() {
        return string;
    }

    public Integer getPending() {
        return pending;
    }

    public Integer getAvailable() {
        return available;
    }

    public Integer getPeric() {
        return peric;
    }

    public Integer getStatus() {
        return status;
    }
}
