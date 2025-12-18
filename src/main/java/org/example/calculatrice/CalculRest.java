package org.example.calculatrice;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/calcul")
@Produces(MediaType.APPLICATION_JSON)  // CORRECTION ICI
public class CalculRest {

    @GET
    @Path("/addition")
    public Response addition(
            @QueryParam("a") double a,
            @QueryParam("b") double b) {

        Operation operation = new Operation("addition", a, b);  // CORRECTION ICI
        operation.setResultat(Calculatrice.addition(a, b));
        operation.setMessage("Addition effectuée avec succès");

        return Response.ok(operation).build();
    }

    @GET
    @Path("/soustraction")
    public Response soustraction(
            @QueryParam("a") double a,
            @QueryParam("b") double b) {

        Operation operation = new Operation("soustraction", a, b);
        operation.setResultat(Calculatrice.soustraction(a, b));
        operation.setMessage("Soustraction effectuée avec succès");

        return Response.ok(operation).build();
    }

    // Ajoutez les autres méthodes (multiplication, division)...
}