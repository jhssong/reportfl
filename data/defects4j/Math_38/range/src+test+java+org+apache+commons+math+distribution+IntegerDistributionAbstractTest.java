{
  "filepath": "/tmp/Math-38b/src/test/java/org/apache/commons/math/distribution/IntegerDistributionAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IntegerDistributionAbstractTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 361,
      "comment": "\n * Abstract base class for {@link IntegerDistribution} tests.\n * \u003cp\u003e\n * To create a concrete test class for an integer distribution implementation,\n *  implement makeDistribution() to return a distribution instance to use in\n *  tests and each of the test data generation methods below.  In each case, the\n *  test points and test values arrays returned represent parallel arrays of\n *  inputs and expected values for the distribution returned by makeDistribution().\n *  \u003cp\u003e\n *  makeDensityTestPoints() -- arguments used to test probability density calculation\n *  makeDensityTestValues() -- expected probability densities\n *  makeCumulativeTestPoints() -- arguments used to test cumulative probabilities\n *  makeCumulativeTestValues() -- expected cumulative probabilites\n *  makeInverseCumulativeTestPoints() -- arguments used to test inverse cdf evaluation\n *  makeInverseCumulativeTestValues() -- expected inverse cdf values\n * \u003cp\u003e\n *  To implement additional test cases with different distribution instances and test data,\n *  use the setXxx methods for the instance data in test cases and call the verifyXxx methods\n *  to verify results.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "distribution"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Discrete distribution instance used to perform tests "
    },
    {
      "type": "field",
      "varNames": [
        "tolerance"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Tolerance used in comparing expected and returned values "
    },
    {
      "type": "field",
      "varNames": [
        "densityTestPoints"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Arguments used to test probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "densityTestValues"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Values used to test probability density calculations "
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
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.makeDistribution()",
      "begin_line": 78,
      "end_line": 78,
      "comment": " Creates the default discrete distribution instance to use in tests. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.makeDensityTestPoints()",
      "begin_line": 81,
      "end_line": 81,
      "comment": " Creates the default probability density test input values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.makeDensityTestValues()",
      "begin_line": 84,
      "end_line": 84,
      "comment": " Creates the default probability density test expected values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.makeCumulativeTestPoints()",
      "begin_line": 87,
      "end_line": 87,
      "comment": " Creates the default cumulative probability density test input values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.makeCumulativeTestValues()",
      "begin_line": 90,
      "end_line": 90,
      "comment": " Creates the default cumulative probability density test expected values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.makeInverseCumulativeTestPoints()",
      "begin_line": 93,
      "end_line": 93,
      "comment": " Creates the default inverse cumulative probability test input values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.makeInverseCumulativeTestValues()",
      "begin_line": 96,
      "end_line": 96,
      "comment": " Creates the default inverse cumulative probability density test expected values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setUp()",
      "begin_line": 103,
      "end_line": 112,
      "comment": "\n     * Setup sets all test instance data to default values\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 42)",
        "(line 106,col 9)-(line 106,col 52)",
        "(line 107,col 9)-(line 107,col 52)",
        "(line 108,col 9)-(line 108,col 58)",
        "(line 109,col 9)-(line 109,col 58)",
        "(line 110,col 9)-(line 110,col 72)",
        "(line 111,col 9)-(line 111,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.tearDown()",
      "begin_line": 117,
      "end_line": 126,
      "comment": "\n     * Cleans up test instance data\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 28)",
        "(line 120,col 9)-(line 120,col 33)",
        "(line 121,col 9)-(line 121,col 33)",
        "(line 122,col 9)-(line 122,col 36)",
        "(line 123,col 9)-(line 123,col 36)",
        "(line 124,col 9)-(line 124,col 43)",
        "(line 125,col 9)-(line 125,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.verifyDensities()",
      "begin_line": 134,
      "end_line": 140,
      "comment": "\n     * Verifies that probability density calculations match expected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 139,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.verifyCumulativeProbabilities()",
      "begin_line": 146,
      "end_line": 152,
      "comment": "\n     * Verifies that cumulative probability density calculations match expected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 151,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.verifyInverseCumulativeProbabilities()",
      "begin_line": 159,
      "end_line": 165,
      "comment": "\n     * Verifies that inverse cumulative probability density calculations match expected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 164,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.testDensities()",
      "begin_line": 173,
      "end_line": 176,
      "comment": "\n     * Verifies that probability density calculations match expected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.testCumulativeProbabilities()",
      "begin_line": 182,
      "end_line": 185,
      "comment": "\n     * Verifies that cumulative probability density calculations match expected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.testInverseCumulativeProbabilities()",
      "begin_line": 191,
      "end_line": 194,
      "comment": "\n     * Verifies that inverse cumulative probability density calculations match expected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.testIllegalArguments()",
      "begin_line": 199,
      "end_line": 219,
      "comment": "\n     * Verifies that illegal arguments are correctly handled\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 218,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.testSampling()",
      "begin_line": 224,
      "end_line": 246,
      "comment": "\n     * Test sampling\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 54)",
        "(line 227,col 9)-(line 227,col 57)",
        "(line 228,col 9)-(line 228,col 30)",
        "(line 229,col 9)-(line 229,col 85)",
        "(line 230,col 9)-(line 230,col 100)",
        "(line 231,col 9)-(line 231,col 53)",
        "(line 232,col 9)-(line 232,col 49)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 49)",
        "(line 237,col 9)-(line 237,col 55)",
        "(line 238,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getCumulativeTestPoints()",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\n     * @return Returns the cumulativeTestPoints.\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setCumulativeTestPoints(int[])",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\n     * @param cumulativeTestPoints The cumulativeTestPoints to set.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getCumulativeTestValues()",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\n     * @return Returns the cumulativeTestValues.\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setCumulativeTestValues(double[])",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\n     * @param cumulativeTestValues The cumulativeTestValues to set.\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getDensityTestPoints()",
      "begin_line": 280,
      "end_line": 282,
      "comment": "\n     * @return Returns the densityTestPoints.\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setDensityTestPoints(int[])",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\n     * @param densityTestPoints The densityTestPoints to set.\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getDensityTestValues()",
      "begin_line": 294,
      "end_line": 296,
      "comment": "\n     * @return Returns the densityTestValues.\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setDensityTestValues(double[])",
      "begin_line": 301,
      "end_line": 303,
      "comment": "\n     * @param densityTestValues The densityTestValues to set.\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getDistribution()",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n     * @return Returns the distribution.\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setDistribution(org.apache.commons.math.distribution.IntegerDistribution)",
      "begin_line": 315,
      "end_line": 317,
      "comment": "\n     * @param distribution The distribution to set.\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getInverseCumulativeTestPoints()",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\n     * @return Returns the inverseCumulativeTestPoints.\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setInverseCumulativeTestPoints(double[])",
      "begin_line": 329,
      "end_line": 331,
      "comment": "\n     * @param inverseCumulativeTestPoints The inverseCumulativeTestPoints to set.\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getInverseCumulativeTestValues()",
      "begin_line": 336,
      "end_line": 338,
      "comment": "\n     * @return Returns the inverseCumulativeTestValues.\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setInverseCumulativeTestValues(int[])",
      "begin_line": 343,
      "end_line": 345,
      "comment": "\n     * @param inverseCumulativeTestValues The inverseCumulativeTestValues to set.\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getTolerance()",
      "begin_line": 350,
      "end_line": 352,
      "comment": "\n     * @return Returns the tolerance.\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setTolerance(double)",
      "begin_line": 357,
      "end_line": 359,
      "comment": "\n     * @param tolerance The tolerance to set.\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 35)"
      ]
    }
  ]
}