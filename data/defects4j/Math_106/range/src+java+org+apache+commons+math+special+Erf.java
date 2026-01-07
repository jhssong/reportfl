{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/special/Erf.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Erf",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 28,
      "end_line": 58,
      "comment": "\n * This is a utility class that provides computation methods related to the\n * error functions.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.special.Erf.Erf()",
      "begin_line": 33,
      "end_line": 35,
      "comment": "\n     * Default constructor.  Prohibit instantiation.\n     ",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Erf.erf(double)",
      "begin_line": 51,
      "end_line": 57,
      "comment": "\n     * Returns the error function erf(x).\n     * \n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Erf.html\"\u003e\n     * Erf\u003c/a\u003e, equation (3).\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param x the value.\n     * @return the error function erf(x)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 73)",
        "(line 53,col 9)-(line 55,col 9)",
        "(line 56,col 9)-(line 56,col 19)"
      ]
    }
  ]
}