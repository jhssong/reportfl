{
  "filepath": "/tmp/Math-27b/src/main/java/org/apache/commons/math3/distribution/TriangularDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TriangularDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 37,
      "end_line": 287,
      "comment": "\n * Implementation of the triangular real distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Triangular_distribution\"\u003e\n * Triangular distribution (Wikipedia)\u003c/a\u003e\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 41,
      "end_line": 41,
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
      "begin_line": 45,
      "end_line": 45,
      "comment": " Mode of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.TriangularDistribution.TriangularDistribution(double, double, double)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Creates a triangular real distribution using the given lower limit,\n     * upper limit, and mode.\n     *\n     * @param a Lower limit of this distribution (inclusive).\n     * @param b Upper limit of this distribution (inclusive).\n     * @param c Mode of this distribution.\n     * @throws NumberIsTooLargeException if {@code a \u003e\u003d b} or if {@code c \u003e b}.\n     * @throws NumberIsTooSmallException if {@code c \u003c a}.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.TriangularDistribution.TriangularDistribution(org.apache.commons.math3.random.RandomGenerator, double, double, double)",
      "begin_line": 75,
      "end_line": 100,
      "comment": "\n     * Creates a triangular distribution.\n     *\n     * @param rng Random number generator.\n     * @param a Lower limit of this distribution (inclusive).\n     * @param b Upper limit of this distribution (inclusive).\n     * @param c Mode of this distribution.\n     * @throws NumberIsTooLargeException if {@code a \u003e\u003d b} or if {@code c \u003e b}.\n     * @throws NumberIsTooSmallException if {@code c \u003c a}.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 19)",
        "(line 82,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 94,col 9)",
        "(line 96,col 9)-(line 96,col 19)",
        "(line 97,col 9)-(line 97,col 19)",
        "(line 98,col 9)-(line 98,col 19)",
        "(line 99,col 9)-(line 99,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistribution.getMode()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Returns the mode {@code c} of this distribution.\n     *\n     * @return the mode {@code c} of this distribution\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 124,
      "end_line": 127,
      "comment": "\n     * {@inheritDoc}\n     *\n     * \u003cp\u003e\n     * For this distribution, the returned value is not really meaningful,\n     * since exact formulas are implemented for the computation of the\n     * {@link #inverseCumulativeProbability(double)} (no solver is invoked).\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * For lower limit {@code a} and upper limit {@code b}, the current\n     * implementation returns {@code max(ulp(a), ulp(b)}.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistribution.probability(double)",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For this distribution {@code P(X \u003d x)} always evaluates to 0.\n     *\n     * @return 0\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistribution.density(double)",
      "begin_line": 152,
      "end_line": 170,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For lower limit {@code a}, upper limit {@code b} and mode {@code c}, the\n     * PDF is given by\n     * \u003cul\u003e\n     * \u003cli\u003e{@code 2 * (x - a) / [(b - a) * (c - a)]} if {@code a \u003c\u003d x \u003c c},\u003c/li\u003e\n     * \u003cli\u003e{@code 2 / (b - a)} if {@code x \u003d c},\u003c/li\u003e\n     * \u003cli\u003e{@code 2 * (b - x) / [(b - a) * (b - c)]} if {@code c \u003c x \u003c\u003d b},\u003c/li\u003e\n     * \u003cli\u003e{@code 0} otherwise.\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistribution.cumulativeProbability(double)",
      "begin_line": 185,
      "end_line": 203,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For lower limit {@code a}, upper limit {@code b} and mode {@code c}, the\n     * CDF is given by\n     * \u003cul\u003e\n     * \u003cli\u003e{@code 0} if {@code x \u003c a},\u003c/li\u003e\n     * \u003cli\u003e{@code (x - a)^2 / [(b - a) * (c - a)]} if {@code a \u003c\u003d x \u003c c},\u003c/li\u003e\n     * \u003cli\u003e{@code (c - a) / (b - a)} if {@code x \u003d c},\u003c/li\u003e\n     * \u003cli\u003e{@code 1 - (b - x)^2 / [(b - a) * (b - c)]} if {@code c \u003c x \u003c\u003d b},\u003c/li\u003e\n     * \u003cli\u003e{@code 1} if {@code x \u003e b}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistribution.getNumericalMean()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For lower limit {@code a}, upper limit {@code b}, and mode {@code c},\n     * the mean is {@code (a + b + c) / 3}.\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistribution.getNumericalVariance()",
      "begin_line": 221,
      "end_line": 223,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For lower limit {@code a}, upper limit {@code b}, and mode {@code c},\n     * the variance is {@code (a^2 + b^2 + c^2 - a * b - a * c - b * c) / 18}.\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistribution.getSupportLowerBound()",
      "begin_line": 233,
      "end_line": 235,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is equal to the lower limit parameter\n     * {@code a} of the distribution.\n     *\n     * @return lower bound of the support\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistribution.getSupportUpperBound()",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is equal to the upper limit parameter\n     * {@code b} of the distribution.\n     *\n     * @return upper bound of the support\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 250,
      "end_line": 252,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 255,
      "end_line": 257,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistribution.isSupportConnected()",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistribution.inverseCumulativeProbability(double)",
      "begin_line": 270,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 273,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 62)"
      ]
    }
  ]
}