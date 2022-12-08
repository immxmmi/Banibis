package main.com.banibis.backend.encrypt;


import lombok.Getter;
import main.com.banibis.backend.config.ConfigurationManager;
import main.com.banibis.backend.config.ConfigurationManagerImpl;
import org.json.simple.JSONObject;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.util.Base64;


@Getter
public class SignatureImpl implements Signature {
    private ConfigurationManager conf = new ConfigurationManagerImpl();
    private static final String DEFAULT_ENCODING = "UTF-8";
    private static final String HMAC_SHA512 = "HmacSHA512";
    private String apiKey = conf.getApiKey();
    private String apiSecret = conf.getApiSecret();
    private long timestamp;
    private String signature;

    @Override
    public void enctypt() {
        timestamp = Instant.now().getEpochSecond();
        JSONObject data = new JSONObject();
        data.put("apiKey", apiKey);
        data.put("timestamp", timestamp);
        byte[] hmacSha512 = hmacSha512(data, apiSecret);
        signature  = Base64.getEncoder().encodeToString(hmacSha512);
        signature  = URLEncoder.encode(signature);
    }
    private static byte[] hmacSha512(JSONObject value, String key){
        try {
            SecretKeySpec keySpec = new SecretKeySpec(
                    key.getBytes(DEFAULT_ENCODING),
                    HMAC_SHA512);

            Mac mac = Mac.getInstance(HMAC_SHA512);
            mac.init(keySpec);
            return mac.doFinal(value.toJSONString().getBytes(DEFAULT_ENCODING));

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

}
