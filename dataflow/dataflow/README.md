# dataflow
Various examples for dataflow analysis to analyze

<a href="https://scan.coverity.com/projects/dataflow">
  <img alt="Coverity Scan Build Status"
       src="https://scan.coverity.com/projects/6514/badge.svg"/>
</a>

To submit to CoverityScan through mvn build:

mvn clean
cov-build --dir cov-int mvn compile
tar czvf my-test.tgz cov-int

To submit to CoverityScan throuh java build:
cov-build --dir cov-int javac ./src/main/java/com/test/app/App.java
