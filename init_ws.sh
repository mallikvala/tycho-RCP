#!/bin/sh

RCP_TARGET_PLATFORM=/home/cliff/Development/eclipse-tools/3.5/rcp-target-platform

# delete old pom files
find . -name "pom.xml" | xargs rm -rf 

mvn org.sonatype.tycho:maven-tycho-plugin:generate-poms \
-DgroupId=com.nextinstruction.dummy \
-Dtycho.targetPlatform=${RCP_TARGET_PLATFORM}
