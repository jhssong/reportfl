{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/util/Incrementor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Incrementor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 95,
      "comment": "\n * Utility that increments a counter until a maximum is reached, at which\n * point it will throw an exception.\n *\n * @version $Revision$ $Date$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "maximalCount"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": "\n     * Upper limit for the counter.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * Current count.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Incrementor.setMaximalCount(int)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Set the upper limit for the counter.\n     *\n     * @param max Upper limit of the counter.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Incrementor.getMaximalCount()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Get the upper limit of the counter.\n     *\n     * @return the counter upper limit.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Incrementor.getCount()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Get the current count.\n     *\n     * @return the current count.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Incrementor.incrementCount(int)",
      "begin_line": 72,
      "end_line": 76,
      "comment": "\n     * Perform multiple increments.\n     * See the other {@link #incrementCount() incrementCount} method).\n     *\n     * @param value Number of increments.\n     * @throws MaxCountExceededException at counter exhaustion.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 75,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Incrementor.incrementCount()",
      "begin_line": 83,
      "end_line": 87,
      "comment": "\n     * Add one to the current iteration count.\n     *\n     * @throws MaxCountExceededException at counter exhaustion.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 86,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Incrementor.resetCount()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Reset the counter to 0.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 18)"
      ]
    }
  ]
}