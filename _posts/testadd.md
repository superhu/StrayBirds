---
layout: default
title: test
comments: true
---


## 如何创建一个线程


第一是继承 Thread 类，实现 run 方法，并创建子类对象。

```java
	public void startThreadUseSubClass() {
		class MyThread extends Thread {
			public void run() {
				System.out.println("start thread using Subclass of Thread");
			}
		}

		MyThread thread = new MyThread();
		thread.start();
	}
```




## 结束线程

## wait 与 sleep


*
ssss
*


