# Scala Playground

## terminal commands
```bash
# Useful Terminal Commands
mkdir dir1 dir2
touch file.txt
```

## mac commands
cmd + k clears terminal

## sbt command
```bash
# entering the sbt shell
$ sbt

# inside sbt shell
sbt:console> compile
sbt:console> update
sbt:console> reload
sbt:console> clean
sbt:console> runMain
sbt:console> exit
# runs entire test suite
sbt:console> test
# runs single test class
sbt:console> testOnly
# runs sbt command when code changes
sbt:console> ~testOnly
```

# adding dependencies
To find scala packages, go to mavern:
https://mvnrepository.com/artifact/org.scalatest/scalatest_2.13/3.1.1