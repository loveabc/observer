package com.imooc.observer;

import com.imooc.observerimpl.ObserverImpl;
import com.imooc.subjectimpl.BondMarketSubjectImpl;
import com.imooc.subjectimpl.StockSubjectImpl;

/*
 * 测试观察者模式
 */
public class TestObserver {

	public static void main(String[] args) {
		// 两个观察者小明和小米
		ObserverImpl xiaoming = new ObserverImpl();
		xiaoming.setObserverName("小明");
		ObserverImpl xiaomi = new ObserverImpl();
		xiaomi.setObserverName("小米");
		ObserverImpl xiaolan = new ObserverImpl();
		xiaolan.setObserverName("小兰");

		// 两个被观察的对象,股市和债市
		StockSubjectImpl stockSubject = new StockSubjectImpl();
		BondMarketSubjectImpl bondSubject = new BondMarketSubjectImpl();

		// 为股市注册观察者
		stockSubject.attach(xiaoming);
		stockSubject.attach(xiaomi);
		stockSubject.attach(xiaolan);
		// 为债市注册观察者
		bondSubject.attach(xiaoming);
		bondSubject.attach(xiaomi);
		bondSubject.attach(xiaolan);

		// 股市发生变化
		stockSubject.setIndex("3300");
		// 债市发生变化
		bondSubject.setIndex("1000");
		
		System.out.println("==============================================");
		
		// 小米不再观察股市
		stockSubject.detach(xiaoming);
		// 小兰不再观察债市
		bondSubject.detach(xiaolan);
		
		// 股市发生变化
		stockSubject.setIndex("3500");
		// 债市发生变化
		bondSubject.setIndex("1200");
	}
}
