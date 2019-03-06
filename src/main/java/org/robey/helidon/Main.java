package org.robey.helidon;

import org.glassfish.jersey.server.ResourceConfig;

import io.helidon.microprofile.server.Server;


public class Main {

    public static void main(String[] args) {
        System.out.println("My app starting up...");

        Server server =
                Server.builder()
                      .addApplication(new Application())
                      .build()
                      .start();

        System.out.println("http://localhost:" + server.port() + "/endpoint");

    }

    public static class Application extends ResourceConfig {
        public Application() {
            packages(getClass().getPackageName());

            // was unable to register the ComponentProvider this way, which would have been ideal, so used META-INF/services SPI instead
            //register(JerseyGuiceComponentProvider.class);
        }
    }
}
