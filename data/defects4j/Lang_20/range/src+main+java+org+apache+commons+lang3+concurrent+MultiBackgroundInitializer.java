{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/concurrent/MultiBackgroundInitializer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiBackgroundInitializer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.concurrent.BackgroundInitializer\u003corg.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults\u003e"
      ],
      "begin_line": 97,
      "end_line": 352,
      "comment": "\n * \u003cp\u003e\n * A specialized {@link BackgroundInitializer} implementation that can deal with\n * multiple background initialization tasks.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This class has a similar purpose as {@link BackgroundInitializer}. However,\n * it is not limited to a single background initialization task. Rather it\n * manages an arbitrary number of {@code BackgroundInitializer} objects,\n * executes them, and waits until they are completely initialized. This is\n * useful for applications that have to perform multiple initialization tasks\n * that can run in parallel (i.e. that do not depend on each other). This class\n * takes care about the management of an {@code ExecutorService} and shares it\n * with the {@code BackgroundInitializer} objects it is responsible for; so the\n * using application need not bother with these details.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The typical usage scenario for {@code MultiBackgroundInitializer} is as\n * follows:\n * \u003cul\u003e\n * \u003cli\u003eCreate a new instance of the class. Optionally pass in a pre-configured\n * {@code ExecutorService}. Alternatively {@code MultiBackgroundInitializer} can\n * create a temporary {@code ExecutorService} and delete it after initialization\n * is complete.\u003c/li\u003e\n * \u003cli\u003eCreate specialized {@link BackgroundInitializer} objects for the\n * initialization tasks to be performed and add them to the {@code\n * MultiBackgroundInitializer} using the\n * {@link #addInitializer(String, BackgroundInitializer)} method.\u003c/li\u003e\n * \u003cli\u003eAfter all initializers have been added, call the {@link #start()} method.\n * \u003c/li\u003e\n * \u003cli\u003eWhen access to the result objects produced by the {@code\n * BackgroundInitializer} objects is needed call the {@link #get()} method. The\n * object returned here provides access to all result objects created during\n * initialization. It also stores information about exceptions that have\n * occurred.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \u003cp\u003e\n * {@code MultiBackgroundInitializer} starts a special controller task that\n * starts all {@code BackgroundInitializer} objects added to the instance.\n * Before the an initializer is started it is checked whether this initializer\n * already has an {@code ExecutorService} set. If this is the case, this {@code\n * ExecutorService} is used for running the background task. Otherwise the\n * current {@code ExecutorService} of this {@code MultiBackgroundInitializer} is\n * shared with the initializer.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The easiest way of using this class is to let it deal with the management of\n * an {@code ExecutorService} itself: If no external {@code ExecutorService} is\n * provided, the class creates a temporary {@code ExecutorService} (that is\n * capable of executing all background tasks in parallel) and destroys it at the\n * end of background processing.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Alternatively an external {@code ExecutorService} can be provided - either at\n * construction time or later by calling the\n * {@link #setExternalExecutor(ExecutorService)} method. In this case all\n * background tasks are scheduled at this external {@code ExecutorService}.\n * \u003cstrong\u003eImportant note:\u003c/strong\u003e When using an external {@code\n * ExecutorService} be sure that the number of threads managed by the service is\n * large enough. Otherwise a deadlock can happen! This is the case in the\n * following scenario: {@code MultiBackgroundInitializer} starts a task that\n * starts all registered {@code BackgroundInitializer} objects and waits for\n * their completion. If for instance a single threaded {@code ExecutorService}\n * is used, none of the background tasks can be executed, and the task created\n * by {@code MultiBackgroundInitializer} waits forever.\n * \u003c/p\u003e\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "childInitializers"
      ],
      "begin_line": 101,
      "end_line": 102,
      "comment": " A map with the child initializers. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializer()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Creates a new instance of {@code MultiBackgroundInitializer}.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializer(java.util.concurrent.ExecutorService)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Creates a new instance of {@code MultiBackgroundInitializer} and\n     * initializes it with the given external {@code ExecutorService}.\n     *\n     * @param exec the {@code ExecutorService} for executing the background\n     * tasks\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.addInitializer(java.lang.String, org.apache.commons.lang3.concurrent.BackgroundInitializer\u003c?\u003e)",
      "begin_line": 134,
      "end_line": 151,
      "comment": "\n     * Adds a new {@code BackgroundInitializer} to this object. When this\n     * {@code MultiBackgroundInitializer} is started, the given initializer will\n     * be processed. This method must not be called after {@link #start()} has\n     * been invoked.\n     *\n     * @param name the name of the initializer (must not be \u003cb\u003enull\u003c/b\u003e)\n     * @param init the {@code BackgroundInitializer} to add (must not be\n     * \u003cb\u003enull\u003c/b\u003e)\n     * @throws IllegalArgumentException if a required parameter is missing\n     * @throws IllegalStateException if {@code start()} has already been called\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 142,col 9)",
        "(line 144,col 9)-(line 150,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.getTaskCount()",
      "begin_line": 163,
      "end_line": 172,
      "comment": "\n     * Returns the number of tasks needed for executing all child {@code\n     * BackgroundInitializer} objects in parallel. This implementation sums up\n     * the required tasks for all child initializers (which is necessary if one\n     * of the child initializers is itself a {@code MultiBackgroundInitializer}\n     * ). Then it adds 1 for the control task that waits for the completion of\n     * the children.\n     *\n     * @return the number of tasks required for background processing\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 23)",
        "(line 167,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 171,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.initialize()",
      "begin_line": 184,
      "end_line": 215,
      "comment": "\n     * Creates the results object. This implementation starts all child {@code\n     * BackgroundInitializer} objects. Then it collects their results and\n     * creates a {@code MultiBackgroundInitializerResults} object with this\n     * data. If a child initializer throws a checked exceptions, it is added to\n     * the results object. Unchecked exceptions are propagated.\n     *\n     * @return the results object\n     * @throws Exception if an error occurs\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 52)",
        "(line 187,col 9)-(line 191,col 9)",
        "(line 194,col 9)-(line 194,col 51)",
        "(line 195,col 9)-(line 201,col 9)",
        "(line 204,col 9)-(line 204,col 68)",
        "(line 205,col 9)-(line 205,col 94)",
        "(line 206,col 9)-(line 212,col 9)",
        "(line 214,col 9)-(line 214,col 78)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultiBackgroundInitializerResults",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 227,
      "end_line": 351,
      "comment": "\n     * A data class for storing the results of the background initialization\n     * performed by {@code MultiBackgroundInitializer}. Objects of this inner\n     * class are returned by {@link MultiBackgroundInitializer#initialize()}.\n     * They allow access to all result objects produced by the\n     * {@link BackgroundInitializer} objects managed by the owning instance. It\n     * is also possible to retrieve status information about single\n     * {@link BackgroundInitializer}s, i.e. whether they completed normally or\n     * caused an exception.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "initializers"
      ],
      "begin_line": 229,
      "end_line": 229,
      "comment": " A map with the child initializers. "
    },
    {
      "type": "field",
      "varNames": [
        "resultObjects"
      ],
      "begin_line": 232,
      "end_line": 232,
      "comment": " A map with the result objects. "
    },
    {
      "type": "field",
      "varNames": [
        "exceptions"
      ],
      "begin_line": 235,
      "end_line": 235,
      "comment": " A map with the exceptions. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults.MultiBackgroundInitializerResults(java.util.Map\u003cjava.lang.String, org.apache.commons.lang3.concurrent.BackgroundInitializer\u003c?\u003e\u003e, java.util.Map\u003cjava.lang.String, java.lang.Object\u003e, java.util.Map\u003cjava.lang.String, org.apache.commons.lang3.concurrent.ConcurrentException\u003e)",
      "begin_line": 246,
      "end_line": 253,
      "comment": "\n         * Creates a new instance of {@code MultiBackgroundInitializerResults}\n         * and initializes it with maps for the {@code BackgroundInitializer}\n         * objects, their result objects and the exceptions thrown by them.\n         *\n         * @param inits the {@code BackgroundInitializer} objects\n         * @param results the result objects\n         * @param excepts the exceptions\n         ",
      "child_ranges": [
        "(line 250,col 13)-(line 250,col 33)",
        "(line 251,col 13)-(line 251,col 36)",
        "(line 252,col 13)-(line 252,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults.getInitializer(java.lang.String)",
      "begin_line": 263,
      "end_line": 265,
      "comment": "\n         * Returns the {@code BackgroundInitializer} with the given name. If the\n         * name cannot be resolved, an exception is thrown.\n         *\n         * @param name the name of the {@code BackgroundInitializer}\n         * @return the {@code BackgroundInitializer} with this name\n         * @throws NoSuchElementException if the name cannot be resolved\n         ",
      "child_ranges": [
        "(line 264,col 13)-(line 264,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults.getResultObject(java.lang.String)",
      "begin_line": 279,
      "end_line": 282,
      "comment": "\n         * Returns the result object produced by the {@code\n         * BackgroundInitializer} with the given name. This is the object\n         * returned by the initializer\u0027s {@code initialize()} method. If this\n         * {@code BackgroundInitializer} caused an exception, \u003cb\u003enull\u003c/b\u003e is\n         * returned. If the name cannot be resolved, an exception is thrown.\n         *\n         * @param name the name of the {@code BackgroundInitializer}\n         * @return the result object produced by this {@code\n         * BackgroundInitializer}\n         * @throws NoSuchElementException if the name cannot be resolved\n         ",
      "child_ranges": [
        "(line 280,col 13)-(line 280,col 28)",
        "(line 281,col 13)-(line 281,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults.isException(java.lang.String)",
      "begin_line": 292,
      "end_line": 295,
      "comment": "\n         * Returns a flag whether the {@code BackgroundInitializer} with the\n         * given name caused an exception.\n         *\n         * @param name the name of the {@code BackgroundInitializer}\n         * @return a flag whether this initializer caused an exception\n         * @throws NoSuchElementException if the name cannot be resolved\n         ",
      "child_ranges": [
        "(line 293,col 13)-(line 293,col 28)",
        "(line 294,col 13)-(line 294,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults.getException(java.lang.String)",
      "begin_line": 307,
      "end_line": 310,
      "comment": "\n         * Returns the {@code ConcurrentException} object that was thrown by the\n         * {@code BackgroundInitializer} with the given name. If this\n         * initializer did not throw an exception, the return value is\n         * \u003cb\u003enull\u003c/b\u003e. If the name cannot be resolved, an exception is thrown.\n         *\n         * @param name the name of the {@code BackgroundInitializer}\n         * @return the exception thrown by this initializer\n         * @throws NoSuchElementException if the name cannot be resolved\n         ",
      "child_ranges": [
        "(line 308,col 13)-(line 308,col 28)",
        "(line 309,col 13)-(line 309,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults.initializerNames()",
      "begin_line": 319,
      "end_line": 321,
      "comment": "\n         * Returns a set with the names of all {@code BackgroundInitializer}\n         * objects managed by the {@code MultiBackgroundInitializer}.\n         *\n         * @return an (unmodifiable) set with the names of the managed {@code\n         * BackgroundInitializer} objects\n         ",
      "child_ranges": [
        "(line 320,col 13)-(line 320,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults.isSuccessful()",
      "begin_line": 329,
      "end_line": 331,
      "comment": "\n         * Returns a flag whether the whole initialization was successful. This\n         * is the case if no child initializer has thrown an exception.\n         *\n         * @return a flag whether the initialization was successful\n         ",
      "child_ranges": [
        "(line 330,col 13)-(line 330,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults.checkName(java.lang.String)",
      "begin_line": 342,
      "end_line": 350,
      "comment": "\n         * Checks whether an initializer with the given name exists. If not,\n         * throws an exception. If it exists, the associated child initializer\n         * is returned.\n         *\n         * @param name the name to check\n         * @return the initializer with this name\n         * @throws NoSuchElementException if the name is unknown\n         ",
      "child_ranges": [
        "(line 343,col 13)-(line 343,col 67)",
        "(line 344,col 13)-(line 347,col 13)",
        "(line 349,col 13)-(line 349,col 24)"
      ]
    }
  ]
}