package cat.iesmanacor.msprova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsProvaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProvaApplication.class, args);
	}

}
