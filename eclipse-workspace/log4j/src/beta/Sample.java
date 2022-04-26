package beta;

import org.apache.logging.log4j.*;

public class Sample {
	
	static Logger log=LogManager.getLogger(Sample.class);

	public static void main(String[] args) {
		
		log.error("button");
		log.fatal("clicked");
		
		log.debug("button clicked");
		log.info("dont");

	}

}
