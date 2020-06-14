package Voigt.Felipe.ExercicioDependencia;

import Voigt.Felipe.ExercicioDependencia.model.Pet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Felipe Voigt
 * @version 1.0
 * @since 13/06/2020 - 20:46
 * @category view
 */
@SpringBootApplication
public class ExercicioDependenciaApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExercicioDependenciaApplication.class, args);

		Pet pet = applicationContext.getBean(Pet.class) ;
		pet.executar();
	}

}
