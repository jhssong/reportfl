{
  "filepath": "/tmp/Math-58b/src/main/java/org/apache/commons/math/exception/DimensionMismatchException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DimensionMismatchException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalNumberException"
      ],
      "begin_line": 28,
      "end_line": 67,
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
      "begin_line": 32,
      "end_line": 32,
      "comment": " Correct dimension. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.DimensionMismatchException.DimensionMismatchException(org.apache.commons.math.exception.util.Localizable, int, int)",
      "begin_line": 41,
      "end_line": 48,
      "comment": "\n     * Construct an exception from the mismatched dimensions.\n     *\n     * @param specific Specific context information pattern.\n     * @param wrong Wrong dimension.\n     * @param expected Expected dimension.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 46,col 31)",
        "(line 47,col 9)-(line 47,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.DimensionMismatchException.DimensionMismatchException(int, int)",
      "begin_line": 56,
      "end_line": 59,
      "comment": "\n     * Construct an exception from the mismatched dimensions.\n     *\n     * @param wrong Wrong dimension.\n     * @param expected Expected dimension.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.DimensionMismatchException.getDimension()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * @return the expected dimension.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 25)"
      ]
    }
  ]
}