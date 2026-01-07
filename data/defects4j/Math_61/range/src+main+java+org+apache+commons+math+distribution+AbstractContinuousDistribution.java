{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/distribution/AbstractContinuousDistribution.java",
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
      "end_line": 232,
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
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * RandomData instance used to generate samples from the distribution\n     * @since 2.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Solver absolute accuracy for inverse cum computation\n     * @since 2.1\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.AbstractContinuousDistribution()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.density(double)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Return the probability density for a particular point.\n     * @param x  The point at which the density should be computed.\n     * @return  The pdf at point x.\n     * @throws MathRuntimeException if the specialized class hasn\u0027t implemented this function\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 74,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.inverseCumulativeProbability(double)",
      "begin_line": 88,
      "end_line": 144,
      "comment": "\n     * For this distribution, X, this method returns the critical point x, such\n     * that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e.\n     *\n     * @param p the desired probability\n     * @return x, such that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e\n     * @throws MathException if the inverse cumulative probability can not be\n     *         computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *         probability.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 93,col 9)",
        "(line 97,col 9)-(line 112,col 10)",
        "(line 115,col 9)-(line 115,col 51)",
        "(line 116,col 9)-(line 116,col 51)",
        "(line 117,col 9)-(line 117,col 32)",
        "(line 118,col 9)-(line 136,col 9)",
        "(line 139,col 9)-(line 142,col 68)",
        "(line 143,col 9)-(line 143,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.Anonymous-a07bca2d-d094-4666-9d12-c5868588282f.value(double)",
      "begin_line": 99,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 100,col 17)-(line 100,col 40)",
        "(line 101,col 17)-(line 105,col 17)",
        "(line 106,col 17)-(line 109,col 17)",
        "(line 110,col 17)-(line 110,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.reseedRandomGenerator(long)",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Reseeds the random generator used to generate samples.\n     *\n     * @param seed the new seed\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.sample()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Generates a random value sampled from this distribution. The default\n     * implementation uses the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Inverse_transform_sampling\"\u003e inversion method.\u003c/a\u003e\n     *\n     * @return random value\n     * @since 2.2\n     * @throws MathException if an error occurs generating the random value\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.sample(int)",
      "begin_line": 179,
      "end_line": 188,
      "comment": "\n     * Generates a random sample from the distribution.  The default implementation\n     * generates the sample by calling {@link #sample()} in a loop.\n     *\n     * @param sampleSize number of random values to generate\n     * @since 2.2\n     * @return an array representing the random sample\n     * @throws MathException if an error occurs generating the sample\n     * @throws IllegalArgumentException if sampleSize is not positive\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 46)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.getInitialDomain(double)",
      "begin_line": 198,
      "end_line": 198,
      "comment": "\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return initial domain value\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.getDomainLowerBound(double)",
      "begin_line": 209,
      "end_line": 209,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.getDomainUpperBound(double)",
      "begin_line": 220,
      "end_line": 220,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\n     * Returns the solver absolute accuracy for inverse cum computation.\n     *\n     * @return the maximum absolute error in inverse cumulative probability estimates\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 38)"
      ]
    }
  ]
}