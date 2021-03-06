package exchange.platform.authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 
 * Description:
 * <p>Company: xinya </p>
 * <p>Date:2018年7月11日 上午11:59:02</p>
 * @author Tony
 * @version 1.0
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ExchangePlatformAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExchangePlatformAuthenticationApplication.class, args);
	}
}
