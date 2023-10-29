package pages;

public enum Properties {
    LOGIN("6"),
    PASSWORD("66"),
    HOST("https://test.com");

    public String property;

    Properties(String property) {

        this.property = property;
    }
    public String getProperty() {

        return property;
    }

}
