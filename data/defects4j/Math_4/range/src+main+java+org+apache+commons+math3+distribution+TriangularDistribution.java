{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/TriangularDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TriangularDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 37,
      "end_line": 276,
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
      "signature": "org.apache.commons.math3.distribution.TriangularDistribution.density(double)",
      "begin_line": 141,
      "end_line": 159,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For lower limit {@code a}, upper limit {@code b} and mode {@code c}, the\n     * PDF is given by\n     * \u003cul\u003e\n     * \u003cli\u003e{@code 2 * (x - a) / [(b - a) * (c - a)]} if {@code a \u003c\u003d x \u003c c},\u003c/li\u003e\n     * \u003cli\u003e{@code 2 / (b - a)} if {@code x \u003d c},\u003c/li\u003e\n     * \u003cli\u003e{@code 2 * (b - x) / [(b - a) * (b - c)]} if {@code c \u003c x \u003c\u003d b},\u003c/li\u003e\n     * \u003cli\u003e{@code 0} otherwise.\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistribution.cumulativeProbability(double)",
      "begin_line": 174,
      "end_line": 192,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For lower limit {@code a}, upper limit {@code b} and mode {@code c}, the\n     * CDF is given by\n     * \u003cul\u003e\n     * \u003cli\u003e{@code 0} if {@code x \u003c a},\u003c/li\u003e\n     * \u003cli\u003e{@code (x - a)^2 / [(b - a) * (c - a)]} if {@code a \u003c\u003d x \u003c c},\u003c/li\u003e\n     * \u003cli\u003e{@code (c - a) / (b - a)} if {@code x \u003d c},\u003c/li\u003e\n     * \u003cli\u003e{@code 1 - (b - x)^2 / [(b - a) * (b - c)]} if {@code c \u003c x \u003c\u003d b},\u003c/li\u003e\n     * \u003cli\u003e{@code 1} if {@code x \u003e b}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 191,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistribution.getNumericalMean()",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For lower limit {@code a}, upper limit {@code b}, and mode {@code c},\n     * the mean is {@code (a + b + c) / 3}.\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistribution.getNumericalVariance()",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For lower limit {@code a}, upper limit {@code b}, and mode {@code c},\n     * the variance is {@code (a^2 + b^2 + c^2 - a * b - a * c - b * c) / 18}.\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistribution.getSupportLowerBound()",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is equal to the lower limit parameter\n     * {@code a} of the distribution.\n     *\n     * @return lower bound of the support\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistribution.getSupportUpperBound()",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is equal to the upper limit parameter\n     * {@code b} of the distribution.\n     *\n     * @return upper bound of the support\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 239,
      "end_line": 241,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 244,
      "end_line": 246,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistribution.isSupportConnected()",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistribution.inverseCumulativeProbability(double)",
      "begin_line": 259,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 262,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 62)"
      ]
    }
  ]
}