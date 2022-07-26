<div align="center">
    <img src="./assets/images/strategy_pattern.png"/>
</div>


## Project structure
```
.
├── strategy-pattern
│   ├── pom.xml
│   ...
├── pom.xml
|
└── README.md
```

## Start project

- Build project

```shell script
$ ./mvnw clean package
...
[INFO] 
[INFO] Strategy Pattern ................................... SUCCESS [  6.142 s]
[INFO] Parent ............................................. SUCCESS [  0.012 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  6.288 s
[INFO] Finished at: 2022-07-26T15:28:26+07:00
[INFO] ------------------------------------------------------------------------
```

- Run project

```shell script
$ java -jar strategy-pattern/target/strategy-pattern-0.0.1-SNAPSHOT.jar
ConcreteStrategy1: 1
ConcreteStrategy2: 2

```

## Contribute

## Reference