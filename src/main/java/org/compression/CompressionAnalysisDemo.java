package org.compression;

import java.text.DecimalFormat;

public class CompressionAnalysisDemo {
    private static final DecimalFormat df = new DecimalFormat("#,###.##");
    private final CompressionTimeCalculator calculator;

    public CompressionAnalysisDemo(CompressionTimeCalculator calculator) {
        this.calculator = calculator;
    }

    public void runAnalysis(double[] fileSizes) {
        printHeader();

        for (double size : fileSizes) {
            analyzeFileSize(size);
        }

        printComplexityAnalysis();
    }

    private void printHeader() {
        System.out.println("Análisis de Tiempo de Compresión");
        System.out.println("================================");
        System.out.println("Fórmula: T(n) = n³ + 7n² - 3n + 5");
        System.out.println("\nResultados:");
        System.out.println("Tamaño (MB) | Tiempo (unidades)");
        System.out.println("--------------------------------");
    }

    private void analyzeFileSize(double size) {
        double time = calculator.calculateExecutionTime(size);
        System.out.println(df.format(size) + " MB | " + df.format(time));

        double[] components = calculator.analyzeComponents(size);
        System.out.println("  Desglose:");
        System.out.println("  - Término cúbico (n³): " + df.format(components[0]));
        System.out.println("  - Término cuadrático (7n²): " + df.format(components[1]));
        System.out.println("  - Término lineal (-3n): " + df.format(components[2]));
        System.out.println("  - Término constante: " + df.format(components[3]));
        System.out.println();
    }

    private void printComplexityAnalysis() {
        System.out.println("\nAnálisis de complejidad:");
        System.out.println("El término dominante es n³, lo que significa que para archivos grandes,");
        System.out.println("el tiempo de ejecución crece de manera cúbica con respecto al tamaño del archivo.");
    }
}

