package Objects;

public class IntegerItem {
    private Integer integerData;

    public IntegerItem(Integer integerData) {
        this.integerData = integerData;
    }

    public Integer getIntegerData() {
        return integerData;
    }

    public void setIntegerData(Integer integerData) {
        this.integerData = integerData;
    }

    @Override
    public String toString() {
        return "IntegerItem{" +
                "integerData=" + integerData +
                '}';
    }
}
