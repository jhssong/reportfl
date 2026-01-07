{
  "filepath": "/tmp/Math-65b/src/main/java/org/apache/commons/math/exception/OutOfRangeException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OutOfRangeException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalNumberException"
      ],
      "begin_line": 26,
      "end_line": 62,
      "comment": "\n * Exception to be thrown when some argument is out of range.\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " Serializable version Id. "
    },
    {
      "type": "field",
      "varNames": [
        "lo"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Lower bound. "
    },
    {
      "type": "field",
      "varNames": [
        "hi"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Higher bound. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.OutOfRangeException.OutOfRangeException(java.lang.Number, java.lang.Number, java.lang.Number)",
      "begin_line": 43,
      "end_line": 49,
      "comment": "\n     * Construct an exception from the mismatched dimensions.\n     *\n     * @param wrong Requested value.\n     * @param lo Lower bound.\n     * @param hi Higher bound.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 67)",
        "(line 47,col 9)-(line 47,col 21)",
        "(line 48,col 9)-(line 48,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.OutOfRangeException.getLo()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * @return the lower bound.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.OutOfRangeException.getHi()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * @return the higher bound.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 18)"
      ]
    }
  ]
}