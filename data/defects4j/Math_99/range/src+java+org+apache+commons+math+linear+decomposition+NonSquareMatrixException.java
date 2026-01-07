{
  "filepath": "/tmp/Math-99b/src/java/org/apache/commons/math/linear/decomposition/NonSquareMatrixException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonSquareMatrixException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.InvalidMatrixException"
      ],
      "begin_line": 27,
      "end_line": 42,
      "comment": "\n * Thrown when an operation defined only for square matrices is applied to non-square ones.\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.decomposition.NonSquareMatrixException.NonSquareMatrixException(int, int)",
      "begin_line": 37,
      "end_line": 40,
      "comment": "\n     * Construct an exception with the given message.\n     * @param rows number of rows of the faulty matrix\n     * @param columns number of columns of the faulty matrix\n     ",
      "child_ranges": [
        "(line 38,col 9)-(line 39,col 46)"
      ]
    }
  ]
}