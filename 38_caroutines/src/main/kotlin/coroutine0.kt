/**
 *
 * One level higher thatn what weve learned
 *
 * Coroutine concept:
 * > scope, suspending function, context, etc
 * > courutine is lightweight threads
 * > async code,callback, synchronization are  simpler than usual thread
 * > simple syntax
 *
 *
 *
 * [Multihreading]
 * We are running  aprogram in parallel
 * these paralel called thread
 *
 * thread is sequence of exceution
 *
 *
 * parralel task only kind that thread not interact
 * e.g task like download image or running music player
 * that can be executed in the background(dont need user interaction)
 *
 * good design didt block useer interaction
 *
 * multiple thread is standard in android application
 *
 *
 * +++ [BENEFITS] +++
 *  > responsive
 *  > faster execution
 *  > parralelization(better CPU utilization)
 *  > resource efficiency
 *
 *  +++[DRAWBACK]***
 *  > synchronization
 *  > error handling
 *
 *
 *
 * Courutines Basic Concept
 *
 * 1. Scope
 * create and run coroutines
 * provides lifecycle evnet
 *
 * 2. Context
 * scope provides a context in which the coroutines runs
 *
 * 3. Suspending function
 * function can run in coroutines(can be suspended)
 *
 * 4. Job
 * a handle on coroutine
 *
 * 5. Deferred
 * future result of coroutine(when couruotune done, ini baru ngereturn)
 *
 * 6. Dispatcher
 * manages which thread the coroutine run on
 *
 * 7. Error Handling
 *
 *
 * */