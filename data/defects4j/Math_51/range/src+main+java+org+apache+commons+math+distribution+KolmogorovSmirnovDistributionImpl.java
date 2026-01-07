{
  "filepath": "/tmp/Math-51b/src/main/java/org/apache/commons/math/distribution/KolmogorovSmirnovDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "KolmogorovSmirnovDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.KolmogorovSmirnovDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 70,
      "end_line": 366,
      "comment": "\n * The default implementation of {@link KolmogorovSmirnovDistribution}.\n *\n * \u003cp\u003eTreats the distribution of the two-sided\n * {@code P(D}\u003csub\u003e{@code n}\u003c/sub\u003e{@code \u003c d)}\n * where {@code D}\u003csub\u003e{@code n}\u003c/sub\u003e{@code \u003d sup_x | G(x) - Gn (x) |} for the\n * theoretical cdf G and the emperical cdf Gn.\u003c/p\u003e\n *\n * \u003cp\u003eThis implementation is based on [1] with certain quick\n * decisions for extreme values given in [2].\u003c/p\u003e\n *\n * \u003cp\u003eIn short, when wanting to evaluate {@code P(D}\u003csub\u003e{@code n}\u003c/sub\u003e{@code \u003c d)},\n * the method in [1] is to write {@code d \u003d (k - h) / n} for positive\n * integer {@code k} and {@code 0 \u003c\u003d h \u003c 1}. Then\n * {@code P(D}\u003csub\u003e{@code n}\u003c/sub\u003e{@code \u003c d) \u003d (n!/n}\u003csup\u003e{@code n}\u003c/sup\u003e{@code ) * t_kk}\n * where {@code t_kk} is the {@code (k, k)}\u0027th entry in the special\n * matrix {@code H}\u003csup\u003e{@code n}\u003c/sup\u003e, i.e. {@code H} to the {@code n}\u0027th power.\u003c/p\u003e\n *\n * \u003cp\u003eSee also \u003ca href\u003d\"http://en.wikipedia.org/wiki/Kolmogorov-Smirnov_test\"\u003e\n * Kolmogorov-Smirnov test on Wikipedia\u003c/a\u003e for details.\u003c/p\u003e\n *\n * \u003cp\u003eReferences:\n * \u003cul\u003e\n * \u003cli\u003e[1] \u003ca href\u003d\"http://www.jstatsoft.org/v08/i18/\"\u003e\n * Evaluating Kolmogorov\u0027s Distribution\u003c/a\u003e by George Marsaglia, Wai\n * Wan Tsang, and Jingbo Wang\u003c/li\u003e\n * \u003cli\u003e[2] \u003ca href\u003d\"http://www.jstatsoft.org/v39/i11/\"\u003e\n * Computing the Two-Sided Kolmogorov-Smirnov Distribution\u003c/a\u003e by Richard Simard\n * and Pierre L\u0027Ecuyer\u003c/li\u003e\n * \u003c/ul\u003e\n * Note that [1] contains an error in computing h, refer to\n * \u003ca href\u003d\"https://issues.apache.org/jira/browse/MATH-437\"\u003eMATH-437\u003c/a\u003e for details.\n * \u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Number of observations. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.KolmogorovSmirnovDistributionImpl.KolmogorovSmirnovDistributionImpl(int)",
      "begin_line": 83,
      "end_line": 89,
      "comment": "\n     * @param n Number of observations\n     * @throws NotStrictlyPositiveException\n     *             if {@code n \u003c\u003d 0}\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 86,col 9)",
        "(line 88,col 9)-(line 88,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.KolmogorovSmirnovDistributionImpl.cdf(double)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Calculates {@code P(D}\u003csub\u003en\u003c/sub\u003e {@code \u003c d)} using method described in\n     * [1] with quick decisions for extreme values given in [2] (see above). The\n     * result is not exact as with\n     * {@link KolmogorovSmirnovDistributionImpl#cdfExact(double)} because\n     * calculations are based on double rather than\n     * {@link org.apache.commons.math.fraction.BigFraction}.\n     *\n     * @param d statistic\n     * @return the two-sided probability of {@code P(D}\u003csub\u003en\u003c/sub\u003e {@code \u003c d)}\n     * @throws MathArithmeticException\n     *             if algorithm fails to convert {@code h} to a\n     *             {@link org.apache.commons.math.fraction.BigFraction} in\n     *             expressing {@code d} as {@code (k - h) / m} for integer\n     *             {@code k, m} and {@code 0 \u003c\u003d h \u003c 1}.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.KolmogorovSmirnovDistributionImpl.cdfExact(double)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * Calculates {@code P(D}\u003csub\u003en\u003c/sub\u003e {@code \u003c d)} using method described in\n     * [1] with quick decisions for extreme values given in [2] (see above).\n     * The result is exact in the sense that BigFraction/BigReal is used everywhere\n     * at the expense of very slow execution time. Almost never choose this in\n     * real applications unless you are very sure; this is almost solely for\n     * verification purposes. Normally, you would choose\n     * {@link KolmogorovSmirnovDistributionImpl#cdf(double)}\n     *\n     * @param d statistic\n     * @return the two-sided probability of {@code P(D}\u003csub\u003en\u003c/sub\u003e {@code \u003c d)}\n     * @throws MathArithmeticException\n     *             if algorithm fails to convert {@code h} to a\n     *             {@link org.apache.commons.math.fraction.BigFraction} in\n     *             expressing {@code d} as {@code (k - h) / m} for integer\n     *             {@code k, m} and {@code 0 \u003c\u003d h \u003c 1}.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.KolmogorovSmirnovDistributionImpl.cdf(double, boolean)",
      "begin_line": 151,
      "end_line": 183,
      "comment": "\n     * Calculates {@code P(D}\u003csub\u003en\u003c/sub\u003e {@code \u003c d)} using method described in\n     * [1] with quick decisions for extreme values given in [2] (see above).\n     *\n     * @param d statistic\n     * @param exact\n     *            whether the probability should be calculated exact using\n     *            BigFraction everywhere at the expense of very\n     *            slow execution time, or if double should be used convenient\n     *            places to gain speed. Almost never choose {@code true} in\n     *            real applications unless you are very sure; {@code true} is\n     *            almost solely for verification purposes.\n     * @return the two-sided probability of {@code P(D}\u003csub\u003en\u003c/sub\u003e {@code \u003c d)}\n     * @throws MathArithmeticException\n     *             if algorithm fails to convert {@code h} to a\n     *             {@link org.apache.commons.math.fraction.BigFraction} in\n     *             expressing {@code d} as {@code (k - h) / m} for integer\n     *             {@code k, m} and {@code 0 \u003c\u003d h \u003c 1}.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 45)",
        "(line 155,col 9)-(line 155,col 43)",
        "(line 157,col 9)-(line 180,col 9)",
        "(line 182,col 9)-(line 182,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.KolmogorovSmirnovDistributionImpl.exactK(double)",
      "begin_line": 197,
      "end_line": 217,
      "comment": "\n     * Calculates {@code P(D}\u003csub\u003en\u003c/sub\u003e {@code \u003c d)} exact using method\n     * described in [1] and BigFraction (see above).\n     *\n     * @param d statistic\n     * @return the two-sided probability of {@code P(D}\u003csub\u003en\u003c/sub\u003e {@code \u003c d)}\n     * @throws MathArithmeticException\n     *             if algorithm fails to convert {@code h} to a\n     *             {@link org.apache.commons.math.fraction.BigFraction} in\n     *             expressing {@code d} as {@code (k - h) / m} for integer\n     *             {@code k, m} and {@code 0 \u003c\u003d h \u003c 1}.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 45)",
        "(line 202,col 9)-(line 202,col 59)",
        "(line 203,col 9)-(line 203,col 59)",
        "(line 205,col 9)-(line 205,col 58)",
        "(line 207,col 9)-(line 209,col 9)",
        "(line 216,col 9)-(line 216,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.KolmogorovSmirnovDistributionImpl.roundedK(double)",
      "begin_line": 231,
      "end_line": 259,
      "comment": "\n     * Calculates {@code P(D}\u003csub\u003en\u003c/sub\u003e {@code \u003c d)} using method described in\n     * [1] and doubles (see above).\n     *\n     * @param d statistic\n     * @return the two-sided probability of {@code P(D}\u003csub\u003en\u003c/sub\u003e {@code \u003c d)}\n     * @throws MathArithmeticException\n     *             if algorithm fails to convert {@code h} to a\n     *             {@link org.apache.commons.math.fraction.BigFraction} in\n     *             expressing {@code d} as {@code (k - h) / m} for integer\n     *             {@code k, m} and {@code 0 \u003c\u003d h \u003c 1}.\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 45)",
        "(line 235,col 9)-(line 235,col 70)",
        "(line 236,col 9)-(line 236,col 53)",
        "(line 242,col 9)-(line 242,col 60)",
        "(line 244,col 9)-(line 248,col 9)",
        "(line 250,col 9)-(line 250,col 45)",
        "(line 252,col 9)-(line 252,col 53)",
        "(line 254,col 9)-(line 256,col 9)",
        "(line 258,col 9)-(line 258,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.KolmogorovSmirnovDistributionImpl.createH(double)",
      "begin_line": 272,
      "end_line": 365,
      "comment": "*\n     * Creates {@code H} of size {@code m x m} as described in [1] (see above).\n     *\n     * @param d statistic\n     * @return H matrix\n     * @throws MathArithmeticException\n     *             if algorithm fails to convert {@code h} to a\n     *             {@link org.apache.commons.math.fraction.BigFraction} in\n     *             expressing {@code d} as {@code (k - h) / m} for integer\n     *             {@code k, m} and {@code 0 \u003c\u003d h \u003c 1}.\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 39)",
        "(line 277,col 9)-(line 277,col 26)",
        "(line 278,col 9)-(line 278,col 35)",
        "(line 280,col 9)-(line 282,col 9)",
        "(line 284,col 9)-(line 284,col 29)",
        "(line 286,col 9)-(line 299,col 9)",
        "(line 301,col 9)-(line 301,col 60)",
        "(line 306,col 9)-(line 314,col 9)",
        "(line 320,col 9)-(line 320,col 57)",
        "(line 321,col 9)-(line 321,col 23)",
        "(line 322,col 9)-(line 324,col 9)",
        "(line 329,col 9)-(line 332,col 9)",
        "(line 339,col 9)-(line 341,col 9)",
        "(line 354,col 9)-(line 362,col 9)",
        "(line 364,col 9)-(line 364,col 93)"
      ]
    }
  ]
}