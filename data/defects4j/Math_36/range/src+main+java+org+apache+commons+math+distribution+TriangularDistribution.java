{
  "filepath": "/tmp/Math-36b/src/main/java/org/apache/commons/math/distribution/TriangularDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TriangularDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractRealDistribution"
      ],
      "begin_line": 35,
      "end_line": 272,
      "comment": "\n * Implementation of the triangular real distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Triangular_distribution\"\u003e\n * Triangular distribution (Wikipedia)\u003c/a\u003e\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Lower limit of this distribution (inclusive). "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Upper limit of this distribution (inclusive). "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Mode of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.TriangularDistribution.TriangularDistribution(double, double, double)",
      "begin_line": 61,
      "end_line": 81,
      "comment": "\n     * Create a triangular real distribution using the given lower limit,\n     * upper limit, and mode.\n     *\n     * @param a Lower limit of this distribution (inclusive).\n     * @param b Upper limit of this distribution (inclusive).\n     * @param c Mode of this distribution.\n     * @throws NumberIsTooLargeException if {@code a \u003e\u003d b} or if {@code c \u003e b}\n     * @throws NumberIsTooSmallException if {@code c \u003c a}\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 75,col 9)",
        "(line 77,col 9)-(line 77,col 19)",
        "(line 78,col 9)-(line 78,col 19)",
        "(line 79,col 9)-(line 79,col 19)",
        "(line 80,col 9)-(line 80,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TriangularDistribution.getMode()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Returns the mode {@code c} of this distribution.\n     *\n     * @return the mode {@code c} of this distribution\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TriangularDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 105,
      "end_line": 108,
      "comment": "\n     * {@inheritDoc}\n     *\n     * \u003cp\u003e\n     * For this distribution, the returned value is not really meaningful,\n     * since exact formulas are implemented for the computation of the\n     * {@link #inverseCumulativeProbability(double)} (no solver is invoked).\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * For lower limit {@code a} and upper limit {@code b}, the current\n     * implementation returns {@code max(ulp(a), ulp(b)}.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TriangularDistribution.probability(double)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For this distribution {@code P(X \u003d x)} always evaluates to 0.\n     *\n     * @return 0\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TriangularDistribution.density(double)",
      "begin_line": 133,
      "end_line": 151,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For lower limit {@code a}, upper limit {@code b} and mode {@code c}, the\n     * PDF is given by\n     * \u003cul\u003e\n     * \u003cli\u003e{@code 2 * (x - a) / [(b - a) * (c - a)]} if {@code a \u003c\u003d x \u003c c},\u003c/li\u003e\n     * \u003cli\u003e{@code 2 / (b - a)} if {@code x \u003d c},\u003c/li\u003e\n     * \u003cli\u003e{@code 2 * (b - x) / [(b - a) * (b - c)]} if {@code c \u003c x \u003c\u003d b},\u003c/li\u003e\n     * \u003cli\u003e{@code 0} otherwise.\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TriangularDistribution.cumulativeProbability(double)",
      "begin_line": 166,
      "end_line": 184,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For lower limit {@code a}, upper limit {@code b} and mode {@code c}, the\n     * CDF is given by\n     * \u003cul\u003e\n     * \u003cli\u003e{@code 0} if {@code x \u003c a},\u003c/li\u003e\n     * \u003cli\u003e{@code (x - a)^2 / [(b - a) * (c - a)]} if {@code a \u003c\u003d x \u003c c},\u003c/li\u003e\n     * \u003cli\u003e{@code (c - a) / (b - a)} if {@code x \u003d c},\u003c/li\u003e\n     * \u003cli\u003e{@code 1 - (b - x)^2 / [(b - a) * (b - c)]} if {@code c \u003c x \u003c\u003d b},\u003c/li\u003e\n     * \u003cli\u003e{@code 1} if {@code x \u003e b}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TriangularDistribution.getNumericalMean()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For lower limit {@code a}, upper limit {@code b}, and mode {@code c},\n     * the mean is {@code (a + b + c) / 3}.\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TriangularDistribution.getNumericalVariance()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For lower limit {@code a}, upper limit {@code b}, and mode {@code c},\n     * the variance is {@code (a^2 + b^2 + c^2 - a * b - a * c - b * c) / 18}.\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TriangularDistribution.getSupportLowerBound()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is equal to the lower limit parameter\n     * {@code a} of the distribution.\n     *\n     * @return lower bound of the support\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TriangularDistribution.getSupportUpperBound()",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is equal to the upper limit parameter\n     * {@code b} of the distribution.\n     *\n     * @return upper bound of the support\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TriangularDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 231,
      "end_line": 233,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TriangularDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 236,
      "end_line": 238,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TriangularDistribution.isSupportConnected()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TriangularDistribution.inverseCumulativeProbability(double)",
      "begin_line": 251,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 254,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 44)",
        "(line 264,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 269,col 9)",
        "(line 270,col 9)-(line 270,col 62)"
      ]
    }
  ]
}