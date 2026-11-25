package util.validator;

public class RegexList {

    public static final String userName = "[A-Z][a-z]+";
    public static final String userAddress = "[A-Za-z0-9.]+";
    public static final String userEmail = "[A-Za-z0-9]+[.]?[A-Za-z0-9]+[@]{1}[A-Za-z]+[.][a-z]+";
    public static final String userPassword = "[a-zA-Z0-9\\S]{8,}";

    public static final String productName = "[A-Za-z0-9][A-Za-z0-9 .,'&()/-]{0,99}";
    public static final String productDescription = "[A-Za-z0-9][A-Za-z0-9 .,'&()!?/-]{0,1999}";

    public static final String reviewDescription = "[A-Za-z0-9][A-Za-z0-9 .,'&()!?/-]{0,999}";

    public static final String paymentType = "(?i)(credit card|debit card|paypal|apple pay|google pay|gift card)";
    public static final String paymentStatus = "(?i)(pending|processing|paid|failed|refunded|cancelled)";

    public static final String timestamp = "\\d{4}-\\d{2}-\\d{2}[T ]\\d{2}:\\d{2}:\\d{2}(?:\\.\\d{1,9})?(?:Z|[+-]\\d{2}:?\\d{2})?";

    public static final String baseName = "[A-Za-z0-9][A-Za-z0-9._-]{0,99}";

}
