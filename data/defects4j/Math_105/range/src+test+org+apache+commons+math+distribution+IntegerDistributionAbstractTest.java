{
  "filepath": "/tmp/Math-105b/src/test/org/apache/commons/math/distribution/IntegerDistributionAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IntegerDistributionAbstractTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 42,
      "end_line": 333,
      "comment": "\n * Abstract base class for {@link IntegerDistribution} tests.\n * \u003cp\u003e\n * To create a concrete test class for an integer distribution implementation,\n *  implement makeDistribution() to return a distribution instance to use in \n *  tests and each of the test data generation methods below.  In each case, the\n *  test points and test values arrays returned represent parallel arrays of \n *  inputs and expected values for the distribution returned by makeDistribution().\n *  \u003cp\u003e\n *  makeDensityTestPoints() -- arguments used to test probability density calculation\n *  makeDensityTestValues() -- expected probability densities\n *  makeCumulativeTestPoints() -- arguments used to test cumulative probabilities\n *  makeCumulativeTestValues() -- expected cumulative probabilites\n *  makeInverseCumulativeTestPoints() -- arguments used to test inverse cdf evaluation\n *  makeInverseCumulativeTestValues() -- expected inverse cdf values\n * \u003cp\u003e\n *  To implement additional test cases with different distribution instances and test data,\n *  use the setXxx methods for the instance data in test cases and call the verifyXxx methods\n *  to verify results. \n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "distribution"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Discrete distribution instance used to perform tests "
    },
    {
      "type": "field",
      "varNames": [
        "tolerance"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Tolerance used in comparing expected and returned values "
    },
    {
      "type": "field",
      "varNames": [
        "densityTestPoints"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Arguments used to test probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "densityTestValues"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Values used to test probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "cumulativeTestPoints"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Arguments used to test cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "cumulativeTestValues"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Values used to test cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "inverseCumulativeTestPoints"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Arguments used to test inverse cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "inverseCumulativeTestValues"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Values used to test inverse cumulative probability density calculations "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.IntegerDistributionAbstractTest(java.lang.String)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Constructor for IntegerDistributionAbstractTest.\n     * @param name\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.makeDistribution()",
      "begin_line": 82,
      "end_line": 82,
      "comment": " Creates the default discrete distribution instance to use in tests. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.makeDensityTestPoints()",
      "begin_line": 85,
      "end_line": 85,
      "comment": " Creates the default probability density test input values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.makeDensityTestValues()",
      "begin_line": 88,
      "end_line": 88,
      "comment": " Creates the default probability density test expected values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.makeCumulativeTestPoints()",
      "begin_line": 91,
      "end_line": 91,
      "comment": " Creates the default cumulative probability density test input values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.makeCumulativeTestValues()",
      "begin_line": 94,
      "end_line": 94,
      "comment": " Creates the default cumulative probability density test expected values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.makeInverseCumulativeTestPoints()",
      "begin_line": 97,
      "end_line": 97,
      "comment": " Creates the default inverse cumulative probability test input values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.makeInverseCumulativeTestValues()",
      "begin_line": 100,
      "end_line": 100,
      "comment": " Creates the default inverse cumulative probability density test expected values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setUp()",
      "begin_line": 107,
      "end_line": 116,
      "comment": "\n     * Setup sets all test instance data to default values \n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 22)",
        "(line 109,col 9)-(line 109,col 42)",
        "(line 110,col 9)-(line 110,col 52)",
        "(line 111,col 9)-(line 111,col 52)",
        "(line 112,col 9)-(line 112,col 58)",
        "(line 113,col 9)-(line 113,col 58)",
        "(line 114,col 9)-(line 114,col 72)",
        "(line 115,col 9)-(line 115,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.tearDown()",
      "begin_line": 121,
      "end_line": 130,
      "comment": "\n     * Cleans up test instance data\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 25)",
        "(line 123,col 9)-(line 123,col 28)",
        "(line 124,col 9)-(line 124,col 33)",
        "(line 125,col 9)-(line 125,col 33)",
        "(line 126,col 9)-(line 126,col 36)",
        "(line 127,col 9)-(line 127,col 36)",
        "(line 128,col 9)-(line 128,col 43)",
        "(line 129,col 9)-(line 129,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.verifyDensities()",
      "begin_line": 138,
      "end_line": 144,
      "comment": "\n     * Verifies that probability density calculations match exptected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 143,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.verifyCumulativeProbabilities()",
      "begin_line": 150,
      "end_line": 156,
      "comment": "\n     * Verifies that cumulative probability density calculations match exptected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 155,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.verifyInverseCumulativeProbabilities()",
      "begin_line": 162,
      "end_line": 168,
      "comment": "\n     * Verifies that inverse cumulative probability density calculations match exptected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 167,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.testDensities()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Verifies that probability density calculations match exptected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.testCumulativeProbabilities()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     * Verifies that cumulative probability density calculations match exptected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.testInverseCumulativeProbabilities()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * Verifies that inverse cumulative probability density calculations match exptected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.testIllegalArguments()",
      "begin_line": 199,
      "end_line": 218,
      "comment": "\n     * Verifies that illegal arguments are correctly handled\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 217,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getCumulativeTestPoints()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     * @return Returns the cumulativeTestPoints.\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setCumulativeTestPoints(int[])",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\n     * @param cumulativeTestPoints The cumulativeTestPoints to set.\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getCumulativeTestValues()",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n     * @return Returns the cumulativeTestValues.\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setCumulativeTestValues(double[])",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\n     * @param cumulativeTestValues The cumulativeTestValues to set.\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getDensityTestPoints()",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\n     * @return Returns the densityTestPoints.\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setDensityTestPoints(int[])",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\n     * @param densityTestPoints The densityTestPoints to set.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getDensityTestValues()",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\n     * @return Returns the densityTestValues.\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setDensityTestValues(double[])",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\n     * @param densityTestValues The densityTestValues to set.\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getDistribution()",
      "begin_line": 280,
      "end_line": 282,
      "comment": "\n     * @return Returns the distribution.\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setDistribution(org.apache.commons.math.distribution.IntegerDistribution)",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\n     * @param distribution The distribution to set.\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getInverseCumulativeTestPoints()",
      "begin_line": 294,
      "end_line": 296,
      "comment": "\n     * @return Returns the inverseCumulativeTestPoints.\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setInverseCumulativeTestPoints(double[])",
      "begin_line": 301,
      "end_line": 303,
      "comment": "\n     * @param inverseCumulativeTestPoints The inverseCumulativeTestPoints to set.\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getInverseCumulativeTestValues()",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n     * @return Returns the inverseCumulativeTestValues.\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setInverseCumulativeTestValues(int[])",
      "begin_line": 315,
      "end_line": 317,
      "comment": "\n     * @param inverseCumulativeTestValues The inverseCumulativeTestValues to set.\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getTolerance()",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\n     * @return Returns the tolerance.\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setTolerance(double)",
      "begin_line": 329,
      "end_line": 331,
      "comment": "\n     * @param tolerance The tolerance to set.\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 35)"
      ]
    }
  ]
}