package totallister.model;

public class MagentoCredentials {

    String consumerKey;
    String consumerSecret;
    String requestToken;
    String accessToken;

    public MagentoCredentials() {
    }

    public MagentoCredentials(String consumerKey, String consumerSecret, String requestToken, String accessToken) {
        this.consumerKey = consumerKey;
        this.consumerSecret = consumerSecret;
        this.requestToken = requestToken;
        this.accessToken = accessToken;
    }

    public String getConsumerKey() {
        return consumerKey;
    }

    public void setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
    }

    public String getConsumerSecret() {
        return consumerSecret;
    }

    public void setConsumerSecret(String consumerSecret) {
        this.consumerSecret = consumerSecret;
    }

    public String getRequestToken() {
        return requestToken;
    }

    public void setRequestToken(String requestToken) {
        this.requestToken = requestToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}