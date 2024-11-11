package org.compression;

public class CompressionTimeCalculator {

    /**
     * Calcula el tiempo de ejecución basado en el tamaño del archivo.
     * @param fileSize Tamaño del archivo en MB
     * @return Tiempo de ejecución calculado
     * @throws IllegalArgumentException si el tamaño del archivo es negativo
     */
    public double calculateExecutionTime(double fileSize) {
        if (fileSize < 0) {
            throw new IllegalArgumentException("El tamaño del archivo no puede ser negativo");
        }
        return Math.pow(fileSize, 3) + 7 * Math.pow(fileSize, 2) - 3 * fileSize + 5;
    }

    /**
     * Analiza los componentes del tiempo de ejecución.
     * @param fileSize Tamaño del archivo en MB
     * @return Array con los componentes [término cúbico, término cuadrático, término lineal, constante]
     */
    public double[] analyzeComponents(double fileSize) {
        if (fileSize < 0) {
            throw new IllegalArgumentException("El tamaño del archivo no puede ser negativo");
        }

        double[] components = new double[4];
        components[0] = Math.pow(fileSize, 3);
        components[1] = 7 * Math.pow(fileSize, 2);
        components[2] = -3 * fileSize;
        components[3] = 5;

        return components;
    }
}
