{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/SaddlePointExpansion.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SaddlePointExpansion",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 201,
      "comment": "\n * \u003cp\u003e\n * Utility class used by various distributions to accurately compute their\n * respective probability mass functions. The implementation for this class is\n * based on the Catherine Loader\u0027s \u003ca target\u003d\"_blank\"\n * href\u003d\"http://www.herine.net/stat/software/dbinom.html\"\u003edbinom\u003c/a\u003e routines.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This class is not intended to be called directly.\n * \u003c/p\u003e\n * \u003cp\u003e\n * References:\n * \u003col\u003e\n * \u003cli\u003eCatherine Loader (2000). \"Fast and Accurate Computation of Binomial\n * Probabilities.\". \u003ca target\u003d\"_blank\"\n * href\u003d\"http://www.herine.net/stat/papers/dbinom.pdf\"\u003e\n * http://www.herine.net/stat/papers/dbinom.pdf\u003c/a\u003e\u003c/li\u003e\n * \u003c/ol\u003e\n * \u003c/p\u003e\n *\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "HALF_LOG_2_PI"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " 1/2 * log(2 \u0026#960;). "
    },
    {
      "type": "field",
      "varNames": [
        "EXACT_STIRLING_ERRORS"
      ],
      "begin_line": 52,
      "end_line": 83,
      "comment": " exact Stirling expansion error for certain values. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.SaddlePointExpansion.SaddlePointExpansion()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.SaddlePointExpansion.getStirlingError(double)",
      "begin_line": 107,
      "end_line": 127,
      "comment": "\n     * Compute the error of Stirling\u0027s series at the given value.\n     * \u003cp\u003e\n     * References:\n     * \u003col\u003e\n     * \u003cli\u003eEric W. Weisstein. \"Stirling\u0027s Series.\" From MathWorld--A Wolfram Web\n     * Resource. \u003ca target\u003d\"_blank\"\n     * href\u003d\"http://mathworld.wolfram.com/StirlingsSeries.html\"\u003e\n     * http://mathworld.wolfram.com/StirlingsSeries.html\u003c/a\u003e\u003c/li\u003e\n     * \u003c/ol\u003e\n     * \u003c/p\u003e\n     *\n     * @param z the value.\n     * @return the Striling\u0027s series error.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 19)",
        "(line 109,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.SaddlePointExpansion.getDeviancePart(double, double)",
      "begin_line": 145,
      "end_line": 166,
      "comment": "\n     * A part of the deviance portion of the saddle point approximation.\n     * \u003cp\u003e\n     * References:\n     * \u003col\u003e\n     * \u003cli\u003eCatherine Loader (2000). \"Fast and Accurate Computation of Binomial\n     * Probabilities.\". \u003ca target\u003d\"_blank\"\n     * href\u003d\"http://www.herine.net/stat/papers/dbinom.pdf\"\u003e\n     * http://www.herine.net/stat/papers/dbinom.pdf\u003c/a\u003e\u003c/li\u003e\n     * \u003c/ol\u003e\n     * \u003c/p\u003e\n     *\n     * @param x the x value.\n     * @param mu the average.\n     * @return a part of the deviance.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 19)",
        "(line 147,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.SaddlePointExpansion.logBinomialProbability(int, int, double, double)",
      "begin_line": 178,
      "end_line": 200,
      "comment": "\n     * Compute the logarithm of the PMF for a binomial distribution\n     * using the saddle point expansion.\n     *\n     * @param x the value at which the probability is evaluated.\n     * @param n the number of trials.\n     * @param p the probability of success.\n     * @param q the probability of failure (1 - p).\n     * @return log(p(x)).\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 19)",
        "(line 180,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 19)"
      ]
    }
  ]
}