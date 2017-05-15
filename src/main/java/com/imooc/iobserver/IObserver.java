package com.imooc.iobserver;

import com.imooc.isubject.ISubject;

public interface IObserver {

	//观察股市,股市发生变化时给出提示
	public void updateStock(ISubject subject);
	//观察债市,债市发生变化时给出提示
	public void updateBondMarket(ISubject subject);
}
