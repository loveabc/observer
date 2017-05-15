package com.imooc.observerimpl;

import com.imooc.iobserver.IObserver;
import com.imooc.isubject.ISubject;
import com.imooc.subjectimpl.BondMarketSubjectImpl;
import com.imooc.subjectimpl.StockSubjectImpl;

public class ObserverImpl implements IObserver {

	//观察者姓名
	private String observerName;
	//接收股市变化的通知
	@Override
	public void updateStock(ISubject subject) {
		System.out.println("HELLO "+this.observerName+",股市发生了变化,变为"+((StockSubjectImpl)subject).getIndex());
	}

	//接收债市变化的通知
	@Override
	public void updateBondMarket(ISubject subject) {
		System.out.println("HELLO "+this.observerName+",债市发生了变化"+((BondMarketSubjectImpl)subject).getIndex());

	}

	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

	
}
