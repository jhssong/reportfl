{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/exception/OutOfRangeException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OutOfRangeException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalNumberException"
      ],
      "begin_line": 27,
      "end_line": 63,
      "comment": "\n * Exception to be thrown when some argument is out of range.\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
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
        "lo"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Lower bound. "
    },
    {
      "type": "field",
      "varNames": [
        "hi"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Higher bound. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.OutOfRangeException.OutOfRangeException(java.lang.Number, java.lang.Number, java.lang.Number)",
      "begin_line": 44,
      "end_line": 50,
      "comment": "\n     * Construct an exception from the mismatched dimensions.\n     *\n     * @param wrong Requested value.\n     * @param lo Lower bound.\n     * @param hi Higher bound.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 67)",
        "(line 48,col 9)-(line 48,col 21)",
        "(line 49,col 9)-(line 49,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.OutOfRangeException.getLo()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * @return the lower bound.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.OutOfRangeException.getHi()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * @return the higher bound.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 18)"
      ]
    }
  ]
}