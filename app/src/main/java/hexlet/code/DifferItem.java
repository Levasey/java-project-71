package hexlet.code;

public class DifferItem {
    private final Object oldValue;
    private final Object newValue;
    private final String status;

    public DifferItem(Object oldValue, Object newValue, String status) {
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.status = status;
    }

    public Object getOldValue() {
        return oldValue;
    }

    public Object getNewValue() {
        return newValue;
    }

    public String getStatus() {
        return status;
    }
}
