## PluginAPI
>> This repo contains classes and interfaces that are needed to create plugins for PicassoCode

## Files
- *PiccodePluginInterface* - An interface any class can implement. This is the core of the plugin
- *PiccodePluginPanel* - A premade Panel class tha already implements the plugin interface. Extend it and assign the expected fields at construction time. 
- *PiccodeBackgroundProcess* - A premade class that represents a plugin that runs without a UI. Extend this class if your plugin fits the description.


## Usage

### Using the Panel
```java

public class MyPlugin extends PiccodePluginPanel {
	
  public MyPlugin() {
    super(); 
    ...
  }

  @Override
  public void init() {
    instance = new MyPlugin();
  }
}

```

### Using the BackgroundProccess class
>> This example demostrates a plugin with no UI. 
```java

public class BackgroundTaskPlugin extends PiccodeBackgroundProcess {
  public BackgroundTaskPlugin() {
    super();
  }

  @Override
  public void init() {
    // Plugin Logic
  }
}

```

## Installation 

Add this to your pom.xml under relevant sections

```xml
<repositories>
  <repository>
    <id>jitpack.io</id>
      <url>https://jitpack.io</url>
  </repository>
</repositories>

<dependency>
  <groupId>com.github.Glimmr-Lang</groupId>
  <artifactId>PiccodePlugin</artifactId>
  <version>main-SNAPSHOT</version>
</dependency>
```
