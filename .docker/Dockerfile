FROM maven:3.8.6-openjdk-11

WORKDIR /usr/src/app/server

COPY . ./

# copy example.wf into workspace
RUN mkdir /app
RUN wget https://raw.githubusercontent.com/glsp-extensions/semantic-zoom-client/master/examples/workflow-standalone/app/example1.wf -O /app/example1.wf

# make GLSP server listen on 0.0.0.0 instead of localhost
RUN sed -i 's/localhost/0.0.0.0/g' examples/org.eclipse.glsp.example.workflow/src/org/eclipse/glsp/example/workflow/launch/WorkflowServerLauncher.java
RUN mvn clean verify -Pm2 -Pfatjar

EXPOSE 8081

CMD java -jar examples/org.eclipse.glsp.example.workflow/target/org.eclipse.glsp.example.workflow-1.1.0-SNAPSHOT-glsp.jar org.eclipse.glsp.example.workflow.launch.ExampleServerLauncher --port=8081 --websocket