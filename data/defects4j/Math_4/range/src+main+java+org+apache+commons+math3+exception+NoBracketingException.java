{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/exception/NoBracketingException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NoBracketingException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.exception.MathIllegalArgumentException"
      ],
      "begin_line": 29,
      "end_line": 107,
      "comment": "\n * Exception to be thrown when function values have the same sign at both\n * ends of an interval.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Serializable version Id. "
    },
    {
      "type": "field",
      "varNames": [
        "lo"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Lower end of the interval. "
    },
    {
      "type": "field",
      "varNames": [
        "hi"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Higher end of the interval. "
    },
    {
      "type": "field",
      "varNames": [
        "fLo"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Value at lower end of the interval. "
    },
    {
      "type": "field",
      "varNames": [
        "fHi"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Value at higher end of the interval. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.exception.NoBracketingException.NoBracketingException(double, double, double, double)",
      "begin_line": 49,
      "end_line": 52,
      "comment": "\n     * Construct the exception.\n     *\n     * @param lo Lower end of the interval.\n     * @param hi Higher end of the interval.\n     * @param fLo Value at lower end of the interval.\n     * @param fHi Value at higher end of the interval.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.exception.NoBracketingException.NoBracketingException(org.apache.commons.math3.exception.util.Localizable, double, double, double, double, java.lang.Object...)",
      "begin_line": 64,
      "end_line": 73,
      "comment": "\n     * Construct the exception with a specific context.\n     *\n     * @param specific Contextual information on what caused the exception.\n     * @param lo Lower end of the interval.\n     * @param hi Higher end of the interval.\n     * @param fLo Value at lower end of the interval.\n     * @param fHi Value at higher end of the interval.\n     * @param args Additional arguments.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 48)",
        "(line 69,col 9)-(line 69,col 21)",
        "(line 70,col 9)-(line 70,col 21)",
        "(line 71,col 9)-(line 71,col 23)",
        "(line 72,col 9)-(line 72,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.NoBracketingException.getLo()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Get the lower end of the interval.\n     *\n     * @return the lower end.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.NoBracketingException.getHi()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Get the higher end of the interval.\n     *\n     * @return the higher end.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.NoBracketingException.getFLo()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Get the value at the lower end of the interval.\n     *\n     * @return the value at the lower end.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.NoBracketingException.getFHi()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Get the value at the higher end of the interval.\n     *\n     * @return the value at the higher end.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 19)"
      ]
    }
  ]
}