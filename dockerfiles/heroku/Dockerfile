FROM ubuntu

RUN apt-get update
RUN apt-get -y install curl software-properties-common apt-transport-https
RUN add-apt-repository -y "deb https://cli-assets.heroku.com/branches/stable/apt ./"
RUN curl -L https://cli-assets.heroku.com/apt/release.key | apt-key add -
RUN apt-get update
RUN apt-get -y install git heroku

RUN mkdir /app

VOLUME /app

WORKDIR /app

