```
Benchmark                                 Mode  Cnt   Score   Error  Units
JMHCollectionsXStream.parallelStream      avgt  200  27,647 ± 0,601  ns/op
JMHCollectionsXStream.pureJava            avgt  200  15,270 ± 0,079  ns/op
JMHCollectionsXStream.streamToCollection  avgt  200  17,385 ± 0,347  ns/op
JMHCollectionsXStream.streamToList        avgt  200  21,396 ± 0,079  ns/op
```

```bazaar
Benchmark                                                              Mode     Cnt         Score       Error   Units
JMHCollectionsXStream.enhancedForEach                                 thrpt      10        ≈ 10⁻⁴              ops/ns
JMHCollectionsXStream.java8ForEach                                    thrpt      10        ≈ 10⁻⁴              ops/ns
JMHCollectionsXStream.parallelStream                                  thrpt      10        ≈ 10⁻⁵              ops/ns
JMHCollectionsXStream.pureJava                                        thrpt      10        ≈ 10⁻⁴              ops/ns
JMHCollectionsXStream.streamToCollection                              thrpt      10        ≈ 10⁻⁵              ops/ns
JMHCollectionsXStream.streamToList                                    thrpt      10        ≈ 10⁻⁵              ops/ns
JMHCollectionsXStream.enhancedForEach                                  avgt      10    109477,194 ±  9288,703   ns/op
JMHCollectionsXStream.java8ForEach                                     avgt      10    117649,415 ± 15795,246   ns/op
JMHCollectionsXStream.parallelStream                                   avgt      10    200639,369 ±  3931,045   ns/op
JMHCollectionsXStream.pureJava                                         avgt      10    116293,352 ± 13779,233   ns/op
JMHCollectionsXStream.streamToCollection                               avgt      10    150330,031 ±  3286,727   ns/op
JMHCollectionsXStream.streamToList                                     avgt      10    159060,516 ±  5191,532   ns/op

```

```
10 mil interações
# Run complete. Total time: 00:01:01

Benchmark                                          Mode  Cnt       Score   Error   Units
JMHCollectionsXStream.enhancedForEach             thrpt    2      ≈ 10⁻⁴          ops/ns
JMHCollectionsXStream.java8ForEach                thrpt    2      ≈ 10⁻⁵          ops/ns
JMHCollectionsXStream.parallelStream              thrpt    2      ≈ 10⁻⁵          ops/ns
JMHCollectionsXStream.parallelStreamToCollection  thrpt    2      ≈ 10⁻⁵          ops/ns
JMHCollectionsXStream.pureJava                    thrpt    2      ≈ 10⁻⁴          ops/ns
JMHCollectionsXStream.streamToCollection          thrpt    2      ≈ 10⁻⁵          ops/ns
JMHCollectionsXStream.streamToList                thrpt    2      ≈ 10⁻⁵          ops/ns
JMHCollectionsXStream.enhancedForEach              avgt    2  120811,204           ns/op
JMHCollectionsXStream.java8ForEach                 avgt    2  148976,534           ns/op
JMHCollectionsXStream.parallelStream               avgt    2  208560,513           ns/op
JMHCollectionsXStream.parallelStreamToCollection   avgt    2  222495,717           ns/op
JMHCollectionsXStream.pureJava                     avgt    2  112952,718           ns/op
JMHCollectionsXStream.streamToCollection           avgt    2  159402,990           ns/op
JMHCollectionsXStream.streamToList                 avgt    2  175352,634           ns/op

```

```bazaar
10 milhões de interações

# Run complete. Total time: 00:05:58

Benchmark                                          Mode  Cnt           Score   Error   Units
JMHCollectionsXStream.enhancedForEach             thrpt    2          ≈ 10⁻⁸          ops/ns
JMHCollectionsXStream.java8ForEach                thrpt    2          ≈ 10⁻⁸          ops/ns
JMHCollectionsXStream.parallelStream              thrpt    2          ≈ 10⁻⁹          ops/ns
JMHCollectionsXStream.parallelStreamToCollection  thrpt    2          ≈ 10⁻⁹          ops/ns
JMHCollectionsXStream.pureJava                    thrpt    2          ≈ 10⁻⁸          ops/ns
JMHCollectionsXStream.streamToCollection          thrpt    2          ≈ 10⁻⁸          ops/ns
JMHCollectionsXStream.streamToList                thrpt    2          ≈ 10⁻⁹          ops/ns
JMHCollectionsXStream.enhancedForEach              avgt    2   510058012,604           ns/op
JMHCollectionsXStream.java8ForEach                 avgt    2   855318651,646           ns/op
JMHCollectionsXStream.parallelStream               avgt    2  3243174020,688           ns/op
JMHCollectionsXStream.parallelStreamToCollection   avgt    2  2158457927,375           ns/op
JMHCollectionsXStream.pureJava                     avgt    2  1700351562,500           ns/op
JMHCollectionsXStream.streamToCollection           avgt    2   475907808,438           ns/op
JMHCollectionsXStream.streamToList                 avgt    2  3443066527,375           ns/op


```