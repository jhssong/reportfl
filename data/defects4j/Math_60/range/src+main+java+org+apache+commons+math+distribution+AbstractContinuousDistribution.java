{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/distribution/AbstractContinuousDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractContinuousDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractDistribution",
        "org.apache.commons.math.distribution.ContinuousDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 40,
      "end_line": 220,
      "comment": "\n * Base class for continuous distributions.  Default implementations are\n * provided for some of the methods that do not vary from distribution to\n * distribution.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * RandomData instance used to generate samples from the distribution\n     * @since 2.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Solver absolute accuracy for inverse cumulative computation\n     * @since 2.1\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.AbstractContinuousDistribution()",
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.density(double)",
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.inverseCumulativeProbability(double)",
      "begin_line": 75,
      "end_line": 131,
      "comment": "\n     * For this distribution, {@code X}, this method returns the critical\n     * point {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     *\n     * @param p Desired probability.\n     * @return {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * @throws MathException if the inverse cumulative probability can not be\n     * computed due to convergence or other numerical errors.\n     * @throws OutOfRangeException if {@code p} is not a valid probability.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 79,col 9)",
        "(line 83,col 9)-(line 99,col 10)",
        "(line 102,col 9)-(line 102,col 51)",
        "(line 103,col 9)-(line 103,col 51)",
        "(line 104,col 9)-(line 104,col 32)",
        "(line 105,col 9)-(line 123,col 9)",
        "(line 126,col 9)-(line 129,col 68)",
        "(line 130,col 9)-(line 130,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.Anonymous-fffd86c1-4e90-4937-add6-47a6b3806b36.value(double)",
      "begin_line": 85,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 86,col 17)-(line 86,col 40)",
        "(line 87,col 17)-(line 93,col 17)",
        "(line 94,col 17)-(line 96,col 17)",
        "(line 97,col 17)-(line 97,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.reseedRandomGenerator(long)",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * Reseed the random generator used to generate samples.\n     *\n     * @param seed New seed.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.sample()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Generate a random value sampled from this distribution. The default\n     * implementation uses the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Inverse_transform_sampling\"\u003e\n     *  inversion method.\n     * \u003c/a\u003e\n     *\n     * @return a random value.\n     * @throws MathException if an error occurs generating the random value.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.sample(int)",
      "begin_line": 168,
      "end_line": 178,
      "comment": "\n     * Generate a random sample from the distribution.  The default implementation\n     * generates the sample by calling {@link #sample()} in a loop.\n     *\n     * @param sampleSize Number of random values to generate.\n     * @return an array representing the random sample.\n     * @throws MathException if an error occurs generating the sample.\n     * @throws NotStrictlyPositiveException if {@code sampleSize} is not positive.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 46)",
        "(line 174,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.getInitialDomain(double)",
      "begin_line": 188,
      "end_line": 188,
      "comment": "\n     * Access the initial domain value, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the initial domain value.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.getDomainLowerBound(double)",
      "begin_line": 198,
      "end_line": 198,
      "comment": "\n     * Access the domain value lower bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value lower bound, i.e. {@code P(X \u003c \u0027lower bound\u0027) \u003c p}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.getDomainUpperBound(double)",
      "begin_line": 208,
      "end_line": 208,
      "comment": "\n     * Access the domain value upper bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value upper bound, i.e. {@code P(X \u003c \u0027upper bound\u0027) \u003e p}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\n     * Returns the solver absolute accuracy for inverse cumulative computation.\n     *\n     * @return the maximum absolute error in inverse cumulative probability estimates\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 38)"
      ]
    }
  ]
}