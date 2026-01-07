{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/exception/NonMonotonicSequenceException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonMonotonicSequenceException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.exception.MathIllegalNumberException"
      ],
      "begin_line": 29,
      "end_line": 121,
      "comment": "\n * Exception to be thrown when the a sequence of values is not monotonically\n * increasing or decreasing.\n *\n * @since 2.2 (name changed to \"NonMonotonicSequenceException\" in 3.0)\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Serializable version Id. "
    },
    {
      "type": "field",
      "varNames": [
        "direction"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * Direction (positive for increasing, negative for decreasing).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "strict"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Whether the sequence must be strictly increasing or decreasing.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Index of the wrong value.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "previous"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Previous value.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.exception.NonMonotonicSequenceException.NonMonotonicSequenceException(java.lang.Number, java.lang.Number, int)",
      "begin_line": 58,
      "end_line": 62,
      "comment": "\n     * Construct the exception.\n     * This constructor uses default values assuming that the sequence should\n     * have been strictly increasing.\n     *\n     * @param wrong Value that did not match the requirements.\n     * @param previous Previous value in the sequence.\n     * @param index Index of the value that did not match the requirements.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 81)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.exception.NonMonotonicSequenceException.NonMonotonicSequenceException(java.lang.Number, java.lang.Number, int, org.apache.commons.math3.util.MathArrays.OrderDirection, boolean)",
      "begin_line": 75,
      "end_line": 93,
      "comment": "\n     * Construct the exception.\n     *\n     * @param wrong Value that did not match the requirements.\n     * @param previous Previous value in the sequence.\n     * @param index Index of the value that did not match the requirements.\n     * @param direction Strictly positive for a sequence required to be\n     * increasing, negative (or zero) for a decreasing sequence.\n     * @param strict Whether the sequence must be strictly increasing or\n     * decreasing.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 87,col 49)",
        "(line 89,col 9)-(line 89,col 35)",
        "(line 90,col 9)-(line 90,col 29)",
        "(line 91,col 9)-(line 91,col 27)",
        "(line 92,col 9)-(line 92,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.NonMonotonicSequenceException.getDirection()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * @return the order direction.\n     *",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.NonMonotonicSequenceException.getStrict()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * @return {@code true} is the sequence should be strictly monotonic.\n     *",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.NonMonotonicSequenceException.getIndex()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Get the index of the wrong value.\n     *\n     * @return the current index.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.NonMonotonicSequenceException.getPrevious()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * @return the previous value.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 24)"
      ]
    }
  ]
}