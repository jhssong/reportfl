{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/ZipfDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipfDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractIntegerDistribution"
      ],
      "begin_line": 32,
      "end_line": 245,
      "comment": "\n * Implementation of the Zipf distribution.\n *\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/ZipfDistribution.html\"\u003eZipf distribution (MathWorld)\u003c/a\u003e\n * @version $Id$\n "
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
      "type": "field",
      "varNames": [
        "numericalMean"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Cached numerical mean "
    },
    {
      "type": "field",
      "varNames": [
        "numericalMeanIsCalculated"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Whether or not the numerical mean has been calculated "
    },
    {
      "type": "field",
      "varNames": [
        "numericalVariance"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Cached numerical variance "
    },
    {
      "type": "field",
      "varNames": [
        "numericalVarianceIsCalculated"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Whether or not the numerical variance has been calculated "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.ZipfDistribution.ZipfDistribution(int, double)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Create a new Zipf distribution with the given number of elements and\n     * exponent.\n     *\n     * @param numberOfElements Number of elements.\n     * @param exponent Exponent.\n     * @exception NotStrictlyPositiveException if {@code numberOfElements \u003c\u003d 0}\n     * or {@code exponent \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.ZipfDistribution.ZipfDistribution(org.apache.commons.math3.random.RandomGenerator, int, double)",
      "begin_line": 71,
      "end_line": 88,
      "comment": "\n     * Creates a Zipf distribution.\n     *\n     * @param rng Random number generator.\n     * @param numberOfElements Number of elements.\n     * @param exponent Exponent.\n     * @exception NotStrictlyPositiveException if {@code numberOfElements \u003c\u003d 0}\n     * or {@code exponent \u003c\u003d 0}.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 19)",
        "(line 77,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 84,col 9)",
        "(line 86,col 9)-(line 86,col 49)",
        "(line 87,col 9)-(line 87,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ZipfDistribution.getNumberOfElements()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Get the number of elements (e.g. corpus size) for the distribution.\n     *\n     * @return the number of elements\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ZipfDistribution.getExponent()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Get the exponent characterizing the distribution.\n     *\n     * @return the exponent\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ZipfDistribution.probability(int)",
      "begin_line": 109,
      "end_line": 115,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 110,col 9)-(line 112,col 9)",
        "(line 114,col 9)-(line 114,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ZipfDistribution.cumulativeProbability(int)",
      "begin_line": 118,
      "end_line": 126,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 119,col 9)-(line 123,col 9)",
        "(line 125,col 9)-(line 125,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ZipfDistribution.getNumericalMean()",
      "begin_line": 138,
      "end_line": 144,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For number of elements {@code N} and exponent {@code s}, the mean is\n     * {@code Hs1 / Hs}, where\n     * \u003cul\u003e\n     *  \u003cli\u003e{@code Hs1 \u003d generalizedHarmonic(N, s - 1)},\u003c/li\u003e\n     *  \u003cli\u003e{@code Hs \u003d generalizedHarmonic(N, s)}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ZipfDistribution.calculateNumericalMean()",
      "begin_line": 151,
      "end_line": 159,
      "comment": "\n     * Used by {@link #getNumericalMean()}.\n     *\n     * @return the mean of this distribution\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 44)",
        "(line 153,col 9)-(line 153,col 39)",
        "(line 155,col 9)-(line 155,col 57)",
        "(line 156,col 9)-(line 156,col 52)",
        "(line 158,col 9)-(line 158,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ZipfDistribution.getNumericalVariance()",
      "begin_line": 172,
      "end_line": 178,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For number of elements {@code N} and exponent {@code s}, the mean is\n     * {@code (Hs2 / Hs) - (Hs1^2 / Hs^2)}, where\n     * \u003cul\u003e\n     *  \u003cli\u003e{@code Hs2 \u003d generalizedHarmonic(N, s - 2)},\u003c/li\u003e\n     *  \u003cli\u003e{@code Hs1 \u003d generalizedHarmonic(N, s - 1)},\u003c/li\u003e\n     *  \u003cli\u003e{@code Hs \u003d generalizedHarmonic(N, s)}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ZipfDistribution.calculateNumericalVariance()",
      "begin_line": 185,
      "end_line": 194,
      "comment": "\n     * Used by {@link #getNumericalVariance()}.\n     *\n     * @return the variance of this distribution\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 44)",
        "(line 187,col 9)-(line 187,col 39)",
        "(line 189,col 9)-(line 189,col 57)",
        "(line 190,col 9)-(line 190,col 57)",
        "(line 191,col 9)-(line 191,col 52)",
        "(line 193,col 9)-(line 193,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ZipfDistribution.generalizedHarmonic(int, double)",
      "begin_line": 205,
      "end_line": 211,
      "comment": "\n     * Calculates the Nth generalized harmonic number. See\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/HarmonicSeries.html\"\u003eHarmonic\n     * Series\u003c/a\u003e.\n     *\n     * @param n Term in the series to calculate (must be larger than 1)\n     * @param m Exponent (special case {@code m \u003d 1} is the harmonic series).\n     * @return the n\u003csup\u003eth\u003c/sup\u003e generalized harmonic number.\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 25)",
        "(line 207,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ZipfDistribution.getSupportLowerBound()",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 1 no matter the parameters.\n     *\n     * @return lower bound of the support (always 1)\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ZipfDistribution.getSupportUpperBound()",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is the number of elements.\n     *\n     * @return upper bound of the support\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ZipfDistribution.isSupportConnected()",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 20)"
      ]
    }
  ]
}