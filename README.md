# java-multithreading
Threads are sometimes called lightweight processes. Both processes and threads provide an execution environment, but creating a new thread requires fewer resources than creating a new process.

Threads exist within a process — every process has at least one. Threads share the process's resources, including memory and open files. This makes for efficient, but potentially problematic, communication.

Multithreaded execution is an essential feature of the Java platform. Every application has at least one thread — or several, if you count "system" threads that do things like memory management and signal handling. But from the application programmer's point of view, you start with just one thread, called the main thread. This thread has the ability to create additional threads, as we'll demonstrate in the next section.

Thread.sleep causes the current thread to suspend execution for a specified period. This is an efficient means of making processor time available to the other threads of an application or other applications that might be running on a computer system. The sleep method can also be used for pacing.

DeadLock
Deadlock describes a situation where two or more threads are blocked forever, waiting for each other.

Synchronization
Threads communicate primarily by sharing access to fields and the objects reference fields refer to. This form of communication is extremely efficient, but makes two kinds of errors possible: thread interference and memory consistency errors.
It is applicable at method level and block level

In java we have 2 levels of lock 
1.Class Level Lock -> A Thread which needs to execute static synchronized block/method needs class level lock
2.Object Level Lock -> A Thread which needs to execute synchronized block/method needs Object level lock.

wait() = whichever thread want the updated result from the object that thread should call wait method.Whenever wait() is called automatically that thread will release the lock of the object to the other thread to use that lock

notify() = Which ever thread wants to update the object that thread should call notify() to the other thread(one)

notifyAll() =  Which ever thread wants to update the object that thread should call notifyAll() to the other waiting threads(many)

PRODUCER CONSUMER 
Main thread
*Needs Demo class total variable with proper value
*Lock is applied on demo object and call wait().
*wait() release the lock of demo object and mai n thread enters into sleepinb state.

User Defined thread[5].
*Should update total variable in Demo class and it shouls send the notification
*notify() is used so the code shouls be in synchronize region 
*It needs the lock of Demo object now the calculation start to update 
*It will give the notification.

