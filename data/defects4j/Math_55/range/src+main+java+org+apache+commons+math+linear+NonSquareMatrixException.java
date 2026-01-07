{
  "filepath": "/tmp/Math-55b/src/main/java/org/apache/commons/math/linear/NonSquareMatrixException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonSquareMatrixException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.DimensionMismatchException"
      ],
      "begin_line": 28,
      "end_line": 43,
      "comment": "\n * Exception to be thrown when a square matrix is expected.\n *\n * @since 3.0\n * @version $Revision$ $Date$\n "
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
      "signature": "org.apache.commons.math.linear.NonSquareMatrixException.NonSquareMatrixException(int, int)",
      "begin_line": 39,
      "end_line": 42,
      "comment": "\n     * Construct an exception from the mismatched dimensions.\n     *\n     * @param wrong Row dimension.\n     * @param expected Column dimension.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 67)"
      ]
    }
  ]
}