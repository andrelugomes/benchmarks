package br.com.andreluisgomes;


import org.openjdk.jmh.annotations.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Threads(Threads.MAX)
@Fork(value = 2)
@Warmup(iterations = 2)
@Measurement(iterations = 5)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@BenchmarkMode({Mode.AverageTime,Mode.Throughput})
public class JMHCollectionsXStream {

    public static final int OPERATIONS = 10000;

    static List<Integer> sourceList = new ArrayList<>();
    //WarmUp
    static {
        for (int i = 0; i < OPERATIONS; i++) {
            sourceList.add(i);
        }
    }

    @Benchmark
    public List<Double> pureJava() {
        List<Double> result = new ArrayList<>(sourceList.size() / 2 + 1);
        for (int i = 0 ; i < sourceList.size(); i++) {
            Integer integer = sourceList.get(i);
            if (integer % 2 == 0){
                result.add(Math.sqrt(integer));
            }
        }
        return result;
    }

    @Benchmark
    public List<Double> enhancedForEach() {
        List<Double> result = new ArrayList<>(sourceList.size() / 2 + 1);
        for (Integer i : sourceList) {
            if (i % 2 == 0){
                result.add(Math.sqrt(i));
            }
        }
        return result;
    }

    @Benchmark
    public List<Double> java8ForEach() {
        List<Double> result = new ArrayList<>(sourceList.size() / 2 + 1);
        sourceList.forEach(i -> {
            if (i % 2 == 0){
                result.add(Math.sqrt(i));
            }
        });
        return result;
    }

    @Benchmark
    public List<Double> streamToCollection() {
        return sourceList.stream()
                .filter(i -> i % 2 == 0)
                .map(Math::sqrt)
                .collect(Collectors.toCollection(
                        () -> new ArrayList<>(sourceList.size() / 2 + 1)));
    }

    @Benchmark
    public List<Double> streamToList() {
        return sourceList.stream()
                .filter(i -> i % 2 == 0)
                .map(Math::sqrt)
                .collect(Collectors.toList());
    }

    @Benchmark
    public List<Double> parallelStream() {
        return sourceList.stream()
                .parallel()
                .filter(i -> i % 2 == 0)
                .map(Math::sqrt)
                .collect(Collectors.toCollection(
                        () -> new ArrayList<>(sourceList.size() / 2 + 1)));
    }
}
