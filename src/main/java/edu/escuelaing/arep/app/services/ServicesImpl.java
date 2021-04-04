package edu.escuelaing.arep.app.services;

/**
 * Class that implements the interface Services
 */
public class ServicesImpl implements Services {

	/**
     * Converts Fahrenheit degrees to Celsius degrees
     * @param fahrenheit degrees to be converted
     * @return fahrenheit degrees converted to celcius
     */
    @Override
    public double celcius(double fahrenheit) {

        double celsius = (fahrenheit-32)*(0.5556);

        return celsius;
    }
}
