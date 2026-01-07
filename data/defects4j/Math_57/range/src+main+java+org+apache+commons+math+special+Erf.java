{
  "filepath": "/tmp/Math-57b/src/main/java/org/apache/commons/math/special/Erf.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Erf",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 91,
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
      "begin_line": 54,
      "end_line": 63,
      "comment": "\n     * \u003cp\u003eReturns the error function\u003c/p\u003e\n     * \u003cp\u003eerf(x) \u003d 2/\u0026radic;\u0026pi; \u003csub\u003e0\u003c/sub\u003e\u0026int;\u003csup\u003ex\u003c/sup\u003e e\u003csup\u003e-t\u003csup\u003e2\u003c/sup\u003e\u003c/sup\u003edt \u003c/p\u003e\n     *\n     * \u003cp\u003eThis implementation computes erf(x) using the\n     * {@link Gamma#regularizedGammaP(double, double, double, int) regularized gamma function},\n     * following \u003ca href\u003d\"http://mathworld.wolfram.com/Erf.html\"\u003e Erf\u003c/a\u003e, equation (3)\u003c/p\u003e\n     *\n     * \u003cp\u003eThe value returned is always between -1 and 1 (inclusive).  If {@code abs(x) \u003e 40}, then\n     * {@code erf(x)} is indistinguishable from either 1 or -1 as a double, so the appropriate extreme\n     * value is returned.\u003c/p\u003e\n     *\n     * @param x the value.\n     * @return the error function erf(x)\n     * @throws MathException if the algorithm fails to converge.\n     * @see Gamma#regularizedGammaP(double, double, double, int)\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 57,col 9)",
        "(line 58,col 9)-(line 58,col 73)",
        "(line 59,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 62,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Erf.erfc(double)",
      "begin_line": 84,
      "end_line": 90,
      "comment": "\n     * \u003cp\u003eReturns the complementary error function\u003c/p\u003e\n     * \u003cp\u003eerfc(x) \u003d 2/\u0026radic;\u0026pi; \u003csub\u003ex\u003c/sub\u003e\u0026int;\u003csup\u003e\u0026infin;\u003c/sup\u003e e\u003csup\u003e-t\u003csup\u003e2\u003c/sup\u003e\u003c/sup\u003edt \u003cbr/\u003e\n     *    \u003d 1 - {@link #erf(double) erf(x)} \u003c/p\u003e\n     *\n     * \u003cp\u003eThis implementation computes erfc(x) using the\n     * {@link Gamma#regularizedGammaQ(double, double, double, int) regularized gamma function},\n     * following \u003ca href\u003d\"http://mathworld.wolfram.com/Erf.html\"\u003e Erf\u003c/a\u003e, equation (3).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe value returned is always between 0 and 2 (inclusive).  If {@code abs(x) \u003e 40}, then\n     * {@code erf(x)} is indistinguishable from either 0 or 2 as a double, so the appropriate extreme\n     * value is returned.\u003c/p\u003e\n     *\n     * @param x the value\n     * @return the complementary error function erfc(x)\n     * @throws MathException if the algorithm fails to converge\n     * @see Gamma#regularizedGammaQ(double, double, double, int)\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 79)",
        "(line 89,col 9)-(line 89,col 37)"
      ]
    }
  ]
}