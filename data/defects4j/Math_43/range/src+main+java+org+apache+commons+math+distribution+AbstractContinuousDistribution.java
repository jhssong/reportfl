{
  "filepath": "/tmp/Math-43b/src/main/java/org/apache/commons/math/distribution/AbstractContinuousDistribution.java",
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
      "end_line": 222,
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
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.probability(double)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For continuous distributions {@code P(X \u003d x)} always evaluates to 0.\n     *\n     * @return 0\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.inverseCumulativeProbability(double)",
      "begin_line": 75,
      "end_line": 120,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 79,col 9)",
        "(line 83,col 9)-(line 88,col 10)",
        "(line 91,col 9)-(line 91,col 51)",
        "(line 92,col 9)-(line 92,col 51)",
        "(line 93,col 9)-(line 93,col 32)",
        "(line 94,col 9)-(line 112,col 9)",
        "(line 115,col 9)-(line 118,col 68)",
        "(line 119,col 9)-(line 119,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.Anonymous-42522f00-a983-4ee3-8236-d3a20ff2247b.value(double)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 17)-(line 86,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.reseedRandomGenerator(long)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * Reseed the random generator used to generate samples.\n     *\n     * @param seed New seed.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.sample()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * Generate a random value sampled from this distribution. The default\n     * implementation uses the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Inverse_transform_sampling\"\u003e\n     *  inversion method.\n     * \u003c/a\u003e\n     *\n     * @return a random value.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.sample(int)",
      "begin_line": 155,
      "end_line": 165,
      "comment": "\n     * Generate a random sample from the distribution.  The default implementation\n     * generates the sample by calling {@link #sample()} in a loop.\n     *\n     * @param sampleSize Number of random values to generate.\n     * @return an array representing the random sample.\n     * @throws NotStrictlyPositiveException if {@code sampleSize} is not positive.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 46)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.getInitialDomain(double)",
      "begin_line": 175,
      "end_line": 175,
      "comment": "\n     * Access the initial domain value, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the initial domain value.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.getDomainLowerBound(double)",
      "begin_line": 185,
      "end_line": 185,
      "comment": "\n     * Access the domain value lower bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value lower bound, i.e. {@code P(X \u003c \u0027lower bound\u0027) \u003c p}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.getDomainUpperBound(double)",
      "begin_line": 195,
      "end_line": 195,
      "comment": "\n     * Access the domain value upper bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value upper bound, i.e. {@code P(X \u003c \u0027upper bound\u0027) \u003e p}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * Returns the solver absolute accuracy for inverse cumulative computation.\n     * You can override this method in order to use a Brent solver with an\n     * absolute accuracy different from the default.\n     *\n     * @return the maximum absolute error in inverse cumulative probability estimates\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.getSupportLowerBound()",
      "begin_line": 214,
      "end_line": 214,
      "comment": "\n     * Access the lower bound of the support.\n     *\n     * @return lower bound of the support (might be Double.NEGATIVE_INFINITY)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.getSupportUpperBound()",
      "begin_line": 221,
      "end_line": 221,
      "comment": "\n     * Access the upper bound of the support.\n     *\n     * @return upper bound of the support (might be Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": []
    }
  ]
}