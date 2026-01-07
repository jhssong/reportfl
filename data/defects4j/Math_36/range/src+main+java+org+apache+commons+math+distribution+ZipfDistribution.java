{
  "filepath": "/tmp/Math-36b/src/main/java/org/apache/commons/math/distribution/ZipfDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipfDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractIntegerDistribution"
      ],
      "begin_line": 30,
      "end_line": 231,
      "comment": "\n * Implementation of the Zipf distribution.\n *\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/ZipfDistribution.html\"\u003eZipf distribution (MathWorld)\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfElements"
      ],
      "begin_line": 35,
      "end_line": 35,
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
      "begin_line": 41,
      "end_line": 41,
      "comment": " Cached numerical mean "
    },
    {
      "type": "field",
      "varNames": [
        "numericalMeanIsCalculated"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Whether or not the numerical mean has been calculated "
    },
    {
      "type": "field",
      "varNames": [
        "numericalVariance"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Cached numerical variance "
    },
    {
      "type": "field",
      "varNames": [
        "numericalVarianceIsCalculated"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Whether or not the numerical variance has been calculated "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.ZipfDistribution(int, double)",
      "begin_line": 61,
      "end_line": 74,
      "comment": "\n     * Create a new Zipf distribution with the given number of elements and\n     * exponent.\n     *\n     * @param numberOfElements Number of elements.\n     * @param exponent Exponent.\n     * @exception NotStrictlyPositiveException if {@code numberOfElements \u003c\u003d 0}\n     * or {@code exponent \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 66,col 9)",
        "(line 67,col 9)-(line 70,col 9)",
        "(line 72,col 9)-(line 72,col 49)",
        "(line 73,col 9)-(line 73,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.getNumberOfElements()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Get the number of elements (e.g. corpus size) for the distribution.\n     *\n     * @return the number of elements\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.getExponent()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Get the exponent characterizing the distribution.\n     *\n     * @return the exponent\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.probability(int)",
      "begin_line": 95,
      "end_line": 101,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 96,col 9)-(line 98,col 9)",
        "(line 100,col 9)-(line 100,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.cumulativeProbability(int)",
      "begin_line": 104,
      "end_line": 112,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 105,col 9)-(line 109,col 9)",
        "(line 111,col 9)-(line 111,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.getNumericalMean()",
      "begin_line": 124,
      "end_line": 130,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For number of elements {@code N} and exponent {@code s}, the mean is\n     * {@code Hs1 / Hs}, where\n     * \u003cul\u003e\n     *  \u003cli\u003e{@code Hs1 \u003d generalizedHarmonic(N, s - 1)},\u003c/li\u003e\n     *  \u003cli\u003e{@code Hs \u003d generalizedHarmonic(N, s)}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.calculateNumericalMean()",
      "begin_line": 137,
      "end_line": 145,
      "comment": "\n     * Used by {@link #getNumericalMean()}.\n     *\n     * @return the mean of this distribution\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 44)",
        "(line 139,col 9)-(line 139,col 39)",
        "(line 141,col 9)-(line 141,col 57)",
        "(line 142,col 9)-(line 142,col 52)",
        "(line 144,col 9)-(line 144,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.getNumericalVariance()",
      "begin_line": 158,
      "end_line": 164,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For number of elements {@code N} and exponent {@code s}, the mean is\n     * {@code (Hs2 / Hs) - (Hs1^2 / Hs^2)}, where\n     * \u003cul\u003e\n     *  \u003cli\u003e{@code Hs2 \u003d generalizedHarmonic(N, s - 2)},\u003c/li\u003e\n     *  \u003cli\u003e{@code Hs1 \u003d generalizedHarmonic(N, s - 1)},\u003c/li\u003e\n     *  \u003cli\u003e{@code Hs \u003d generalizedHarmonic(N, s)}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.calculateNumericalVariance()",
      "begin_line": 171,
      "end_line": 180,
      "comment": "\n     * Used by {@link #getNumericalVariance()}.\n     *\n     * @return the variance of this distribution\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 44)",
        "(line 173,col 9)-(line 173,col 39)",
        "(line 175,col 9)-(line 175,col 57)",
        "(line 176,col 9)-(line 176,col 57)",
        "(line 177,col 9)-(line 177,col 52)",
        "(line 179,col 9)-(line 179,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.generalizedHarmonic(int, double)",
      "begin_line": 191,
      "end_line": 197,
      "comment": "\n     * Calculates the Nth generalized harmonic number. See\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/HarmonicSeries.html\"\u003eHarmonic\n     * Series\u003c/a\u003e.\n     *\n     * @param n Term in the series to calculate (must be larger than 1)\n     * @param m Exponent (special case {@code m \u003d 1} is the harmonic series).\n     * @return the n\u003csup\u003eth\u003c/sup\u003e generalized harmonic number.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 25)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.getSupportLowerBound()",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 1 no matter the parameters.\n     *\n     * @return lower bound of the support (always 1)\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.getSupportUpperBound()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is the number of elements.\n     *\n     * @return upper bound of the support\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.isSupportConnected()",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 20)"
      ]
    }
  ]
}