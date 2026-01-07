{
  "filepath": "/tmp/Math-103b/src/java/org/apache/commons/math/distribution/DistributionFactoryImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DistributionFactoryImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.DistributionFactory"
      ],
      "begin_line": 27,
      "end_line": 159,
      "comment": "\n * A concrete distribution factory.  This is the default factory used by\n * Commons-Math.\n *  \n * @version $Revision$ $Date$\n * @deprecated pluggability of distribution instances is now provided through\n *             constructors and setters.\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.DistributionFactoryImpl.DistributionFactoryImpl()",
      "begin_line": 32,
      "end_line": 34,
      "comment": "\n     * Default constructor.  Package scope to prevent unwanted instantiation. \n     ",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactoryImpl.createChiSquareDistribution(double)",
      "begin_line": 42,
      "end_line": 46,
      "comment": "\n     * Create a new chi-square distribution with the given degrees of freedom.\n     * \n     * @param degreesOfFreedom degrees of freedom\n     * @return a new chi-square distribution  \n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactoryImpl.createGammaDistribution(double, double)",
      "begin_line": 55,
      "end_line": 59,
      "comment": "\n     * Create a new gamma distribution the given shape and scale parameters.\n     * \n     * @param alpha the shape parameter\n     * @param beta the scale parameter\n     * @return a new gamma distribution  \n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactoryImpl.createTDistribution(double)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Create a new t distribution with the given degrees of freedom.\n     * \n     * @param degreesOfFreedom degrees of freedom\n     * @return a new t distribution.  \n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactoryImpl.createFDistribution(double, double)",
      "begin_line": 78,
      "end_line": 83,
      "comment": "\n     * Create a new F-distribution with the given degrees of freedom.\n     * \n     * @param numeratorDegreesOfFreedom numerator degrees of freedom\n     * @param denominatorDegreesOfFreedom denominator degrees of freedom\n     * @return a new F-distribution \n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 82,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactoryImpl.createExponentialDistribution(double)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Create a new exponential distribution with the given degrees of freedom.\n     * \n     * @param mean mean\n     * @return a new exponential distribution  \n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactoryImpl.createBinomialDistribution(int, double)",
      "begin_line": 103,
      "end_line": 107,
      "comment": "\n     * Create a binomial distribution with the given number of trials and\n     * probability of success.\n     * \n     * @param numberOfTrials the number of trials\n     * @param probabilityOfSuccess the probability of success\n     * @return a new binomial distribution\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 106,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactoryImpl.createHypergeometricDistribution(int, int, int)",
      "begin_line": 118,
      "end_line": 122,
      "comment": "\n     * Create a new hypergeometric distribution with the given the population\n     * size, the number of successes in the population, and the sample size.\n     * \n     * @param populationSize the population size\n     * @param numberOfSuccesses number of successes in the population\n     * @param sampleSize the sample size\n     * @return a new hypergeometric desitribution\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 121,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactoryImpl.createNormalDistribution(double, double)",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * Create a new normal distribution with the given mean and standard\n     * deviation.\n     *  \n     * @param mean the mean of the distribution\n     * @param sd standard deviation\n     * @return a new normal distribution \n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactoryImpl.createNormalDistribution()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * Create a new normal distribution with the mean zero and standard\n     * deviation one.\n     * \n     * @return a new normal distribution  \n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.DistributionFactoryImpl.createPoissonDistribution(double)",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * Create a new Poisson distribution with poisson parameter lambda.\n     * \u003cp\u003e\n     * lambda must be postive; otherwise an \n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\n     * \n     * @param lambda poisson parameter\n     * @return a new Poisson distribution  \n     * @throws IllegalArgumentException if lambda \u0026le; 0\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 51)"
      ]
    }
  ]
}