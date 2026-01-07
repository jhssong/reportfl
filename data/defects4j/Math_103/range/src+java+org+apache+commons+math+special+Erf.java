{
  "filepath": "/tmp/Math-103b/src/java/org/apache/commons/math/special/Erf.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Erf",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 62,
      "comment": "\n * This is a utility class that provides computation methods related to the\n * error functions.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.special.Erf.Erf()",
      "begin_line": 37,
      "end_line": 39,
      "comment": "\n     * Default constructor.  Prohibit instantiation.\n     ",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Erf.erf(double)",
      "begin_line": 55,
      "end_line": 61,
      "comment": "\n     * Returns the error function erf(x).\n     * \n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Erf.html\"\u003e\n     * Erf\u003c/a\u003e, equation (3).\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param x the value.\n     * @return the error function erf(x)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 73)",
        "(line 57,col 9)-(line 59,col 9)",
        "(line 60,col 9)-(line 60,col 19)"
      ]
    }
  ]
}