package edu.escuelaing.arep.app.services;

/**
 * Interface that contains the services of the Spark Web App
 */
public interface Services {

    /**
     * Converts Fahrenheit degrees to Celsius degrees
     * @param fahrenheit degrees to be converted
     * @return fahrenheit degrees converted to celcius
     */
    double celcius(double fahrenheit);
}