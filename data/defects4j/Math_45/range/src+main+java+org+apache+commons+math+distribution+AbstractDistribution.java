{
  "filepath": "/tmp/Math-45b/src/main/java/org/apache/commons/math/distribution/AbstractDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.Distribution",
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 165,
      "comment": "\n * Base class for probability distributions.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "numericalMean"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Cached numerical mean "
    },
    {
      "type": "field",
      "varNames": [
        "numericalMeanIsCalculated"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Whether or not the numerical mean has been calculated "
    },
    {
      "type": "field",
      "varNames": [
        "numericalVariance"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Cached numerical variance "
    },
    {
      "type": "field",
      "varNames": [
        "numericalVarianceIsCalculated"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Whether or not the numerical variance has been calculated "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.AbstractDistribution.AbstractDistribution()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractDistribution.cumulativeProbability(double, double)",
      "begin_line": 69,
      "end_line": 75,
      "comment": "\n     * For a random variable X whose values are distributed according\n     * to this distribution, this method returns P(x0 \u0026le; X \u0026le; x1).\n     * \u003cp\u003e\n     * The default implementation uses the identity\u003c/p\u003e\n     * \u003cp\u003e\n     * P(x0 \u0026le; X \u0026le; x1) \u003d P(X \u0026le; x1) - P(X \u0026le; x0) \u003c/p\u003e\n     *\n     * @param x0 the (inclusive) lower bound\n     * @param x1 the (inclusive) upper bound\n     * @return the probability that a random variable with this distribution\n     * will take a value between {@code x0} and {@code x1},\n     * including the endpoints.\n     * @throws NumberIsTooLargeException if {@code x0 \u003e x1}\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 74,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractDistribution.calculateNumericalMean()",
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * Use this method to actually calculate the mean for the\n     * specific distribution. Use {@link #getNumericalMean()}\n     * (which implements caching) to actually get the mean.\n     *\n     * @return the mean or Double.NaN if it\u0027s not defined\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractDistribution.getNumericalMean()",
      "begin_line": 92,
      "end_line": 99,
      "comment": "\n     * Use this method to get the numerical value of the mean of this\n     * distribution.\n     *\n     * @return the mean or Double.NaN if it\u0027s not defined\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 96,col 9)",
        "(line 98,col 9)-(line 98,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractDistribution.calculateNumericalVariance()",
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n     * Use this method to actually calculate the variance for the\n     * specific distribution.  Use {@link #getNumericalVariance()}\n     * (which implements caching) to actually get the variance.\n     *\n     * @return the variance or Double.NaN if it\u0027s not defined\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractDistribution.getNumericalVariance()",
      "begin_line": 118,
      "end_line": 125,
      "comment": "\n     * Use this method to get the numerical value of the variance of this\n     * distribution.\n     *\n     * @return the variance (possibly Double.POSITIVE_INFINITY as\n     * for certain cases in {@link TDistributionImpl}) or\n     * Double.NaN if it\u0027s not defined\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 122,col 9)",
        "(line 124,col 9)-(line 124,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 133,
      "end_line": 133,
      "comment": "\n     * Use this method to get information about whether the lower bound\n     * of the support is inclusive or not.\n     *\n     * @return whether the lower bound of the support is inclusive or not\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 141,
      "end_line": 141,
      "comment": "\n     * Use this method to get information about whether the upper bound\n     * of the support is inclusive or not.\n     *\n     * @return whether the upper bound of the support is inclusive or not\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractDistribution.isSupportConnected()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Use this method to get information about whether the support is connected,\n     * i.e. whether all values between the lower and upper bound of the support\n     * is included in the support.\n     *\n     * For {@link AbstractIntegerDistribution} the support is discrete, so\n     * if this is true, then the support is\n     * {lower bound, lower bound + 1, ..., upper bound}.\n     *\n     * For {@link AbstractContinuousDistribution} the support is continuous, so\n     * if this is true, then the support is the interval\n     * [lower bound, upper bound]\n     * where the limits are inclusive or not according to\n     * {@link #isSupportLowerBoundInclusive()} and {@link #isSupportUpperBoundInclusive()}\n     * (in the example both are true). If both are false, then the support is the interval\n     * (lower bound, upper bound)\n     *\n     * @return whether the support limits given by subclassed methods are connected or not\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 20)"
      ]
    }
  ]
}