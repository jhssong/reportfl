{
  "filepath": "/tmp/Math-43b/src/main/java/org/apache/commons/math/util/Incrementor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Incrementor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 174,
      "comment": "\n * Utility that increments a counter until a maximum is reached, at\n * which point, the instance will by default throw a\n * {@link MaxCountExceededException}.\n * However, the user is able to override this behaviour by defining a\n * custom {@link MaxCountExceededCallback callback}, in order to e.g.\n * select which exception must be thrown.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "maximalCount"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * Upper limit for the counter.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Current count.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxCountCallback"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Function called at counter exhaustion.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.Incrementor.Incrementor()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Default constructor.\n     * For the new instance to be useful, the maximal count must be set\n     * by calling {@link #setMaximalCount(int) setMaximalCount}.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.Incrementor.Incrementor(int)",
      "begin_line": 60,
      "end_line": 68,
      "comment": "\n     * Defines a maximal count.\n     *\n     * @param max Maximal count.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 67,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Incrementor.Anonymous-6007ae3d-037e-4c35-936a-d3b6ae77ac6c.trigger(int)",
      "begin_line": 64,
      "end_line": 66,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 65,col 22)-(line 65,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.Incrementor.Incrementor(int, org.apache.commons.math.util.Incrementor.MaxCountExceededCallback)",
      "begin_line": 77,
      "end_line": 81,
      "comment": "\n     * Defines a maximal count and a callback method to be triggered at\n     * counter exhaustion.\n     *\n     * @param max Maximal count.\n     * @param cb Function to be called when the maximal count has been reached.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 27)",
        "(line 80,col 9)-(line 80,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Incrementor.setMaximalCount(int)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Sets the upper limit for the counter.\n     * This does not automatically reset the current count to zero (see\n     * {@link #resetCount()}).\n     *\n     * @param max Upper limit of the counter.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Incrementor.getMaximalCount()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Gets the upper limit of the counter.\n     *\n     * @return the counter upper limit.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Incrementor.getCount()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Gets the current count.\n     *\n     * @return the current count.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Incrementor.canIncrement()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * Checks whether a single increment is allowed.\n     *\n     * @return {@code false} if the next call to {@link #incrementCount(int)\n     * incrementCount} will trigger a {@code MaxCountExceededException},\n     * {@code true} otherwise.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Incrementor.incrementCount(int)",
      "begin_line": 130,
      "end_line": 134,
      "comment": "\n     * Performs multiple increments.\n     * See the other {@link #incrementCount() incrementCount} method).\n     *\n     * @param value Number of increments.\n     * @throws MaxCountExceededException at counter exhaustion.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 133,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Incrementor.incrementCount()",
      "begin_line": 149,
      "end_line": 153,
      "comment": "\n     * Adds one to the current iteration count.\n     * At counter exhaustion, this method will call the\n     * {@link MaxCountExceededCallback#trigger(int) trigger} method of the\n     * callback object passed to the\n     * {@link #Incrementor(int,MaxCountExceededCallback) constructor}.\n     * If not explictly set, a default callback is used that will throw\n     * a {@code MaxCountExceededException}.\n     *\n     * @throws MaxCountExceededException at counter exhaustion, unless a\n     * custom {@link MaxCountExceededCallback callback} has been set at\n     * construction.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 152,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Incrementor.resetCount()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * Resets the counter to 0.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MaxCountExceededCallback",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 166,
      "end_line": 173,
      "comment": "\n     * Defines a method to be called at counter exhaustion.\n     * The {@link #trigger(int) trigger} method should usually throw an exception.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Incrementor.MaxCountExceededCallback.trigger(int)",
      "begin_line": 172,
      "end_line": 172,
      "comment": "\n         * Function called when the maximal count has been reached.\n         *\n         * @param maximalCount Maximal count.\n         ",
      "child_ranges": []
    }
  ]
}