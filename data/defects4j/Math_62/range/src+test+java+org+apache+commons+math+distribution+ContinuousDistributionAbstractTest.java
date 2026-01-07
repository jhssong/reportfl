{
  "filepath": "/tmp/Math-62b/src/test/java/org/apache/commons/math/distribution/ContinuousDistributionAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ContinuousDistributionAbstractTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 58,
      "end_line": 371,
      "comment": "\n * Abstract base class for {@link ContinuousDistribution} tests.\n * \u003cp\u003e\n * To create a concrete test class for a continuous distribution\n * implementation, first implement makeDistribution() to return a distribution\n * instance to use in tests. Then implement each of the test data generation\n * methods below.  In each case, the test points and test values arrays\n * returned represent parallel arrays of inputs and expected values for the\n * distribution returned by makeDistribution().  Default implementations\n * are provided for the makeInverseXxx methods that just invert the mapping\n * defined by the arrays returned by the makeCumulativeXxx methods.\n * \u003cp\u003e\n * makeCumulativeTestPoints() -- arguments used to test cumulative probabilities\n * makeCumulativeTestValues() -- expected cumulative probabilites\n * makeDensityTestValues() -- expected density values at cumulativeTestPoints\n * makeInverseCumulativeTestPoints() -- arguments used to test inverse cdf\n * makeInverseCumulativeTestValues() -- expected inverse cdf values\n * \u003cp\u003e\n * To implement additional test cases with different distribution instances and\n * test data, use the setXxx methods for the instance data in test cases and\n * call the verifyXxx methods to verify results.\n * \u003cp\u003e\n * Error tolerance can be overriden by implementing getTolerance().\n * \u003cp\u003e\n * Test data should be validated against reference tables or other packages\n * where possible, and the source of the reference data and/or validation\n * should be documented in the test cases.  A framework for validating\n * distribution data against R is included in the /src/test/R source tree.\n * \u003cp\u003e\n * See {@link NormalDistributionTest} and {@link ChiSquareDistributionTest}\n * for examples.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "distribution"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "  Distribution instance used to perform tests "
    },
    {
      "type": "field",
      "varNames": [
        "tolerance"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Tolerance used in comparing expected and returned values "
    },
    {
      "type": "field",
      "varNames": [
        "cumulativeTestPoints"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Arguments used to test cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "cumulativeTestValues"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Values used to test cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "inverseCumulativeTestPoints"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Arguments used to test inverse cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "inverseCumulativeTestValues"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Values used to test inverse cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "densityTestValues"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Values used to test density calculations "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.ContinuousDistributionAbstractTest(java.lang.String)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Constructor for ContinuousDistributionAbstractTest.\n     * @param name\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.makeDistribution()",
      "begin_line": 95,
      "end_line": 95,
      "comment": " Creates the default continuous distribution instance to use in tests. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.makeCumulativeTestPoints()",
      "begin_line": 98,
      "end_line": 98,
      "comment": " Creates the default cumulative probability test input values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.makeCumulativeTestValues()",
      "begin_line": 101,
      "end_line": 101,
      "comment": " Creates the default cumulative probability test expected values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.makeDensityTestValues()",
      "begin_line": 104,
      "end_line": 104,
      "comment": " Creates the default density test expected values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.makeInverseCumulativeTestPoints()",
      "begin_line": 109,
      "end_line": 111,
      "comment": " Creates the default inverse cumulative probability test input values ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.makeInverseCumulativeTestValues()",
      "begin_line": 114,
      "end_line": 116,
      "comment": " Creates the default inverse cumulative probability density test expected values ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setUp()",
      "begin_line": 123,
      "end_line": 132,
      "comment": "\n     * Setup sets all test instance data to default values\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 22)",
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
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.tearDown()",
      "begin_line": 137,
      "end_line": 146,
      "comment": "\n     * Cleans up test instance data\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 25)",
        "(line 140,col 9)-(line 140,col 28)",
        "(line 141,col 9)-(line 141,col 36)",
        "(line 142,col 9)-(line 142,col 36)",
        "(line 143,col 9)-(line 143,col 43)",
        "(line 144,col 9)-(line 144,col 43)",
        "(line 145,col 9)-(line 145,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.verifyCumulativeProbabilities()",
      "begin_line": 154,
      "end_line": 161,
      "comment": "\n     * Verifies that cumulative probability density calculations match expected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 160,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.verifyInverseCumulativeProbabilities()",
      "begin_line": 167,
      "end_line": 174,
      "comment": "\n     * Verifies that inverse cumulative probability density calculations match expected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 173,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.verifyDensities()",
      "begin_line": 179,
      "end_line": 187,
      "comment": "\n     * Verifies that density calculations match expected values\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 186,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.testCumulativeProbabilities()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * Verifies that cumulative probability density calculations match expected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.testInverseCumulativeProbabilities()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n     * Verifies that inverse cumulative probability density calculations match expected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.testDensities()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\n     * Verifies that density calculations return expected values\n     * for default test instance data\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.testConsistency()",
      "begin_line": 218,
      "end_line": 235,
      "comment": "\n     * Verifies that probability computations are consistent\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 234,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.testIllegalArguments()",
      "begin_line": 240,
      "end_line": 259,
      "comment": "\n     * Verifies that illegal arguments are correctly handled\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 258,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.testSampling()",
      "begin_line": 264,
      "end_line": 276,
      "comment": "\n     * Test sampling\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 98)",
        "(line 266,col 9)-(line 266,col 36)",
        "(line 267,col 9)-(line 267,col 50)",
        "(line 268,col 9)-(line 268,col 70)",
        "(line 269,col 9)-(line 269,col 49)",
        "(line 270,col 9)-(line 270,col 36)",
        "(line 271,col 9)-(line 271,col 41)",
        "(line 272,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getCumulativeTestPoints()",
      "begin_line": 282,
      "end_line": 284,
      "comment": "\n     * @return Returns the cumulativeTestPoints.\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setCumulativeTestPoints(double[])",
      "begin_line": 289,
      "end_line": 291,
      "comment": "\n     * @param cumulativeTestPoints The cumulativeTestPoints to set.\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getCumulativeTestValues()",
      "begin_line": 296,
      "end_line": 298,
      "comment": "\n     * @return Returns the cumulativeTestValues.\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setCumulativeTestValues(double[])",
      "begin_line": 303,
      "end_line": 305,
      "comment": "\n     * @param cumulativeTestValues The cumulativeTestValues to set.\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getDensityTestValues()",
      "begin_line": 307,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setDensityTestValues(double[])",
      "begin_line": 311,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getDistribution()",
      "begin_line": 318,
      "end_line": 320,
      "comment": "\n     * @return Returns the distribution.\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setDistribution(org.apache.commons.math.distribution.AbstractContinuousDistribution)",
      "begin_line": 325,
      "end_line": 327,
      "comment": "\n     * @param distribution The distribution to set.\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getInverseCumulativeTestPoints()",
      "begin_line": 332,
      "end_line": 334,
      "comment": "\n     * @return Returns the inverseCumulativeTestPoints.\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setInverseCumulativeTestPoints(double[])",
      "begin_line": 339,
      "end_line": 341,
      "comment": "\n     * @param inverseCumulativeTestPoints The inverseCumulativeTestPoints to set.\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getInverseCumulativeTestValues()",
      "begin_line": 346,
      "end_line": 348,
      "comment": "\n     * @return Returns the inverseCumulativeTestValues.\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setInverseCumulativeTestValues(double[])",
      "begin_line": 353,
      "end_line": 355,
      "comment": "\n     * @param inverseCumulativeTestValues The inverseCumulativeTestValues to set.\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getTolerance()",
      "begin_line": 360,
      "end_line": 362,
      "comment": "\n     * @return Returns the tolerance.\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setTolerance(double)",
      "begin_line": 367,
      "end_line": 369,
      "comment": "\n     * @param tolerance The tolerance to set.\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 35)"
      ]
    }
  ]
}