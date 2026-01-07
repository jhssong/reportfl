{
  "filepath": "/tmp/Math-41b/src/main/java/org/apache/commons/math/distribution/AbstractDistribution.java",
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
      "end_line": 156,
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
      "begin_line": 60,
      "end_line": 66,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation uses the identity\n     * \u003cp\u003e{@code P(x0 \u003c X \u003c\u003d x1) \u003d P(X \u003c\u003d x1) - P(X \u003c\u003d x0)}\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 64,col 9)",
        "(line 65,col 9)-(line 65,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractDistribution.calculateNumericalMean()",
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * Use this method to actually calculate the mean for the\n     * specific distribution. Use {@link #getNumericalMean()}\n     * (which implements caching) to actually get the mean.\n     *\n     * @return the mean or Double.NaN if it\u0027s not defined\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractDistribution.getNumericalMean()",
      "begin_line": 83,
      "end_line": 90,
      "comment": "\n     * Use this method to get the numerical value of the mean of this\n     * distribution.\n     *\n     * @return the mean or Double.NaN if it\u0027s not defined\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 87,col 9)",
        "(line 89,col 9)-(line 89,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractDistribution.calculateNumericalVariance()",
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * Use this method to actually calculate the variance for the\n     * specific distribution.  Use {@link #getNumericalVariance()}\n     * (which implements caching) to actually get the variance.\n     *\n     * @return the variance or Double.NaN if it\u0027s not defined\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractDistribution.getNumericalVariance()",
      "begin_line": 109,
      "end_line": 116,
      "comment": "\n     * Use this method to get the numerical value of the variance of this\n     * distribution.\n     *\n     * @return the variance (possibly Double.POSITIVE_INFINITY as\n     * for certain cases in {@link TDistribution}) or\n     * Double.NaN if it\u0027s not defined\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 113,col 9)",
        "(line 115,col 9)-(line 115,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 124,
      "end_line": 124,
      "comment": "\n     * Use this method to get information about whether the lower bound\n     * of the support is inclusive or not.\n     *\n     * @return whether the lower bound of the support is inclusive or not\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 132,
      "end_line": 132,
      "comment": "\n     * Use this method to get information about whether the upper bound\n     * of the support is inclusive or not.\n     *\n     * @return whether the upper bound of the support is inclusive or not\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractDistribution.isSupportConnected()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Use this method to get information about whether the support is connected,\n     * i.e. whether all values between the lower and upper bound of the support\n     * is included in the support.\n     *\n     * For {@link AbstractIntegerDistribution} the support is discrete, so\n     * if this is true, then the support is\n     * {lower bound, lower bound + 1, ..., upper bound}.\n     *\n     * For {@link AbstractContinuousDistribution} the support is continuous, so\n     * if this is true, then the support is the interval\n     * [lower bound, upper bound]\n     * where the limits are inclusive or not according to\n     * {@link #isSupportLowerBoundInclusive()} and {@link #isSupportUpperBoundInclusive()}\n     * (in the example both are true). If both are false, then the support is the interval\n     * (lower bound, upper bound)\n     *\n     * @return whether the support limits given by subclassed methods are connected or not\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 20)"
      ]
    }
  ]
}