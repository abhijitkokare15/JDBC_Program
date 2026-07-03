The Thread class has many methods, but these are the most important ones used in interviews, exams, and real projects.

Method	Purpose
start()	Starts a new thread.
run()	Contains the task executed by the thread.
sleep(long millis)	Pauses the currently executing thread for a specified time.
join()	Makes the calling thread wait until another thread finishes.
join(long millis)	Waits for another thread for a specified time.
isAlive()	Checks whether a thread is currently alive.
currentThread()	Returns the currently executing thread.
getName()	Returns the thread's name.
setName(String name)	Changes the thread's name.
getPriority()	Returns the thread's priority.
setPriority(int priority)	Sets the thread's priority (1–10).
yield()	Suggests that the scheduler may let another runnable thread execute.
interrupt()	Requests interruption of a thread.
isInterrupted()	Checks whether the interrupt flag of a thread is set.
interrupted()	Static method that checks and clears the interrupt status of the current thread.
getState()	Returns the current state of the thread.
getId()	Returns the unique ID of the thread.
isDaemon()	Checks whether the thread is a daemon thread.
setDaemon(boolean)	Marks a thread as a daemon thread (must b