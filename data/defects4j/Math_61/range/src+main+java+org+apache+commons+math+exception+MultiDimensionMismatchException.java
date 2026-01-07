{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/exception/MultiDimensionMismatchException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiDimensionMismatchException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalArgumentException"
      ],
      "begin_line": 28,
      "end_line": 76,
      "comment": "\n * Exception to be thrown when two sets of dimensions differ.\n *\n * @since 3.0\n * @version $Revision$ $Date$\n "
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
      "signature": "org.apache.commons.math.exception.MultiDimensionMismatchException.MultiDimensionMismatchException(java.lang.Integer[], java.lang.Integer[])",
      "begin_line": 43,
      "end_line": 46,
      "comment": "\n     * Construct an exception from the mismatched dimensions.\n     *\n     * @param wrong Wrong dimensionq.\n     * @param expected Expected dimensionq.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MultiDimensionMismatchException.MultiDimensionMismatchException(org.apache.commons.math.exception.util.Localizable, java.lang.Integer[], java.lang.Integer[])",
      "begin_line": 56,
      "end_line": 62,
      "comment": "\n     * Construct an exception from the mismatched dimensions.\n     *\n     * @param specific Message pattern providing the specific context of\n     * the error.\n     * @param wrong Wrong dimensions.\n     * @param expected Expected dimensions.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 79)",
        "(line 60,col 9)-(line 60,col 35)",
        "(line 61,col 9)-(line 61,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MultiDimensionMismatchException.getWrongDimensions()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * @return a reference to the array containing the wrong dimensions.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MultiDimensionMismatchException.getExpectedDimensions()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * @return a reference to the array containing the expected dimensions.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 24)"
      ]
    }
  ]
}