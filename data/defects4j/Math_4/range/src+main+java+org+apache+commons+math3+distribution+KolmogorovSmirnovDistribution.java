{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/KolmogorovSmirnovDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "KolmogorovSmirnovDistribution",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 72,
      "end_line": 355,
      "comment": "\n * Implementation of the Kolmogorov-Smirnov distribution.\n *\n * \u003cp\u003e\n * Treats the distribution of the two-sided {@code P(D_n \u003c d)} where\n * {@code D_n \u003d sup_x |G(x) - G_n (x)|} for the theoretical cdf {@code G} and\n * the empirical cdf {@code G_n}.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This implementation is based on [1] with certain quick decisions for extreme\n * values given in [2].\n * \u003c/p\u003e\n * \u003cp\u003e\n * In short, when wanting to evaluate {@code P(D_n \u003c d)}, the method in [1] is\n * to write {@code d \u003d (k - h) / n} for positive integer {@code k} and\n * {@code 0 \u003c\u003d h \u003c 1}. Then {@code P(D_n \u003c d) \u003d (n! / n^n) * t_kk}, where\n * {@code t_kk} is the {@code (k, k)}\u0027th entry in the special matrix\n * {@code H^n}, i.e. {@code H} to the {@code n}\u0027th power.\n * \u003c/p\u003e\n * \u003cp\u003e\n * References:\n * \u003cul\u003e\n * \u003cli\u003e[1] \u003ca href\u003d\"http://www.jstatsoft.org/v08/i18/\"\u003e\n * Evaluating Kolmogorov\u0027s Distribution\u003c/a\u003e by George Marsaglia, Wai\n * Wan Tsang, and Jingbo Wang\u003c/li\u003e\n * \u003cli\u003e[2] \u003ca href\u003d\"http://www.jstatsoft.org/v39/i11/\"\u003e\n * Computing the Two-Sided Kolmogorov-Smirnov Distribution\u003c/a\u003e by Richard Simard\n * and Pierre L\u0027Ecuyer\u003c/li\u003e\n * \u003c/ul\u003e\n * Note that [1] contains an error in computing h, refer to\n * \u003ca href\u003d\"https://issues.apache.org/jira/browse/MATH-437\"\u003eMATH-437\u003c/a\u003e for details.\n * \u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Kolmogorov-Smirnov_test\"\u003e\n * Kolmogorov-Smirnov test (Wikipedia)\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Number of observations. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.KolmogorovSmirnovDistribution.KolmogorovSmirnovDistribution(int)",
      "begin_line": 84,
      "end_line": 91,
      "comment": "\n     * @param n Number of observations\n     * @throws NotStrictlyPositiveException if {@code n \u003c\u003d 0}\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 88,col 9)",
        "(line 90,col 9)-(line 90,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.KolmogorovSmirnovDistribution.cdf(double)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Calculates {@code P(D_n \u003c d)} using method described in [1] with quick\n     * decisions for extreme values given in [2] (see above). The result is not\n     * exact as with\n     * {@link KolmogorovSmirnovDistribution#cdfExact(double)} because\n     * calculations are based on {@code double} rather than\n     * {@link org.apache.commons.math3.fraction.BigFraction}.\n     *\n     * @param d statistic\n     * @return the two-sided probability of {@code P(D_n \u003c d)}\n     * @throws MathArithmeticException if algorithm fails to convert {@code h}\n     * to a {@link org.apache.commons.math3.fraction.BigFraction} in expressing\n     * {@code d} as {@code (k - h) / m} for integer {@code k, m} and\n     * {@code 0 \u003c\u003d h \u003c 1}.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.KolmogorovSmirnovDistribution.cdfExact(double)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * Calculates {@code P(D_n \u003c d)} using method described in [1] with quick\n     * decisions for extreme values given in [2] (see above). The result is\n     * exact in the sense that BigFraction/BigReal is used everywhere at the\n     * expense of very slow execution time. Almost never choose this in real\n     * applications unless you are very sure; this is almost solely for\n     * verification purposes. Normally, you would choose\n     * {@link KolmogorovSmirnovDistribution#cdf(double)}\n     *\n     * @param d statistic\n     * @return the two-sided probability of {@code P(D_n \u003c d)}\n     * @throws MathArithmeticException if algorithm fails to convert {@code h}\n     * to a {@link org.apache.commons.math3.fraction.BigFraction} in expressing\n     * {@code d} as {@code (k - h) / m} for integer {@code k, m} and\n     * {@code 0 \u003c\u003d h \u003c 1}.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.KolmogorovSmirnovDistribution.cdf(double, boolean)",
      "begin_line": 149,
      "end_line": 180,
      "comment": "\n     * Calculates {@code P(D_n \u003c d)} using method described in [1] with quick\n     * decisions for extreme values given in [2] (see above).\n     *\n     * @param d statistic\n     * @param exact whether the probability should be calculated exact using\n     * {@link org.apache.commons.math3.fraction.BigFraction} everywhere at the\n     * expense of very slow execution time, or if {@code double} should be used\n     * convenient places to gain speed. Almost never choose {@code true} in real\n     * applications unless you are very sure; {@code true} is almost solely for\n     * verification purposes.\n     * @return the two-sided probability of {@code P(D_n \u003c d)}\n     * @throws MathArithmeticException if algorithm fails to convert {@code h}\n     * to a {@link org.apache.commons.math3.fraction.BigFraction} in expressing\n     * {@code d} as {@code (k - h) / m} for integer {@code k, m} and\n     * {@code 0 \u003c\u003d h \u003c 1}.\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 45)",
        "(line 152,col 9)-(line 152,col 43)",
        "(line 154,col 9)-(line 177,col 9)",
        "(line 179,col 9)-(line 179,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.KolmogorovSmirnovDistribution.exactK(double)",
      "begin_line": 194,
      "end_line": 213,
      "comment": "\n     * Calculates the exact value of {@code P(D_n \u003c d)} using method described\n     * in [1] and {@link org.apache.commons.math3.fraction.BigFraction} (see\n     * above).\n     *\n     * @param d statistic\n     * @return the two-sided probability of {@code P(D_n \u003c d)}\n     * @throws MathArithmeticException if algorithm fails to convert {@code h}\n     * to a {@link org.apache.commons.math3.fraction.BigFraction} in expressing\n     * {@code d} as {@code (k - h) / m} for integer {@code k, m} and\n     * {@code 0 \u003c\u003d h \u003c 1}.\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 45)",
        "(line 198,col 9)-(line 198,col 59)",
        "(line 199,col 9)-(line 199,col 59)",
        "(line 201,col 9)-(line 201,col 58)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 212,col 9)-(line 212,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.KolmogorovSmirnovDistribution.roundedK(double)",
      "begin_line": 226,
      "end_line": 253,
      "comment": "\n     * Calculates {@code P(D_n \u003c d)} using method described in [1] and doubles\n     * (see above).\n     *\n     * @param d statistic\n     * @return the two-sided probability of {@code P(D_n \u003c d)}\n     * @throws MathArithmeticException if algorithm fails to convert {@code h}\n     * to a {@link org.apache.commons.math3.fraction.BigFraction} in expressing\n     * {@code d} as {@code (k - h) / m} for integer {@code k, m} and\n     * {@code 0 \u003c\u003d h \u003c 1}.\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 45)",
        "(line 229,col 9)-(line 229,col 70)",
        "(line 230,col 9)-(line 230,col 53)",
        "(line 236,col 9)-(line 236,col 60)",
        "(line 238,col 9)-(line 242,col 9)",
        "(line 244,col 9)-(line 244,col 45)",
        "(line 246,col 9)-(line 246,col 53)",
        "(line 248,col 9)-(line 250,col 9)",
        "(line 252,col 9)-(line 252,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.KolmogorovSmirnovDistribution.createH(double)",
      "begin_line": 266,
      "end_line": 354,
      "comment": "*\n     * Creates {@code H} of size {@code m x m} as described in [1] (see above).\n     *\n     * @param d statistic\n     * @return H matrix\n     * @throws NumberIsTooLargeException if fractional part is greater than 1\n     * @throws FractionConversionException if algorithm fails to convert\n     * {@code h} to a {@link org.apache.commons.math3.fraction.BigFraction} in\n     * expressing {@code d} as {@code (k - h) / m} for integer {@code k, m} and\n     * {@code 0 \u003c\u003d h \u003c 1}.\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 39)",
        "(line 271,col 9)-(line 271,col 26)",
        "(line 272,col 9)-(line 272,col 35)",
        "(line 274,col 9)-(line 276,col 9)",
        "(line 278,col 9)-(line 278,col 29)",
        "(line 280,col 9)-(line 288,col 9)",
        "(line 290,col 9)-(line 290,col 60)",
        "(line 295,col 9)-(line 303,col 9)",
        "(line 309,col 9)-(line 309,col 57)",
        "(line 310,col 9)-(line 310,col 23)",
        "(line 311,col 9)-(line 313,col 9)",
        "(line 318,col 9)-(line 321,col 9)",
        "(line 328,col 9)-(line 330,col 9)",
        "(line 343,col 9)-(line 351,col 9)",
        "(line 353,col 9)-(line 353,col 93)"
      ]
    }
  ]
}