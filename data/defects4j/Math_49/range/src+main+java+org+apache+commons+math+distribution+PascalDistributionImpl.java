{
  "filepath": "/tmp/Math-49b/src/main/java/org/apache/commons/math/distribution/PascalDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PascalDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractIntegerDistribution",
        "org.apache.commons.math.distribution.PascalDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 34,
      "end_line": 236,
      "comment": "\n * The default implementation of {@link PascalDistribution}.\n * @version $Id$\n * @since 1.2\n "
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
        "numberOfSuccesses"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The number of successes. "
    },
    {
      "type": "field",
      "varNames": [
        "probabilityOfSuccess"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The probability of success. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.PascalDistributionImpl(int, double)",
      "begin_line": 50,
      "end_line": 61,
      "comment": "\n     * Create a Pascal distribution with the given number of trials and\n     * probability of success.\n     *\n     * @param r Number of successes.\n     * @param p Probability of success.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 57,col 9)",
        "(line 59,col 9)-(line 59,col 30)",
        "(line 60,col 9)-(line 60,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.getNumberOfSuccesses()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.getProbabilityOfSuccess()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * Access the domain value lower bound, based on {@code p}, used to\n     * bracket a PDF root.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value lower bound, i.e. {@code P(X \u003c \u0027lower bound\u0027) \u003c p}.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 96,
      "end_line": 100,
      "comment": "\n     * Access the domain value upper bound, based on {@code p}, used to\n     * bracket a PDF root.\n     *\n     * @param p Desired probability for the critical value\n     * @return the domain value upper bound, i.e. {@code P(X \u003c \u0027upper bound\u0027) \u003e p}.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.cumulativeProbability(int)",
      "begin_line": 110,
      "end_line": 120,
      "comment": "\n     * For this distribution, {@code X}, this method returns {@code P(X \u003c\u003d x)}.\n     *\n     * @param x Value at which the PDF is evaluated.\n     * @return PDF for this distribution.\n     * @throws MathException if the cumulative probability can not be computed\n     * due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 19)",
        "(line 113,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.probability(int)",
      "begin_line": 128,
      "end_line": 139,
      "comment": "\n     * For this distribution, {@code X}, this method returns {@code P(X \u003d x)}.\n     *\n     * @param x Value at which the PMF is evaluated.\n     * @return PMF for this distribution.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 19)",
        "(line 130,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 152,
      "end_line": 167,
      "comment": "\n     * For this distribution, {@code X}, this method returns the largest\n     * {@code x}, such that {@code P(X \u003c\u003d x) \u003c\u003d p}.\n     * It will return -1 when p \u003d 0 and {@code Integer.MAX_VALUE} when p \u003d 1.\n     *\n     * @param p Desired probability.\n     * @return the largest {@code x} such that {@code P(X \u003c\u003d x) \u003c\u003d p}.\n     * @throws MathException if the inverse cumulative probability can not be\n     * computed due to convergence or other numerical errors.\n     * @throws OutOfRangeException if {@code p \u003c 0} or {@code p \u003e 1}.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 16)",
        "(line 158,col 9)-(line 164,col 9)",
        "(line 166,col 9)-(line 166,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.getSupportLowerBound()",
      "begin_line": 176,
      "end_line": 179,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the parameters.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.getSupportUpperBound()",
      "begin_line": 191,
      "end_line": 194,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the parameters. Positive infinity is symbolised\n     * by \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e together with\n     * {@link #isSupportUpperBoundInclusive()} being \u003ccode\u003efalse\u003c/code\u003e\n     *\n     * @return upper bound of the support (always \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e for positive infinity)\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.calculateNumericalMean()",
      "begin_line": 205,
      "end_line": 210,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For number of successes \u003ccode\u003er\u003c/code\u003e and\n     * probability of success \u003ccode\u003ep\u003c/code\u003e, the mean is\n     * \u003ccode\u003e( r * p ) / ( 1 - p )\u003c/code\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 51)",
        "(line 208,col 9)-(line 208,col 48)",
        "(line 209,col 9)-(line 209,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.calculateNumericalVariance()",
      "begin_line": 221,
      "end_line": 227,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For number of successes \u003ccode\u003er\u003c/code\u003e and\n     * probability of success \u003ccode\u003ep\u003c/code\u003e, the mean is\n     * \u003ccode\u003e( r * p ) / ( 1 - p )^2\u003c/code\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 51)",
        "(line 224,col 9)-(line 224,col 48)",
        "(line 225,col 9)-(line 225,col 34)",
        "(line 226,col 9)-(line 226,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.isSupportUpperBoundInclusive()",
      "begin_line": 232,
      "end_line": 235,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 21)"
      ]
    }
  ]
}