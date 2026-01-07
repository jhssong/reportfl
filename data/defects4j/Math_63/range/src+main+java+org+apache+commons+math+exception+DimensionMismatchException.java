{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/exception/DimensionMismatchException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DimensionMismatchException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalNumberException"
      ],
      "begin_line": 27,
      "end_line": 53,
      "comment": "\n * Exception to be thrown when two dimensions differ.\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
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
        "dimension"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Correct dimension. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.DimensionMismatchException.DimensionMismatchException(int, int)",
      "begin_line": 41,
      "end_line": 45,
      "comment": "\n     * Construct an exception from the mismatched dimensions.\n     *\n     * @param wrong Wrong dimension.\n     * @param expected Expected dimension.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 76)",
        "(line 44,col 9)-(line 44,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.DimensionMismatchException.getDimension()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * @return the expected dimension.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 25)"
      ]
    }
  ]
}