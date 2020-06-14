package Voigt.Felipe.ExercicioDependencia.model;

import Voigt.Felipe.ExercicioDependencia.interfaces.AnimalIterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Felipe Voigt
 * @version 1.0
 * @since 13/06/2020 - 20:40
 * @category model
 */
@Component
@Primary
public class Pet {

    @Autowired
    private AnimalIterface animalIterface;

    public void executar() {
        animalIterface.comunicar();

    }
}
