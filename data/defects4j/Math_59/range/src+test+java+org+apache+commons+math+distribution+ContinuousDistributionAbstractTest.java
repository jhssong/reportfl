{
  "filepath": "/tmp/Math-59b/src/test/java/org/apache/commons/math/distribution/ContinuousDistributionAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ContinuousDistributionAbstractTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 59,
      "end_line": 372,
      "comment": "\n * Abstract base class for {@link ContinuousDistribution} tests.\n * \u003cp\u003e\n * To create a concrete test class for a continuous distribution\n * implementation, first implement makeDistribution() to return a distribution\n * instance to use in tests. Then implement each of the test data generation\n * methods below.  In each case, the test points and test values arrays\n * returned represent parallel arrays of inputs and expected values for the\n * distribution returned by makeDistribution().  Default implementations\n * are provided for the makeInverseXxx methods that just invert the mapping\n * defined by the arrays returned by the makeCumulativeXxx methods.\n * \u003cp\u003e\n * makeCumulativeTestPoints() -- arguments used to test cumulative probabilities\n * makeCumulativeTestValues() -- expected cumulative probabilites\n * makeDensityTestValues() -- expected density values at cumulativeTestPoints\n * makeInverseCumulativeTestPoints() -- arguments used to test inverse cdf\n * makeInverseCumulativeTestValues() -- expected inverse cdf values\n * \u003cp\u003e\n * To implement additional test cases with different distribution instances and\n * test data, use the setXxx methods for the instance data in test cases and\n * call the verifyXxx methods to verify results.\n * \u003cp\u003e\n * Error tolerance can be overriden by implementing getTolerance().\n * \u003cp\u003e\n * Test data should be validated against reference tables or other packages\n * where possible, and the source of the reference data and/or validation\n * should be documented in the test cases.  A framework for validating\n * distribution data against R is included in the /src/test/R source tree.\n * \u003cp\u003e\n * See {@link NormalDistributionTest} and {@link ChiSquareDistributionTest}\n * for examples.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "distribution"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "  Distribution instance used to perform tests "
    },
    {
      "type": "field",
      "varNames": [
        "tolerance"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Tolerance used in comparing expected and returned values "
    },
    {
      "type": "field",
      "varNames": [
        "cumulativeTestPoints"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Arguments used to test cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "cumulativeTestValues"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Values used to test cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "inverseCumulativeTestPoints"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Arguments used to test inverse cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "inverseCumulativeTestValues"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Values used to test inverse cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "densityTestValues"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Values used to test density calculations "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.ContinuousDistributionAbstractTest(java.lang.String)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Constructor for ContinuousDistributionAbstractTest.\n     * @param name\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.makeDistribution()",
      "begin_line": 96,
      "end_line": 96,
      "comment": " Creates the default continuous distribution instance to use in tests. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.makeCumulativeTestPoints()",
      "begin_line": 99,
      "end_line": 99,
      "comment": " Creates the default cumulative probability test input values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.makeCumulativeTestValues()",
      "begin_line": 102,
      "end_line": 102,
      "comment": " Creates the default cumulative probability test expected values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.makeDensityTestValues()",
      "begin_line": 105,
      "end_line": 105,
      "comment": " Creates the default density test expected values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.makeInverseCumulativeTestPoints()",
      "begin_line": 110,
      "end_line": 112,
      "comment": " Creates the default inverse cumulative probability test input values ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.makeInverseCumulativeTestValues()",
      "begin_line": 115,
      "end_line": 117,
      "comment": " Creates the default inverse cumulative probability density test expected values ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setUp()",
      "begin_line": 124,
      "end_line": 133,
      "comment": "\n     * Setup sets all test instance data to default values\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 22)",
        "(line 127,col 9)-(line 127,col 42)",
        "(line 128,col 9)-(line 128,col 58)",
        "(line 129,col 9)-(line 129,col 58)",
        "(line 130,col 9)-(line 130,col 72)",
        "(line 131,col 9)-(line 131,col 72)",
        "(line 132,col 9)-(line 132,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.tearDown()",
      "begin_line": 138,
      "end_line": 147,
      "comment": "\n     * Cleans up test instance data\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 25)",
        "(line 141,col 9)-(line 141,col 28)",
        "(line 142,col 9)-(line 142,col 36)",
        "(line 143,col 9)-(line 143,col 36)",
        "(line 144,col 9)-(line 144,col 43)",
        "(line 145,col 9)-(line 145,col 43)",
        "(line 146,col 9)-(line 146,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.verifyCumulativeProbabilities()",
      "begin_line": 155,
      "end_line": 162,
      "comment": "\n     * Verifies that cumulative probability density calculations match expected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.verifyInverseCumulativeProbabilities()",
      "begin_line": 168,
      "end_line": 175,
      "comment": "\n     * Verifies that inverse cumulative probability density calculations match expected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 174,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.verifyDensities()",
      "begin_line": 180,
      "end_line": 188,
      "comment": "\n     * Verifies that density calculations match expected values\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 187,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.testCumulativeProbabilities()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * Verifies that cumulative probability density calculations match expected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.testInverseCumulativeProbabilities()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * Verifies that inverse cumulative probability density calculations match expected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.testDensities()",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n     * Verifies that density calculations return expected values\n     * for default test instance data\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.testConsistency()",
      "begin_line": 219,
      "end_line": 236,
      "comment": "\n     * Verifies that probability computations are consistent\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 235,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.testIllegalArguments()",
      "begin_line": 241,
      "end_line": 260,
      "comment": "\n     * Verifies that illegal arguments are correctly handled\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 259,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.testSampling()",
      "begin_line": 265,
      "end_line": 277,
      "comment": "\n     * Test sampling\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 98)",
        "(line 267,col 9)-(line 267,col 36)",
        "(line 268,col 9)-(line 268,col 50)",
        "(line 269,col 9)-(line 269,col 70)",
        "(line 270,col 9)-(line 270,col 49)",
        "(line 271,col 9)-(line 271,col 36)",
        "(line 272,col 9)-(line 272,col 41)",
        "(line 273,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 276,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getCumulativeTestPoints()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\n     * @return Returns the cumulativeTestPoints.\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setCumulativeTestPoints(double[])",
      "begin_line": 290,
      "end_line": 292,
      "comment": "\n     * @param cumulativeTestPoints The cumulativeTestPoints to set.\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getCumulativeTestValues()",
      "begin_line": 297,
      "end_line": 299,
      "comment": "\n     * @return Returns the cumulativeTestValues.\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setCumulativeTestValues(double[])",
      "begin_line": 304,
      "end_line": 306,
      "comment": "\n     * @param cumulativeTestValues The cumulativeTestValues to set.\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getDensityTestValues()",
      "begin_line": 308,
      "end_line": 310,
      "comment": "",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setDensityTestValues(double[])",
      "begin_line": 312,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getDistribution()",
      "begin_line": 319,
      "end_line": 321,
      "comment": "\n     * @return Returns the distribution.\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setDistribution(org.apache.commons.math.distribution.AbstractContinuousDistribution)",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\n     * @param distribution The distribution to set.\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getInverseCumulativeTestPoints()",
      "begin_line": 333,
      "end_line": 335,
      "comment": "\n     * @return Returns the inverseCumulativeTestPoints.\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setInverseCumulativeTestPoints(double[])",
      "begin_line": 340,
      "end_line": 342,
      "comment": "\n     * @param inverseCumulativeTestPoints The inverseCumulativeTestPoints to set.\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getInverseCumulativeTestValues()",
      "begin_line": 347,
      "end_line": 349,
      "comment": "\n     * @return Returns the inverseCumulativeTestValues.\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setInverseCumulativeTestValues(double[])",
      "begin_line": 354,
      "end_line": 356,
      "comment": "\n     * @param inverseCumulativeTestValues The inverseCumulativeTestValues to set.\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getTolerance()",
      "begin_line": 361,
      "end_line": 363,
      "comment": "\n     * @return Returns the tolerance.\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setTolerance(double)",
      "begin_line": 368,
      "end_line": 370,
      "comment": "\n     * @param tolerance The tolerance to set.\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 35)"
      ]
    }
  ]
}