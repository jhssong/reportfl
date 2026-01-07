{
  "filepath": "/tmp/Math-42b/src/main/java/org/apache/commons/math/distribution/ZipfDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipfDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractIntegerDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 32,
      "end_line": 200,
      "comment": "\n * Implementation of the Zipf distribution.\n *\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/ZipfDistribution.html\"\u003eZipf distribution (MathWorld)\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfElements"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Number of elements. "
    },
    {
      "type": "field",
      "varNames": [
        "exponent"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Exponent parameter of the distribution. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.ZipfDistribution(int, double)",
      "begin_line": 50,
      "end_line": 63,
      "comment": "\n     * Create a new Zipf distribution with the given number of elements and\n     * exponent.\n     *\n     * @param numberOfElements Number of elements.\n     * @param exponent Exponent.\n     * @exception NotStrictlyPositiveException if {@code numberOfElements \u003c\u003d 0}\n     * or {@code exponent \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 55,col 9)",
        "(line 56,col 9)-(line 59,col 9)",
        "(line 61,col 9)-(line 61,col 49)",
        "(line 62,col 9)-(line 62,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.getNumberOfElements()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Get the number of elements (e.g. corpus size) for the distribution.\n     *\n     * @return the number of elements\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.getExponent()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Get the exponent characterizing the distribution.\n     *\n     * @return the exponent\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.probability(int)",
      "begin_line": 84,
      "end_line": 90,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 85,col 9)-(line 87,col 9)",
        "(line 89,col 9)-(line 89,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.cumulativeProbability(int)",
      "begin_line": 93,
      "end_line": 102,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 95,col 9)-(line 99,col 9)",
        "(line 101,col 9)-(line 101,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.getDomainLowerBound(double)",
      "begin_line": 105,
      "end_line": 108,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.getDomainUpperBound(double)",
      "begin_line": 111,
      "end_line": 114,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.generalizedHarmonic(int, double)",
      "begin_line": 125,
      "end_line": 131,
      "comment": "\n     * Calculates the Nth generalized harmonic number. See\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/HarmonicSeries.html\"\u003eHarmonic\n     * Series\u003c/a\u003e.\n     *\n     * @param n Term in the series to calculate (must be larger than 1)\n     * @param m Exponent (special case {@code m \u003d 1} is the harmonic series).\n     * @return the n\u003csup\u003eth\u003c/sup\u003e generalized harmonic number.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 25)",
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.getSupportLowerBound()",
      "begin_line": 140,
      "end_line": 143,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 1 no matter the parameters.\n     *\n     * @return lower bound of the support (always 1)\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.getSupportUpperBound()",
      "begin_line": 152,
      "end_line": 155,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is the number of elements.\n     *\n     * @return upper bound of the support\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.calculateNumericalMean()",
      "begin_line": 167,
      "end_line": 176,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For number of elements {@code N} and exponent {@code s}, the mean is\n     * {@code Hs1 / Hs}, where\n     * \u003cul\u003e\n     *  \u003cli\u003e{@code Hs1 \u003d generalizedHarmonic(N, s - 1)},\u003c/li\u003e\n     *  \u003cli\u003e{@code Hs \u003d generalizedHarmonic(N, s)}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 44)",
        "(line 170,col 9)-(line 170,col 39)",
        "(line 172,col 9)-(line 172,col 57)",
        "(line 173,col 9)-(line 173,col 52)",
        "(line 175,col 9)-(line 175,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ZipfDistribution.calculateNumericalVariance()",
      "begin_line": 189,
      "end_line": 199,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For number of elements {@code N} and exponent {@code s}, the mean is\n     * {@code (Hs2 / Hs) - (Hs1^2 / Hs^2)}, where\n     * \u003cul\u003e\n     *  \u003cli\u003e{@code Hs2 \u003d generalizedHarmonic(N, s - 2)},\u003c/li\u003e\n     *  \u003cli\u003e{@code Hs1 \u003d generalizedHarmonic(N, s - 1)},\u003c/li\u003e\n     *  \u003cli\u003e{@code Hs \u003d generalizedHarmonic(N, s)}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 44)",
        "(line 192,col 9)-(line 192,col 39)",
        "(line 194,col 9)-(line 194,col 57)",
        "(line 195,col 9)-(line 195,col 57)",
        "(line 196,col 9)-(line 196,col 52)",
        "(line 198,col 9)-(line 198,col 54)"
      ]
    }
  ]
}