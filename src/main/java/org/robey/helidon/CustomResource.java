package org.robey.helidon;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/endpoint")
public class CustomResource {
    @GET
    public String get() {
        return "Worked";
    }

}
