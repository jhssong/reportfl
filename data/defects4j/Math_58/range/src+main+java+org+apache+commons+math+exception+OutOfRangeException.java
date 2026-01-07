{
  "filepath": "/tmp/Math-58b/src/main/java/org/apache/commons/math/exception/OutOfRangeException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OutOfRangeException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalNumberException"
      ],
      "begin_line": 28,
      "end_line": 80,
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
      "end_line": 47,
      "comment": "\n     * Construct an exception from the mismatched dimensions.\n     *\n     * @param wrong Requested value.\n     * @param lo Lower bound.\n     * @param hi Higher bound.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.OutOfRangeException.OutOfRangeException(org.apache.commons.math.exception.util.Localizable, java.lang.Number, java.lang.Number, java.lang.Number)",
      "begin_line": 58,
      "end_line": 66,
      "comment": "\n     * Construct an exception from the mismatched dimensions with a\n     * specific context information.\n     *\n     * @param specific Context information.\n     * @param wrong Requested value.\n     * @param lo Lower bound.\n     * @param hi Higher bound.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 63,col 29)",
        "(line 64,col 9)-(line 64,col 21)",
        "(line 65,col 9)-(line 65,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.OutOfRangeException.getLo()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * @return the lower bound.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.OutOfRangeException.getHi()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * @return the higher bound.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 18)"
      ]
    }
  ]
}