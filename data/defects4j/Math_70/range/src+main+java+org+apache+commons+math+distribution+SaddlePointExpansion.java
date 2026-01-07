{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/distribution/SaddlePointExpansion.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SaddlePointExpansion",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 45,
      "end_line": 200,
      "comment": "\n * \u003cp\u003e\n * Utility class used by various distributions to accurately compute their\n * respective probability mass functions. The implementation for this class is\n * based on the Catherine Loader\u0027s \u003ca target\u003d\"_blank\"\n * href\u003d\"http://www.herine.net/stat/software/dbinom.html\"\u003edbinom\u003c/a\u003e routines.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This class is not intended to be called directly.\n * \u003c/p\u003e\n * \u003cp\u003e\n * References:\n * \u003col\u003e\n * \u003cli\u003eCatherine Loader (2000). \"Fast and Accurate Computation of Binomial\n * Probabilities.\". \u003ca target\u003d\"_blank\"\n * href\u003d\"http://www.herine.net/stat/papers/dbinom.pdf\"\u003e\n * http://www.herine.net/stat/papers/dbinom.pdf\u003c/a\u003e\u003c/li\u003e\n * \u003c/ol\u003e\n * \u003c/p\u003e\n *\n * @since 2.1\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "HALF_LOG_2_PI"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " 1/2 * log(2 \u0026#960;). "
    },
    {
      "type": "field",
      "varNames": [
        "EXACT_STIRLING_ERRORS"
      ],
      "begin_line": 51,
      "end_line": 82,
      "comment": " exact Stirling expansion error for certain values. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.SaddlePointExpansion.SaddlePointExpansion()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.SaddlePointExpansion.getStirlingError(double)",
      "begin_line": 106,
      "end_line": 126,
      "comment": "\n     * Compute the error of Stirling\u0027s series at the given value.\n     * \u003cp\u003e\n     * References:\n     * \u003col\u003e\n     * \u003cli\u003eEric W. Weisstein. \"Stirling\u0027s Series.\" From MathWorld--A Wolfram Web\n     * Resource. \u003ca target\u003d\"_blank\"\n     * href\u003d\"http://mathworld.wolfram.com/StirlingsSeries.html\"\u003e\n     * http://mathworld.wolfram.com/StirlingsSeries.html\u003c/a\u003e\u003c/li\u003e\n     * \u003c/ol\u003e\n     * \u003c/p\u003e\n     *\n     * @param z the value.\n     * @return the Striling\u0027s series error.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 19)",
        "(line 108,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 125,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.SaddlePointExpansion.getDeviancePart(double, double)",
      "begin_line": 144,
      "end_line": 165,
      "comment": "\n     * A part of the deviance portion of the saddle point approximation.\n     * \u003cp\u003e\n     * References:\n     * \u003col\u003e\n     * \u003cli\u003eCatherine Loader (2000). \"Fast and Accurate Computation of Binomial\n     * Probabilities.\". \u003ca target\u003d\"_blank\"\n     * href\u003d\"http://www.herine.net/stat/papers/dbinom.pdf\"\u003e\n     * http://www.herine.net/stat/papers/dbinom.pdf\u003c/a\u003e\u003c/li\u003e\n     * \u003c/ol\u003e\n     * \u003c/p\u003e\n     *\n     * @param x the x value.\n     * @param mu the average.\n     * @return a part of the deviance.\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 19)",
        "(line 146,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.SaddlePointExpansion.logBinomialProbability(int, int, double, double)",
      "begin_line": 177,
      "end_line": 199,
      "comment": "\n     * Compute the PMF for a binomial distribution using the saddle point\n     * expansion.\n     *\n     * @param x the value at which the probability is evaluated.\n     * @param n the number of trials.\n     * @param p the probability of success.\n     * @param q the probability of failure (1 - p).\n     * @return log(p(x)).\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 19)",
        "(line 179,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 19)"
      ]
    }
  ]
}