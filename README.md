To Build the Project use the command bellow:

```
> mvn package
```

To run the application, use the command bellow:

```
> java -cp ./target/SkillsTesting-1.0-SNAPSHOT.jar net.adneom.test.Application [size] [elements...]
```

- size: should be an Integer
- elements: all the elements of the list (Integer, String...)

There are some conditions in the main method to test if the size is not null, not equal to 0 and is an Integer

This application use jUnit4 for Unit testing, bellow are the cases used in the tests:

```
> java -cp ./target/SkillsTesting-1.0-SNAPSHOT.jar net.adneom.test.Application 2 1 2 3 4 5 
[ [1,2], [3,4], [5] ]
```

```
> java -cp ./target/SkillsTesting-1.0-SNAPSHOT.jar net.adneom.test.Application 3 1 2 3 4 5 
[ [1,2,3], [4,5] ]
```

```
> java -cp ./target/SkillsTesting-1.0-SNAPSHOT.jar net.adneom.test.Application 1 1 2 3 4 5 
[ [1], [2], [3], [4], [5] ]
```

```
> java -cp ./target/SkillsTesting-1.0-SNAPSHOT.jar net.adneom.test.Application 2 1 2 3 4 5 6 
[ [1,2], [3,4], [5,6] ]
```

To run the Application using maven without building, use the command bellow:

```
mvn exec:java -Dexec.mainClass="net.adneom.test.Application" -Dexec.args="2 1 2 3 5 4 8"
```
