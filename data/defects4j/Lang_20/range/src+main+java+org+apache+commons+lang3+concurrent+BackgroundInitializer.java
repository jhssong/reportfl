{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/concurrent/BackgroundInitializer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BackgroundInitializer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.concurrent.ConcurrentInitializer\u003cT\u003e"
      ],
      "begin_line": 86,
      "end_line": 333,
      "comment": "\n * \u003cp\u003e\n * A class that allows complex initialization operations in a background task.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Applications often have to do some expensive initialization steps when they\n * are started, e.g. constructing a connection to a database, reading a\n * configuration file, etc. Doing these things in parallel can enhance\n * performance as the CPU load can be improved. However, when access to the\n * resources initialized in a background thread is actually required,\n * synchronization has to be performed to ensure that their initialization is\n * complete.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This abstract base class provides support for this use case. A concrete\n * subclass must implement the {@link #initialize()} method. Here an arbitrary\n * initialization can be implemented, and a result object can be returned. With\n * this method in place the basic usage of this class is as follows (where\n * {@code MyBackgroundInitializer} is a concrete subclass):\n *\n * \u003cpre\u003e\n * MyBackgroundInitializer initializer \u003d new MyBackgroundInitializer();\n * initializer.start();\n * // Now do some other things. Initialization runs in a parallel thread\n * ...\n * // Wait for the end of initialization and access the result object\n * Object result \u003d initializer.get();\n * \u003c/pre\u003e\n *\n * \u003c/p\u003e\n * \u003cp\u003e\n * After the construction of a {@code BackgroundInitializer} object its\n * {@link #start()} method has to be called. This starts the background\n * processing. The application can now continue to do other things. When it\n * needs access to the object produced by the {@code BackgroundInitializer} it\n * calls its {@link #get()} method. If initialization is already complete,\n * {@link #get()} returns the result object immediately. Otherwise it blocks\n * until the result object is fully constructed.\n * \u003c/p\u003e\n * \u003cp\u003e\n * {@code BackgroundInitializer} is a thin wrapper around a {@code Future}\n * object and uses an {@code ExecutorService} for running the background\n * initialization task. It is possible to pass in an {@code ExecutorService} at\n * construction time or set one using {@code setExternalExecutor()} before\n * {@code start()} was called. Then this object is used to spawn the background\n * task. If no {@code ExecutorService} has been provided, {@code\n * BackgroundInitializer} creates a temporary {@code ExecutorService} and\n * destroys it when initialization is complete.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The methods provided by {@code BackgroundInitializer} provide for minimal\n * interaction with the wrapped {@code Future} object. It is also possible to\n * obtain the {@code Future} object directly. Then the enhanced functionality\n * offered by {@code Future} can be used, e.g. to check whether the background\n * operation is complete or to cancel the operation.\n * \u003c/p\u003e\n *\n * @since 3.0\n * @version $Id$\n * @param \u003cT\u003e the type of the object managed by this initializer class\n "
    },
    {
      "type": "field",
      "varNames": [
        "externalExecutor"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " The external executor service for executing tasks. "
    },
    {
      "type": "field",
      "varNames": [
        "executor"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " A reference to the executor service that is actually used. "
    },
    {
      "type": "field",
      "varNames": [
        "future"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Stores the handle to the background task. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializer.BackgroundInitializer()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Creates a new instance of {@code BackgroundInitializer}. No external\n     * {@code ExecutorService} is used.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializer.BackgroundInitializer(java.util.concurrent.ExecutorService)",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Creates a new instance of {@code BackgroundInitializer} and initializes\n     * it with the given {@code ExecutorService}. If the {@code ExecutorService}\n     * is not null, the background task for initializing this object will be\n     * scheduled at this service. Otherwise a new temporary {@code\n     * ExecutorService} is created.\n     *\n     * @param exec an external {@code ExecutorService} to be used for task\n     * execution\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializer.getExternalExecutor()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * Returns the external {@code ExecutorService} to be used by this class.\n     *\n     * @return the {@code ExecutorService}\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializer.isStarted()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * Returns a flag whether this {@code BackgroundInitializer} has already\n     * been started.\n     *\n     * @return a flag whether the {@link #start()} method has already been\n     * called\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializer.setExternalExecutor(java.util.concurrent.ExecutorService)",
      "begin_line": 153,
      "end_line": 161,
      "comment": "\n     * Sets an {@code ExecutorService} to be used by this class. The {@code\n     * ExecutorService} passed to this method is used for executing the\n     * background task. Thus it is possible to re-use an already existing\n     * {@code ExecutorService} or to use a specially configured one. If no\n     * {@code ExecutorService} is set, this instance creates a temporary one and\n     * destroys it after background initialization is complete. Note that this\n     * method must be called before {@link #start()}; otherwise an exception is\n     * thrown.\n     *\n     * @param externalExecutor the {@code ExecutorService} to be used\n     * @throws IllegalStateException if this initializer has already been\n     * started\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 158,col 9)",
        "(line 160,col 9)-(line 160,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializer.start()",
      "begin_line": 173,
      "end_line": 193,
      "comment": "\n     * Starts the background initialization. With this method the initializer\n     * becomes active and invokes the {@link #initialize()} method in a\n     * background task. A {@code BackgroundInitializer} can be started exactly\n     * once. The return value of this method determines whether the start was\n     * successful: only the first invocation of this method returns \u003cb\u003etrue\u003c/b\u003e,\n     * following invocations will return \u003cb\u003efalse\u003c/b\u003e.\n     *\n     * @return a flag whether the initializer could be started successfully\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 190,col 9)",
        "(line 192,col 9)-(line 192,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializer.get()",
      "begin_line": 209,
      "end_line": 220,
      "comment": "\n     * Returns the result of the background initialization. This method blocks\n     * until initialization is complete. If the background processing caused a\n     * runtime exception, it is directly thrown by this method. Checked\n     * exceptions, including {@code InterruptedException} are wrapped in a\n     * {@link ConcurrentException}. Calling this method before {@link #start()}\n     * was called causes an {@code IllegalStateException} exception to be\n     * thrown.\n     *\n     * @return the object produced by this initializer\n     * @throws ConcurrentException if a checked exception occurred during\n     * background processing\n     * @throws IllegalStateException if {@link #start()} has not been called\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 219,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializer.getFuture()",
      "begin_line": 230,
      "end_line": 236,
      "comment": "\n     * Returns the {@code Future} object that was created when {@link #start()}\n     * was called. Therefore this method can only be called after {@code\n     * start()}.\n     *\n     * @return the {@code Future} object wrapped by this initializer\n     * @throws IllegalStateException if {@link #start()} has not been called\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 233,col 9)",
        "(line 235,col 9)-(line 235,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializer.getActiveExecutor()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\n     * Returns the {@code ExecutorService} that is actually used for executing\n     * the background task. This method can be called after {@link #start()}\n     * (before {@code start()} it returns \u003cb\u003enull\u003c/b\u003e). If an external executor\n     * was set, this is also the active executor. Otherwise this method returns\n     * the temporary executor that was created by this object.\n     *\n     * @return the {@code ExecutorService} for executing the background task\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializer.getTaskCount()",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\n     * Returns the number of background tasks to be created for this\n     * initializer. This information is evaluated when a temporary {@code\n     * ExecutorService} is created. This base implementation returns 1. Derived\n     * classes that do more complex background processing can override it. This\n     * method is called from a synchronized block by the {@link #start()}\n     * method. Therefore overriding methods should be careful with obtaining\n     * other locks and return as fast as possible.\n     *\n     * @return the number of background tasks required by this initializer\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializer.initialize()",
      "begin_line": 276,
      "end_line": 276,
      "comment": "\n     * Performs the initialization. This method is called in a background task\n     * when this {@code BackgroundInitializer} is started. It must be\n     * implemented by a concrete subclass. An implementation is free to perform\n     * arbitrary initialization. The object returned by this method can be\n     * queried using the {@link #get()} method.\n     *\n     * @return a result object\n     * @throws Exception if an error occurs\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializer.createTask(java.util.concurrent.ExecutorService)",
      "begin_line": 289,
      "end_line": 291,
      "comment": "\n     * Creates a task for the background initialization. The {@code Callable}\n     * object returned by this method is passed to the {@code ExecutorService}.\n     * This implementation returns a task that invokes the {@link #initialize()}\n     * method. If a temporary {@code ExecutorService} is used, it is destroyed\n     * at the end of the task.\n     *\n     * @param execDestroy the {@code ExecutorService} to be destroyed by the\n     * task\n     * @return a task for the background initialization\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializer.createExecutor()",
      "begin_line": 299,
      "end_line": 301,
      "comment": "\n     * Creates the {@code ExecutorService} to be used. This method is called if\n     * no {@code ExecutorService} was provided at construction time.\n     *\n     * @return the {@code ExecutorService} to be used\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InitializationTask",
      "is_interface": false,
      "parent_types": [
        "java.util.concurrent.Callable\u003cT\u003e"
      ],
      "begin_line": 303,
      "end_line": 332,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "execFinally"
      ],
      "begin_line": 305,
      "end_line": 305,
      "comment": " Stores the executor service to be destroyed at the end. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializer.InitializationTask.InitializationTask(java.util.concurrent.ExecutorService)",
      "begin_line": 313,
      "end_line": 315,
      "comment": "\n         * Creates a new instance of {@code InitializationTask} and initializes\n         * it with the {@code ExecutorService} to be destroyed at the end.\n         *\n         * @param exec the {@code ExecutorService}\n         ",
      "child_ranges": [
        "(line 314,col 13)-(line 314,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializer.InitializationTask.call()",
      "begin_line": 323,
      "end_line": 331,
      "comment": "\n         * Initiates initialization and returns the result.\n         *\n         * @return the result object\n         * @throws Exception if an error occurs\n         ",
      "child_ranges": [
        "(line 324,col 13)-(line 330,col 13)"
      ]
    }
  ]
}