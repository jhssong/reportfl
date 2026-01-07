{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/concurrent/BasicThreadFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BasicThreadFactory",
      "is_interface": false,
      "parent_types": [
        "java.util.concurrent.ThreadFactory"
      ],
      "begin_line": 90,
      "end_line": 381,
      "comment": "\n * \u003cp\u003e\n * An implementation of the {@code ThreadFactory} interface that provides some\n * configuration options for the threads it creates.\n * \u003c/p\u003e\n * \u003cp\u003e\n * A {@code ThreadFactory} is used for instance by an {@code ExecutorService} to\n * create the threads it uses for executing tasks. In many cases users do not\n * have to care about a {@code ThreadFactory} because the default one used by an\n * {@code ExecutorService} will do. However, if there are special requirements\n * for the threads, a custom {@code ThreadFactory} has to be created.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This class provides some frequently needed configuration options for the\n * threads it creates. These are the following:\n * \u003cul\u003e\n * \u003cli\u003eA name pattern for the threads created by this factory can be specified.\n * This is often useful if an application uses multiple executor services for\n * different purposes. If the names of the threads used by these services have\n * meaningful names, log output or exception traces can be much easier to read.\n * Naming patterns are \u003cem\u003eformat strings\u003c/em\u003e as used by the {@code\n * String.format()} method. The string can contain the place holder {@code %d}\n * which will be replaced by the number of the current thread ({@code\n * ThreadFactoryImpl} keeps a counter of the threads it has already created).\n * For instance, the naming pattern {@code \"My %d. worker thread\"} will result\n * in thread names like {@code \"My 1. worker thread\"}, {@code\n * \"My 2. worker thread\"} and so on.\u003c/li\u003e\n * \u003cli\u003eA flag whether the threads created by this factory should be daemon\n * threads. This can impact the exit behavior of the current Java application\n * because the JVM shuts down if there are only daemon threads running.\u003c/li\u003e\n * \u003cli\u003eThe priority of the thread. Here an integer value can be provided. The\n * {@code java.lang.Thread} class defines constants for valid ranges of priority\n * values.\u003c/li\u003e\n * \u003cli\u003eThe {@code UncaughtExceptionHandler} for the thread. This handler is\n * called if an uncaught exception occurs within the thread.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \u003cp\u003e\n * {@code BasicThreadFactory} wraps another thread factory which actually\n * creates new threads. The configuration options are set on the threads created\n * by the wrapped thread factory. On construction time the factory to be wrapped\n * can be specified. If none is provided, a default {@code ThreadFactory} is\n * used.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Instances of {@code BasicThreadFactory} are not created directly, but the\n * nested {@code Builder} class is used for this purpose. Using the builder only\n * the configuration options an application is interested in need to be set. The\n * following example shows how a {@code BasicThreadFactory} is created and\n * installed in an {@code ExecutorService}:\n *\n * \u003cpre\u003e\n * // Create a factory that produces daemon threads with a naming pattern and\n * // a priority\n * BasicThreadFactory factory \u003d new BasicThreadFactory.Builder()\n *     .namingPattern(\u0026quot;workerthread-%d\u0026quot;)\n *     .daemon(true)\n *     .priority(Thread.MAX_PRIORITY)\n *     .build();\n * // Create an executor service for single-threaded execution\n * ExecutorService exec \u003d Executors.newSingleThreadExecutor(factory);\n * \u003c/pre\u003e\n * \u003c/p\u003e\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "threadCounter"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " A counter for the threads created by this factory. "
    },
    {
      "type": "field",
      "varNames": [
        "wrappedFactory"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Stores the wrapped factory. "
    },
    {
      "type": "field",
      "varNames": [
        "uncaughtExceptionHandler"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " Stores the uncaught exception handler. "
    },
    {
      "type": "field",
      "varNames": [
        "namingPattern"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " Stores the naming pattern for newly created threads. "
    },
    {
      "type": "field",
      "varNames": [
        "priority"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " Stores the priority. "
    },
    {
      "type": "field",
      "varNames": [
        "daemonFlag"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " Stores the daemon status flag. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactory.BasicThreadFactory(org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder)",
      "begin_line": 115,
      "end_line": 128,
      "comment": "\n     * Creates a new instance of {@code ThreadFactoryImpl} and configures it\n     * from the specified {@code Builder} object.\n     *\n     * @param builder the {@code Builder} object\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 120,col 9)",
        "(line 122,col 9)-(line 122,col 46)",
        "(line 123,col 9)-(line 123,col 36)",
        "(line 124,col 9)-(line 124,col 40)",
        "(line 125,col 9)-(line 125,col 60)",
        "(line 127,col 9)-(line 127,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactory.getWrappedFactory()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * Returns the wrapped {@code ThreadFactory}. This factory is used for\n     * actually creating threads. This method never returns \u003cb\u003enull\u003c/b\u003e. If no\n     * {@code ThreadFactory} was passed when this object was created, a default\n     * thread factory is returned.\n     *\n     * @return the wrapped {@code ThreadFactory}\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactory.getNamingPattern()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * Returns the naming pattern for naming newly created threads. Result can\n     * be \u003cb\u003enull\u003c/b\u003e if no naming pattern was provided.\n     *\n     * @return the naming pattern\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactory.getDaemonFlag()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * Returns the daemon flag. This flag determines whether newly created\n     * threads should be daemon threads. If \u003cb\u003etrue\u003c/b\u003e, this factory object\n     * calls {@code setDaemon(true)} on the newly created threads. Result can be\n     * \u003cb\u003enull\u003c/b\u003e if no daemon flag was provided at creation time.\n     *\n     * @return the daemon flag\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactory.getPriority()",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * Returns the priority of the threads created by this factory. Result can\n     * be \u003cb\u003enull\u003c/b\u003e if no priority was specified.\n     *\n     * @return the priority for newly created threads\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactory.getUncaughtExceptionHandler()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * Returns the {@code UncaughtExceptionHandler} for the threads created by\n     * this factory. Result can be \u003cb\u003enull\u003c/b\u003e if no handler was provided.\n     *\n     * @return the {@code UncaughtExceptionHandler}\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactory.getThreadCount()",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n     * Returns the number of threads this factory has already created. This\n     * class maintains an internal counter that is incremented each time the\n     * {@link #newThread(Runnable)} method is invoked.\n     *\n     * @return the number of threads created by this factory\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactory.newThread(java.lang.Runnable)",
      "begin_line": 203,
      "end_line": 208,
      "comment": "\n     * Creates a new thread. This implementation delegates to the wrapped\n     * factory for creating the thread. Then, on the newly created thread the\n     * corresponding configuration options are set.\n     *\n     * @param r the {@code Runnable} to be executed by the new thread\n     * @return the newly created thread\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 52)",
        "(line 205,col 9)-(line 205,col 28)",
        "(line 207,col 9)-(line 207,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactory.initializeThread(java.lang.Thread)",
      "begin_line": 218,
      "end_line": 236,
      "comment": "\n     * Initializes the specified thread. This method is called by\n     * {@link #newThread(Runnable)} after a new thread has been obtained from\n     * the wrapped thread factory. It initializes the thread according to the\n     * options set for this factory.\n     *\n     * @param t the thread to be initialized\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 223,col 9)",
        "(line 225,col 9)-(line 227,col 9)",
        "(line 229,col 9)-(line 231,col 9)",
        "(line 233,col 9)-(line 235,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Builder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.Builder\u003corg.apache.commons.lang3.concurrent.BasicThreadFactory\u003e"
      ],
      "begin_line": 253,
      "end_line": 380,
      "comment": "\n     * \u003cp\u003e\n     * A \u003cem\u003ebuilder\u003c/em\u003e class for creating instances of {@code\n     * BasicThreadFactory}.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Using this builder class instances of {@code BasicThreadFactory} can be\n     * created and initialized. The class provides methods that correspond to\n     * the configuration options supported by {@code BasicThreadFactory}. Method\n     * chaining is supported. Refer to the documentation of {@code\n     * BasicThreadFactory} for a usage example.\n     * \u003c/p\u003e\n     *\n     * @version $Id$\n     "
    },
    {
      "type": "field",
      "varNames": [
        "wrappedFactory"
      ],
      "begin_line": 257,
      "end_line": 257,
      "comment": " The wrapped factory. "
    },
    {
      "type": "field",
      "varNames": [
        "exceptionHandler"
      ],
      "begin_line": 260,
      "end_line": 260,
      "comment": " The uncaught exception handler. "
    },
    {
      "type": "field",
      "varNames": [
        "namingPattern"
      ],
      "begin_line": 263,
      "end_line": 263,
      "comment": " The naming pattern. "
    },
    {
      "type": "field",
      "varNames": [
        "priority"
      ],
      "begin_line": 266,
      "end_line": 266,
      "comment": " The priority. "
    },
    {
      "type": "field",
      "varNames": [
        "daemonFlag"
      ],
      "begin_line": 269,
      "end_line": 269,
      "comment": " The daemon flag. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder.wrappedFactory(java.util.concurrent.ThreadFactory)",
      "begin_line": 281,
      "end_line": 289,
      "comment": "\n         * Sets the {@code ThreadFactory} to be wrapped by the new {@code\n         * BasicThreadFactory}.\n         *\n         * @param factory the wrapped {@code ThreadFactory} (must not be\n         * \u003cb\u003enull\u003c/b\u003e)\n         * @return a reference to this {@code Builder}\n         * @throws NullPointerException if the passed in {@code ThreadFactory}\n         * is \u003cb\u003enull\u003c/b\u003e\n         ",
      "child_ranges": [
        "(line 282,col 13)-(line 285,col 13)",
        "(line 287,col 13)-(line 287,col 37)",
        "(line 288,col 13)-(line 288,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder.namingPattern(java.lang.String)",
      "begin_line": 299,
      "end_line": 307,
      "comment": "\n         * Sets the naming pattern to be used by the new {@code\n         * BasicThreadFactory}.\n         *\n         * @param pattern the naming pattern (must not be \u003cb\u003enull\u003c/b\u003e)\n         * @return a reference to this {@code Builder}\n         * @throws NullPointerException if the naming pattern is \u003cb\u003enull\u003c/b\u003e\n         ",
      "child_ranges": [
        "(line 300,col 13)-(line 303,col 13)",
        "(line 305,col 13)-(line 305,col 36)",
        "(line 306,col 13)-(line 306,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder.daemon(boolean)",
      "begin_line": 317,
      "end_line": 320,
      "comment": "\n         * Sets the daemon flag for the new {@code BasicThreadFactory}. If this\n         * flag is set to \u003cb\u003etrue\u003c/b\u003e the new thread factory will create daemon\n         * threads.\n         *\n         * @param f the value of the daemon flag\n         * @return a reference to this {@code Builder}\n         ",
      "child_ranges": [
        "(line 318,col 13)-(line 318,col 44)",
        "(line 319,col 13)-(line 319,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder.priority(int)",
      "begin_line": 329,
      "end_line": 332,
      "comment": "\n         * Sets the priority for the threads created by the new {@code\n         * BasicThreadFactory}.\n         *\n         * @param prio the priority\n         * @return a reference to this {@code Builder}\n         ",
      "child_ranges": [
        "(line 330,col 13)-(line 330,col 45)",
        "(line 331,col 13)-(line 331,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder.uncaughtExceptionHandler(java.lang.Thread.UncaughtExceptionHandler)",
      "begin_line": 343,
      "end_line": 352,
      "comment": "\n         * Sets the uncaught exception handler for the threads created by the\n         * new {@code BasicThreadFactory}.\n         *\n         * @param handler the {@code UncaughtExceptionHandler} (must not be\n         * \u003cb\u003enull\u003c/b\u003e)\n         * @return a reference to this {@code Builder}\n         * @throws NullPointerException if the exception handler is \u003cb\u003enull\u003c/b\u003e\n         ",
      "child_ranges": [
        "(line 345,col 13)-(line 348,col 13)",
        "(line 350,col 13)-(line 350,col 39)",
        "(line 351,col 13)-(line 351,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder.reset()",
      "begin_line": 360,
      "end_line": 366,
      "comment": "\n         * Resets this builder. All configuration options are set to default\n         * values. Note: If the {@link #build()} method was called, it is not\n         * necessary to call {@code reset()} explicitly because this is done\n         * automatically.\n         ",
      "child_ranges": [
        "(line 361,col 13)-(line 361,col 34)",
        "(line 362,col 13)-(line 362,col 36)",
        "(line 363,col 13)-(line 363,col 33)",
        "(line 364,col 13)-(line 364,col 28)",
        "(line 365,col 13)-(line 365,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder.build()",
      "begin_line": 375,
      "end_line": 379,
      "comment": "\n         * Creates a new {@code BasicThreadFactory} with all configuration\n         * options that have been specified by calling methods on this builder.\n         * After creating the factory {@link #reset()} is called.\n         *\n         * @return the new {@code BasicThreadFactory}\n         ",
      "child_ranges": [
        "(line 376,col 13)-(line 376,col 70)",
        "(line 377,col 13)-(line 377,col 20)",
        "(line 378,col 13)-(line 378,col 27)"
      ]
    }
  ]
}