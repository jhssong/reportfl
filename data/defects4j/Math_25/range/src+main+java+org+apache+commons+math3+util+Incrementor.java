{
  "filepath": "/tmp/Math-25b/src/main/java/org/apache/commons/math3/util/Incrementor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Incrementor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 179,
      "comment": "\n * Utility that increments a counter until a maximum is reached, at\n * which point, the instance will by default throw a\n * {@link MaxCountExceededException}.\n * However, the user is able to override this behaviour by defining a\n * custom {@link MaxCountExceededCallback callback}, in order to e.g.\n * select which exception must be thrown.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "maximalCount"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * Upper limit for the counter.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Current count.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxCountCallback"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Function called at counter exhaustion.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.Incrementor.Incrementor()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Default constructor.\n     * For the new instance to be useful, the maximal count must be set\n     * by calling {@link #setMaximalCount(int) setMaximalCount}.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.Incrementor.Incrementor(int)",
      "begin_line": 61,
      "end_line": 69,
      "comment": "\n     * Defines a maximal count.\n     *\n     * @param max Maximal count.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 68,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Incrementor.Anonymous-4123a3f8-df4f-4050-8fed-d3506b52a423.trigger(int)",
      "begin_line": 65,
      "end_line": 67,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 66,col 22)-(line 66,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.Incrementor.Incrementor(int, org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback)",
      "begin_line": 79,
      "end_line": 86,
      "comment": "\n     * Defines a maximal count and a callback method to be triggered at\n     * counter exhaustion.\n     *\n     * @param max Maximal count.\n     * @param cb Function to be called when the maximal count has been reached.\n     * @throws NullArgumentException if {@code cb} is {@code null}\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 27)",
        "(line 85,col 9)-(line 85,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Incrementor.setMaximalCount(int)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Sets the upper limit for the counter.\n     * This does not automatically reset the current count to zero (see\n     * {@link #resetCount()}).\n     *\n     * @param max Upper limit of the counter.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Incrementor.getMaximalCount()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Gets the upper limit of the counter.\n     *\n     * @return the counter upper limit.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Incrementor.getCount()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Gets the current count.\n     *\n     * @return the current count.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Incrementor.canIncrement()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * Checks whether a single increment is allowed.\n     *\n     * @return {@code false} if the next call to {@link #incrementCount(int)\n     * incrementCount} will trigger a {@code MaxCountExceededException},\n     * {@code true} otherwise.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Incrementor.incrementCount(int)",
      "begin_line": 135,
      "end_line": 139,
      "comment": "\n     * Performs multiple increments.\n     * See the other {@link #incrementCount() incrementCount} method).\n     *\n     * @param value Number of increments.\n     * @throws MaxCountExceededException at counter exhaustion.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 138,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Incrementor.incrementCount()",
      "begin_line": 154,
      "end_line": 158,
      "comment": "\n     * Adds one to the current iteration count.\n     * At counter exhaustion, this method will call the\n     * {@link MaxCountExceededCallback#trigger(int) trigger} method of the\n     * callback object passed to the\n     * {@link #Incrementor(int,MaxCountExceededCallback) constructor}.\n     * If not explictly set, a default callback is used that will throw\n     * a {@code MaxCountExceededException}.\n     *\n     * @throws MaxCountExceededException at counter exhaustion, unless a\n     * custom {@link MaxCountExceededCallback callback} has been set at\n     * construction.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 157,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Incrementor.resetCount()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * Resets the counter to 0.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MaxCountExceededCallback",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 171,
      "end_line": 178,
      "comment": "\n     * Defines a method to be called at counter exhaustion.\n     * The {@link #trigger(int) trigger} method should usually throw an exception.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback.trigger(int)",
      "begin_line": 177,
      "end_line": 177,
      "comment": "\n         * Function called when the maximal count has been reached.\n         *\n         * @param maximalCount Maximal count.\n         ",
      "child_ranges": []
    }
  ]
}