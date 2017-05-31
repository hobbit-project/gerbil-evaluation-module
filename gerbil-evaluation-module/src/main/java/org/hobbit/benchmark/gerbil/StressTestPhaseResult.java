package org.hobbit.benchmark.gerbil;

public class StressTestPhaseResult {

    public final long duration;
    public final double f1ScoreSum;
    public final double beta;
    public final int errors;
    
    public StressTestPhaseResult(long duration, double f1ScoreSum, double beta, int errors) {
        this.duration = duration;
        this.f1ScoreSum = f1ScoreSum;
        this.beta = beta;
        this.errors = errors;
    }
}