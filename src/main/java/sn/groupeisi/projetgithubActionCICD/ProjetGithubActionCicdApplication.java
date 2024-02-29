package sn.groupeisi.projetgithubActionCICD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

@SpringBootApplication
@Controller
public class ProjetGithubActionCicdApplication {

	@GetMapping  ("/welcome")
	public String welcome (){
		return " bienvenue ";
	}

	public static void main(String[] args) {
		SpringApplication.run(ProjetGithubActionCicdApplication.class, args);
	}

}
