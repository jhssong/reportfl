{
  "filepath": "/tmp/Math-38b/src/test/java/org/apache/commons/math/distribution/RealDistributionAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealDistributionAbstractTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 63,
      "end_line": 386,
      "comment": "\n * Abstract base class for {@link RealDistribution} tests.\n * \u003cp\u003e\n * To create a concrete test class for a continuous distribution\n * implementation, first implement makeDistribution() to return a distribution\n * instance to use in tests. Then implement each of the test data generation\n * methods below.  In each case, the test points and test values arrays\n * returned represent parallel arrays of inputs and expected values for the\n * distribution returned by makeDistribution().  Default implementations\n * are provided for the makeInverseXxx methods that just invert the mapping\n * defined by the arrays returned by the makeCumulativeXxx methods.\n * \u003cp\u003e\n * makeCumulativeTestPoints() -- arguments used to test cumulative probabilities\n * makeCumulativeTestValues() -- expected cumulative probabilites\n * makeDensityTestValues() -- expected density values at cumulativeTestPoints\n * makeInverseCumulativeTestPoints() -- arguments used to test inverse cdf\n * makeInverseCumulativeTestValues() -- expected inverse cdf values\n * \u003cp\u003e\n * To implement additional test cases with different distribution instances and\n * test data, use the setXxx methods for the instance data in test cases and\n * call the verifyXxx methods to verify results.\n * \u003cp\u003e\n * Error tolerance can be overriden by implementing getTolerance().\n * \u003cp\u003e\n * Test data should be validated against reference tables or other packages\n * where possible, and the source of the reference data and/or validation\n * should be documented in the test cases.  A framework for validating\n * distribution data against R is included in the /src/test/R source tree.\n * \u003cp\u003e\n * See {@link NormalDistributionTest} and {@link ChiSquaredDistributionTest}\n * for examples.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "distribution"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "  Distribution instance used to perform tests "
    },
    {
      "type": "field",
      "varNames": [
        "tolerance"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Tolerance used in comparing expected and returned values "
    },
    {
      "type": "field",
      "varNames": [
        "cumulativeTestPoints"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Arguments used to test cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "cumulativeTestValues"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Values used to test cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "inverseCumulativeTestPoints"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Arguments used to test inverse cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "inverseCumulativeTestValues"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Values used to test inverse cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "densityTestValues"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Values used to test density calculations "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.makeDistribution()",
      "begin_line": 90,
      "end_line": 90,
      "comment": " Creates the default continuous distribution instance to use in tests. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.makeCumulativeTestPoints()",
      "begin_line": 93,
      "end_line": 93,
      "comment": " Creates the default cumulative probability test input values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.makeCumulativeTestValues()",
      "begin_line": 96,
      "end_line": 96,
      "comment": " Creates the default cumulative probability test expected values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.makeDensityTestValues()",
      "begin_line": 99,
      "end_line": 99,
      "comment": " Creates the default density test expected values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.makeInverseCumulativeTestPoints()",
      "begin_line": 104,
      "end_line": 106,
      "comment": " Creates the default inverse cumulative probability test input values ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.makeInverseCumulativeTestValues()",
      "begin_line": 109,
      "end_line": 111,
      "comment": " Creates the default inverse cumulative probability density test expected values ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.setUp()",
      "begin_line": 118,
      "end_line": 126,
      "comment": "\n     * Setup sets all test instance data to default values\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 42)",
        "(line 121,col 9)-(line 121,col 58)",
        "(line 122,col 9)-(line 122,col 58)",
        "(line 123,col 9)-(line 123,col 72)",
        "(line 124,col 9)-(line 124,col 72)",
        "(line 125,col 9)-(line 125,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.tearDown()",
      "begin_line": 131,
      "end_line": 139,
      "comment": "\n     * Cleans up test instance data\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 28)",
        "(line 134,col 9)-(line 134,col 36)",
        "(line 135,col 9)-(line 135,col 36)",
        "(line 136,col 9)-(line 136,col 43)",
        "(line 137,col 9)-(line 137,col 43)",
        "(line 138,col 9)-(line 138,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.verifyCumulativeProbabilities()",
      "begin_line": 147,
      "end_line": 172,
      "comment": "\n     * Verifies that cumulative probability density calculations match expected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 154,col 9)",
        "(line 156,col 9)-(line 171,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.verifyInverseCumulativeProbabilities()",
      "begin_line": 178,
      "end_line": 185,
      "comment": "\n     * Verifies that inverse cumulative probability density calculations match expected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 184,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.verifyDensities()",
      "begin_line": 190,
      "end_line": 197,
      "comment": "\n     * Verifies that density calculations match expected values\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 196,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.testCumulativeProbabilities()",
      "begin_line": 205,
      "end_line": 208,
      "comment": "\n     * Verifies that cumulative probability density calculations match expected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.testInverseCumulativeProbabilities()",
      "begin_line": 214,
      "end_line": 217,
      "comment": "\n     * Verifies that inverse cumulative probability density calculations match expected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.testDensities()",
      "begin_line": 223,
      "end_line": 226,
      "comment": "\n     * Verifies that density calculations return expected values\n     * for default test instance data\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.testConsistency()",
      "begin_line": 231,
      "end_line": 249,
      "comment": "\n     * Verifies that probability computations are consistent\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 248,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.testIllegalArguments()",
      "begin_line": 254,
      "end_line": 274,
      "comment": "\n     * Verifies that illegal arguments are correctly handled\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 273,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.testSampling()",
      "begin_line": 279,
      "end_line": 291,
      "comment": "\n     * Test sampling\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 36)",
        "(line 282,col 9)-(line 282,col 49)",
        "(line 283,col 9)-(line 283,col 58)",
        "(line 284,col 9)-(line 284,col 78)",
        "(line 285,col 9)-(line 285,col 49)",
        "(line 286,col 9)-(line 286,col 36)",
        "(line 287,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 290,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.getCumulativeTestPoints()",
      "begin_line": 297,
      "end_line": 299,
      "comment": "\n     * @return Returns the cumulativeTestPoints.\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.setCumulativeTestPoints(double[])",
      "begin_line": 304,
      "end_line": 306,
      "comment": "\n     * @param cumulativeTestPoints The cumulativeTestPoints to set.\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.getCumulativeTestValues()",
      "begin_line": 311,
      "end_line": 313,
      "comment": "\n     * @return Returns the cumulativeTestValues.\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.setCumulativeTestValues(double[])",
      "begin_line": 318,
      "end_line": 320,
      "comment": "\n     * @param cumulativeTestValues The cumulativeTestValues to set.\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.getDensityTestValues()",
      "begin_line": 322,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.setDensityTestValues(double[])",
      "begin_line": 326,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.getDistribution()",
      "begin_line": 333,
      "end_line": 335,
      "comment": "\n     * @return Returns the distribution.\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.setDistribution(org.apache.commons.math.distribution.RealDistribution)",
      "begin_line": 340,
      "end_line": 342,
      "comment": "\n     * @param distribution The distribution to set.\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.getInverseCumulativeTestPoints()",
      "begin_line": 347,
      "end_line": 349,
      "comment": "\n     * @return Returns the inverseCumulativeTestPoints.\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.setInverseCumulativeTestPoints(double[])",
      "begin_line": 354,
      "end_line": 356,
      "comment": "\n     * @param inverseCumulativeTestPoints The inverseCumulativeTestPoints to set.\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.getInverseCumulativeTestValues()",
      "begin_line": 361,
      "end_line": 363,
      "comment": "\n     * @return Returns the inverseCumulativeTestValues.\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.setInverseCumulativeTestValues(double[])",
      "begin_line": 368,
      "end_line": 370,
      "comment": "\n     * @param inverseCumulativeTestValues The inverseCumulativeTestValues to set.\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.getTolerance()",
      "begin_line": 375,
      "end_line": 377,
      "comment": "\n     * @return Returns the tolerance.\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.RealDistributionAbstractTest.setTolerance(double)",
      "begin_line": 382,
      "end_line": 384,
      "comment": "\n     * @param tolerance The tolerance to set.\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 35)"
      ]
    }
  ]
}