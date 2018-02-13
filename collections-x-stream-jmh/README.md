# Benchmark Collecnoins API X Stream API

## JMH

http://openjdk.java.net/projects/code-tools/jmh/

JMH is a Java harness for building, running, and analysing nano/micro/milli/macro benchmarks written in Java and other languages targetting the JVM.

```
mvn archetype:generate \
    -DinteractiveMode=false \
    -DarchetypeGroupId=org.openjdk.jmh \
    -DarchetypeArtifactId=jmh-java-benchmark-archetype \
    -DgroupId=br.com.andreluisgomes \
    -DartifactId=collections-x-stream \
    -Dversion=1.0
```

## Usage

```
$ mvn clean install
```

```
$ java -jar target/collections-x-stream-1.0.jar
```