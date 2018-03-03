# Benchmark Simple

## Basics

http://javadox.com/org.openjdk.jmh/jmh-core/0.9/org/openjdk/jmh/annotations/package-summary.html

```java
@Fork(value = 10, warmups = 3) // Number of trials (sets of iterations) to run. Each trial is started in a separate JVM. It also lets you specify the (extra) JVM arguments.
@Threads(Threads.MAX) //Threads annotation provides the default number of threads to run. Threads.MAX to run with all available threads.
@Measurement(iterations = 1) //Number of measurement iterations
@Warmup(iterations = 2) // Controls how many times a benchmark will dry run before results are collected,
@OutputTimeUnit(TimeUnit.NANOSECONDS) // The time unit will be used for all benchmark modes your benchmark is executed in.
@BenchmarkMode({Mode.AverageTime,Mode.Throughput}) // The benchmark mode tells JMH what you want to measure.

```

## Usage
```
$ mvn clean install
```

```
$ java -jar target/jmh-simple-1.0.jar
```

## Avoid

### JIT-compiler 
Each method is executed in interpreted mode at first. 
The Java interpreter counts how many times a method is invoked and requests that it should be JIT-compiled. 
Loosely speaking this happens after a method has been called 10.000 times (see an article about tiered compilation by Dr. Cliff Click for more details on how the process works and the Oracle documentation on HotSpot performance options). 
Consequently, we have to run the benchmarked code often enough before the actual measurement starts to ensure that all benchmarked code has been JIT-compiled beforehand. 
This can easily be verified by providing -XX:+PrintCompilation. 
You should not see any JIT-compiler activity after the warmup phase.

### CPU burning
From time to time you may want to burn some CPU cycles inside your tests. 
This could be done via a static BlackHole.consumeCPU(tokens) method. Token is a few CPU instructions. 
Method code is written so that the time to run this method will depend linearly on its argument (defensive against any JIT/CPU optimizations).

### JVM Dead Code Elimination
One of the JVM optimizations to avoid when implementing performance benchmarks is dead code elimination.
If the JVM detects that the result of some computation is never used, the JVM may consider this computation dead code and eliminate it.

### Loop Optimizations
It is tempting to put your benchmark code inside a loop in your benchmark methods,in order to repeat it more times per call to the benchmark method (to reduce the overhead of the benchmark method call).
However, the JVM is very good at optimizing loops, so you may end up with a different result than what you expected.
In general you should avoid loops in your benchmark methods, unless they are part of the code you want to measure (and not around the code you want to measure).

### Constant Folding
Constant folding is another common JVM optimization.
A calculation which is based on constants will often result in the exact same result, regardless of how many times the calculation is performed.
The JVM may detect that, and replace the calculation with the result of the calculation.

