{
  "filepath": "/tmp/Math-17b/src/test/java/org/apache/commons/math3/distribution/RealDistributionAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealDistributionAbstractTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 69,
      "end_line": 467,
      "comment": "\n * Abstract base class for {@link RealDistribution} tests.\n * \u003cp\u003e\n * To create a concrete test class for a continuous distribution\n * implementation, first implement makeDistribution() to return a distribution\n * instance to use in tests. Then implement each of the test data generation\n * methods below.  In each case, the test points and test values arrays\n * returned represent parallel arrays of inputs and expected values for the\n * distribution returned by makeDistribution().  Default implementations\n * are provided for the makeInverseXxx methods that just invert the mapping\n * defined by the arrays returned by the makeCumulativeXxx methods.\n * \u003cp\u003e\n * makeCumulativeTestPoints() -- arguments used to test cumulative probabilities\n * makeCumulativeTestValues() -- expected cumulative probabilites\n * makeDensityTestValues() -- expected density values at cumulativeTestPoints\n * makeInverseCumulativeTestPoints() -- arguments used to test inverse cdf\n * makeInverseCumulativeTestValues() -- expected inverse cdf values\n * \u003cp\u003e\n * To implement additional test cases with different distribution instances and\n * test data, use the setXxx methods for the instance data in test cases and\n * call the verifyXxx methods to verify results.\n * \u003cp\u003e\n * Error tolerance can be overriden by implementing getTolerance().\n * \u003cp\u003e\n * Test data should be validated against reference tables or other packages\n * where possible, and the source of the reference data and/or validation\n * should be documented in the test cases.  A framework for validating\n * distribution data against R is included in the /src/test/R source tree.\n * \u003cp\u003e\n * See {@link NormalDistributionTest} and {@link ChiSquaredDistributionTest}\n * for examples.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "distribution"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "  Distribution instance used to perform tests "
    },
    {
      "type": "field",
      "varNames": [
        "tolerance"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Tolerance used in comparing expected and returned values "
    },
    {
      "type": "field",
      "varNames": [
        "cumulativeTestPoints"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Arguments used to test cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "cumulativeTestValues"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Values used to test cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "inverseCumulativeTestPoints"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Arguments used to test inverse cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "inverseCumulativeTestValues"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Values used to test inverse cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "densityTestValues"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Values used to test density calculations "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.makeDistribution()",
      "begin_line": 96,
      "end_line": 96,
      "comment": " Creates the default continuous distribution instance to use in tests. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.makeCumulativeTestPoints()",
      "begin_line": 99,
      "end_line": 99,
      "comment": " Creates the default cumulative probability test input values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.makeCumulativeTestValues()",
      "begin_line": 102,
      "end_line": 102,
      "comment": " Creates the default cumulative probability test expected values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.makeDensityTestValues()",
      "begin_line": 105,
      "end_line": 105,
      "comment": " Creates the default density test expected values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.makeInverseCumulativeTestPoints()",
      "begin_line": 110,
      "end_line": 112,
      "comment": " Creates the default inverse cumulative probability test input values ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.makeInverseCumulativeTestValues()",
      "begin_line": 115,
      "end_line": 117,
      "comment": " Creates the default inverse cumulative probability density test expected values ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.setUp()",
      "begin_line": 124,
      "end_line": 132,
      "comment": "\n     * Setup sets all test instance data to default values\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 42)",
        "(line 127,col 9)-(line 127,col 58)",
        "(line 128,col 9)-(line 128,col 58)",
        "(line 129,col 9)-(line 129,col 72)",
        "(line 130,col 9)-(line 130,col 72)",
        "(line 131,col 9)-(line 131,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.tearDown()",
      "begin_line": 137,
      "end_line": 145,
      "comment": "\n     * Cleans up test instance data\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 28)",
        "(line 140,col 9)-(line 140,col 36)",
        "(line 141,col 9)-(line 141,col 36)",
        "(line 142,col 9)-(line 142,col 43)",
        "(line 143,col 9)-(line 143,col 43)",
        "(line 144,col 9)-(line 144,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.verifyCumulativeProbabilities()",
      "begin_line": 153,
      "end_line": 179,
      "comment": "\n     * Verifies that cumulative probability density calculations match expected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 160,col 9)",
        "(line 163,col 9)-(line 178,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.verifyInverseCumulativeProbabilities()",
      "begin_line": 185,
      "end_line": 192,
      "comment": "\n     * Verifies that inverse cumulative probability density calculations match expected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 191,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.verifyDensities()",
      "begin_line": 197,
      "end_line": 204,
      "comment": "\n     * Verifies that density calculations match expected values\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 203,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.testCumulativeProbabilities()",
      "begin_line": 212,
      "end_line": 215,
      "comment": "\n     * Verifies that cumulative probability density calculations match expected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.testInverseCumulativeProbabilities()",
      "begin_line": 221,
      "end_line": 224,
      "comment": "\n     * Verifies that inverse cumulative probability density calculations match expected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.testDensities()",
      "begin_line": 230,
      "end_line": 233,
      "comment": "\n     * Verifies that density calculations return expected values\n     * for default test instance data\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.testConsistency()",
      "begin_line": 238,
      "end_line": 258,
      "comment": "\n     * Verifies that probability computations are consistent\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 257,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.testIllegalArguments()",
      "begin_line": 263,
      "end_line": 284,
      "comment": "\n     * Verifies that illegal arguments are correctly handled\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 283,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.testSampling()",
      "begin_line": 289,
      "end_line": 301,
      "comment": "\n     * Test sampling\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 36)",
        "(line 292,col 9)-(line 292,col 49)",
        "(line 293,col 9)-(line 293,col 58)",
        "(line 294,col 9)-(line 294,col 78)",
        "(line 295,col 9)-(line 295,col 49)",
        "(line 296,col 9)-(line 296,col 36)",
        "(line 297,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 300,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.testDensityIntegrals()",
      "begin_line": 311,
      "end_line": 340,
      "comment": "\n     * Verify that density integrals match the distribution.\n     * The (filtered, sorted) cumulativeTestPoints array is used to source\n     * integration limits. The integral of the density (estimated using a\n     * Legendre-Gauss integrator) is compared with the cdf over the same\n     * interval. Test points outside of the domain of the density function\n     * are discarded.\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 34)",
        "(line 314,col 9)-(line 315,col 70)",
        "(line 316,col 9)-(line 320,col 10)",
        "(line 321,col 9)-(line 321,col 80)",
        "(line 322,col 9)-(line 329,col 9)",
        "(line 330,col 9)-(line 330,col 48)",
        "(line 331,col 9)-(line 339,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.Anonymous-f805caa8-2336-4398-95d4-3c5794723cc6.value(double)",
      "begin_line": 317,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 318,col 17)-(line 318,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.testIsSupportLowerBoundInclusive()",
      "begin_line": 346,
      "end_line": 356,
      "comment": "\n     * Verify that isSupportLowerBoundInclusvie returns true iff the lower bound\n     * is finite and density is non-NaN, non-infinite there.\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 70)",
        "(line 349,col 9)-(line 349,col 35)",
        "(line 350,col 9)-(line 350,col 50)",
        "(line 351,col 9)-(line 354,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.testIsSupportUpperBoundInclusive()",
      "begin_line": 362,
      "end_line": 372,
      "comment": "\n     * Verify that isSupportUpperBoundInclusvie returns true iff the upper bound\n     * is finite and density is non-NaN, non-infinite there.\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 70)",
        "(line 365,col 9)-(line 365,col 35)",
        "(line 366,col 9)-(line 366,col 50)",
        "(line 367,col 9)-(line 370,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.getCumulativeTestPoints()",
      "begin_line": 378,
      "end_line": 380,
      "comment": "\n     * @return Returns the cumulativeTestPoints.\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.setCumulativeTestPoints(double[])",
      "begin_line": 385,
      "end_line": 387,
      "comment": "\n     * @param cumulativeTestPoints The cumulativeTestPoints to set.\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.getCumulativeTestValues()",
      "begin_line": 392,
      "end_line": 394,
      "comment": "\n     * @return Returns the cumulativeTestValues.\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.setCumulativeTestValues(double[])",
      "begin_line": 399,
      "end_line": 401,
      "comment": "\n     * @param cumulativeTestValues The cumulativeTestValues to set.\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.getDensityTestValues()",
      "begin_line": 403,
      "end_line": 405,
      "comment": "",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.setDensityTestValues(double[])",
      "begin_line": 407,
      "end_line": 409,
      "comment": "",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.getDistribution()",
      "begin_line": 414,
      "end_line": 416,
      "comment": "\n     * @return Returns the distribution.\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.setDistribution(org.apache.commons.math3.distribution.RealDistribution)",
      "begin_line": 421,
      "end_line": 423,
      "comment": "\n     * @param distribution The distribution to set.\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.getInverseCumulativeTestPoints()",
      "begin_line": 428,
      "end_line": 430,
      "comment": "\n     * @return Returns the inverseCumulativeTestPoints.\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.setInverseCumulativeTestPoints(double[])",
      "begin_line": 435,
      "end_line": 437,
      "comment": "\n     * @param inverseCumulativeTestPoints The inverseCumulativeTestPoints to set.\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.getInverseCumulativeTestValues()",
      "begin_line": 442,
      "end_line": 444,
      "comment": "\n     * @return Returns the inverseCumulativeTestValues.\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.setInverseCumulativeTestValues(double[])",
      "begin_line": 449,
      "end_line": 451,
      "comment": "\n     * @param inverseCumulativeTestValues The inverseCumulativeTestValues to set.\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.getTolerance()",
      "begin_line": 456,
      "end_line": 458,
      "comment": "\n     * @return Returns the tolerance.\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.setTolerance(double)",
      "begin_line": 463,
      "end_line": 465,
      "comment": "\n     * @param tolerance The tolerance to set.\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 35)"
      ]
    }
  ]
}