{
  "filepath": "/tmp/Lang-33b/src/main/java/org/apache/commons/lang3/concurrent/MultiBackgroundInitializer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiBackgroundInitializer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.concurrent.BackgroundInitializer\u003corg.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults\u003e"
      ],
      "begin_line": 96,
      "end_line": 340,
      "comment": "\n * \u003cp\u003e\n * A specialized {@link BackgroundInitializer} implementation that can deal with\n * multiple background initialization tasks.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This class has a similar purpose as {@link BackgroundInitializer}. However,\n * it is not limited to a single background initialization task. Rather it\n * manages an arbitrary number of {@code BackgroundInitializer} objects,\n * executes them, and waits until they are completely initialized. This is\n * useful for applications that have to perform multiple initialization tasks\n * that can run in parallel (i.e. that do not depend on each other). This class\n * takes care about the management of an {@code ExecutorService} and shares it\n * with the {@code BackgroundInitializer} objects it is responsible for; so the\n * using application need not bother with these details.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The typical usage scenario for {@code MultiBackgroundInitializer} is as\n * follows:\n * \u003cul\u003e\n * \u003cli\u003eCreate a new instance of the class. Optionally pass in a pre-configured\n * {@code ExecutorService}. Alternatively {@code MultiBackgroundInitializer} can\n * create a temporary {@code ExecutorService} and delete it after initialization\n * is complete.\u003c/li\u003e\n * \u003cli\u003eCreate specialized {@link BackgroundInitializer} objects for the\n * initialization tasks to be performed and add them to the {@code\n * MultiBackgroundInitializer} using the\n * {@link #addInitializer(String, BackgroundInitializer)} method.\u003c/li\u003e\n * \u003cli\u003eAfter all initializers have been added, call the {@link #start()} method.\n * \u003c/li\u003e\n * \u003cli\u003eWhen access to the result objects produced by the {@code\n * BackgroundInitializer} objects is needed call the {@link #get()} method. The\n * object returned here provides access to all result objects created during\n * initialization. It also stores information about exceptions that have\n * occurred.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \u003cp\u003e\n * {@code MultiBackgroundInitializer} starts a special controller task that\n * starts all {@code BackgroundInitializer} objects added to the instance.\n * Before the an initializer is started it is checked whether this initializer\n * already has an {@code ExecutorService} set. If this is the case, this {@code\n * ExecutorService} is used for running the background task. Otherwise the\n * current {@code ExecutorService} of this {@code MultiBackgroundInitializer} is\n * shared with the initializer.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The easiest way of using this class is to let it deal with the management of\n * an {@code ExecutorService} itself: If no external {@code ExecutorService} is\n * provided, the class creates a temporary {@code ExecutorService} (that is\n * capable of executing all background tasks in parallel) and destroys it at the\n * end of background processing.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Alternatively an external {@code ExecutorService} can be provided - either at\n * construction time or later by calling the\n * {@link #setExternalExecutor(ExecutorService)} method. In this case all\n * background tasks are scheduled at this external {@code ExecutorService}.\n * \u003cstrong\u003eImportant note:\u003c/strong\u003e When using an external {@code\n * ExecutorService} be sure that the number of threads managed by the service is\n * large enough. Otherwise a deadlock can happen! This is the case in the\n * following scenario: {@code MultiBackgroundInitializer} starts a task that\n * starts all registered {@code BackgroundInitializer} objects and waits for\n * their completion. If for instance a single threaded {@code ExecutorService}\n * is used, none of the background tasks can be executed, and the task created\n * by {@code MultiBackgroundInitializer} waits forever.\n * \u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "childInitializers"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " A map with the child initializers. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializer()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Creates a new instance of {@code MultiBackgroundInitializer}.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializer(java.util.concurrent.ExecutorService)",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * Creates a new instance of {@code MultiBackgroundInitializer} and\n     * initializes it with the given external {@code ExecutorService}.\n     *\n     * @param exec the {@code ExecutorService} for executing the background\n     * tasks\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.addInitializer(java.lang.String, org.apache.commons.lang3.concurrent.BackgroundInitializer\u003c?\u003e)",
      "begin_line": 132,
      "end_line": 149,
      "comment": "\n     * Adds a new {@code BackgroundInitializer} to this object. When this\n     * {@code MultiBackgroundInitializer} is started, the given initializer will\n     * be processed. This method must not be called after {@link #start()} has\n     * been invoked.\n     *\n     * @param name the name of the initializer (must not be \u003cb\u003enull\u003c/b\u003e)\n     * @param init the {@code BackgroundInitializer} to add (must not be\n     * \u003cb\u003enull\u003c/b\u003e)\n     * @throws IllegalArgumentException if a required parameter is missing\n     * @throws IllegalStateException if {@code start()} has already been called\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 140,col 9)",
        "(line 142,col 9)-(line 148,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.getTaskCount()",
      "begin_line": 161,
      "end_line": 170,
      "comment": "\n     * Returns the number of tasks needed for executing all child {@code\n     * BackgroundInitializer} objects in parallel. This implementation sums up\n     * the required tasks for all child initializers (which is necessary if one\n     * of the child initializers is itself a {@code MultiBackgroundInitializer}\n     * ). Then it adds 1 for the control task that waits for the completion of\n     * the children.\n     *\n     * @return the number of tasks required for background processing\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 23)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 169,col 9)-(line 169,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.initialize()",
      "begin_line": 182,
      "end_line": 213,
      "comment": "\n     * Creates the results object. This implementation starts all child {@code\n     * BackgroundInitializer} objects. Then it collects their results and\n     * creates a {@code MultiBackgroundInitializerResults} object with this\n     * data. If a child initializer throws a checked exceptions, it is added to\n     * the results object. Unchecked exceptions are propagated.\n     *\n     * @return the results object\n     * @throws Exception if an error occurs\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 52)",
        "(line 185,col 9)-(line 189,col 9)",
        "(line 192,col 9)-(line 192,col 51)",
        "(line 193,col 9)-(line 199,col 9)",
        "(line 202,col 9)-(line 202,col 68)",
        "(line 203,col 9)-(line 203,col 94)",
        "(line 204,col 9)-(line 210,col 9)",
        "(line 212,col 9)-(line 212,col 78)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultiBackgroundInitializerResults",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 225,
      "end_line": 339,
      "comment": "\n     * A data class for storing the results of the background initialization\n     * performed by {@code MultiBackgroundInitializer}. Objects of this inner\n     * class are returned by {@link MultiBackgroundInitializer#initialize()}.\n     * They allow access to all result objects produced by the\n     * {@link BackgroundInitializer} objects managed by the owning instance. It\n     * is also possible to retrieve status information about single\n     * {@link BackgroundInitializer}s, i.e. whether they completed normally or\n     * caused an exception.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "initializers"
      ],
      "begin_line": 227,
      "end_line": 227,
      "comment": " A map with the child initializers. "
    },
    {
      "type": "field",
      "varNames": [
        "resultObjects"
      ],
      "begin_line": 230,
      "end_line": 230,
      "comment": " A map with the result objects. "
    },
    {
      "type": "field",
      "varNames": [
        "exceptions"
      ],
      "begin_line": 233,
      "end_line": 233,
      "comment": " A map with the exceptions. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults.MultiBackgroundInitializerResults(java.util.Map\u003cjava.lang.String, org.apache.commons.lang3.concurrent.BackgroundInitializer\u003c?\u003e\u003e, java.util.Map\u003cjava.lang.String, java.lang.Object\u003e, java.util.Map\u003cjava.lang.String, org.apache.commons.lang3.concurrent.ConcurrentException\u003e)",
      "begin_line": 244,
      "end_line": 251,
      "comment": "\n         * Creates a new instance of {@code MultiBackgroundInitializerResults}\n         * and initializes it with maps for the {@code BackgroundInitializer}\n         * objects, their result objects and the exceptions thrown by them.\n         *\n         * @param inits the {@code BackgroundInitializer} objects\n         * @param results the result objects\n         * @param excepts the exceptions\n         ",
      "child_ranges": [
        "(line 248,col 13)-(line 248,col 33)",
        "(line 249,col 13)-(line 249,col 36)",
        "(line 250,col 13)-(line 250,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults.getInitializer(java.lang.String)",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\n         * Returns the {@code BackgroundInitializer} with the given name. If the\n         * name cannot be resolved, an exception is thrown.\n         *\n         * @param name the name of the {@code BackgroundInitializer}\n         * @return the {@code BackgroundInitializer} with this name\n         * @throws NoSuchElementException if the name cannot be resolved\n         ",
      "child_ranges": [
        "(line 262,col 13)-(line 262,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults.getResultObject(java.lang.String)",
      "begin_line": 277,
      "end_line": 280,
      "comment": "\n         * Returns the result object produced by the {@code\n         * BackgroundInitializer} with the given name. This is the object\n         * returned by the initializer\u0027s {@code initialize()} method. If this\n         * {@code BackgroundInitializer} caused an exception, \u003cb\u003enull\u003c/b\u003e is\n         * returned. If the name cannot be resolved, an exception is thrown.\n         *\n         * @param name the name of the {@code BackgroundInitializer}\n         * @return the result object produced by this {@code\n         * BackgroundInitializer}\n         * @throws NoSuchElementException if the name cannot be resolved\n         ",
      "child_ranges": [
        "(line 278,col 13)-(line 278,col 28)",
        "(line 279,col 13)-(line 279,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults.isException(java.lang.String)",
      "begin_line": 290,
      "end_line": 293,
      "comment": "\n         * Returns a flag whether the {@code BackgroundInitializer} with the\n         * given name caused an exception.\n         *\n         * @param name the name of the {@code BackgroundInitializer}\n         * @return a flag whether this initializer caused an exception\n         * @throws NoSuchElementException if the name cannot be resolved\n         ",
      "child_ranges": [
        "(line 291,col 13)-(line 291,col 28)",
        "(line 292,col 13)-(line 292,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults.getException(java.lang.String)",
      "begin_line": 305,
      "end_line": 308,
      "comment": "\n         * Returns the {@code ConcurrentException} object that was thrown by the\n         * {@code BackgroundInitializer} with the given name. If this\n         * initializer did not throw an exception, the return value is\n         * \u003cb\u003enull\u003c/b\u003e. If the name cannot be resolved, an exception is thrown.\n         *\n         * @param name the name of the {@code BackgroundInitializer}\n         * @return the exception thrown by this initializer\n         * @throws NoSuchElementException if the name cannot be resolved\n         ",
      "child_ranges": [
        "(line 306,col 13)-(line 306,col 28)",
        "(line 307,col 13)-(line 307,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults.initializerNames()",
      "begin_line": 317,
      "end_line": 319,
      "comment": "\n         * Returns a set with the names of all {@code BackgroundInitializer}\n         * objects managed by the {@code MultiBackgroundInitializer}.\n         *\n         * @return an (unmodifiable) set with the names of the managed {@code\n         * BackgroundInitializer} objects\n         ",
      "child_ranges": [
        "(line 318,col 13)-(line 318,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults.checkName(java.lang.String)",
      "begin_line": 330,
      "end_line": 338,
      "comment": "\n         * Checks whether an initializer with the given name exists. If not,\n         * throws an exception. If it exists, the associated child initializer\n         * is returned.\n         *\n         * @param name the name to check\n         * @return the initializer with this name\n         * @throws NoSuchElementException if the name is unknown\n         ",
      "child_ranges": [
        "(line 331,col 13)-(line 331,col 67)",
        "(line 332,col 13)-(line 335,col 13)",
        "(line 337,col 13)-(line 337,col 24)"
      ]
    }
  ]
}