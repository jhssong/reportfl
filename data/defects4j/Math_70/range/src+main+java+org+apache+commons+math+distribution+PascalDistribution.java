{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/distribution/PascalDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PascalDistribution",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math.distribution.IntegerDistribution"
      ],
      "begin_line": 41,
      "end_line": 73,
      "comment": "\n * The Pascal distribution.  The Pascal distribution is a special case of the\n * Negative Binomial distribution where the number of successes parameter is an\n * integer.\n *\n * There are various ways to express the probability mass and distribution\n * functions for the Pascal distribution.  The convention employed by the\n * library is to express these functions in terms of the number of failures in\n * a Bernoulli experiment [2].\n *\n * \u003cp\u003e\n * References:\n * \u003col\u003e\n * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/NegativeBinomialDistribution.html\"\u003e\n * Negative Binomial Distribution\u003c/a\u003e\u003c/li\u003e\n * \u003coi\u003e\u003ca href\u003d\"http://en.wikipedia.org/wiki/Negative_binomial_distribution#Waiting_time_in_a_Bernoulli_process\"\u003eWaiting Time in a Bernoulli Process\u003c/a\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistribution.getNumberOfSuccesses()",
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Access the number of successes for this distribution.\n     *\n     * @return the number of successes\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistribution.getProbabilityOfSuccess()",
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Access the probability of success for this distribution.\n     *\n     * @return the probability of success\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistribution.setNumberOfSuccesses(int)",
      "begin_line": 62,
      "end_line": 63,
      "comment": "\n     * Change the number of successes for this distribution.\n     *\n     * @param successes the new number of successes\n     * @deprecated as of v2.1\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistribution.setProbabilityOfSuccess(double)",
      "begin_line": 71,
      "end_line": 72,
      "comment": "\n     * Change the probability of success for this distribution.\n     *\n     * @param p the new probability of success\n     * @deprecated as of v2.1\n     ",
      "child_ranges": []
    }
  ]
}