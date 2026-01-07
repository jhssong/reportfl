{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/exception/NonMonotonousSequenceException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonMonotonousSequenceException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalNumberException"
      ],
      "begin_line": 29,
      "end_line": 123,
      "comment": "\n * Exception to be thrown when the a sequence of values is not monotonously\n * increasing or decreasing.\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serializable version Id. "
    },
    {
      "type": "field",
      "varNames": [
        "direction"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * Direction (positive for increasing, negative for decreasing).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "strict"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Whether the sequence must be strictly increasing or decreasing.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Index of the wrong value.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "previous"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Previous value.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.NonMonotonousSequenceException.NonMonotonousSequenceException(java.lang.Number, java.lang.Number, int)",
      "begin_line": 60,
      "end_line": 64,
      "comment": "\n     * Construct the exception.\n     * This constructor uses default values assuming that the sequence should\n     * have been strictly increasing.\n     *\n     * @param wrong Value that did not match the requirements.\n     * @param previous Previous value in the sequence.\n     * @param index Index of the value that did not match the requirements.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 80)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.NonMonotonousSequenceException.NonMonotonousSequenceException(java.lang.Number, java.lang.Number, int, org.apache.commons.math.util.MathUtils.OrderDirection, boolean)",
      "begin_line": 77,
      "end_line": 95,
      "comment": "\n     * Construct the exception.\n     *\n     * @param wrong Value that did not match the requirements.\n     * @param previous Previous value in the sequence.\n     * @param index Index of the value that did not match the requirements.\n     * @param direction Strictly positive for a sequence required to be\n     * increasing, negative (or zero) for a decreasing sequence.\n     * @param strict Whether the sequence must be strictly increasing or\n     * decreasing.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 89,col 49)",
        "(line 91,col 9)-(line 91,col 35)",
        "(line 92,col 9)-(line 92,col 29)",
        "(line 93,col 9)-(line 93,col 27)",
        "(line 94,col 9)-(line 94,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NonMonotonousSequenceException.getDirection()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * @return the order direction.\n     *",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NonMonotonousSequenceException.getStrict()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * @return {@code true} is the sequence should be strictly monotonous.\n     *",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NonMonotonousSequenceException.getIndex()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Get the index of the wrong value.\n     *\n     * @return the current index.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NonMonotonousSequenceException.getPrevious()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * @return the previous value.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 24)"
      ]
    }
  ]
}