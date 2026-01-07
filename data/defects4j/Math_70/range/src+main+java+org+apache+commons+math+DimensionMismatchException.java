{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/DimensionMismatchException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DimensionMismatchException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathException"
      ],
      "begin_line": 25,
      "end_line": 63,
      "comment": "\n * Error thrown when two dimensions differ.\n *\n * @since 1.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "dimension1"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " First dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "dimension2"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Second dimension. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.DimensionMismatchException.DimensionMismatchException(int, int)",
      "begin_line": 41,
      "end_line": 45,
      "comment": "\n     * Construct an exception from the mismatched dimensions\n     * @param dimension1 first dimension\n     * @param dimension2 second dimension\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 71)",
        "(line 43,col 9)-(line 43,col 37)",
        "(line 44,col 9)-(line 44,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.DimensionMismatchException.getDimension1()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Get the first dimension\n     * @return first dimension\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.DimensionMismatchException.getDimension2()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Get the second dimension\n     * @return second dimension\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 26)"
      ]
    }
  ]
}