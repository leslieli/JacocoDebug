# JacocoDebug

For debugging https://github.com/jacoco/jacoco/issues/1233.

Build it with:

`mvn clean && mvn install -DskipTests=true -P default && mvn eclipse:clean && mvn eclipse:eclipse`

Run the UT in UtilsTest.groovy and would see the line coverage only has 50%.