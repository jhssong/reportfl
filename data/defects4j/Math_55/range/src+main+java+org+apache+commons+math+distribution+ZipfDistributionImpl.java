{
  "filepath": "/tmp/Math-55b/src/main/java/org/apache/commons/math/distribution/ZipfDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipfDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractIntegerDistribution",
        "org.apache.commons.math.distribution.ZipfDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 222,
      "comment": "\n * Implementation for the {@link ZipfDistribution}.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfElements"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Number of elements. "
    },
    {
      "type": "field",
      "varNames": [
        "exponent"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Exponent parameter of the distribution. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.ZipfDistributionImpl(int, double)",
      "begin_line": 49,
      "end_line": 62,
      "comment": "\n     * Create a new Zipf distribution with the given number of elements and\n     * exponent.\n     *\n     * @param numberOfElements Number of elements.\n     * @param exponent Exponent.\n     * @exception NotStrictlyPositiveException if {@code numberOfElements \u003c\u003d 0}\n     * or {@code exponent \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 58,col 9)",
        "(line 60,col 9)-(line 60,col 49)",
        "(line 61,col 9)-(line 61,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.getNumberOfElements()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.getExponent()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.probability(int)",
      "begin_line": 84,
      "end_line": 90,
      "comment": "\n     * The probability mass function {@code P(X \u003d x)} for a Zipf distribution.\n     *\n     * @param x Value at which the probability density function is evaluated.\n     * @return the value of the probability mass function at {@code x}.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 87,col 9)",
        "(line 89,col 9)-(line 89,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.cumulativeProbability(int)",
      "begin_line": 99,
      "end_line": 108,
      "comment": "\n     * The probability distribution function {@code P(X \u003c\u003d x)} for a\n     * Zipf distribution.\n     *\n     * @param x Value at which the PDF is evaluated.\n     * @return Zipf distribution function evaluated at {@code x}.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 105,col 9)",
        "(line 107,col 9)-(line 107,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 117,
      "end_line": 120,
      "comment": "\n     * Access the domain value lower bound, based on {@code p}, used to\n     * bracket a PDF root.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value lower bound, i.e. {@code P(X \u003c \u0027lower bound\u0027) \u003c p}.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 129,
      "end_line": 132,
      "comment": "\n     * Access the domain value upper bound, based on {@code p}, used to\n     * bracket a PDF root.\n     *\n     * @param p Desired probability for the critical value\n     * @return the domain value upper bound, i.e. {@code P(X \u003c \u0027upper bound\u0027) \u003e p}.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.generalizedHarmonic(int, double)",
      "begin_line": 143,
      "end_line": 149,
      "comment": "\n     * Calculates the Nth generalized harmonic number. See\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/HarmonicSeries.html\"\u003eHarmonic\n     * Series\u003c/a\u003e.\n     *\n     * @param n Term in the series to calculate (must be larger than 1)\n     * @param m Exponent (special case {@code m \u003d 1} is the harmonic series).\n     * @return the n\u003csup\u003eth\u003c/sup\u003e generalized harmonic number.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 25)",
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.getSupportLowerBound()",
      "begin_line": 158,
      "end_line": 161,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 1 no matter the parameters.\n     *\n     * @return lower bound of the support (always 1)\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.getSupportUpperBound()",
      "begin_line": 170,
      "end_line": 173,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is the number of elements\n     *\n     * @return upper bound of the support\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.calculateNumericalMean()",
      "begin_line": 187,
      "end_line": 196,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For number of elements N and exponent s, the mean is\n     * \u003ccode\u003eHs1 / Hs\u003c/code\u003e where\n     * \u003cul\u003e\n     *  \u003cli\u003e\u003ccode\u003eHs1 \u003d generalizedHarmonic(N, s - 1)\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003eHs \u003d generalizedHarmonic(N, s)\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 44)",
        "(line 190,col 9)-(line 190,col 39)",
        "(line 192,col 9)-(line 192,col 57)",
        "(line 193,col 9)-(line 193,col 52)",
        "(line 195,col 9)-(line 195,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistributionImpl.calculateNumericalVariance()",
      "begin_line": 211,
      "end_line": 221,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For number of elements N and exponent s, the mean is\n     * \u003ccode\u003e(Hs2 / Hs) - (Hs1^2 / Hs^2)\u003c/code\u003e where\n     * \u003cul\u003e\n     *  \u003cli\u003e\u003ccode\u003eHs2 \u003d generalizedHarmonic(N, s - 2)\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003eHs1 \u003d generalizedHarmonic(N, s - 1)\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003eHs \u003d generalizedHarmonic(N, s)\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 44)",
        "(line 214,col 9)-(line 214,col 39)",
        "(line 216,col 9)-(line 216,col 57)",
        "(line 217,col 9)-(line 217,col 57)",
        "(line 218,col 9)-(line 218,col 52)",
        "(line 220,col 9)-(line 220,col 54)"
      ]
    }
  ]
}