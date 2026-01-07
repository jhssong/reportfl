{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/MatrixDimensionMismatchException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MatrixDimensionMismatchException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.exception.MultiDimensionMismatchException"
      ],
      "begin_line": 29,
      "end_line": 74,
      "comment": "\n * Exception to be thrown when either the number of rows or the number of\n * columns of a matrix do not match the expected values.\n *\n * @since 3.0\n * @version $Id$\n "
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
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.MatrixDimensionMismatchException.MatrixDimensionMismatchException(int, int, int, int)",
      "begin_line": 41,
      "end_line": 48,
      "comment": "\n     * Construct an exception from the mismatched dimensions.\n     *\n     * @param wrongRowDim Wrong row dimension.\n     * @param wrongColDim Wrong column dimension.\n     * @param expectedRowDim Expected row dimension.\n     * @param expectedColDim Expected column dimension.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 47,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixDimensionMismatchException.getWrongRowDimension()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * @return the expected row dimension.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixDimensionMismatchException.getExpectedRowDimension()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * @return the expected row dimension.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixDimensionMismatchException.getWrongColumnDimension()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * @return the wrong column dimension.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixDimensionMismatchException.getExpectedColumnDimension()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * @return the expected column dimension.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 39)"
      ]
    }
  ]
}