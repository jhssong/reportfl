{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/exception/MultiDimensionMismatchException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiDimensionMismatchException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.exception.MathIllegalArgumentException"
      ],
      "begin_line": 28,
      "end_line": 91,
      "comment": "\n * Exception to be thrown when two sets of dimensions differ.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " Serializable version Id. "
    },
    {
      "type": "field",
      "varNames": [
        "wrong"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Wrong dimensions. "
    },
    {
      "type": "field",
      "varNames": [
        "expected"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Correct dimensions. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.exception.MultiDimensionMismatchException.MultiDimensionMismatchException(java.lang.Integer[], java.lang.Integer[])",
      "begin_line": 43,
      "end_line": 46,
      "comment": "\n     * Construct an exception from the mismatched dimensions.\n     *\n     * @param wrong Wrong dimensions.\n     * @param expected Expected dimensions.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.exception.MultiDimensionMismatchException.MultiDimensionMismatchException(org.apache.commons.math3.exception.util.Localizable, java.lang.Integer[], java.lang.Integer[])",
      "begin_line": 56,
      "end_line": 62,
      "comment": "\n     * Construct an exception from the mismatched dimensions.\n     *\n     * @param specific Message pattern providing the specific context of\n     * the error.\n     * @param wrong Wrong dimensions.\n     * @param expected Expected dimensions.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 41)",
        "(line 60,col 9)-(line 60,col 35)",
        "(line 61,col 9)-(line 61,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.MultiDimensionMismatchException.getWrongDimensions()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * @return an array containing the wrong dimensions.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.MultiDimensionMismatchException.getExpectedDimensions()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * @return an array containing the expected dimensions.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.MultiDimensionMismatchException.getWrongDimension(int)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * @param index Dimension index.\n     * @return the wrong dimension stored at {@code index}.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.MultiDimensionMismatchException.getExpectedDimension(int)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * @param index Dimension index.\n     * @return the expected dimension stored at {@code index}.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 31)"
      ]
    }
  ]
}