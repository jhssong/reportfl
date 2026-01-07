{
  "filepath": "/tmp/Math-57b/src/main/java/org/apache/commons/math/distribution/AbstractContinuousDistribution.java",
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
      "begin_line": 39,
      "end_line": 234,
      "comment": "\n * Base class for continuous distributions.  Default implementations are\n * provided for some of the methods that do not vary from distribution to\n * distribution.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "SOLVER_DEFAULT_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Default accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * RandomData instance used to generate samples from the distribution\n     * @since 2.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * Solver absolute accuracy for inverse cumulative computation.\n     * @since 2.1\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.AbstractContinuousDistribution()",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.density(double)",
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.inverseCumulativeProbability(double)",
      "begin_line": 76,
      "end_line": 130,
      "comment": "\n     * For this distribution, {@code X}, this method returns the critical\n     * point {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     *\n     * @param p Desired probability.\n     * @return {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * @throws MathException if the inverse cumulative probability can not be\n     * computed due to convergence or other numerical errors.\n     * @throws OutOfRangeException if {@code p} is not a valid probability.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 80,col 9)",
        "(line 84,col 9)-(line 98,col 10)",
        "(line 101,col 9)-(line 101,col 51)",
        "(line 102,col 9)-(line 102,col 51)",
        "(line 103,col 9)-(line 103,col 32)",
        "(line 104,col 9)-(line 122,col 9)",
        "(line 125,col 9)-(line 128,col 68)",
        "(line 129,col 9)-(line 129,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.Anonymous-87483abe-7061-4a49-9f05-0fc726c93064.value(double)",
      "begin_line": 86,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 87,col 17)-(line 87,col 40)",
        "(line 88,col 17)-(line 92,col 17)",
        "(line 93,col 17)-(line 95,col 17)",
        "(line 96,col 17)-(line 96,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.reseedRandomGenerator(long)",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * Reseed the random generator used to generate samples.\n     *\n     * @param seed New seed.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.sample()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Generate a random value sampled from this distribution. The default\n     * implementation uses the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Inverse_transform_sampling\"\u003e\n     *  inversion method.\n     * \u003c/a\u003e\n     *\n     * @return a random value.\n     * @throws MathException if an error occurs generating the random value.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.sample(int)",
      "begin_line": 167,
      "end_line": 177,
      "comment": "\n     * Generate a random sample from the distribution.  The default implementation\n     * generates the sample by calling {@link #sample()} in a loop.\n     *\n     * @param sampleSize Number of random values to generate.\n     * @return an array representing the random sample.\n     * @throws MathException if an error occurs generating the sample.\n     * @throws NotStrictlyPositiveException if {@code sampleSize} is not positive.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 46)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.getInitialDomain(double)",
      "begin_line": 187,
      "end_line": 187,
      "comment": "\n     * Access the initial domain value, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the initial domain value.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.getDomainLowerBound(double)",
      "begin_line": 197,
      "end_line": 197,
      "comment": "\n     * Access the domain value lower bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value lower bound, i.e. {@code P(X \u003c \u0027lower bound\u0027) \u003c p}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.getDomainUpperBound(double)",
      "begin_line": 207,
      "end_line": 207,
      "comment": "\n     * Access the domain value upper bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value upper bound, i.e. {@code P(X \u003c \u0027upper bound\u0027) \u003e p}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     * Returns the solver absolute accuracy for inverse cumulative computation.\n     * You can override this method in order to use a Brent solver with an\n     * absolute accuracy different from the default.\n     *\n     * @return the maximum absolute error in inverse cumulative probability estimates\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.getSupportLowerBound()",
      "begin_line": 226,
      "end_line": 226,
      "comment": "\n     * Access the lower bound of the support.\n     *\n     * @return lower bound of the support (might be Double.NEGATIVE_INFINITY)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.getSupportUpperBound()",
      "begin_line": 233,
      "end_line": 233,
      "comment": "\n     * Access the upper bound of the support.\n     *\n     * @return upper bound of the support (might be Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": []
    }
  ]
}