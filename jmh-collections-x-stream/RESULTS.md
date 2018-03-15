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