package tinker.net.dongliu.apk.parser.struct.xml;

import tinker.net.dongliu.apk.parser.struct.ResourceValue;

/**
 * @author dongliu
 */
public class XmlCData {

    public static final String CDATA_START = "<![CDATA[";
    public static final String CDATA_END = "]]>";

    // The raw CDATA character data.
    private String data;

    // The typed value of the character data if this is a CDATA node.
    private ResourceValue typedData;

    // the final value as string
    private String value;

    /**
     * get value as string
     *
     * @return value
     */
    public String toStringValue() {
        if (data != null) {
            return CDATA_START + data + CDATA_END;
        } else {
            return CDATA_START + typedData.toStringValue() + CDATA_END;
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ResourceValue getTypedData() {
        return typedData;
    }

    public void setTypedData(ResourceValue typedData) {
        this.typedData = typedData;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "XmlCData{" +
                "data='" + data + '\'' +
                ", typedData=" + typedData +
                '}';
    }
}