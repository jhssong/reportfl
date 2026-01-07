{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/exception/DimensionMismatchException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DimensionMismatchException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.exception.MathIllegalNumberException"
      ],
      "begin_line": 28,
      "end_line": 65,
      "comment": "\n * Exception to be thrown when two dimensions differ.\n *\n * @since 2.2\n * @version $Id$\n "
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
      "signature": "org.apache.commons.math3.exception.DimensionMismatchException.DimensionMismatchException(org.apache.commons.math3.exception.util.Localizable, int, int)",
      "begin_line": 41,
      "end_line": 46,
      "comment": "\n     * Construct an exception from the mismatched dimensions.\n     *\n     * @param specific Specific context information pattern.\n     * @param wrong Wrong dimension.\n     * @param expected Expected dimension.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 41)",
        "(line 45,col 9)-(line 45,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.exception.DimensionMismatchException.DimensionMismatchException(int, int)",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\n     * Construct an exception from the mismatched dimensions.\n     *\n     * @param wrong Wrong dimension.\n     * @param expected Expected dimension.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.DimensionMismatchException.getDimension()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * @return the expected dimension.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 25)"
      ]
    }
  ]
}