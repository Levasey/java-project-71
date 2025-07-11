package hexlet.code;

/**
 * Represents a difference item with old and new values and their status.
 * This class is designed for extension. When overriding methods, ensure to
 * maintain the same contract of returning the respective values.
 */
public final class DifferItem {
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
