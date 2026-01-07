{
  "filepath": "/tmp/Math-52b/src/main/java/org/apache/commons/math/distribution/AbstractDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.Distribution",
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 169,
      "comment": "\n * Base class for probability distributions.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "numericalMean"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Cached numerical mean "
    },
    {
      "type": "field",
      "varNames": [
        "numericalMeanIsCalculated"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Whether or not the numerical mean has been calculated "
    },
    {
      "type": "field",
      "varNames": [
        "numericalVariance"
      ],
      "begin_line": 43,
      "end_line": 43,
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
      "signature": "org.apache.commons.math.distribution.AbstractDistribution.AbstractDistribution()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractDistribution.cumulativeProbability(double, double)",
      "begin_line": 72,
      "end_line": 79,
      "comment": "\n     * For a random variable X whose values are distributed according\n     * to this distribution, this method returns P(x0 \u0026le; X \u0026le; x1).\n     * \u003cp\u003e\n     * The default implementation uses the identity\u003c/p\u003e\n     * \u003cp\u003e\n     * P(x0 \u0026le; X \u0026le; x1) \u003d P(X \u0026le; x1) - P(X \u0026le; x0) \u003c/p\u003e\n     *\n     * @param x0 the (inclusive) lower bound\n     * @param x1 the (inclusive) upper bound\n     * @return the probability that a random variable with this distribution\n     * will take a value between {@code x0} and {@code x1},\n     * including the endpoints.\n     * @throws MathException if the cumulative probability can not be\n     * computed due to convergence or other numerical errors.\n     * @throws NumberIsTooLargeException if {@code x0 \u003e x1}\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 78,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractDistribution.calculateNumericalMean()",
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * Use this method to actually calculate the mean for the\n     * specific distribution. Use {@link #getNumericalMean()}\n     * (which implements caching) to actually get the mean.\n     *\n     * @return the mean or Double.NaN if it\u0027s not defined\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractDistribution.getNumericalMean()",
      "begin_line": 96,
      "end_line": 103,
      "comment": "\n     * Use this method to get the numerical value of the mean of this\n     * distribution.\n     *\n     * @return the mean or Double.NaN if it\u0027s not defined\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 100,col 9)",
        "(line 102,col 9)-(line 102,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractDistribution.calculateNumericalVariance()",
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * Use this method to actually calculate the variance for the\n     * specific distribution.  Use {@link #getNumericalVariance()}\n     * (which implements caching) to actually get the variance.\n     *\n     * @return the variance or Double.NaN if it\u0027s not defined\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractDistribution.getNumericalVariance()",
      "begin_line": 122,
      "end_line": 129,
      "comment": "\n     * Use this method to get the numerical value of the variance of this\n     * distribution.\n     *\n     * @return the variance (possibly Double.POSITIVE_INFINITY as\n     * for certain cases in {@link TDistributionImpl}) or\n     * Double.NaN if it\u0027s not defined\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 126,col 9)",
        "(line 128,col 9)-(line 128,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 137,
      "end_line": 137,
      "comment": "\n     * Use this method to get information about whether the lower bound\n     * of the support is inclusive or not.\n     *\n     * @return whether the lower bound of the support is inclusive or not\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 145,
      "end_line": 145,
      "comment": "\n     * Use this method to get information about whether the upper bound\n     * of the support is inclusive or not.\n     *\n     * @return whether the upper bound of the support is inclusive or not\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractDistribution.isSupportConnected()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * Use this method to get information about whether the support is connected,\n     * i.e. whether all values between the lower and upper bound of the support\n     * is included in the support.\n     *\n     * For {@link AbstractIntegerDistribution} the support is discrete, so\n     * if this is true, then the support is\n     * {lower bound, lower bound + 1, ..., upper bound}.\n     *\n     * For {@link AbstractContinuousDistribution} the support is continuous, so\n     * if this is true, then the support is the interval\n     * [lower bound, upper bound]\n     * where the limits are inclusive or not according to\n     * {@link #isSupportLowerBoundInclusive()} and {@link #isSupportUpperBoundInclusive()}\n     * (in the example both are true). If both are false, then the support is the interval\n     * (lower bound, upper bound)\n     *\n     * @return whether the support limits given by subclassed methods are connected or not\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 20)"
      ]
    }
  ]
}