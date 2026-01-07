{
  "filepath": "/tmp/Math-45b/src/main/java/org/apache/commons/math/distribution/PascalDistributionImpl.java",
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
      "begin_line": 33,
      "end_line": 231,
      "comment": "\n * The default implementation of {@link PascalDistribution}.\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfSuccesses"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The number of successes. "
    },
    {
      "type": "field",
      "varNames": [
        "probabilityOfSuccess"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The probability of success. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.PascalDistributionImpl(int, double)",
      "begin_line": 49,
      "end_line": 60,
      "comment": "\n     * Create a Pascal distribution with the given number of trials and\n     * probability of success.\n     *\n     * @param r Number of successes.\n     * @param p Probability of success.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 53,col 9)",
        "(line 54,col 9)-(line 56,col 9)",
        "(line 58,col 9)-(line 58,col 30)",
        "(line 59,col 9)-(line 59,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.getNumberOfSuccesses()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.getProbabilityOfSuccess()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 83,
      "end_line": 86,
      "comment": "\n     * Access the domain value lower bound, based on {@code p}, used to\n     * bracket a PDF root.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value lower bound, i.e. {@code P(X \u003c \u0027lower bound\u0027) \u003c p}.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 95,
      "end_line": 99,
      "comment": "\n     * Access the domain value upper bound, based on {@code p}, used to\n     * bracket a PDF root.\n     *\n     * @param p Desired probability for the critical value\n     * @return the domain value upper bound, i.e. {@code P(X \u003c \u0027upper bound\u0027) \u003e p}.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.cumulativeProbability(int)",
      "begin_line": 108,
      "end_line": 118,
      "comment": "\n     * For this distribution, {@code X}, this method returns {@code P(X \u003c\u003d x)}.\n     *\n     * @param x Value at which the PDF is evaluated.\n     * @return PDF for this distribution.\n     * due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 19)",
        "(line 111,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.probability(int)",
      "begin_line": 126,
      "end_line": 137,
      "comment": "\n     * For this distribution, {@code X}, this method returns {@code P(X \u003d x)}.\n     *\n     * @param x Value at which the PMF is evaluated.\n     * @return PMF for this distribution.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 19)",
        "(line 128,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 148,
      "end_line": 162,
      "comment": "\n     * For this distribution, {@code X}, this method returns the largest\n     * {@code x}, such that {@code P(X \u003c\u003d x) \u003c\u003d p}.\n     * It will return -1 when p \u003d 0 and {@code Integer.MAX_VALUE} when p \u003d 1.\n     *\n     * @param p Desired probability.\n     * @return the largest {@code x} such that {@code P(X \u003c\u003d x) \u003c\u003d p}.\n     * @throws OutOfRangeException if {@code p \u003c 0} or {@code p \u003e 1}.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 16)",
        "(line 153,col 9)-(line 159,col 9)",
        "(line 161,col 9)-(line 161,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.getSupportLowerBound()",
      "begin_line": 171,
      "end_line": 174,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the parameters.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.getSupportUpperBound()",
      "begin_line": 186,
      "end_line": 189,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the parameters. Positive infinity is symbolised\n     * by \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e together with\n     * {@link #isSupportUpperBoundInclusive()} being \u003ccode\u003efalse\u003c/code\u003e\n     *\n     * @return upper bound of the support (always \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e for positive infinity)\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.calculateNumericalMean()",
      "begin_line": 200,
      "end_line": 205,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For number of successes \u003ccode\u003er\u003c/code\u003e and\n     * probability of success \u003ccode\u003ep\u003c/code\u003e, the mean is\n     * \u003ccode\u003e( r * p ) / ( 1 - p )\u003c/code\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 51)",
        "(line 203,col 9)-(line 203,col 48)",
        "(line 204,col 9)-(line 204,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.calculateNumericalVariance()",
      "begin_line": 216,
      "end_line": 222,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For number of successes \u003ccode\u003er\u003c/code\u003e and\n     * probability of success \u003ccode\u003ep\u003c/code\u003e, the mean is\n     * \u003ccode\u003e( r * p ) / ( 1 - p )^2\u003c/code\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 51)",
        "(line 219,col 9)-(line 219,col 48)",
        "(line 220,col 9)-(line 220,col 34)",
        "(line 221,col 9)-(line 221,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.isSupportUpperBoundInclusive()",
      "begin_line": 227,
      "end_line": 230,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 21)"
      ]
    }
  ]
}