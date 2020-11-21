# lombok-demo

For spring boot projects add dependency:
```xml
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
```

For other projects see: https://projectlombok.org/setup/maven


Install plugin:

```
1. Go to File > Settings > Plugins
2. Click on Browse repositories...
3. Search for Lombok Plugin
4. Click on Install plugin
5. Restart IntelliJ IDEA
```

Enable annotation processing
```
1. Go to File > Settings > Plugins
2. Build, Execution, Deployment
3. Open Compailer
4. Annotation Processor
5. Mark "Enable annotation processing"

or

crtl+shift+a
And sharch for "Enable annotation processing"

or InteliJ after restart will help you set it :)
```