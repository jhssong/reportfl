{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/concurrent/CallableBackgroundInitializer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CallableBackgroundInitializer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.concurrent.BackgroundInitializer\u003cT\u003e"
      ],
      "begin_line": 68,
      "end_line": 126,
      "comment": "\n * \u003cp\u003e\n * A specialized {@link BackgroundInitializer} implementation that wraps a\n * {@code Callable} object.\n * \u003c/p\u003e\n * \u003cp\u003e\n * An instance of this class is initialized with a {@code Callable} object when\n * it is constructed. The implementation of the {@link #initialize()} method\n * defined in the super class delegates to this {@code Callable} so that the\n * {@code Callable} is executed in the background thread.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The {@code java.util.concurrent.Callable} interface is a standard mechanism\n * of the JDK to define tasks to be executed by another thread. The {@code\n * CallableBackgroundInitializer} class allows combining this standard interface\n * with the background initializer API.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Usage of this class is very similar to the default usage pattern of the\n * {@link BackgroundInitializer} class: Just create an instance and provide the\n * {@code Callable} object to be executed, then call the initializer\u0027s\n * {@link #start()} method. This causes the {@code Callable} to be executed in\n * another thread. When the results of the {@code Callable} are needed the\n * initializer\u0027s {@link #get()} method can be called (which may block until\n * background execution is complete). The following code fragment shows a\n * typical usage example:\n *\n * \u003cpre\u003e\n * // a Callable that performs a complex computation\n * Callable\u0026lt;Integer\u0026gt; computationCallable \u003d new MyComputationCallable();\n * // setup the background initializer\n * CallableBackgroundInitializer\u0026lt;Integer\u0026gt; initializer \u003d\n *     new CallableBackgroundInitializer(computationCallable);\n * initializer.start();\n * // Now do some other things. Initialization runs in a parallel thread\n * ...\n * // Wait for the end of initialization and access the result\n * Integer result \u003d initializer.get();\n * \u003c/pre\u003e\n *\n * \u003c/p\u003e\n *\n * @since 3.0\n * @version $Id$\n * @param \u003cT\u003e the type of the object managed by this initializer class\n "
    },
    {
      "type": "field",
      "varNames": [
        "callable"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " The Callable to be executed. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.CallableBackgroundInitializer.CallableBackgroundInitializer(java.util.concurrent.Callable\u003cT\u003e)",
      "begin_line": 79,
      "end_line": 82,
      "comment": "\n     * Creates a new instance of {@code CallableBackgroundInitializer} and sets\n     * the {@code Callable} to be executed in a background thread.\n     *\n     * @param call the {@code Callable} (must not be \u003cb\u003enull\u003c/b\u003e)\n     * @throws IllegalArgumentException if the {@code Callable} is \u003cb\u003enull\u003c/b\u003e\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 28)",
        "(line 81,col 9)-(line 81,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.CallableBackgroundInitializer.CallableBackgroundInitializer(java.util.concurrent.Callable\u003cT\u003e, java.util.concurrent.ExecutorService)",
      "begin_line": 95,
      "end_line": 99,
      "comment": "\n     * Creates a new instance of {@code CallableBackgroundInitializer} and\n     * initializes it with the {@code Callable} to be executed in a background\n     * thread and the {@code ExecutorService} for managing the background\n     * execution.\n     *\n     * @param call the {@code Callable} (must not be \u003cb\u003enull\u003c/b\u003e)\n     * @param exec an external {@code ExecutorService} to be used for task\n     * execution\n     * @throws IllegalArgumentException if the {@code Callable} is \u003cb\u003enull\u003c/b\u003e\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 20)",
        "(line 97,col 9)-(line 97,col 28)",
        "(line 98,col 9)-(line 98,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.CallableBackgroundInitializer.initialize()",
      "begin_line": 109,
      "end_line": 112,
      "comment": "\n     * Performs initialization in a background thread. This implementation\n     * delegates to the {@code Callable} passed at construction time of this\n     * object.\n     *\n     * @return the result of the initialization\n     * @throws Exception if an error occurs\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.CallableBackgroundInitializer.checkCallable(java.util.concurrent.Callable\u003cT\u003e)",
      "begin_line": 121,
      "end_line": 125,
      "comment": "\n     * Tests the passed in {@code Callable} and throws an exception if it is\n     * undefined.\n     *\n     * @param call the object to check\n     * @throws IllegalArgumentException if the {@code Callable} is \u003cb\u003enull\u003c/b\u003e\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 124,col 9)"
      ]
    }
  ]
}