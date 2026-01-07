{
  "filepath": "/tmp/Math-31b/src/main/java/org/apache/commons/math3/util/IterationManager.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IterationManager",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 159,
      "comment": "\n * This abstract class provides a general framework for managing iterative\n * algorithms. The maximum number of iterations can be set, and methods are\n * provided to monitor the current iteration count. A lightweight event\n * framework is also provided.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Keeps a count of the number of iterations. "
    },
    {
      "type": "field",
      "varNames": [
        "listeners"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The collection of all listeners attached to this iterative algorithm. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.IterationManager.IterationManager(int)",
      "begin_line": 45,
      "end_line": 49,
      "comment": "\n     * Creates a new instance of this class.\n     *\n     * @param maxIterations Maximum number of iterations.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 44)",
        "(line 47,col 9)-(line 47,col 55)",
        "(line 48,col 9)-(line 48,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.IterationManager.addIterationListener(org.apache.commons.math3.util.IterationListener)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Attaches a listener to this manager.\n     *\n     * @param listener A {@code IterationListener} object.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.IterationManager.fireInitializationEvent(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 66,
      "end_line": 70,
      "comment": "\n     * Informs all registered listeners that the initial phase (prior to the\n     * main iteration loop) has been completed.\n     *\n     * @param e The {@link IterationEvent} object.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 69,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.IterationManager.fireIterationPerformedEvent(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 78,
      "end_line": 82,
      "comment": "\n     * Informs all registered listeners that a new iteration (in the main\n     * iteration loop) has been performed.\n     *\n     * @param e The {@link IterationEvent} object.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 81,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.IterationManager.fireIterationStartedEvent(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 90,
      "end_line": 94,
      "comment": "\n     * Informs all registered listeners that a new iteration (in the main\n     * iteration loop) has been started.\n     *\n     * @param e The {@link IterationEvent} object.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 93,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.IterationManager.fireTerminationEvent(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 102,
      "end_line": 106,
      "comment": "\n     * Informs all registered listeners that the final phase (post-iterations)\n     * has been completed.\n     *\n     * @param e The {@link IterationEvent} object.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 105,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.IterationManager.getIterations()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Returns the number of iterations of this solver, 0 if no iterations has\n     * been performed yet.\n     *\n     * @return the number of iterations.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.IterationManager.getMaxIterations()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * Returns the maximum number of iterations.\n     *\n     * @return the maximum number of iterations.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.IterationManager.incrementIterationCount()",
      "begin_line": 135,
      "end_line": 138,
      "comment": "\n     * Increments the iteration count by one, and throws an exception if the\n     * maximum number of iterations is reached. This method should be called at\n     * the beginning of a new iteration.\n     *\n     * @throws MaxCountExceededException if the maximum number of iterations is\n     * reached.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.IterationManager.removeIterationListener(org.apache.commons.math3.util.IterationListener)",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * Removes the specified iteration listener from the list of listeners\n     * currently attached to {@code this} object. Attempting to remove a\n     * listener which was \u003cem\u003enot\u003c/em\u003e previously registered does not cause any\n     * error.\n     *\n     * @param listener The {@link IterationListener} to be removed.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.IterationManager.resetIterationCount()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * Sets the iteration count to 0. This method must be called during the\n     * initial phase.\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 32)"
      ]
    }
  ]
}