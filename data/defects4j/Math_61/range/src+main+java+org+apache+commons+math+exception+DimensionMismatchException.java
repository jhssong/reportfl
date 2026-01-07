{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/exception/DimensionMismatchException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DimensionMismatchException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalNumberException"
      ],
      "begin_line": 27,
      "end_line": 55,
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
      "end_line": 47,
      "comment": "\n     * Construct an exception from the mismatched dimensions.\n     *\n     * @param wrong Wrong dimension.\n     * @param expected Expected dimension.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 45,col 31)",
        "(line 46,col 9)-(line 46,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.DimensionMismatchException.getDimension()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * @return the expected dimension.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 25)"
      ]
    }
  ]
}