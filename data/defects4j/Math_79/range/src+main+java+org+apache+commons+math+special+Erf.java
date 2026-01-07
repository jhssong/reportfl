{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/special/Erf.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Erf",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 57,
      "comment": "\n * This is a utility class that provides computation methods related to the\n * error functions.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.special.Erf.Erf()",
      "begin_line": 32,
      "end_line": 34,
      "comment": "\n     * Default constructor.  Prohibit instantiation.\n     ",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Erf.erf(double)",
      "begin_line": 50,
      "end_line": 56,
      "comment": "\n     * Returns the error function erf(x).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Erf.html\"\u003e\n     * Erf\u003c/a\u003e, equation (3).\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x the value.\n     * @return the error function erf(x)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 73)",
        "(line 52,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 55,col 19)"
      ]
    }
  ]
}