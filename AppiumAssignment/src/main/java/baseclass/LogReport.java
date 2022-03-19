package baseclass;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogReport {
	//logger reference
	public Logger log;
	//loggerReport contractor
	public LogReport(String name) {
		log = LogManager.getLogger(name);
		BasicConfigurator.configure();
		//log4j properties path 
		PropertyConfigurator.configure("./src/main/resources/log4j2.properties");
	}
}
