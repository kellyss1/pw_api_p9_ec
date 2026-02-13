package uce.examen.application;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uce.examen.domain.Vehiculo;
import uce.examen.infraestructure.VehiculoInterface;

@ApplicationScoped
public class VehiculoService {
    

    @Inject
    VehiculoInterface vehiculoInterface;

    public List<Vehiculo> listarTodos() {
        return this.vehiculoInterface.listAll().stream().toList();
    }

    @Transactional
    public void eliminar(Integer id) {
        this.vehiculoInterface.deleteById(id.longValue());
    }

    @Transactional
    public void guardar(Vehiculo vehiculo){
        this.vehiculoInterface.persist(vehiculo);
    }

}
