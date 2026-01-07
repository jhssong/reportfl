{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/util/IterationListener.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IterationListener",
      "is_interface": true,
      "parent_types": [
        "java.util.EventListener"
      ],
      "begin_line": 27,
      "end_line": 58,
      "comment": "\n * The listener interface for receiving events occurring in an iterative\n * algorithm.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.IterationListener.initializationPerformed(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * Invoked after completion of the initial phase of the iterative algorithm\n     * (prior to the main iteration loop).\n     *\n     * @param e The {@link IterationEvent} object.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.IterationListener.iterationPerformed(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Invoked each time an iteration is completed (in the main iteration loop).\n     *\n     * @param e The {@link IterationEvent} object.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.IterationListener.iterationStarted(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Invoked each time a new iteration is completed (in the main iteration\n     * loop).\n     *\n     * @param e The {@link IterationEvent} object.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.IterationListener.terminationPerformed(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Invoked after completion of the operations which occur after breaking out\n     * of the main iteration loop.\n     *\n     * @param e The {@link IterationEvent} object.\n     ",
      "child_ranges": []
    }
  ]
}