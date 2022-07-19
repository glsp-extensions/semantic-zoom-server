# Semantic Zooming in GLSP (Server)

This is a prototype that demonstrates semantic zooming in GLSP. \
It is based on a fork of the original GLSP server on https://github.com/eclipse-glsp/glsp-server.

### Prerequisites: 

-   Java 11 or higher
-   Maven


### Running the project:

In the root of this repository, run

```bash
mvn clean verify -Pm2 -Pfatjar
```

In the folder `examples/org.eclipse.glsp.example.workflow/target`, you should have a jar file `org.eclipse.glsp.example.workflow-X.X.X-SNAPSHOT-glsp.jar` whereas `X.X.X` is the current version.

To run the server standalone JAR, run this command in your terminal:

```console
cd examples/org.eclipse.glsp.example.workflow/target
java -jar org.eclipse.glsp.example.workflow-X.X.X-SNAPSHOT-glsp.jar --websocket --port=8081
```

Once the server is running, start the client which is available here: https://github.com/glsp-extensions/semantic-zoom-client.
