package alpha;

import org.apache.logging.log4j.*;

public class Demo {
	
	static Logger log=LogManager.getLogger(Demo.class);

	public static void main(String[] args) {
		
		log.error("button");
		log.fatal("clicked");
		
		log.debug("button clicked");
		log.info("dont");

	}

}
