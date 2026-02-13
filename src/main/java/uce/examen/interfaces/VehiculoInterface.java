package uce.examen.interfaces;

import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import uce.examen.application.VehiculoService;
import uce.examen.domain.Vehiculo;

@Path("/vehiculos")
public class VehiculoInterface {
    
    @Inject
    VehiculoService vehiculoService;

    @GET
    @Path("")
    @RolesAllowed("admin")
    @Produces(MediaType.APPLICATION_JSON)
    public String listarTodos() {
        return this.vehiculoService.listarTodos().toString();
    }

    @DELETE
    @Path("/{id}")
    @RolesAllowed("admin")
    public void eliminar(@PathParam("id") Integer id) {
        this.vehiculoService.eliminar(id);
    }

    @POST
    @Path("")
    @RolesAllowed("admin")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void guardar(Vehiculo vehiculo) {
        this.vehiculoService.guardar(vehiculo);
    }
}
