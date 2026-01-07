{
  "filepath": "/tmp/Math-91b/src/test/org/apache/commons/math/distribution/ContinuousDistributionAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ContinuousDistributionAbstractTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 56,
      "end_line": 313,
      "comment": "\n * Abstract base class for {@link ContinuousDistribution} tests.\n * \u003cp\u003e\n * To create a concrete test class for a continuous distribution\n * implementation, first implement makeDistribution() to return a distribution\n * instance to use in tests. Then implement each of the test data generation\n * methods below.  In each case, the test points and test values arrays\n * returned represent parallel arrays of inputs and expected values for the\n * distribution returned by makeDistribution().  Default implementations\n * are provided for the makeInverseXxx methods that just invert the mapping\n * defined by the arrays returned by the makeCumulativeXxx methods.\n * \u003cp\u003e\n * makeCumulativeTestPoints() -- arguments used to test cumulative probabilities\n * makeCumulativeTestValues() -- expected cumulative probabilites\n * makeInverseCumulativeTestPoints() -- arguments used to test inverse cdf\n * makeInverseCumulativeTestValues() -- expected inverse cdf values\n * \u003cp\u003e\n * To implement additional test cases with different distribution instances and\n * test data, use the setXxx methods for the instance data in test cases and\n * call the verifyXxx methods to verify results. \n * \u003cp\u003e\n * Error tolerance can be overriden by implementing getTolerance().\n * \u003cp\u003e\n * Test data should be validated against reference tables or other packages\n * where possible, and the source of the reference data and/or validation\n * should be documented in the test cases.  A framework for validating\n * distribution data against R is included in the /src/test/R source tree.\n * \u003cp\u003e\n * See {@link NormalDistributionTest} and {@link ChiSquareDistributionTest}\n * for examples.\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "distribution"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "  Distribution instance used to perform tests "
    },
    {
      "type": "field",
      "varNames": [
        "tolerance"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Tolerance used in comparing expected and returned values "
    },
    {
      "type": "field",
      "varNames": [
        "cumulativeTestPoints"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Arguments used to test cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "cumulativeTestValues"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Values used to test cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "inverseCumulativeTestPoints"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Arguments used to test inverse cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "inverseCumulativeTestValues"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Values used to test inverse cumulative probability density calculations "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.ContinuousDistributionAbstractTest(java.lang.String)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Constructor for ContinuousDistributionAbstractTest.\n     * @param name\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.makeDistribution()",
      "begin_line": 90,
      "end_line": 90,
      "comment": " Creates the default continuous distribution instance to use in tests. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.makeCumulativeTestPoints()",
      "begin_line": 93,
      "end_line": 93,
      "comment": " Creates the default cumulative probability density test input values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.makeCumulativeTestValues()",
      "begin_line": 96,
      "end_line": 96,
      "comment": " Creates the default cumulative probability density test expected values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.makeInverseCumulativeTestPoints()",
      "begin_line": 101,
      "end_line": 103,
      "comment": " Creates the default inverse cumulative probability test input values ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.makeInverseCumulativeTestValues()",
      "begin_line": 106,
      "end_line": 108,
      "comment": " Creates the default inverse cumulative probability density test expected values ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setUp()",
      "begin_line": 115,
      "end_line": 122,
      "comment": "\n     * Setup sets all test instance data to default values \n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 22)",
        "(line 117,col 9)-(line 117,col 42)",
        "(line 118,col 9)-(line 118,col 58)",
        "(line 119,col 9)-(line 119,col 58)",
        "(line 120,col 9)-(line 120,col 72)",
        "(line 121,col 9)-(line 121,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.tearDown()",
      "begin_line": 127,
      "end_line": 134,
      "comment": "\n     * Cleans up test instance data\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 25)",
        "(line 129,col 9)-(line 129,col 28)",
        "(line 130,col 9)-(line 130,col 36)",
        "(line 131,col 9)-(line 131,col 36)",
        "(line 132,col 9)-(line 132,col 43)",
        "(line 133,col 9)-(line 133,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.verifyCumulativeProbabilities()",
      "begin_line": 142,
      "end_line": 149,
      "comment": "\n     * Verifies that cumulative probability density calculations match expected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 148,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.verifyInverseCumulativeProbabilities()",
      "begin_line": 155,
      "end_line": 162,
      "comment": "\n     * Verifies that inverse cumulative probability density calculations match expected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.testCumulativeProbabilities()",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * Verifies that cumulative probability density calculations match expected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.testInverseCumulativeProbabilities()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * Verifies that inverse cumulative probability density calculations match expected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.testConsistency()",
      "begin_line": 185,
      "end_line": 202,
      "comment": "\n     * Verifies that probability computations are consistent\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 201,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.testIllegalArguments()",
      "begin_line": 207,
      "end_line": 226,
      "comment": "\n     * Verifies that illegal arguments are correctly handled\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 225,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getCumulativeTestPoints()",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\n     * @return Returns the cumulativeTestPoints.\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setCumulativeTestPoints(double[])",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\n     * @param cumulativeTestPoints The cumulativeTestPoints to set.\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getCumulativeTestValues()",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\n     * @return Returns the cumulativeTestValues.\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setCumulativeTestValues(double[])",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\n     * @param cumulativeTestValues The cumulativeTestValues to set.\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getDistribution()",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n     * @return Returns the distribution.\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setDistribution(org.apache.commons.math.distribution.ContinuousDistribution)",
      "begin_line": 267,
      "end_line": 269,
      "comment": "\n     * @param distribution The distribution to set.\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getInverseCumulativeTestPoints()",
      "begin_line": 274,
      "end_line": 276,
      "comment": "\n     * @return Returns the inverseCumulativeTestPoints.\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setInverseCumulativeTestPoints(double[])",
      "begin_line": 281,
      "end_line": 283,
      "comment": "\n     * @param inverseCumulativeTestPoints The inverseCumulativeTestPoints to set.\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getInverseCumulativeTestValues()",
      "begin_line": 288,
      "end_line": 290,
      "comment": "\n     * @return Returns the inverseCumulativeTestValues.\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setInverseCumulativeTestValues(double[])",
      "begin_line": 295,
      "end_line": 297,
      "comment": "\n     * @param inverseCumulativeTestValues The inverseCumulativeTestValues to set.\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getTolerance()",
      "begin_line": 302,
      "end_line": 304,
      "comment": "\n     * @return Returns the tolerance.\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setTolerance(double)",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\n     * @param tolerance The tolerance to set.\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 35)"
      ]
    }
  ]
}