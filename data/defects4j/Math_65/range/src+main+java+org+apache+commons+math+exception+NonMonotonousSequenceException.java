{
  "filepath": "/tmp/Math-65b/src/main/java/org/apache/commons/math/exception/NonMonotonousSequenceException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonMonotonousSequenceException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalNumberException"
      ],
      "begin_line": 28,
      "end_line": 122,
      "comment": "\n * Exception to be thrown when the a sequence of values is not monotonously\n * increasing or decreasing.\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
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
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * Direction (positive for increasing, negative for decreasing).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "strict"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Whether the sequence must be strictly increasing or decreasing.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Index of the wrong value.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "previous"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Previous value.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.NonMonotonousSequenceException.NonMonotonousSequenceException(java.lang.Number, java.lang.Number, int)",
      "begin_line": 59,
      "end_line": 63,
      "comment": "\n     * Construct the exception.\n     * This constructor uses default values assuming that the sequence should\n     * have been strictly increasing.\n     *\n     * @param wrong Value that did not match the requirements.\n     * @param previous Previous value in the sequence.\n     * @param index Index of the value that did not match the requirements.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 80)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.NonMonotonousSequenceException.NonMonotonousSequenceException(java.lang.Number, java.lang.Number, int, org.apache.commons.math.util.MathUtils.OrderDirection, boolean)",
      "begin_line": 76,
      "end_line": 94,
      "comment": "\n     * Construct the exception.\n     *\n     * @param wrong Value that did not match the requirements.\n     * @param previous Previous value in the sequence.\n     * @param index Index of the value that did not match the requirements.\n     * @param direction Strictly positive for a sequence required to be\n     * increasing, negative (or zero) for a decreasing sequence.\n     * @param strict Whether the sequence must be strictly increasing or\n     * decreasing.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 88,col 49)",
        "(line 90,col 9)-(line 90,col 35)",
        "(line 91,col 9)-(line 91,col 29)",
        "(line 92,col 9)-(line 92,col 27)",
        "(line 93,col 9)-(line 93,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NonMonotonousSequenceException.getDirection()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * @return the order direction.\n     *",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NonMonotonousSequenceException.getStrict()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * @return {@code true} is the sequence should be strictly monotonous.\n     *",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NonMonotonousSequenceException.getIndex()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Get the index of the wrong value.\n     *\n     * @return the current index.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NonMonotonousSequenceException.getPrevious()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * @return the previous value.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 24)"
      ]
    }
  ]
}