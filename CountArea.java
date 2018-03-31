package log;

import org.apache.log4j.Logger;

public class CountArea {
	static Logger log = Logger.getLogger(TestLog4j.class);
	double a;
	double b;
	double c;

	public void sets(double a, double b, double c) {
		log.trace("边长定义开始!");
		this.a = a;
		this.b = b;
		this.c = c;
		log.trace("边长定义完毕！");
		if (a + b <= c || a + c <= b || b + c <= a) {
			log.warn("三角形三边的边长无法构成三角形！计算结果将不可信！");
		}
		if (a <= 0 || c <= 0 || b <= 0) {
			log.warn("三角形的边长有负数或0，无法构成三角形！计算结果将不可信！");
		}
	}

	public void conculate() {
		log.trace("开始用海伦公式计算面积!");
		double p = (a + b + c) / 2;
		double s = p * (p - a) * (p - b) * (p - c);
		if (s <= 0) {
			log.warn("面积小于零，三边设置有问题！");
		}
		if (s > 0) {
			double area = Math.sqrt(s);
			System.out.println("三角形面积为：" + area);
		}
		else {
			System.out.println("计算失败，请查看日志信息！");
		}
		log.trace("面积计算完毕!");

	}
}
