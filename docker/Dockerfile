FROM ubuntu:latest
ARG DEBIAN_FRONTEND=noninteractive

# source command (used in sdkman installation guide) is not present in default shell, so bash is used
SHELL ["/bin/bash", "-c"]


RUN  apt update -y && apt upgrade -y && apt-get install software-properties-common -y && apt update && add-apt-repository ppa:deadsnakes/ppa -y

RUN apt install python3.8 python3.8-distutils -y
RUN python3.8 --version

RUN apt update -y && apt install openjdk-8-jdk -y
RUN java -version

#https://aster.cloud/2022/09/07/how-to-install-kotlin-on-ubuntu-22-04/
RUN apt install unzip -y && apt install zip -y && apt install wget -y && apt install curl -y
RUN curl -s https://get.sdkman.io | bash && source "/root/.sdkman/bin/sdkman-init.sh" && sdk version && sdk install kotlin