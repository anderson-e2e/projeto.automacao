package projeto.web.config;

import java.io.InputStream;
import java.util.Properties;

public class UiEnvironmentConfig {

	private static final Properties properties = new Properties();
	 private static String activeFile;
	

	static {
		String env = System.getProperty("env", "local.ui"); // ex.: -Denv=qa.ui
       String path = "environments/" + env + ".properties";
       activeFile = "src/test/resources/" + path;
      
		try {
			InputStream in = Thread.currentThread()
           .getContextClassLoader()
           .getResourceAsStream(path);
			
			if (in == null) {
               throw new IllegalStateException(
                   "Arquivo de propriedades não encontrado no classpath: " + activeFile
               );
           }
			
			 properties.load(in);
		} catch (Exception e) {
			throw new RuntimeException("Error to loading UI environment properties: " + env, e);
		}
	}

	public static String get(String key) {
		return properties.getProperty(key);
	}

}
