package Objects;

public class StringItem {
    private String stringData;

    public StringItem(String stringData) {
        this.stringData = stringData;
    }

    public String getStringData() {
        return stringData;
    }

    public void setStringData(String stringData) {
        this.stringData = stringData;
    }

    @Override
    public String toString() {
        return "StringItem{" +
                "stringData='" + stringData + '\'' +
                '}';
    }
}
