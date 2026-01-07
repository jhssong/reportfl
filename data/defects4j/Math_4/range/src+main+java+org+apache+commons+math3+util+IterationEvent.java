{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/util/IterationEvent.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IterationEvent",
      "is_interface": false,
      "parent_types": [
        "java.util.EventObject"
      ],
      "begin_line": 27,
      "end_line": 56,
      "comment": "\n * The root class from which all events occurring while running an\n * {@link IterationManager} should be derived.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " The number of iterations performed so far. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.IterationEvent.IterationEvent(java.lang.Object, int)",
      "begin_line": 42,
      "end_line": 45,
      "comment": "\n     * Creates a new instance of this class.\n     *\n     * @param source the iterative algorithm on which the event initially\n     * occurred\n     * @param iterations the number of iterations performed at the time\n     * {@code this} event is created\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 22)",
        "(line 44,col 9)-(line 44,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.IterationEvent.getIterations()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Returns the number of iterations performed at the time {@code this} event\n     * is created.\n     *\n     * @return the number of iterations performed\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 26)"
      ]
    }
  ]
}