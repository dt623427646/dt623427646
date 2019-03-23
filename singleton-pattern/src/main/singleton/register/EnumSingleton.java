package singleton.register;

public enum EnumSingleton {
    INSTANCE;

    private Object data;

    public void setData(Object data) {
        this.data = data;
    }

    public EnumSingleton getInstance() {
        return INSTANCE;
    }
}
