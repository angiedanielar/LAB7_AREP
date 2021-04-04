package edu.escuelaing.arep.app;

import org.json.simple.JSONObject;
import edu.escuelaing.arep.app.services.Services;
import edu.escuelaing.arep.app.services.ServicesImpl;
import spark.Request;
import spark.Response;
import static spark.Spark.*;

/**
 * Spark Web Server
 */
public class App {

    private static Services service = new ServicesImpl();

    public static void main(String ... args){
        port(getPort());
        get("/celcius",App::celcius);

    }

    /**
     * Convert the fahrenheit degrees in to celcius
     * @param request The request made to the server
     * @param response The response made by the server
     * @return myObject The fahrenheit degrees converted to celcius
     */
    private static Object celcius(Request request, Response response) {
        Double value = Double.valueOf(request.queryParams("value"));
        JSONObject myObject = new JSONObject();
        myObject.put("operation", "Fahrenheit degrees converted to Celsius degrees");
        myObject.put("input", value);
        myObject.put("output", service.celcius(value));
        return myObject;
    }

    /**
     * Gets a port on which the Server will run
     * @return the port on which the Server will run
     */
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4767;
    }
}