{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/DuplicateSampleAbscissaException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DuplicateSampleAbscissaException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathException"
      ],
      "begin_line": 27,
      "end_line": 51,
      "comment": "\n * Exception thrown when a sample contains several entries at the same abscissa.\n *\n * @since 1.2\n * @version $Revision$ $Date$\n "
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
      "type": "constructor",
      "signature": "org.apache.commons.math.DuplicateSampleAbscissaException.DuplicateSampleAbscissaException(double, int, int)",
      "begin_line": 38,
      "end_line": 41,
      "comment": "\n     * Construct an exception indicating the duplicate abscissa.\n     * @param abscissa duplicate abscissa\n     * @param i1 index of one entry having the duplicate abscissa\n     * @param i2 index of another entry having the duplicate abscissa\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 40,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.DuplicateSampleAbscissaException.getDuplicateAbscissa()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Get the duplicate abscissa.\n     * @return duplicate abscissa\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 58)"
      ]
    }
  ]
}