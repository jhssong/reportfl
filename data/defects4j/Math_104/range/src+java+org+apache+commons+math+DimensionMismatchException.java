{
  "filepath": "/tmp/Math-104b/src/java/org/apache/commons/math/DimensionMismatchException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DimensionMismatchException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathException"
      ],
      "begin_line": 23,
      "end_line": 64,
      "comment": "\n * Error thrown when two dimensions differ.\n * @version $Revision:$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.DimensionMismatchException.DimensionMismatchException(int, int)",
      "begin_line": 33,
      "end_line": 40,
      "comment": "\n     * Construct an exception from the mismatched dimensions\n     * @param dimension1 first dimension\n     * @param dimension2 second dimension\n     ",
      "child_ranges": [
        "(line 34,col 9)-(line 37,col 17)",
        "(line 38,col 9)-(line 38,col 37)",
        "(line 39,col 9)-(line 39,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.DimensionMismatchException.getDimension1()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Get the first dimension\n     * @return first dimension\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.DimensionMismatchException.getDimension2()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Get the second dimension\n     * @return second dimension\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 26)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "dimension1"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " First dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "dimension2"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Second dimension. "
    }
  ]
}