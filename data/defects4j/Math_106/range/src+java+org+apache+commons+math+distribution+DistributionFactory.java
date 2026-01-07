{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/distribution/DistributionFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DistributionFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 211,
      "comment": "\n * This factory provids the means to create common statistical distributions.\n * The following distributions are supported:\n * \u003cul\u003e\n * \u003cli\u003eBinomial\u003c/li\u003e\n * \u003cli\u003eCauchy\u003c/li\u003e\n * \u003cli\u003eChi-Squared\u003c/li\u003e\n * \u003cli\u003eExponential\u003c/li\u003e\n * \u003cli\u003eF\u003c/li\u003e\n * \u003cli\u003eGamma\u003c/li\u003e\n * \u003cli\u003eHyperGeometric\u003c/li\u003e\n * \u003cli\u003ePoisson\u003c/li\u003e\n * \u003cli\u003eNormal\u003c/li\u003e\n * \u003cli\u003eStudent\u0027s t\u003c/li\u003e\n * \u003cli\u003eWeibull\u003c/li\u003e\n * \u003cli\u003ePascal\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * Common usage:\u003cpre\u003e\n * DistributionFactory factory \u003d DistributionFactory.newInstance();\n *\n * // create a Chi-Square distribution with 5 degrees of freedom.\n * ChiSquaredDistribution chi \u003d factory.createChiSquareDistribution(5.0);\n * \u003c/pre\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.DistributionFactory.DistributionFactory()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactory.newInstance()",
      "begin_line": 60,
      "end_line": 71,
      "comment": "\n     * Create an instance of a \u003ccode\u003eDistributionFactory\u003c/code\u003e\n     * @return a new factory. \n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 43)",
        "(line 62,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 70,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactory.createBinomialDistribution(int, double)",
      "begin_line": 81,
      "end_line": 82,
      "comment": "\n     * Create a binomial distribution with the given number of trials and\n     * probability of success.\n     * \n     * @param numberOfTrials the number of trials.\n     * @param probabilityOfSuccess the probability of success\n     * @return a new binomial distribution\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactory.createPascalDistribution(int, double)",
      "begin_line": 92,
      "end_line": 93,
      "comment": "\n     * Create a Pascal distribution with the given number of successes and\n     * probability of success.\n     * \n     * @param numberOfSuccesses the number of successes.\n     * @param probabilityOfSuccess the probability of success\n     * @return a new Pascal distribution\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactory.createCauchyDistribution(double, double)",
      "begin_line": 102,
      "end_line": 106,
      "comment": "\n     * Create a new cauchy distribution with the given median and scale.\n     * @param median the median of the distribution\n     * @param scale the scale\n     * @return a new cauchy distribution  \n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactory.createChiSquareDistribution(double)",
      "begin_line": 114,
      "end_line": 115,
      "comment": "\n     * Create a new chi-square distribution with the given degrees of freedom.\n     * \n     * @param degreesOfFreedom degrees of freedom\n     * @return a new chi-square distribution  \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactory.createExponentialDistribution(double)",
      "begin_line": 123,
      "end_line": 124,
      "comment": "\n     * Create a new exponential distribution with the given degrees of freedom.\n     * \n     * @param mean mean\n     * @return a new exponential distribution  \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactory.createFDistribution(double, double)",
      "begin_line": 133,
      "end_line": 134,
      "comment": "\n     * Create a new F-distribution with the given degrees of freedom.\n     * \n     * @param numeratorDegreesOfFreedom numerator degrees of freedom\n     * @param denominatorDegreesOfFreedom denominator degrees of freedom\n     * @return a new F-distribution \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactory.createGammaDistribution(double, double)",
      "begin_line": 145,
      "end_line": 146,
      "comment": "\n     * Create a new gamma distribution with the given shape and scale\n     * parameters.\n     * \n     * @param alpha the shape parameter\n     * @param beta the scale parameter\n     * \n     * @return a new gamma distribution  \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactory.createTDistribution(double)",
      "begin_line": 154,
      "end_line": 154,
      "comment": "\n     * Create a new t distribution with the given degrees of freedom.\n     * \n     * @param degreesOfFreedom degrees of freedom\n     * @return a new t distribution  \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactory.createHypergeometricDistribution(int, int, int)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Create a new hypergeometric distribution with the given the population\n     * size, the number of successes in the population, and the sample size.\n     * \n     * @param populationSize the population size\n     * @param numberOfSuccesses number of successes in the population\n     * @param sampleSize the sample size\n     * @return a new hypergeometric desitribution\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactory.createNormalDistribution(double, double)",
      "begin_line": 177,
      "end_line": 178,
      "comment": "\n     * Create a new normal distribution with the given mean and standard\n     * deviation.\n     * \n     * @param mean the mean of the distribution\n     * @param sd standard deviation\n     * @return a new normal distribution  \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactory.createNormalDistribution()",
      "begin_line": 186,
      "end_line": 186,
      "comment": "\n     * Create a new normal distribution with mean zero and standard\n     * deviation one.\n     * \n     * @return a new normal distribution.  \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactory.createPoissonDistribution(double)",
      "begin_line": 194,
      "end_line": 195,
      "comment": "\n     * Create a new Poisson distribution with poisson parameter lambda.\n     * \n     * @param lambda poisson parameter\n     * @return a new poisson distribution.  \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactory.createWeibullDistribution(double, double)",
      "begin_line": 206,
      "end_line": 210,
      "comment": "\n     * Create a new Weibull distribution with the given shape and scale\n     * parameters.\n     * \n     * @param alpha the shape parameter.\n     * @param beta the scale parameter.\n     * @return a new Weibull distribution.  \n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 56)"
      ]
    }
  ]
}