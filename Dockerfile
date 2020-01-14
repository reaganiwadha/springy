FROM jboss/wildfly:latest
COPY target/springy-0.0.1-SNAPSHOT.war /opt/jboss/wildfly/standalone/deployments/springy.war