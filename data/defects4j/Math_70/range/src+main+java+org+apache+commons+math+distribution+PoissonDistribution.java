{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/distribution/PoissonDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PoissonDistribution",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math.distribution.IntegerDistribution"
      ],
      "begin_line": 34,
      "end_line": 64,
      "comment": "\n * Interface representing the Poisson Distribution.\n *\n * \u003cp\u003e\n * References:\n * \u003cul\u003e\n * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/PoissonDistribution.html\"\u003e\n * Poisson distribution\u003c/a\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistribution.getMean()",
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Get the mean for the distribution.\n     *\n     * @return the mean for the distribution.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistribution.setMean(double)",
      "begin_line": 52,
      "end_line": 53,
      "comment": "\n     * Set the mean for the distribution.\n     * The parameter value must be positive; otherwise an\n     * \u003ccode\u003eIllegalArgument\u003c/code\u003e is thrown.\n     *\n     * @param p the mean\n     * @throws IllegalArgumentException if p \u0026le; 0\n     * @deprecated as of v2.1\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistribution.normalApproximateProbability(int)",
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * Calculates the Poisson distribution function using a normal approximation.\n     *\n     * @param x the upper bound, inclusive\n     * @return the distribution function value calculated using a normal approximation\n     * @throws MathException if an error occurs computing the normal approximation\n     ",
      "child_ranges": []
    }
  ]
}