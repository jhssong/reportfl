{
  "filepath": "/tmp/Math-106b/src/test/org/apache/commons/math/distribution/ContinuousDistributionAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ContinuousDistributionAbstractTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 54,
      "end_line": 311,
      "comment": "\n * Abstract base class for {@link ContinuousDistribution} tests.\n * \u003cp\u003e\n * To create a concrete test class for a continuous distribution\n * implementation, first implement makeDistribution() to return a distribution\n * instance to use in tests. Then implement each of the test data generation\n * methods below.  In each case, the test points and test values arrays\n * returned represent parallel arrays of inputs and expected values for the\n * distribution returned by makeDistribution().  Default implementations\n * are provided for the makeInverseXxx methods that just invert the mapping\n * defined by the arrays returned by the makeCumulativeXxx methods.\n * \u003cp\u003e\n * makeCumulativeTestPoints() -- arguments used to test cumulative probabilities\n * makeCumulativeTestValues() -- expected cumulative probabilites\n * makeInverseCumulativeTestPoints() -- arguments used to test inverse cdf\n * makeInverseCumulativeTestValues() -- expected inverse cdf values\n * \u003cp\u003e\n * To implement additional test cases with different distribution instances and\n * test data, use the setXxx methods for the instance data in test cases and\n * call the verifyXxx methods to verify results. \n * \u003cp\u003e\n * Error tolerance can be overriden by implementing getTolerance().\n * \u003cp\u003e\n * Test data should be validated against reference tables or other packages\n * where possible, and the source of the reference data and/or validation\n * should be documented in the test cases.  A framework for validating\n * distribution data against R is included in the /src/test/R source tree.\n * \u003cp\u003e\n * See {@link NormalDistributionTest} and {@link ChiSquareDistributionTest}\n * for examples.\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "distribution"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "  Distribution instance used to perform tests "
    },
    {
      "type": "field",
      "varNames": [
        "tolerance"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Tolerance used in comparing expected and returned values "
    },
    {
      "type": "field",
      "varNames": [
        "cumulativeTestPoints"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Arguments used to test cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "cumulativeTestValues"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Values used to test cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "inverseCumulativeTestPoints"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Arguments used to test inverse cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "inverseCumulativeTestValues"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Values used to test inverse cumulative probability density calculations "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.ContinuousDistributionAbstractTest(java.lang.String)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Constructor for ContinuousDistributionAbstractTest.\n     * @param name\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.makeDistribution()",
      "begin_line": 88,
      "end_line": 88,
      "comment": " Creates the default continuous distribution instance to use in tests. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.makeCumulativeTestPoints()",
      "begin_line": 91,
      "end_line": 91,
      "comment": " Creates the default cumulative probability density test input values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.makeCumulativeTestValues()",
      "begin_line": 94,
      "end_line": 94,
      "comment": " Creates the default cumulative probability density test expected values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.makeInverseCumulativeTestPoints()",
      "begin_line": 99,
      "end_line": 101,
      "comment": " Creates the default inverse cumulative probability test input values ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.makeInverseCumulativeTestValues()",
      "begin_line": 104,
      "end_line": 106,
      "comment": " Creates the default inverse cumulative probability density test expected values ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setUp()",
      "begin_line": 113,
      "end_line": 120,
      "comment": "\n     * Setup sets all test instance data to default values \n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 22)",
        "(line 115,col 9)-(line 115,col 42)",
        "(line 116,col 9)-(line 116,col 58)",
        "(line 117,col 9)-(line 117,col 58)",
        "(line 118,col 9)-(line 118,col 72)",
        "(line 119,col 9)-(line 119,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.tearDown()",
      "begin_line": 125,
      "end_line": 132,
      "comment": "\n     * Cleans up test instance data\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 25)",
        "(line 127,col 9)-(line 127,col 28)",
        "(line 128,col 9)-(line 128,col 36)",
        "(line 129,col 9)-(line 129,col 36)",
        "(line 130,col 9)-(line 130,col 43)",
        "(line 131,col 9)-(line 131,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.verifyCumulativeProbabilities()",
      "begin_line": 140,
      "end_line": 147,
      "comment": "\n     * Verifies that cumulative probability density calculations match expected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 146,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.verifyInverseCumulativeProbabilities()",
      "begin_line": 153,
      "end_line": 160,
      "comment": "\n     * Verifies that inverse cumulative probability density calculations match expected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 159,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.testCumulativeProbabilities()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n     * Verifies that cumulative probability density calculations match expected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.testInverseCumulativeProbabilities()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Verifies that inverse cumulative probability density calculations match expected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.testConsistency()",
      "begin_line": 183,
      "end_line": 200,
      "comment": "\n     * Verifies that probability computations are consistent\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 199,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.testIllegalArguments()",
      "begin_line": 205,
      "end_line": 224,
      "comment": "\n     * Verifies that illegal arguments are correctly handled\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 223,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getCumulativeTestPoints()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\n     * @return Returns the cumulativeTestPoints.\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setCumulativeTestPoints(double[])",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\n     * @param cumulativeTestPoints The cumulativeTestPoints to set.\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getCumulativeTestValues()",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n     * @return Returns the cumulativeTestValues.\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setCumulativeTestValues(double[])",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\n     * @param cumulativeTestValues The cumulativeTestValues to set.\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getDistribution()",
      "begin_line": 258,
      "end_line": 260,
      "comment": "\n     * @return Returns the distribution.\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setDistribution(org.apache.commons.math.distribution.ContinuousDistribution)",
      "begin_line": 265,
      "end_line": 267,
      "comment": "\n     * @param distribution The distribution to set.\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getInverseCumulativeTestPoints()",
      "begin_line": 272,
      "end_line": 274,
      "comment": "\n     * @return Returns the inverseCumulativeTestPoints.\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setInverseCumulativeTestPoints(double[])",
      "begin_line": 279,
      "end_line": 281,
      "comment": "\n     * @param inverseCumulativeTestPoints The inverseCumulativeTestPoints to set.\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getInverseCumulativeTestValues()",
      "begin_line": 286,
      "end_line": 288,
      "comment": "\n     * @return Returns the inverseCumulativeTestValues.\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setInverseCumulativeTestValues(double[])",
      "begin_line": 293,
      "end_line": 295,
      "comment": "\n     * @param inverseCumulativeTestValues The inverseCumulativeTestValues to set.\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getTolerance()",
      "begin_line": 300,
      "end_line": 302,
      "comment": "\n     * @return Returns the tolerance.\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setTolerance(double)",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\n     * @param tolerance The tolerance to set.\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 35)"
      ]
    }
  ]
}