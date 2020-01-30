# 09-ood-patterns

Example project showing how to implement some Design Patterns with Java.

### Observer Pattern aka Reactive Programming Paradigm

From Java9 on, the well known Observer Pattern and it's implementation classes `java.util.Observer` & `java.util.Observer` got replaced or extended by the so called reactive libraries and interfaces of the JVM.

See stackoverflow for more info https://stackoverflow.com/a/46563116/4964553

There's also a great introduction in the `projectreactor.io` documentation: https://projectreactor.io/docs/core/release/reference/#intro-reactive

In short you could see the 

`java.util.Observable` replaced by  `java.util.concurrent.Flow.Publisher`

`java.util.Observer`   replaced by  `java.util.concurrent.Flow.Subscriber` 


