package Voigt.Felipe.ExercicioDependencia.model;

import Voigt.Felipe.ExercicioDependencia.interfaces.AnimalIterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Felipe Voigt
 * @version 1.0
 * @since 13/06/2020 - 20:35
 * @category model
 */
@Component
@Qualifier("cachorro")
public class Cachorro implements AnimalIterface {

    @Override
    public void comunicar() {
        System.out.println("AU AU");
    }
}
