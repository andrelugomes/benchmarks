# 02/03/2018 Run complete. Total time: 00:01:15

 JMH version: 1.20
 VM version: JDK 1.8.0_161, VM 25.161-b12
 VM invoker: /usr/lib/jvm/java-8-oracle/jre/bin/java
 VM options: <none>
 Warmup: 1 iterations, 1 s each
 Measurement: 5 iterations, 1 s each
 Timeout: 10 min per iteration
 Threads: 4 threads, will synchronize iterations
 Benchmark mode: Average time, time/op


Benchmark                        Mode  Cnt      Score      Error   Units
JMHSimple.avoidConstantFolding  thrpt    5      0,816 ±    0,187  ops/ns
JMHSimple.avoidDeadCode         thrpt    5      0,822 ±    0,334  ops/ns
JMHSimple.constantFolding       thrpt    5      0,829 ±    0,243  ops/ns
JMHSimple.deadCode              thrpt    5      5,923 ±    0,335  ops/ns
JMHSimple.deadCodeBlackHole     thrpt    5      0,828 ±    0,276  ops/ns
JMHSimple.looping               thrpt    5     ≈ 10⁻⁴             ops/ns
JMHSimple.avoidConstantFolding   avgt    5      4,766 ±    0,900   ns/op
JMHSimple.avoidDeadCode          avgt    5      4,884 ±    1,778   ns/op
JMHSimple.constantFolding        avgt    5      5,018 ±    2,490   ns/op
JMHSimple.deadCode               avgt    5      0,670 ±    0,008   ns/op
JMHSimple.deadCodeBlackHole      avgt    5      4,933 ±    2,324   ns/op
JMHSimple.looping                avgt    5  15909,529 ± 1327,767   ns/op
