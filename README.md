# quarkus-code-dump project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Class Dump

When you use the quarkus dev mode, then Quarkus generates classes in memory for dynamic class-loading.

This example project contains decompiled dumps of the classes generated in memory by the Quarkus dev mode.

The dump was created with the following procedure:
0. Run the quarkus app and attach a debugger.
1. Set a breakpoint at the last return of `io.quarkus.bootstrap.classloading.QuarkusClassLoader.getState`
2. Run the following expression in your debugger:
```
new ObjectOutputStream(new FileOutputStream("../quarkus-in-memory-classes.ser")).writeObject(((MemoryClassPathElement) this.elements.get(0)).resources)
```
3. Run the `DumpClassFiles` main class to generate the class files into the `target/generated-classes` folder
4. Use a decompiler of your choice, e.g. fern-flower with IntelliJ, to look at the generated code.
For your convenience I copied all the decompiled source files into the [src/main/java-dump](src/main/java-dump) folder for quick inspection.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory. Be aware that it’s not an _über-jar_ as
the dependencies are copied into the `target/quarkus-app/lib/` directory.

If you want to build an _über-jar_, execute the following command:

```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/quarkus-code-dump-1.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.html
.

## Related guides

- RESTEasy JAX-RS ([guide](https://quarkus.io/guides/rest-json)): REST endpoint framework implementing JAX-RS and more

## Provided examples

### RESTEasy JAX-RS example

REST is easy peasy with this Hello World RESTEasy resource.

[Related guide section...](https://quarkus.io/guides/getting-started#the-jax-rs-resources)

### RESTEasy JSON serialisation using Jackson

This example demonstrate RESTEasy JSON serialisation by letting you list, add and remove quark types from a list.
Quarked!

[Related guide section...](https://quarkus.io/guides/rest-json#creating-your-first-json-rest-service)
