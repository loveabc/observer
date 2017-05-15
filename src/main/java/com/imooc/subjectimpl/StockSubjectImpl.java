package com.imooc.subjectimpl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.imooc.iobserver.IObserver;
import com.imooc.isubject.ISubject;

/*
 * 股市被观察者
 */
public class StockSubjectImpl implements ISubject {

	//股市指数
	private String index;
	//观察股市的所有观察者
	private List<IObserver> observerList=new LinkedList<IObserver>();
	//注册股市观察者
	@Override
	public void attach(IObserver observer) {
		this.observerList.add(observer);
	}

	//移除股市观察者
	@Override
	public void detach(IObserver observer) {
		this.observerList.remove(observer);
	}

	//股市变化,通知所有股市观察者
	@Override
	public void notifyObserver() {
		for(Iterator<IObserver> it=observerList.iterator();it.hasNext();){
			it.next().updateStock(this);
		}
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
		this.notifyObserver();
	}
	
}
