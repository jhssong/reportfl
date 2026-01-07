{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/distribution/DistributionFactoryImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DistributionFactoryImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.DistributionFactory"
      ],
      "begin_line": 24,
      "end_line": 169,
      "comment": "\n * A concrete distribution factory.  This is the default factory used by\n * Commons-Math.\n *  \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.DistributionFactoryImpl.DistributionFactoryImpl()",
      "begin_line": 29,
      "end_line": 31,
      "comment": "\n     * Default constructor.  Package scope to prevent unwanted instantiation. \n     ",
      "child_ranges": [
        "(line 30,col 9)-(line 30,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactoryImpl.createChiSquareDistribution(double)",
      "begin_line": 39,
      "end_line": 43,
      "comment": "\n     * Create a new chi-square distribution with the given degrees of freedom.\n     * \n     * @param degreesOfFreedom degrees of freedom\n     * @return a new chi-square distribution  \n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactoryImpl.createGammaDistribution(double, double)",
      "begin_line": 52,
      "end_line": 56,
      "comment": "\n     * Create a new gamma distribution the given shape and scale parameters.\n     * \n     * @param alpha the shape parameter\n     * @param beta the scale parameter\n     * @return a new gamma distribution  \n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactoryImpl.createTDistribution(double)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Create a new t distribution with the given degrees of freedom.\n     * \n     * @param degreesOfFreedom degrees of freedom\n     * @return a new t distribution.  \n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactoryImpl.createFDistribution(double, double)",
      "begin_line": 75,
      "end_line": 80,
      "comment": "\n     * Create a new F-distribution with the given degrees of freedom.\n     * \n     * @param numeratorDegreesOfFreedom numerator degrees of freedom\n     * @param denominatorDegreesOfFreedom denominator degrees of freedom\n     * @return a new F-distribution \n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 79,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactoryImpl.createExponentialDistribution(double)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Create a new exponential distribution with the given degrees of freedom.\n     * \n     * @param mean mean\n     * @return a new exponential distribution  \n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactoryImpl.createBinomialDistribution(int, double)",
      "begin_line": 100,
      "end_line": 104,
      "comment": "\n     * Create a binomial distribution with the given number of trials and\n     * probability of success.\n     * \n     * @param numberOfTrials the number of trials\n     * @param probabilityOfSuccess the probability of success\n     * @return a new binomial distribution\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 103,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactoryImpl.createHypergeometricDistribution(int, int, int)",
      "begin_line": 115,
      "end_line": 119,
      "comment": "\n     * Create a new hypergeometric distribution with the given the population\n     * size, the number of successes in the population, and the sample size.\n     * \n     * @param populationSize the population size\n     * @param numberOfSuccesses number of successes in the population\n     * @param sampleSize the sample size\n     * @return a new hypergeometric desitribution\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 118,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactoryImpl.createNormalDistribution(double, double)",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Create a new normal distribution with the given mean and standard\n     * deviation.\n     *  \n     * @param mean the mean of the distribution\n     * @param sd standard deviation\n     * @return a new normal distribution \n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactoryImpl.createNormalDistribution()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * Create a new normal distribution with the mean zero and standard\n     * deviation one.\n     * \n     * @return a new normal distribution  \n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactoryImpl.createPoissonDistribution(double)",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Create a new Poisson distribution with poisson parameter lambda.\n     * \u003cp\u003e\n     * lambda must be postive; otherwise an \n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\n     * \n     * @param lambda poisson parameter\n     * @return a new Poisson distribution  \n     * @throws IllegalArgumentException if lambda \u0026le; 0\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactoryImpl.createPascalDistribution(int, double)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Create a Pascal distribution with the given number of successes and\n     * probability of success.\n     * \n     * @param numberOfSuccesses the number of successes.\n     * @param probabilityOfSuccess the probability of success\n     * @return a new Pascal distribution\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 83)"
      ]
    }
  ]
}