This is sample maven multimodule(parent , child1 , child2) project having springboot tests in child2 module. Main application is in child1 module.

run tests using command from parent folder :

c:\parent> mvn test failsafe:integration-test surefire-report:failsafe-report-only

A HTML report should be generated in ${basedir}/target/site/failsafe-report.html.

reference : https://www.baeldung.com/maven-integration-test
