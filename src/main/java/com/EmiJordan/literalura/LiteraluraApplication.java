package com.EmiJordan.literalura;

import com.EmiJordan.literalura.menu.Principal;
import com.EmiJordan.literalura.repository.AutorRepository;
import com.EmiJordan.literalura.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {

	@Autowired
	private LibroRepository repositorio1;
	@Autowired
	private AutorRepository repositorio2;

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repositorio1, repositorio2);
		principal.mostrarMenu(0);
	}
}
