package log;

import org.apache.log4j.Logger;

public class CountArea {
	static Logger log = Logger.getLogger(TestLog4j.class);
	double a;
	double b;
	double c;

	public void sets(double a, double b, double c) {
		log.trace("�߳����忪ʼ!");
		this.a = a;
		this.b = b;
		this.c = c;
		log.trace("�߳�������ϣ�");
		if (a + b <= c || a + c <= b || b + c <= a) {
			log.warn("���������ߵı߳��޷����������Σ��������������ţ�");
		}
		if (a <= 0 || c <= 0 || b <= 0) {
			log.warn("�����εı߳��и�����0���޷����������Σ��������������ţ�");
		}
	}

	public void conculate() {
		log.trace("��ʼ�ú��׹�ʽ�������!");
		double p = (a + b + c) / 2;
		double s = p * (p - a) * (p - b) * (p - c);
		if (s <= 0) {
			log.warn("���С���㣬�������������⣡");
		}
		if (s > 0) {
			double area = Math.sqrt(s);
			System.out.println("���������Ϊ��" + area);
		}
		else {
			System.out.println("����ʧ�ܣ���鿴��־��Ϣ��");
		}
		log.trace("����������!");

	}
}
