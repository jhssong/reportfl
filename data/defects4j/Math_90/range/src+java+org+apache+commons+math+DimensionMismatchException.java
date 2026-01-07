{
  "filepath": "/tmp/Math-90b/src/java/org/apache/commons/math/DimensionMismatchException.java",
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
      "end_line": 39,
      "comment": "\n     * Construct an exception from the mismatched dimensions\n     * @param dimension1 first dimension\n     * @param dimension2 second dimension\n     ",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 71)",
        "(line 37,col 9)-(line 37,col 37)",
        "(line 38,col 9)-(line 38,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.DimensionMismatchException.getDimension1()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Get the first dimension\n     * @return first dimension\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.DimensionMismatchException.getDimension2()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Get the second dimension\n     * @return second dimension\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 26)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "dimension1"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " First dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "dimension2"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Second dimension. "
    }
  ]
}