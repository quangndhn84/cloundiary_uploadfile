package ra.uf.config;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloundiaryConfig {
    private static final String CLOUNDNAME = "dtig9dlxu";
    private static final String APIKEY = "729974857332387";
    private static final String APISECRET = "leI-kc2oGRUwGf82GnPWbx86Gw8";

    @Bean
    public Cloudinary cloudinary() {
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", CLOUNDNAME,
                "api_key", APIKEY,
                "api_secret", APISECRET
        ));
    }
}
