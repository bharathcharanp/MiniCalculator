FROM openjdk
MAINTAINER Bharath pbharathcharan@gmail.com
COPY ./target/MiniCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-cp", "MiniCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar", "MiniCalculator.MiniCalculator_Main"]
