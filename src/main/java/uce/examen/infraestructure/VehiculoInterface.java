package uce.examen.infraestructure;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import uce.examen.domain.Vehiculo;

@ApplicationScoped
public class VehiculoInterface implements PanacheRepository<Vehiculo> {
    
}
