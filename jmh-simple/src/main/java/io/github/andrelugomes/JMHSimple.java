package io.github.andrelugomes;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Fork(value = 1, warmups = 0)
@Threads(Threads.MAX)
@Warmup(iterations = 1)
@Measurement(iterations = 5)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@BenchmarkMode({Mode.All})
public class JMHSimple {

    /**
     * JVM Dead Code Elimination
     */
    @Benchmark
    public void deadCode() {
        int a = 1;
        int b = 2;
        int sum = a + b;
    }

    @Benchmark
    public void deadCodeBlackHole(Blackhole blackhole) {
        int a = 1;
        int b = 2;
        int sum = a + b;

        blackhole.consume(sum);
    }

    @Benchmark
    public int avoidDeadCode() {
        int a = 1;
        int b = 2;
        int sum = a + b;

        return sum;
    }


    /**
     * Loop Optimizations
     */
    @Benchmark
    public int[] looping() {
        int[] array = new int[10000];

        for (int i = 0; i < 10000; i++) {
            array[i] = i;
        }

        return array;
    }

    /**
     * Constant Folding
     *
     * In this case: Always return 3
     */
    @Benchmark
    public int constantFolding() {
        int a = 1;
        int b = 2;
        int sum = a + b;

        return sum;
    }

    /**
     * Avoiding Constant Folding
     * To avoid constant folding you must not hardcode constants into your benchmark methods.
     * Instead, the input to your calculations should come from a state object.
     * This makes it harder for the JVM to see that the calculations are based on constant values.
     */
    @State(Scope.Thread)
    public static class MyState {
        public int a = 1;
        public int b = 2;
    }


    @Benchmark
    public int avoidConstantFolding(MyState state) {
        int sum = state.a + state.b;
        return sum;
    }



}
