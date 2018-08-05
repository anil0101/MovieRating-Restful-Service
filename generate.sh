#!/usr/bin/env bash

echo "cleaning server api folder"
rm -rf ./src/main/java/swagger/api/*

echo "cleaning server model folder"
rm -rf ./src/main/java/swagger/model/*

echo "cleaning client sdk folder"
#rm -rf ./dmf-file-compare-service-client-sdk/*

echo "generating server api interface and model objects"
java -jar ./libs/swagger-codegen-cli-2.3.1.jar generate \
  --input-spec ./apispecs/Swagger-Service.yaml \
  -l spring \
  -o ./ \
  -c ./apispecs/config.json \
  -Dmodels -DmodelTests=false \
  -D hideGenerationTimestamp=true

java -jar ./libs/swagger-codegen-cli-2.3.1.jar generate \
  --input-spec ./apispecs/Swagger-Service.yaml \
  -l spring \
  -o ./ \
  -c ./apispecs/config.json \
  -Dapis -DapiTests=false \
  -D hideGenerationTimestamp=true

#This is for generating complete server code.
#java -jar ./libs/swagger-codegen-cli-2.3.1.jar generate \
#  --input-spec ./apispecs/Swagger-Service.yaml \
#  -l spring \
#  -o api \
#  -c ./apispecs/config.json \
#  -D hideGenerationTimestamp=true

####### generate client sdk #########
#echo "generating client sdk"
#java -jar ./libs/swagger-codegen-cli-2.3.1.jar generate \
#  --input-spec ./apispecs/Swagger-Service.yaml \
#  -l java \
#  -o dmf-file-compare-service-client-sdk
#
#
#cat dmf-file-compare-service-client-sdk/build.gradle | grep -v "group = 'io.swagger'" | grep -v "version = '1.0.0'" >dmf-file-compare-service-client-sdk/build.gradle.clean
#mv dmf-file-compare-service-client-sdk/build.gradle.clean dmf-file-compare-service-client-sdk/build.gradle

./gradlew clean build

