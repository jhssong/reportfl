{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/DimensionMismatchException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DimensionMismatchException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathException"
      ],
      "begin_line": 27,
      "end_line": 65,
      "comment": "\n * Error thrown when two dimensions differ.\n *\n * @since 1.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "dimension1"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " First dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "dimension2"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Second dimension. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.DimensionMismatchException.DimensionMismatchException(int, int)",
      "begin_line": 43,
      "end_line": 47,
      "comment": "\n     * Construct an exception from the mismatched dimensions\n     * @param dimension1 first dimension\n     * @param dimension2 second dimension\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 83)",
        "(line 45,col 9)-(line 45,col 37)",
        "(line 46,col 9)-(line 46,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.DimensionMismatchException.getDimension1()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Get the first dimension\n     * @return first dimension\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.DimensionMismatchException.getDimension2()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Get the second dimension\n     * @return second dimension\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 26)"
      ]
    }
  ]
}