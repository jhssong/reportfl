{
  "filepath": "/tmp/Math-49b/src/main/java/org/apache/commons/math/special/Erf.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Erf",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 94,
      "comment": "\n * This is a utility class that provides computation methods related to the\n * error functions.\n *\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.special.Erf.Erf()",
      "begin_line": 31,
      "end_line": 31,
      "comment": "\n     * Default constructor.  Prohibit instantiation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Erf.erf(double)",
      "begin_line": 53,
      "end_line": 62,
      "comment": "\n     * Returns the error function.\n     *\n     * \u003cp\u003eerf(x) \u003d 2/\u0026radic;\u0026pi; \u003csub\u003e0\u003c/sub\u003e\u0026int;\u003csup\u003ex\u003c/sup\u003e e\u003csup\u003e-t\u003csup\u003e2\u003c/sup\u003e\u003c/sup\u003edt \u003c/p\u003e\n     *\n     * \u003cp\u003eThis implementation computes erf(x) using the\n     * {@link Gamma#regularizedGammaP(double, double, double, int) regularized gamma function},\n     * following \u003ca href\u003d\"http://mathworld.wolfram.com/Erf.html\"\u003e Erf\u003c/a\u003e, equation (3)\u003c/p\u003e\n     *\n     * \u003cp\u003eThe value returned is always between -1 and 1 (inclusive).\n     * If {@code abs(x) \u003e 40}, then {@code erf(x)} is indistinguishable from\n     * either 1 or -1 as a double, so the appropriate extreme value is returned.\n     * \u003c/p\u003e\n     *\n     * @param x the value.\n     * @return the error function erf(x)\n     * @throws org.apache.commons.math.exception.MaxCountExceededException\n     * if the algorithm fails to converge.\n     * @see Gamma#regularizedGammaP(double, double, double, int)\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 56,col 9)",
        "(line 57,col 9)-(line 57,col 73)",
        "(line 58,col 9)-(line 60,col 9)",
        "(line 61,col 9)-(line 61,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Erf.erfc(double)",
      "begin_line": 87,
      "end_line": 93,
      "comment": "\n     * Returns the complementary error function.\n     *\n     * \u003cp\u003eerfc(x) \u003d 2/\u0026radic;\u0026pi; \u003csub\u003ex\u003c/sub\u003e\u0026int;\u003csup\u003e\u0026infin;\u003c/sup\u003e e\u003csup\u003e-t\u003csup\u003e2\u003c/sup\u003e\u003c/sup\u003edt\n     * \u003cbr/\u003e\n     *    \u003d 1 - {@link #erf(double) erf(x)} \u003c/p\u003e\n     *\n     * \u003cp\u003eThis implementation computes erfc(x) using the\n     * {@link Gamma#regularizedGammaQ(double, double, double, int) regularized gamma function},\n     * following \u003ca href\u003d\"http://mathworld.wolfram.com/Erf.html\"\u003e Erf\u003c/a\u003e, equation (3).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe value returned is always between 0 and 2 (inclusive).\n     * If {@code abs(x) \u003e 40}, then {@code erf(x)} is indistinguishable from\n     * either 0 or 2 as a double, so the appropriate extreme value is returned.\n     * \u003c/p\u003e\n     *\n     * @param x the value\n     * @return the complementary error function erfc(x)\n     * @throws org.apache.commons.math.exception.MaxCountExceededException\n     * if the algorithm fails to converge.\n     * @see Gamma#regularizedGammaQ(double, double, double, int)\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 91,col 79)",
        "(line 92,col 9)-(line 92,col 37)"
      ]
    }
  ]
}