{
  "filepath": "/tmp/Math-7b/src/test/java/org/apache/commons/math3/distribution/RealDistributionAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealDistributionAbstractTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 74,
      "end_line": 510,
      "comment": "\n * Abstract base class for {@link RealDistribution} tests.\n * \u003cp\u003e\n * To create a concrete test class for a continuous distribution\n * implementation, first implement makeDistribution() to return a distribution\n * instance to use in tests. Then implement each of the test data generation\n * methods below.  In each case, the test points and test values arrays\n * returned represent parallel arrays of inputs and expected values for the\n * distribution returned by makeDistribution().  Default implementations\n * are provided for the makeInverseXxx methods that just invert the mapping\n * defined by the arrays returned by the makeCumulativeXxx methods.\n * \u003cp\u003e\n * makeCumulativeTestPoints() -- arguments used to test cumulative probabilities\n * makeCumulativeTestValues() -- expected cumulative probabilites\n * makeDensityTestValues() -- expected density values at cumulativeTestPoints\n * makeInverseCumulativeTestPoints() -- arguments used to test inverse cdf\n * makeInverseCumulativeTestValues() -- expected inverse cdf values\n * \u003cp\u003e\n * To implement additional test cases with different distribution instances and\n * test data, use the setXxx methods for the instance data in test cases and\n * call the verifyXxx methods to verify results.\n * \u003cp\u003e\n * Error tolerance can be overriden by implementing getTolerance().\n * \u003cp\u003e\n * Test data should be validated against reference tables or other packages\n * where possible, and the source of the reference data and/or validation\n * should be documented in the test cases.  A framework for validating\n * distribution data against R is included in the /src/test/R source tree.\n * \u003cp\u003e\n * See {@link NormalDistributionTest} and {@link ChiSquaredDistributionTest}\n * for examples.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "distribution"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "  Distribution instance used to perform tests "
    },
    {
      "type": "field",
      "varNames": [
        "tolerance"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Tolerance used in comparing expected and returned values "
    },
    {
      "type": "field",
      "varNames": [
        "cumulativeTestPoints"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Arguments used to test cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "cumulativeTestValues"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Values used to test cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "inverseCumulativeTestPoints"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Arguments used to test inverse cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "inverseCumulativeTestValues"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Values used to test inverse cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "densityTestValues"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Values used to test density calculations "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.makeDistribution()",
      "begin_line": 101,
      "end_line": 101,
      "comment": " Creates the default continuous distribution instance to use in tests. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.makeCumulativeTestPoints()",
      "begin_line": 104,
      "end_line": 104,
      "comment": " Creates the default cumulative probability test input values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.makeCumulativeTestValues()",
      "begin_line": 107,
      "end_line": 107,
      "comment": " Creates the default cumulative probability test expected values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.makeDensityTestValues()",
      "begin_line": 110,
      "end_line": 110,
      "comment": " Creates the default density test expected values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.makeInverseCumulativeTestPoints()",
      "begin_line": 115,
      "end_line": 117,
      "comment": " Creates the default inverse cumulative probability test input values ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.makeInverseCumulativeTestValues()",
      "begin_line": 120,
      "end_line": 122,
      "comment": " Creates the default inverse cumulative probability density test expected values ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.setUp()",
      "begin_line": 129,
      "end_line": 137,
      "comment": "\n     * Setup sets all test instance data to default values\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 42)",
        "(line 132,col 9)-(line 132,col 58)",
        "(line 133,col 9)-(line 133,col 58)",
        "(line 134,col 9)-(line 134,col 72)",
        "(line 135,col 9)-(line 135,col 72)",
        "(line 136,col 9)-(line 136,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.tearDown()",
      "begin_line": 142,
      "end_line": 150,
      "comment": "\n     * Cleans up test instance data\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 28)",
        "(line 145,col 9)-(line 145,col 36)",
        "(line 146,col 9)-(line 146,col 36)",
        "(line 147,col 9)-(line 147,col 43)",
        "(line 148,col 9)-(line 148,col 43)",
        "(line 149,col 9)-(line 149,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.verifyCumulativeProbabilities()",
      "begin_line": 158,
      "end_line": 184,
      "comment": "\n     * Verifies that cumulative probability density calculations match expected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 165,col 9)",
        "(line 168,col 9)-(line 183,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.verifyInverseCumulativeProbabilities()",
      "begin_line": 190,
      "end_line": 197,
      "comment": "\n     * Verifies that inverse cumulative probability density calculations match expected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 196,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.verifyDensities()",
      "begin_line": 202,
      "end_line": 209,
      "comment": "\n     * Verifies that density calculations match expected values\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 208,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.testCumulativeProbabilities()",
      "begin_line": 217,
      "end_line": 220,
      "comment": "\n     * Verifies that cumulative probability density calculations match expected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.testInverseCumulativeProbabilities()",
      "begin_line": 226,
      "end_line": 229,
      "comment": "\n     * Verifies that inverse cumulative probability density calculations match expected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.testDensities()",
      "begin_line": 235,
      "end_line": 238,
      "comment": "\n     * Verifies that density calculations return expected values\n     * for default test instance data\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.testConsistency()",
      "begin_line": 243,
      "end_line": 263,
      "comment": "\n     * Verifies that probability computations are consistent\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 262,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.testIllegalArguments()",
      "begin_line": 268,
      "end_line": 289,
      "comment": "\n     * Verifies that illegal arguments are correctly handled\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 288,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.testSampling()",
      "begin_line": 294,
      "end_line": 306,
      "comment": "\n     * Test sampling\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 36)",
        "(line 297,col 9)-(line 297,col 49)",
        "(line 298,col 9)-(line 298,col 58)",
        "(line 299,col 9)-(line 299,col 78)",
        "(line 300,col 9)-(line 300,col 49)",
        "(line 301,col 9)-(line 301,col 36)",
        "(line 302,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 305,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.testDensityIntegrals()",
      "begin_line": 316,
      "end_line": 345,
      "comment": "\n     * Verify that density integrals match the distribution.\n     * The (filtered, sorted) cumulativeTestPoints array is used to source\n     * integration limits. The integral of the density (estimated using a\n     * Legendre-Gauss integrator) is compared with the cdf over the same\n     * interval. Test points outside of the domain of the density function\n     * are discarded.\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 34)",
        "(line 319,col 9)-(line 320,col 70)",
        "(line 321,col 9)-(line 325,col 10)",
        "(line 326,col 9)-(line 326,col 80)",
        "(line 327,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 48)",
        "(line 336,col 9)-(line 344,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.Anonymous-2b7024eb-e6be-4229-bc98-d6f814258585.value(double)",
      "begin_line": 322,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 323,col 17)-(line 323,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.testIsSupportLowerBoundInclusive()",
      "begin_line": 351,
      "end_line": 361,
      "comment": "\n     * Verify that isSupportLowerBoundInclusvie returns true iff the lower bound\n     * is finite and density is non-NaN, non-infinite there.\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 70)",
        "(line 354,col 9)-(line 354,col 35)",
        "(line 355,col 9)-(line 355,col 50)",
        "(line 356,col 9)-(line 359,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.testIsSupportUpperBoundInclusive()",
      "begin_line": 367,
      "end_line": 377,
      "comment": "\n     * Verify that isSupportUpperBoundInclusvie returns true iff the upper bound\n     * is finite and density is non-NaN, non-infinite there.\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 70)",
        "(line 370,col 9)-(line 370,col 35)",
        "(line 371,col 9)-(line 371,col 50)",
        "(line 372,col 9)-(line 375,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.testDistributionClone()",
      "begin_line": 379,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 48)",
        "(line 386,col 9)-(line 386,col 30)",
        "(line 389,col 9)-(line 389,col 52)",
        "(line 392,col 9)-(line 392,col 48)",
        "(line 393,col 9)-(line 393,col 42)",
        "(line 394,col 9)-(line 394,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.getCumulativeTestPoints()",
      "begin_line": 401,
      "end_line": 403,
      "comment": "\n     * @return Returns the cumulativeTestPoints.\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.setCumulativeTestPoints(double[])",
      "begin_line": 408,
      "end_line": 410,
      "comment": "\n     * @param cumulativeTestPoints The cumulativeTestPoints to set.\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.getCumulativeTestValues()",
      "begin_line": 415,
      "end_line": 417,
      "comment": "\n     * @return Returns the cumulativeTestValues.\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.setCumulativeTestValues(double[])",
      "begin_line": 422,
      "end_line": 424,
      "comment": "\n     * @param cumulativeTestValues The cumulativeTestValues to set.\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.getDensityTestValues()",
      "begin_line": 426,
      "end_line": 428,
      "comment": "",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.setDensityTestValues(double[])",
      "begin_line": 430,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.getDistribution()",
      "begin_line": 437,
      "end_line": 439,
      "comment": "\n     * @return Returns the distribution.\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.setDistribution(org.apache.commons.math3.distribution.RealDistribution)",
      "begin_line": 444,
      "end_line": 446,
      "comment": "\n     * @param distribution The distribution to set.\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.getInverseCumulativeTestPoints()",
      "begin_line": 451,
      "end_line": 453,
      "comment": "\n     * @return Returns the inverseCumulativeTestPoints.\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.setInverseCumulativeTestPoints(double[])",
      "begin_line": 458,
      "end_line": 460,
      "comment": "\n     * @param inverseCumulativeTestPoints The inverseCumulativeTestPoints to set.\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.getInverseCumulativeTestValues()",
      "begin_line": 465,
      "end_line": 467,
      "comment": "\n     * @return Returns the inverseCumulativeTestValues.\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.setInverseCumulativeTestValues(double[])",
      "begin_line": 472,
      "end_line": 474,
      "comment": "\n     * @param inverseCumulativeTestValues The inverseCumulativeTestValues to set.\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.getTolerance()",
      "begin_line": 479,
      "end_line": 481,
      "comment": "\n     * @return Returns the tolerance.\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.setTolerance(double)",
      "begin_line": 486,
      "end_line": 488,
      "comment": "\n     * @param tolerance The tolerance to set.\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistributionAbstractTest.deepClone()",
      "begin_line": 493,
      "end_line": 509,
      "comment": "\n     * Serialization and deserialization loop of the {@link #distribution}.\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 71)",
        "(line 498,col 9)-(line 498,col 69)",
        "(line 499,col 9)-(line 499,col 39)",
        "(line 500,col 9)-(line 500,col 47)",
        "(line 503,col 9)-(line 503,col 72)",
        "(line 504,col 9)-(line 504,col 65)",
        "(line 505,col 9)-(line 505,col 46)",
        "(line 506,col 9)-(line 506,col 20)",
        "(line 508,col 9)-(line 508,col 40)"
      ]
    }
  ]
}