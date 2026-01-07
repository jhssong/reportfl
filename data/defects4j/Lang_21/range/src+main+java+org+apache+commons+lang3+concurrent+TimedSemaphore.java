{
  "filepath": "/tmp/Lang-21b/src/main/java/org/apache/commons/lang3/concurrent/TimedSemaphore.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TimedSemaphore",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 127,
      "end_line": 420,
      "comment": "\n * \u003cp\u003e\n * A specialized \u003cem\u003esemaphore\u003c/em\u003e implementation that provides a number of\n * permits in a given time frame.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This class is similar to the {@code java.util.concurrent.Semaphore} class\n * provided by the JDK in that it manages a configurable number of permits.\n * Using the {@link #acquire()} method a permit can be requested by a thread.\n * However, there is an additional timing dimension: there is no {@code\n * release()} method for freeing a permit, but all permits are automatically\n * released at the end of a configurable time frame. If a thread calls\n * {@link #acquire()} and the available permits are already exhausted for this\n * time frame, the thread is blocked. When the time frame ends all permits\n * requested so far are restored, and blocking threads are waked up again, so\n * that they can try to acquire a new permit. This basically means that in the\n * specified time frame only the given number of operations is possible.\n * \u003c/p\u003e\n * \u003cp\u003e\n * A use case for this class is to artificially limit the load produced by a\n * process. As an example consider an application that issues database queries\n * on a production system in a background process to gather statistical\n * information. This background processing should not produce so much database\n * load that the functionality and the performance of the production system are\n * impacted. Here a {@code TimedSemaphore} could be installed to guarantee that\n * only a given number of database queries are issued per second.\n * \u003c/p\u003e\n * \u003cp\u003e\n * A thread class for performing database queries could look as follows:\n *\n * \u003cpre\u003e\n * public class StatisticsThread extends Thread {\n *     // The semaphore for limiting database load.\n *     private final TimedSemaphore semaphore;\n *     // Create an instance and set the semaphore\n *     public StatisticsThread(TimedSemaphore timedSemaphore) {\n *         semaphore \u003d timedSemaphore;\n *     }\n *     // Gather statistics\n *     public void run() {\n *         try {\n *             while(true) {\n *                 semaphore.acquire();   // limit database load\n *                 performQuery();        // issue a query\n *             }\n *         } catch(InterruptedException) {\n *             // fall through\n *         }\n *     }\n *     ...\n * }\n * \u003c/pre\u003e\n *\n * The following code fragment shows how a {@code TimedSemaphore} is created\n * that allows only 10 operations per second and passed to the statistics\n * thread:\n *\n * \u003cpre\u003e\n * TimedSemaphore sem \u003d new TimedSemaphore(1, TimeUnit.SECOND, 10);\n * StatisticsThread thread \u003d new StatisticsThread(sem);\n * thread.start();\n * \u003c/pre\u003e\n *\n * \u003c/p\u003e\n * \u003cp\u003e\n * When creating an instance the time period for the semaphore must be\n * specified. {@code TimedSemaphore} uses an executor service with a\n * corresponding period to monitor this interval. The {@code\n * ScheduledExecutorService} to be used for this purpose can be provided at\n * construction time. Alternatively the class creates an internal executor\n * service.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Client code that uses {@code TimedSemaphore} has to call the\n * {@link #acquire()} method in aach processing step. {@code TimedSemaphore}\n * keeps track of the number of invocations of the {@link #acquire()} method and\n * blocks the calling thread if the counter exceeds the limit specified. When\n * the timer signals the end of the time period the counter is reset and all\n * waiting threads are released. Then another cycle can start.\n * \u003c/p\u003e\n * \u003cp\u003e\n * It is possible to modify the limit at any time using the\n * {@link #setLimit(int)} method. This is useful if the load produced by an\n * operation has to be adapted dynamically. In the example scenario with the\n * thread collecting statistics it may make sense to specify a low limit during\n * day time while allowing a higher load in the night time. Reducing the limit\n * takes effect immediately by blocking incoming callers. If the limit is\n * increased, waiting threads are not released immediately, but wake up when the\n * timer runs out. Then, in the next period more processing steps can be\n * performed without blocking. By setting the limit to 0 the semaphore can be\n * switched off: in this mode the {@link #acquire()} method never blocks, but\n * lets all callers pass directly.\n * \u003c/p\u003e\n * \u003cp\u003e\n * When the {@code TimedSemaphore} is no more needed its {@link #shutdown()}\n * method should be called. This causes the periodic task that monitors the time\n * interval to be canceled. If the {@code ScheduledExecutorService} has been\n * created by the semaphore at construction time, it is also shut down.\n * resources. After that {@link #acquire()} must not be called any more.\n * \u003c/p\u003e\n *\n * @version $Id:$\n "
    },
    {
      "type": "field",
      "varNames": [
        "NO_LIMIT"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": "\n     * Constant for a value representing no limit. If the limit is set to a\n     * value less or equal this constant, the {@code TimedSemaphore} will be\n     * effectively switched off.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "THREAD_POOL_SIZE"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " Constant for the thread pool size for the executor. "
    },
    {
      "type": "field",
      "varNames": [
        "executorService"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " The executor service for managing the timer thread. "
    },
    {
      "type": "field",
      "varNames": [
        "period"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " Stores the period for this timed semaphore. "
    },
    {
      "type": "field",
      "varNames": [
        "unit"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " The time unit for the period. "
    },
    {
      "type": "field",
      "varNames": [
        "ownExecutor"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": " A flag whether the executor service was created by this object. "
    },
    {
      "type": "field",
      "varNames": [
        "task"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": " A future object representing the timer task. "
    },
    {
      "type": "field",
      "varNames": [
        "totalAcquireCount"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " Stores the total number of invocations of the acquire() method. "
    },
    {
      "type": "field",
      "varNames": [
        "periodCount"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": "\n     * The counter for the periods. This counter is increased every time a\n     * period ends.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "limit"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": " The limit. "
    },
    {
      "type": "field",
      "varNames": [
        "acquireCount"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": " The current counter. "
    },
    {
      "type": "field",
      "varNames": [
        "lastCallsPerPeriod"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": " The number of invocations of acquire() in the last period. "
    },
    {
      "type": "field",
      "varNames": [
        "shutdown"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": " A flag whether shutdown() was called. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphore.TimedSemaphore(long, java.util.concurrent.TimeUnit, int)",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * Creates a new instance of {@link TimedSemaphore} and initializes it with\n     * the given time period and the limit.\n     *\n     * @param timePeriod the time period\n     * @param timeUnit the unit for the period\n     * @param limit the limit for the semaphore\n     * @throws IllegalArgumentException if the period is less or equals 0\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphore.TimedSemaphore(java.util.concurrent.ScheduledExecutorService, long, java.util.concurrent.TimeUnit, int)",
      "begin_line": 199,
      "end_line": 221,
      "comment": "\n     * Creates a new instance of {@link TimedSemaphore} and initializes it with\n     * an executor service, the given time period, and the limit. The executor\n     * service will be used for creating a periodic task for monitoring the time\n     * period. It can be \u003cb\u003enull\u003c/b\u003e, then a default service will be created.\n     *\n     * @param service the executor service\n     * @param timePeriod the time period\n     * @param timeUnit the unit for the period\n     * @param limit the limit for the semaphore\n     * @throws IllegalArgumentException if the period is less or equals 0\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 205,col 28)",
        "(line 206,col 9)-(line 206,col 24)",
        "(line 208,col 9)-(line 218,col 9)",
        "(line 220,col 9)-(line 220,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphore.getLimit()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\n     * Returns the limit enforced by this semaphore. The limit determines how\n     * many invocations of {@link #acquire()} are allowed within the monitored\n     * period.\n     *\n     * @return the limit\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphore.setLimit(int)",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n     * Sets the limit. This is the number of times the {@link #acquire()} method\n     * can be called within the time period specified. If this limit is reached,\n     * further invocations of {@link #acquire()} will block. Setting the limit\n     * to a value \u0026lt;\u003d {@link #NO_LIMIT} will cause the limit to be disabled,\n     * i.e. an arbitrary number of{@link #acquire()} invocations is allowed in\n     * the time period.\n     *\n     * @param limit the limit\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphore.shutdown()",
      "begin_line": 253,
      "end_line": 267,
      "comment": "\n     * Initializes a shutdown. After that the object cannot be used any more.\n     * This method can be invoked an arbitrary number of times. All invocations\n     * after the first one do not have any effect.\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 266,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphore.isShutdown()",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\n     * Tests whether the {@link #shutdown()} method has been called on this\n     * object. If this method returns \u003cb\u003etrue\u003c/b\u003e, this instance cannot be used\n     * any longer.\n     *\n     * @return a flag whether a shutdown has been performed\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphore.acquire()",
      "begin_line": 291,
      "end_line": 309,
      "comment": "\n     * Tries to acquire a permit from this semaphore. This method will block if\n     * the limit for the current period has already been reached. If\n     * {@link #shutdown()} has already been invoked, calling this method will\n     * cause an exception. The very first call of this method starts the timer\n     * task which monitors the time period set for this {@code TimedSemaphore}.\n     * From now on the semaphore is active.\n     *\n     * @throws InterruptedException if the thread gets interrupted\n     * @throws IllegalStateException if this semaphore is already shut down\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 294,col 9)",
        "(line 296,col 9)-(line 298,col 9)",
        "(line 300,col 9)-(line 300,col 32)",
        "(line 301,col 9)-(line 308,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphore.getLastAcquiresPerPeriod()",
      "begin_line": 321,
      "end_line": 323,
      "comment": "\n     * Returns the number of (successful) acquire invocations during the last\n     * period. This is the number of times the {@link #acquire()} method was\n     * called without blocking. This can be useful for testing or debugging\n     * purposes or to determine a meaningful threshold value. If a limit is set,\n     * the value returned by this method won\u0027t be greater than this limit.\n     *\n     * @return the number of non-blocking invocations of the {@link #acquire()}\n     * method\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphore.getAcquireCount()",
      "begin_line": 331,
      "end_line": 333,
      "comment": "\n     * Returns the number of invocations of the {@link #acquire()} method for\n     * the current period. This may be useful for testing or debugging purposes.\n     *\n     * @return the current number of {@link #acquire()} invocations\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphore.getAvailablePermits()",
      "begin_line": 346,
      "end_line": 348,
      "comment": "\n     * Returns the number of calls to the {@link #acquire()} method that can\n     * still be performed in the current period without blocking. This method\n     * can give an indication whether it is safe to call the {@link #acquire()}\n     * method without risking to be suspended. However, there is no guarantee\n     * that a subsequent call to {@link #acquire()} actually is not-blocking\n     * because in the mean time other threads may have invoked the semaphore.\n     *\n     * @return the current number of available {@link #acquire()} calls in the\n     * current period\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphore.getAverageCallsPerPeriod()",
      "begin_line": 359,
      "end_line": 362,
      "comment": "\n     * Returns the average number of successful (i.e. non-blocking)\n     * {@link #acquire()} invocations for the entire life-time of this {@code\n     * TimedSemaphore}. This method can be used for instance for statistical\n     * calculations.\n     *\n     * @return the average number of {@link #acquire()} invocations per time\n     * unit\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 361,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphore.getPeriod()",
      "begin_line": 371,
      "end_line": 373,
      "comment": "\n     * Returns the time period. This is the time monitored by this semaphore.\n     * Only a given number of invocations of the {@link #acquire()} method is\n     * possible in this period.\n     *\n     * @return the time period\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphore.getUnit()",
      "begin_line": 380,
      "end_line": 382,
      "comment": "\n     * Returns the time unit. This is the unit used by {@link #getPeriod()}.\n     *\n     * @return the time unit\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphore.getExecutorService()",
      "begin_line": 389,
      "end_line": 391,
      "comment": "\n     * Returns the executor service used by this instance.\n     *\n     * @return the executor service\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphore.startTimer()",
      "begin_line": 400,
      "end_line": 406,
      "comment": "\n     * Starts the timer. This method is called when {@link #acquire()} is called\n     * for the first time. It schedules a task to be executed at fixed rate to\n     * monitor the time period specified.\n     *\n     * @return a future object representing the task scheduled\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 405,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphore.Anonymous-244d4eb4-10e9-40a3-9641-9ee96aff15ca.run()",
      "begin_line": 402,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 403,col 17)-(line 403,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphore.endOfPeriod()",
      "begin_line": 413,
      "end_line": 419,
      "comment": "\n     * The current time period is finished. This method is called by the timer\n     * used internally to monitor the time period. It resets the counter and\n     * releases the threads waiting for this barrier.\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 42)",
        "(line 415,col 9)-(line 415,col 42)",
        "(line 416,col 9)-(line 416,col 22)",
        "(line 417,col 9)-(line 417,col 25)",
        "(line 418,col 9)-(line 418,col 20)"
      ]
    }
  ]
}