{
  "filepath": "/tmp/Math-44b/src/main/java/org/apache/commons/math/distribution/AbstractContinuousDistribution.java",
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
      "begin_line": 38,
      "end_line": 221,
      "comment": "\n * Base class for continuous distributions.  Default implementations are\n * provided for some of the methods that do not vary from distribution to\n * distribution.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "SOLVER_DEFAULT_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Default accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Serializable version identifier "
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
      "begin_line": 74,
      "end_line": 119,
      "comment": "\n     * For this distribution, {@code X}, this method returns the critical\n     * point {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     *\n     * @param p Desired probability.\n     * @return {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * @throws OutOfRangeException if {@code p} is not a valid probability.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 78,col 9)",
        "(line 82,col 9)-(line 87,col 10)",
        "(line 90,col 9)-(line 90,col 51)",
        "(line 91,col 9)-(line 91,col 51)",
        "(line 92,col 9)-(line 92,col 32)",
        "(line 93,col 9)-(line 111,col 9)",
        "(line 114,col 9)-(line 117,col 68)",
        "(line 118,col 9)-(line 118,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.Anonymous-99f41f4c-dbab-481f-9d05-27bf3f86c4a9.value(double)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 17)-(line 85,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.reseedRandomGenerator(long)",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * Reseed the random generator used to generate samples.\n     *\n     * @param seed New seed.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.sample()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * Generate a random value sampled from this distribution. The default\n     * implementation uses the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Inverse_transform_sampling\"\u003e\n     *  inversion method.\n     * \u003c/a\u003e\n     *\n     * @return a random value.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.sample(int)",
      "begin_line": 154,
      "end_line": 164,
      "comment": "\n     * Generate a random sample from the distribution.  The default implementation\n     * generates the sample by calling {@link #sample()} in a loop.\n     *\n     * @param sampleSize Number of random values to generate.\n     * @return an array representing the random sample.\n     * @throws NotStrictlyPositiveException if {@code sampleSize} is not positive.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 46)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.getInitialDomain(double)",
      "begin_line": 174,
      "end_line": 174,
      "comment": "\n     * Access the initial domain value, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the initial domain value.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.getDomainLowerBound(double)",
      "begin_line": 184,
      "end_line": 184,
      "comment": "\n     * Access the domain value lower bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value lower bound, i.e. {@code P(X \u003c \u0027lower bound\u0027) \u003c p}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.getDomainUpperBound(double)",
      "begin_line": 194,
      "end_line": 194,
      "comment": "\n     * Access the domain value upper bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value upper bound, i.e. {@code P(X \u003c \u0027upper bound\u0027) \u003e p}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * Returns the solver absolute accuracy for inverse cumulative computation.\n     * You can override this method in order to use a Brent solver with an\n     * absolute accuracy different from the default.\n     *\n     * @return the maximum absolute error in inverse cumulative probability estimates\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.getSupportLowerBound()",
      "begin_line": 213,
      "end_line": 213,
      "comment": "\n     * Access the lower bound of the support.\n     *\n     * @return lower bound of the support (might be Double.NEGATIVE_INFINITY)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.getSupportUpperBound()",
      "begin_line": 220,
      "end_line": 220,
      "comment": "\n     * Access the upper bound of the support.\n     *\n     * @return upper bound of the support (might be Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": []
    }
  ]
}