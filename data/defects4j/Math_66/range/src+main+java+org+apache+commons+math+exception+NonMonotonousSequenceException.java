{
  "filepath": "/tmp/Math-66b/src/main/java/org/apache/commons/math/exception/NonMonotonousSequenceException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonMonotonousSequenceException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalNumberException"
      ],
      "begin_line": 29,
      "end_line": 119,
      "comment": "\n * Exception to be thrown when the a sequence of values is not monotonously\n * increasing or decreasing.\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "direction"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": "\n     * Direction (positive for increasing, negative for decreasing).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "strict"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * Whether the sequence must be strictly increasing or decreasing.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Index of the wrong value.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "previous"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Previous value.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.NonMonotonousSequenceException.NonMonotonousSequenceException(java.lang.Number, java.lang.Number, int)",
      "begin_line": 56,
      "end_line": 60,
      "comment": "\n     * Construct the exception.\n     * This constructor uses default values assuming that the sequence should\n     * have been strictly increasing.\n     *\n     * @param wrong Value that did not match the requirements.\n     * @param previous Previous value in the sequence.\n     * @param index Index of the value that did not match the requirements.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 81)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.NonMonotonousSequenceException.NonMonotonousSequenceException(java.lang.Number, java.lang.Number, int, org.apache.commons.math.util.MathUtils.Order.Direction, boolean)",
      "begin_line": 73,
      "end_line": 91,
      "comment": "\n     * Construct the exception.\n     *\n     * @param wrong Value that did not match the requirements.\n     * @param previous Previous value in the sequence.\n     * @param index Index of the value that did not match the requirements.\n     * @param direction Strictly positive for a sequence required to be\n     * increasing, negative (or zero) for a decreasing sequence.\n     * @param strict Whether the sequence must be strictly increasing or\n     * decreasing.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 85,col 49)",
        "(line 87,col 9)-(line 87,col 35)",
        "(line 88,col 9)-(line 88,col 29)",
        "(line 89,col 9)-(line 89,col 27)",
        "(line 90,col 9)-(line 90,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NonMonotonousSequenceException.getDirection()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * @return the order direction.\n     *",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NonMonotonousSequenceException.getStrict()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * @return {@code true} is the sequence should be strictly monotonous.\n     *",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NonMonotonousSequenceException.getIndex()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Get the index of the wrong value.\n     *\n     * @return the current index.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NonMonotonousSequenceException.getPrevious()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * @return the previous value.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 24)"
      ]
    }
  ]
}