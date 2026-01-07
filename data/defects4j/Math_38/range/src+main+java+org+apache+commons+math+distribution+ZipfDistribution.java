{
  "filepath": "/tmp/Math-38b/src/main/java/org/apache/commons/math/distribution/ZipfDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipfDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractIntegerDistribution"
      ],
      "begin_line": 30,
      "end_line": 243,
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
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.getDomainLowerBound(double)",
      "begin_line": 115,
      "end_line": 118,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.getDomainUpperBound(double)",
      "begin_line": 121,
      "end_line": 124,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.getNumericalMean()",
      "begin_line": 136,
      "end_line": 142,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For number of elements {@code N} and exponent {@code s}, the mean is\n     * {@code Hs1 / Hs}, where\n     * \u003cul\u003e\n     *  \u003cli\u003e{@code Hs1 \u003d generalizedHarmonic(N, s - 1)},\u003c/li\u003e\n     *  \u003cli\u003e{@code Hs \u003d generalizedHarmonic(N, s)}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.calculateNumericalMean()",
      "begin_line": 149,
      "end_line": 157,
      "comment": "\n     * Used by {@link #getNumericalMean()}.\n     *\n     * @return the mean of this distribution\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 44)",
        "(line 151,col 9)-(line 151,col 39)",
        "(line 153,col 9)-(line 153,col 57)",
        "(line 154,col 9)-(line 154,col 52)",
        "(line 156,col 9)-(line 156,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.getNumericalVariance()",
      "begin_line": 170,
      "end_line": 176,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For number of elements {@code N} and exponent {@code s}, the mean is\n     * {@code (Hs2 / Hs) - (Hs1^2 / Hs^2)}, where\n     * \u003cul\u003e\n     *  \u003cli\u003e{@code Hs2 \u003d generalizedHarmonic(N, s - 2)},\u003c/li\u003e\n     *  \u003cli\u003e{@code Hs1 \u003d generalizedHarmonic(N, s - 1)},\u003c/li\u003e\n     *  \u003cli\u003e{@code Hs \u003d generalizedHarmonic(N, s)}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.calculateNumericalVariance()",
      "begin_line": 183,
      "end_line": 192,
      "comment": "\n     * used by {@link #getNumericalVariance()}\n     *\n     * @return the variance of this distribution\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 44)",
        "(line 185,col 9)-(line 185,col 39)",
        "(line 187,col 9)-(line 187,col 57)",
        "(line 188,col 9)-(line 188,col 57)",
        "(line 189,col 9)-(line 189,col 52)",
        "(line 191,col 9)-(line 191,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.generalizedHarmonic(int, double)",
      "begin_line": 203,
      "end_line": 209,
      "comment": "\n     * Calculates the Nth generalized harmonic number. See\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/HarmonicSeries.html\"\u003eHarmonic\n     * Series\u003c/a\u003e.\n     *\n     * @param n Term in the series to calculate (must be larger than 1)\n     * @param m Exponent (special case {@code m \u003d 1} is the harmonic series).\n     * @return the n\u003csup\u003eth\u003c/sup\u003e generalized harmonic number.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 25)",
        "(line 205,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 208,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.getSupportLowerBound()",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 1 no matter the parameters.\n     *\n     * @return lower bound of the support (always 1)\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.getSupportUpperBound()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is the number of elements.\n     *\n     * @return upper bound of the support\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.isSupportConnected()",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 20)"
      ]
    }
  ]
}