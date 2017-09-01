package totallister.controller;

import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.model.*;
import com.github.scribejava.core.oauth.OAuth10aService;
import org.springframework.web.bind.annotation.*;
import totallister.model.MagentoCredentials;
import totallister.oauth.MagentoApi;

import javax.servlet.http.HttpServletRequest;

@RestController
public class MagentoController {

    @RequestMapping(value = "/integrations/magento/authenticate", method = RequestMethod.POST)
    public MagentoCredentials getRequestToken(HttpServletRequest request) {

        MagentoApi api = MagentoApi.instance();
        api.setBaseUrl(request.getParameter("store_base_url"));

        OAuth10aService service = new ServiceBuilder(request.getParameter("consumer_key"))
                .apiSecret(request.getParameter("consumer_secret"))
                .build(api);

        final OAuth1RequestToken requestToken;
        final OAuth1AccessToken  accessToken;

        try {

            requestToken = service.getRequestToken();
            accessToken = service.getAccessToken(requestToken, request.getParameter("verifier"));

            return new MagentoCredentials(
                    request.getParameter("consumer_key"),
                    request.getParameter("consumer_secret"),
                    requestToken.getToken(),
                    accessToken.getToken()
            );
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}