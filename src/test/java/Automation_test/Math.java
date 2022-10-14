package Automation_test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 20;
		int j = ++i - --i;
		int k = j-- - --i + --i - --j;
		int l = --k - k-- + i-- - --i + j++ - --j;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		

	}

}
