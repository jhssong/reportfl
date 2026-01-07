{
  "filepath": "/tmp/Math-66b/src/main/java/org/apache/commons/math/exception/DimensionMismatchException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DimensionMismatchException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalNumberException"
      ],
      "begin_line": 27,
      "end_line": 49,
      "comment": "\n * Exception to be thrown when two dimensions differ.\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " Correct dimension. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.DimensionMismatchException.DimensionMismatchException(int, int)",
      "begin_line": 37,
      "end_line": 41,
      "comment": "\n     * Construct an exception from the mismatched dimensions.\n     *\n     * @param wrong Wrong dimension.\n     * @param expected Expected dimension.\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 76)",
        "(line 40,col 9)-(line 40,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.DimensionMismatchException.getDimension()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * @return the expected dimension.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 25)"
      ]
    }
  ]
}