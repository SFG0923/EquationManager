package org.example;


public class SolverService {
    private QuadraticEquation equation;

    public SolverService(QuadraticEquation equation) {
        this.equation = equation;
    }

    public double getMaxRoot() {
        double[] roots = equation.solve();
        if (roots.length == 0) {
            throw new RuntimeException("Корней нет");
        }
        double max = roots[0];
        for (double r : roots) {
            if (r > max) max = r;
        }
        return max;
    }
}