{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/special/Erf.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Erf",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 243,
      "comment": "\n * This is a utility class that provides computation methods related to the\n * error functions.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "X_CRIT"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * The number {@code X_CRIT} is used by {@link #erf(double, double)} internally.\n     * This number solves {@code erf(x)\u003d0.5} within 1ulp.\n     * More precisely, the current implementations of\n     * {@link #erf(double)} and {@link #erfc(double)} satisfy:\u003cbr/\u003e\n     * {@code erf(X_CRIT) \u003c 0.5},\u003cbr/\u003e\n     * {@code erf(Math.nextUp(X_CRIT) \u003e 0.5},\u003cbr/\u003e\n     * {@code erfc(X_CRIT) \u003d 0.5}, and\u003cbr/\u003e\n     * {@code erfc(Math.nextUp(X_CRIT) \u003c 0.5}\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.special.Erf.Erf()",
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Default constructor.  Prohibit instantiation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Erf.erf(double)",
      "begin_line": 66,
      "end_line": 72,
      "comment": "\n     * Returns the error function.\n     *\n     * \u003cp\u003eerf(x) \u003d 2/\u0026radic;\u0026pi; \u003csub\u003e0\u003c/sub\u003e\u0026int;\u003csup\u003ex\u003c/sup\u003e e\u003csup\u003e-t\u003csup\u003e2\u003c/sup\u003e\u003c/sup\u003edt \u003c/p\u003e\n     *\n     * \u003cp\u003eThis implementation computes erf(x) using the\n     * {@link Gamma#regularizedGammaP(double, double, double, int) regularized gamma function},\n     * following \u003ca href\u003d\"http://mathworld.wolfram.com/Erf.html\"\u003e Erf\u003c/a\u003e, equation (3)\u003c/p\u003e\n     *\n     * \u003cp\u003eThe value returned is always between -1 and 1 (inclusive).\n     * If {@code abs(x) \u003e 40}, then {@code erf(x)} is indistinguishable from\n     * either 1 or -1 as a double, so the appropriate extreme value is returned.\n     * \u003c/p\u003e\n     *\n     * @param x the value.\n     * @return the error function erf(x)\n     * @throws org.apache.commons.math3.exception.MaxCountExceededException\n     * if the algorithm fails to converge.\n     * @see Gamma#regularizedGammaP(double, double, double, int)\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 70,col 79)",
        "(line 71,col 9)-(line 71,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Erf.erfc(double)",
      "begin_line": 97,
      "end_line": 103,
      "comment": "\n     * Returns the complementary error function.\n     *\n     * \u003cp\u003eerfc(x) \u003d 2/\u0026radic;\u0026pi; \u003csub\u003ex\u003c/sub\u003e\u0026int;\u003csup\u003e\u0026infin;\u003c/sup\u003e e\u003csup\u003e-t\u003csup\u003e2\u003c/sup\u003e\u003c/sup\u003edt\n     * \u003cbr/\u003e\n     *    \u003d 1 - {@link #erf(double) erf(x)} \u003c/p\u003e\n     *\n     * \u003cp\u003eThis implementation computes erfc(x) using the\n     * {@link Gamma#regularizedGammaQ(double, double, double, int) regularized gamma function},\n     * following \u003ca href\u003d\"http://mathworld.wolfram.com/Erf.html\"\u003e Erf\u003c/a\u003e, equation (3).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe value returned is always between 0 and 2 (inclusive).\n     * If {@code abs(x) \u003e 40}, then {@code erf(x)} is indistinguishable from\n     * either 0 or 2 as a double, so the appropriate extreme value is returned.\n     * \u003c/p\u003e\n     *\n     * @param x the value\n     * @return the complementary error function erfc(x)\n     * @throws org.apache.commons.math3.exception.MaxCountExceededException\n     * if the algorithm fails to converge.\n     * @see Gamma#regularizedGammaQ(double, double, double, int)\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 79)",
        "(line 102,col 9)-(line 102,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Erf.erf(double, double)",
      "begin_line": 115,
      "end_line": 128,
      "comment": "\n     * Returns the difference between erf(x1) and erf(x2).\n     *\n     * The implementation uses either erf(double) or erfc(double)\n     * depending on which provides the most precise result.\n     *\n     * @param x1 the first value\n     * @param x2 the second value\n     * @return erf(x2) - erf(x1)\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 118,col 9)",
        "(line 120,col 9)-(line 127,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Erf.erfInv(double)",
      "begin_line": 143,
      "end_line": 231,
      "comment": "\n     * Returns the inverse erf.\n     * \u003cp\u003e\n     * This implementation is described in the paper:\n     * \u003ca href\u003d\"http://people.maths.ox.ac.uk/gilesm/files/gems_erfinv.pdf\"\u003eApproximating\n     * the erfinv function\u003c/a\u003e by Mike Giles, Oxford-Man Institute of Quantitative Finance,\n     * which was published in GPU Computing Gems, volume 2, 2010.\n     * The source code is available \u003ca href\u003d\"http://gpucomputing.net/?q\u003dnode/1828\"\u003ehere\u003c/a\u003e.\n     * \u003c/p\u003e\n     * @param x the value\n     * @return t such that x \u003d erf(t)\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 57)",
        "(line 150,col 9)-(line 150,col 17)",
        "(line 152,col 9)-(line 227,col 9)",
        "(line 229,col 9)-(line 229,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Erf.erfcInv(double)",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\n     * Returns the inverse erfc.\n     * @param x the value\n     * @return t such that x \u003d erfc(t)\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 29)"
      ]
    }
  ]
}