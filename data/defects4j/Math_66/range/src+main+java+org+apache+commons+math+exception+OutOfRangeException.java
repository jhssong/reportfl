{
  "filepath": "/tmp/Math-66b/src/main/java/org/apache/commons/math/exception/OutOfRangeException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OutOfRangeException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalNumberException"
      ],
      "begin_line": 27,
      "end_line": 59,
      "comment": "\n * Exception to be thrown when some argument is out of range.\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "lo"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " Lower bound. "
    },
    {
      "type": "field",
      "varNames": [
        "hi"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Higher bound. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.OutOfRangeException.OutOfRangeException(java.lang.Number, java.lang.Number, java.lang.Number)",
      "begin_line": 40,
      "end_line": 46,
      "comment": "\n     * Construct an exception from the mismatched dimensions.\n     *\n     * @param wrong Requested value.\n     * @param lo Lower bound.\n     * @param hi Higher bound.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 67)",
        "(line 44,col 9)-(line 44,col 21)",
        "(line 45,col 9)-(line 45,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.OutOfRangeException.getLo()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * @return the lower bound.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.OutOfRangeException.getHi()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * @return the higher bound.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 18)"
      ]
    }
  ]
}