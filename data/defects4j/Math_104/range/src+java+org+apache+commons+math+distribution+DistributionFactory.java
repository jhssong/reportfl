{
  "filepath": "/tmp/Math-104b/src/java/org/apache/commons/math/distribution/DistributionFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DistributionFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 49,
      "end_line": 206,
      "comment": "\n * This factory provids the means to create common statistical distributions.\n * The following distributions are supported:\n * \u003cul\u003e\n * \u003cli\u003eBinomial\u003c/li\u003e\n * \u003cli\u003eCauchy\u003c/li\u003e\n * \u003cli\u003eChi-Squared\u003c/li\u003e\n * \u003cli\u003eExponential\u003c/li\u003e\n * \u003cli\u003eF\u003c/li\u003e\n * \u003cli\u003eGamma\u003c/li\u003e\n * \u003cli\u003eHyperGeometric\u003c/li\u003e\n * \u003cli\u003ePoisson\u003c/li\u003e\n * \u003cli\u003eNormal\u003c/li\u003e\n * \u003cli\u003eStudent\u0027s t\u003c/li\u003e\n * \u003cli\u003eWeibull\u003c/li\u003e\n * \u003cli\u003ePascal\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * Common usage:\u003cpre\u003e\n * DistributionFactory factory \u003d DistributionFactory.newInstance();\n *\n * // create a Chi-Square distribution with 5 degrees of freedom.\n * ChiSquaredDistribution chi \u003d factory.createChiSquareDistribution(5.0);\n * \u003c/pre\u003e\n *\n * @version $Revision$ $Date$\n * @deprecated pluggability of distribution instances is now provided through\n *             constructors and setters.\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.DistributionFactory.DistributionFactory()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactory.newInstance()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Create an instance of a \u003ccode\u003eDistributionFactory\u003c/code\u003e\n     * @return a new factory. \n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactory.createBinomialDistribution(int, double)",
      "begin_line": 73,
      "end_line": 74,
      "comment": "\n     * Create a binomial distribution with the given number of trials and\n     * probability of success.\n     * \n     * @param numberOfTrials the number of trials.\n     * @param probabilityOfSuccess the probability of success\n     * @return a new binomial distribution\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactory.createPascalDistribution(int, double)",
      "begin_line": 85,
      "end_line": 88,
      "comment": "\n     * Create a Pascal distribution with the given number of successes and\n     * probability of success.\n     * \n     * @param numberOfSuccesses the number of successes.\n     * @param probabilityOfSuccess the probability of success\n     * @return a new Pascal distribution\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactory.createCauchyDistribution(double, double)",
      "begin_line": 97,
      "end_line": 101,
      "comment": "\n     * Create a new cauchy distribution with the given median and scale.\n     * @param median the median of the distribution\n     * @param scale the scale\n     * @return a new cauchy distribution  \n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactory.createChiSquareDistribution(double)",
      "begin_line": 109,
      "end_line": 110,
      "comment": "\n     * Create a new chi-square distribution with the given degrees of freedom.\n     * \n     * @param degreesOfFreedom degrees of freedom\n     * @return a new chi-square distribution  \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactory.createExponentialDistribution(double)",
      "begin_line": 118,
      "end_line": 119,
      "comment": "\n     * Create a new exponential distribution with the given degrees of freedom.\n     * \n     * @param mean mean\n     * @return a new exponential distribution  \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactory.createFDistribution(double, double)",
      "begin_line": 128,
      "end_line": 129,
      "comment": "\n     * Create a new F-distribution with the given degrees of freedom.\n     * \n     * @param numeratorDegreesOfFreedom numerator degrees of freedom\n     * @param denominatorDegreesOfFreedom denominator degrees of freedom\n     * @return a new F-distribution \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactory.createGammaDistribution(double, double)",
      "begin_line": 140,
      "end_line": 141,
      "comment": "\n     * Create a new gamma distribution with the given shape and scale\n     * parameters.\n     * \n     * @param alpha the shape parameter\n     * @param beta the scale parameter\n     * \n     * @return a new gamma distribution  \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactory.createTDistribution(double)",
      "begin_line": 149,
      "end_line": 149,
      "comment": "\n     * Create a new t distribution with the given degrees of freedom.\n     * \n     * @param degreesOfFreedom degrees of freedom\n     * @return a new t distribution  \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactory.createHypergeometricDistribution(int, int, int)",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * Create a new hypergeometric distribution with the given the population\n     * size, the number of successes in the population, and the sample size.\n     * \n     * @param populationSize the population size\n     * @param numberOfSuccesses number of successes in the population\n     * @param sampleSize the sample size\n     * @return a new hypergeometric desitribution\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactory.createNormalDistribution(double, double)",
      "begin_line": 172,
      "end_line": 173,
      "comment": "\n     * Create a new normal distribution with the given mean and standard\n     * deviation.\n     * \n     * @param mean the mean of the distribution\n     * @param sd standard deviation\n     * @return a new normal distribution  \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactory.createNormalDistribution()",
      "begin_line": 181,
      "end_line": 181,
      "comment": "\n     * Create a new normal distribution with mean zero and standard\n     * deviation one.\n     * \n     * @return a new normal distribution.  \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactory.createPoissonDistribution(double)",
      "begin_line": 189,
      "end_line": 190,
      "comment": "\n     * Create a new Poisson distribution with poisson parameter lambda.\n     * \n     * @param lambda poisson parameter\n     * @return a new poisson distribution.  \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactory.createWeibullDistribution(double, double)",
      "begin_line": 201,
      "end_line": 205,
      "comment": "\n     * Create a new Weibull distribution with the given shape and scale\n     * parameters.\n     * \n     * @param alpha the shape parameter.\n     * @param beta the scale parameter.\n     * @return a new Weibull distribution.  \n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 56)"
      ]
    }
  ]
}