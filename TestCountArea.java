package log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestCountArea {
	static Logger log = Logger.getLogger(TestLog4j.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("g:/project/log/src/log4ca.properties");
		
		log.trace("ʵ����CA�ࣺ");
		CountArea ca=new CountArea();
		log.trace("ʵ������ɣ�ȡ�ö���ca��");
		log.trace("�������ñ߳�������");
		ca.sets(3, 4, 5);
		log.trace("�߳�������ɡ�");
		log.trace("���ü������������");
		ca.conculate();
		log.trace("���������ɡ�");
	}
}
