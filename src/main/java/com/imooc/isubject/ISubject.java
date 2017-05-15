package com.imooc.isubject;

import com.imooc.iobserver.IObserver;

public interface ISubject {
	
	//注册观察者
	public void attach(IObserver observer);
	//移除观察者
	public void detach(IObserver observer);
	//通知观察者
	public void notifyObserver();
	
}
