package br.com.cassioguerra.Docker_MySQL;

import br.com.cassioguerra.Docker_MySQL.model.UsuarioModel;
import br.com.cassioguerra.Docker_MySQL.reposytori.UsuarioReposytori;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DockerMySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerMySqlApplication.class, args);
	}


	@Bean
	CommandLineRunner initDatabase(UsuarioReposytori usuarioReposytori) {
		return args -> {
			usuarioReposytori.deleteAll();
			UsuarioModel c = new UsuarioModel();
			c.setNome("cassio Guerra");
			c.setEmail("cassioguerra@live.com");
			c.setTelefone("913644");

			usuarioReposytori.save(c);
		};
	}
}
