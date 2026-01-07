{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/DuplicateSampleAbscissaException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DuplicateSampleAbscissaException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathException"
      ],
      "begin_line": 23,
      "end_line": 47,
      "comment": "\n * Exeption thrown when a sample contains several entries at the same abscissa.\n * @version $Revision:$\n "
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
      "signature": "org.apache.commons.math.DuplicateSampleAbscissaException.DuplicateSampleAbscissaException(double, int, int)",
      "begin_line": 34,
      "end_line": 37,
      "comment": "\n     * Construct an exception indicating the duplicate abscissa.\n     * @param abscissa duplicate abscissa\n     * @param i1 index of one entry having the duplicate abscissa\n     * @param i2 index of another entry having the duplicate abscissa\n     ",
      "child_ranges": [
        "(line 35,col 9)-(line 36,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.DuplicateSampleAbscissaException.getDuplicateAbscissa()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Get the duplicate abscissa.\n     * @return duplicate abscissa\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 58)"
      ]
    }
  ]
}