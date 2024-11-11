package org.compression;

public class Main {
    public static void main(String[] args) {
        CompressionTimeCalculator calculator = new CompressionTimeCalculator();
        CompressionAnalysisDemo demo = new CompressionAnalysisDemo(calculator);
        double[] fileSizes = {100, 500, 1000};
        demo.runAnalysis(fileSizes);
    }
}