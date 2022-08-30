package software.design.rest.Resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import software.design.rest.mysql.CreateTable;

import java.sql.SQLException;

@Path("Test")
public class TestResource {
/*
This is a horrible example only made to get it working quickly the rest command is more suited to a PUT instead of a GET how this works
 is that whenever localhost:9080/api/Test/{insert number here} a table is created using the CreateTable Class the CreateTable class calls the
 mysqlConnect to connect to a local database which you will have to set up on your own laptop.
 */
    @Path("{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response test(@PathParam("id") String id) throws SQLException, ClassNotFoundException {
        CreateTable createTable = new CreateTable("name2", id);
        return  Response.status(Response.Status.ACCEPTED).build();
    }
}
