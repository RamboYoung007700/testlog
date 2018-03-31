package log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestCountArea {
	static Logger log = Logger.getLogger(TestLog4j.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("g:/project/log/src/log4ca.properties");
		
		log.trace("实例化CA类：");
		CountArea ca=new CountArea();
		log.trace("实例化完成，取得对象ca。");
		log.trace("调用设置边长方法。");
		ca.sets(3, 4, 5);
		log.trace("边长设置完成。");
		log.trace("调用计算面积方法。");
		ca.conculate();
		log.trace("面积计算完成。");
	}
}
