package totallister.model;

public class MagentoCredentials {

    String storeBaseUrl;
    String consumerKey;
    String consumerSecret;
    String requestToken;
    String accessToken;
    
    public MagentoCredentials() {
    }

    public MagentoCredentials(String storeBaseUrl, String consumerKey, String consumerSecret, String requestToken, String accessToken) {
        this.storeBaseUrl = storeBaseUrl;
        this.consumerKey = consumerKey;
        this.consumerSecret = consumerSecret;
        this.requestToken = requestToken;
        this.accessToken = accessToken;
    }

    public String getStoreBaseUrl() {
        return storeBaseUrl;
    }

    public void setStoreBaseUrl(String storeBaseUrl) {
        this.storeBaseUrl = storeBaseUrl;
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