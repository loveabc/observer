package com.imooc.subjectimpl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.imooc.iobserver.IObserver;
import com.imooc.isubject.ISubject;
/*
 * 债市被观察者
 */
public class BondMarketSubjectImpl implements ISubject{

	//债市指数
	private String index;
	//所有债市观察者
	private List<IObserver> observerList=new LinkedList<>();
	//注册债市观察者
	@Override
	public void attach(IObserver observer) {
		this.observerList.add(observer);
	}

	//注册股市观察者
	@Override
	public void detach(IObserver observer) {
		this.observerList.remove(observer);
	}

	//债市变化,通知所有债市观察者
	@Override
	public void notifyObserver() {
		for(Iterator<IObserver> it=observerList.iterator();it.hasNext();){
			it.next().updateBondMarket(this);
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
