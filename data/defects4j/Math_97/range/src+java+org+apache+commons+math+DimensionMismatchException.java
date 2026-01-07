{
  "filepath": "/tmp/Math-97b/src/java/org/apache/commons/math/DimensionMismatchException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DimensionMismatchException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathException"
      ],
      "begin_line": 25,
      "end_line": 66,
      "comment": "\n * Error thrown when two dimensions differ.\n * \n * @since 1.2\n * @version $Revision$ $Date$\n "
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
      "type": "constructor",
      "signature": "org.apache.commons.math.DimensionMismatchException.DimensionMismatchException(int, int)",
      "begin_line": 35,
      "end_line": 42,
      "comment": "\n     * Construct an exception from the mismatched dimensions\n     * @param dimension1 first dimension\n     * @param dimension2 second dimension\n     ",
      "child_ranges": [
        "(line 36,col 9)-(line 39,col 17)",
        "(line 40,col 9)-(line 40,col 37)",
        "(line 41,col 9)-(line 41,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.DimensionMismatchException.getDimension1()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Get the first dimension\n     * @return first dimension\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.DimensionMismatchException.getDimension2()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Get the second dimension\n     * @return second dimension\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 26)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "dimension1"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " First dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "dimension2"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Second dimension. "
    }
  ]
}