package utilities;

public class PropertyReader {

    public static String getSystemProperty(String property) {
        String propertyString;
        try {
            propertyString = System.getProperty(property);
        } catch (Exception e) {
            throw new RuntimeException("Specified property '" + property + "' was not found\n" + e.getMessage(), e);
        }
        return propertyString;
    }
}
