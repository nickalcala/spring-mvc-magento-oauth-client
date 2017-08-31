package totallister.oauth;

import com.github.scribejava.core.builder.api.DefaultApi10a;
import com.github.scribejava.core.model.OAuth1RequestToken;

public class MagentoApi extends DefaultApi10a {

    private static final String BASE_URL = "http://magento.dev/";
    private static final String AUTHORIZE_URL = "http://magento.dev/oauth/oauth_authorize?oauth_token=";
    private static final String REQUEST_TOKEN_ENDPOINT = "http://magento.dev/oauth/token/request";
    private static final String ACCESS_TOKEN_ENDPOINT = "http://magento.dev/oauth/token/access";

    @Override
    public String getAccessTokenEndpoint() {
        return ACCESS_TOKEN_ENDPOINT;
    }

    @Override
    public String getRequestTokenEndpoint() {
        return REQUEST_TOKEN_ENDPOINT;
    }

    @Override
    public String getAuthorizationUrl(OAuth1RequestToken requestToken) {
        return String.format(AUTHORIZE_URL, requestToken.getToken());
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