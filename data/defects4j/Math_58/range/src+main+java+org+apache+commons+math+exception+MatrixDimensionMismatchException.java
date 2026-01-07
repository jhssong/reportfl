{
  "filepath": "/tmp/Math-58b/src/main/java/org/apache/commons/math/exception/MatrixDimensionMismatchException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MatrixDimensionMismatchException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MultiDimensionMismatchException"
      ],
      "begin_line": 28,
      "end_line": 73,
      "comment": "\n * Exception to be thrown when either the number of rows or the number of\n * columns of a matrix do not match the expected values.\n *\n * @since 3.0\n * @version $Revision$ $Date$\n "
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
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MatrixDimensionMismatchException.MatrixDimensionMismatchException(int, int, int, int)",
      "begin_line": 40,
      "end_line": 47,
      "comment": "\n     * Construct an exception from the mismatched dimensions.\n     *\n     * @param wrongRowDim Wrong row dimension.\n     * @param wrongColDim Wrong column dimension.\n     * @param expectedRowDim Expected row dimension.\n     * @param expectedColDim Expected column dimension.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 46,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MatrixDimensionMismatchException.getWrongRowDimension()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * @return the expected row dimension.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MatrixDimensionMismatchException.getExpectedRowDimension()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * @return the expected row dimension.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MatrixDimensionMismatchException.getWrongColumnDimension()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * @return the wrong column dimension.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MatrixDimensionMismatchException.getExpectedColumnDimension()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * @return the expected column dimension.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 39)"
      ]
    }
  ]
}