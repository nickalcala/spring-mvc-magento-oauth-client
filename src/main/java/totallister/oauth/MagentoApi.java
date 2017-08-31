package totallister.oauth;

import com.github.scribejava.core.builder.api.DefaultApi10a;
import com.github.scribejava.core.model.OAuth1RequestToken;

public class MagentoApi extends DefaultApi10a {

    private String baseUrl;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        if (!baseUrl.endsWith("/")) {
            baseUrl += "/";
        }

        this.baseUrl = baseUrl;
    }

    @Override
    public String getAccessTokenEndpoint() {
        return baseUrl + "oauth/token/access";
    }

    @Override
    public String getRequestTokenEndpoint() {
        return baseUrl + "oauth/token/request";
    }

    @Override
    public String getAuthorizationUrl(OAuth1RequestToken requestToken) {
        return String.format(baseUrl + "oauth/oauth_authorize?oauth_token=", requestToken.getToken());
    }

    public static MagentoApi instance() {
        return MagentoApi.InstanceHolder.INSTANCE;
    }

    private static class InstanceHolder {
        private static final MagentoApi INSTANCE = new MagentoApi();

        private InstanceHolder() {
        }
    }
}