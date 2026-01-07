{
  "filepath": "/tmp/Math-102b/src/test/org/apache/commons/math/distribution/IntegerDistributionAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IntegerDistributionAbstractTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 43,
      "end_line": 334,
      "comment": "\n * Abstract base class for {@link IntegerDistribution} tests.\n * \u003cp\u003e\n * To create a concrete test class for an integer distribution implementation,\n *  implement makeDistribution() to return a distribution instance to use in \n *  tests and each of the test data generation methods below.  In each case, the\n *  test points and test values arrays returned represent parallel arrays of \n *  inputs and expected values for the distribution returned by makeDistribution().\n *  \u003cp\u003e\n *  makeDensityTestPoints() -- arguments used to test probability density calculation\n *  makeDensityTestValues() -- expected probability densities\n *  makeCumulativeTestPoints() -- arguments used to test cumulative probabilities\n *  makeCumulativeTestValues() -- expected cumulative probabilites\n *  makeInverseCumulativeTestPoints() -- arguments used to test inverse cdf evaluation\n *  makeInverseCumulativeTestValues() -- expected inverse cdf values\n * \u003cp\u003e\n *  To implement additional test cases with different distribution instances and test data,\n *  use the setXxx methods for the instance data in test cases and call the verifyXxx methods\n *  to verify results. \n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "distribution"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Discrete distribution instance used to perform tests "
    },
    {
      "type": "field",
      "varNames": [
        "tolerance"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Tolerance used in comparing expected and returned values "
    },
    {
      "type": "field",
      "varNames": [
        "densityTestPoints"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Arguments used to test probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "densityTestValues"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Values used to test probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "cumulativeTestPoints"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Arguments used to test cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "cumulativeTestValues"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Values used to test cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "inverseCumulativeTestPoints"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Arguments used to test inverse cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "inverseCumulativeTestValues"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Values used to test inverse cumulative probability density calculations "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.IntegerDistributionAbstractTest(java.lang.String)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Constructor for IntegerDistributionAbstractTest.\n     * @param name\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.makeDistribution()",
      "begin_line": 83,
      "end_line": 83,
      "comment": " Creates the default discrete distribution instance to use in tests. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.makeDensityTestPoints()",
      "begin_line": 86,
      "end_line": 86,
      "comment": " Creates the default probability density test input values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.makeDensityTestValues()",
      "begin_line": 89,
      "end_line": 89,
      "comment": " Creates the default probability density test expected values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.makeCumulativeTestPoints()",
      "begin_line": 92,
      "end_line": 92,
      "comment": " Creates the default cumulative probability density test input values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.makeCumulativeTestValues()",
      "begin_line": 95,
      "end_line": 95,
      "comment": " Creates the default cumulative probability density test expected values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.makeInverseCumulativeTestPoints()",
      "begin_line": 98,
      "end_line": 98,
      "comment": " Creates the default inverse cumulative probability test input values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.makeInverseCumulativeTestValues()",
      "begin_line": 101,
      "end_line": 101,
      "comment": " Creates the default inverse cumulative probability density test expected values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setUp()",
      "begin_line": 108,
      "end_line": 117,
      "comment": "\n     * Setup sets all test instance data to default values \n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 22)",
        "(line 110,col 9)-(line 110,col 42)",
        "(line 111,col 9)-(line 111,col 52)",
        "(line 112,col 9)-(line 112,col 52)",
        "(line 113,col 9)-(line 113,col 58)",
        "(line 114,col 9)-(line 114,col 58)",
        "(line 115,col 9)-(line 115,col 72)",
        "(line 116,col 9)-(line 116,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.tearDown()",
      "begin_line": 122,
      "end_line": 131,
      "comment": "\n     * Cleans up test instance data\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 25)",
        "(line 124,col 9)-(line 124,col 28)",
        "(line 125,col 9)-(line 125,col 33)",
        "(line 126,col 9)-(line 126,col 33)",
        "(line 127,col 9)-(line 127,col 36)",
        "(line 128,col 9)-(line 128,col 36)",
        "(line 129,col 9)-(line 129,col 43)",
        "(line 130,col 9)-(line 130,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.verifyDensities()",
      "begin_line": 139,
      "end_line": 145,
      "comment": "\n     * Verifies that probability density calculations match exptected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 144,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.verifyCumulativeProbabilities()",
      "begin_line": 151,
      "end_line": 157,
      "comment": "\n     * Verifies that cumulative probability density calculations match exptected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 156,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.verifyInverseCumulativeProbabilities()",
      "begin_line": 163,
      "end_line": 169,
      "comment": "\n     * Verifies that inverse cumulative probability density calculations match exptected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 168,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.testDensities()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * Verifies that probability density calculations match exptected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.testCumulativeProbabilities()",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * Verifies that cumulative probability density calculations match exptected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.testInverseCumulativeProbabilities()",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n     * Verifies that inverse cumulative probability density calculations match exptected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.testIllegalArguments()",
      "begin_line": 200,
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
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getCumulativeTestPoints()",
      "begin_line": 225,
      "end_line": 227,
      "comment": "\n     * @return Returns the cumulativeTestPoints.\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setCumulativeTestPoints(int[])",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\n     * @param cumulativeTestPoints The cumulativeTestPoints to set.\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getCumulativeTestValues()",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\n     * @return Returns the cumulativeTestValues.\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setCumulativeTestValues(double[])",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\n     * @param cumulativeTestValues The cumulativeTestValues to set.\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getDensityTestPoints()",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\n     * @return Returns the densityTestPoints.\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setDensityTestPoints(int[])",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n     * @param densityTestPoints The densityTestPoints to set.\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getDensityTestValues()",
      "begin_line": 267,
      "end_line": 269,
      "comment": "\n     * @return Returns the densityTestValues.\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setDensityTestValues(double[])",
      "begin_line": 274,
      "end_line": 276,
      "comment": "\n     * @param densityTestValues The densityTestValues to set.\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getDistribution()",
      "begin_line": 281,
      "end_line": 283,
      "comment": "\n     * @return Returns the distribution.\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setDistribution(org.apache.commons.math.distribution.IntegerDistribution)",
      "begin_line": 288,
      "end_line": 290,
      "comment": "\n     * @param distribution The distribution to set.\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getInverseCumulativeTestPoints()",
      "begin_line": 295,
      "end_line": 297,
      "comment": "\n     * @return Returns the inverseCumulativeTestPoints.\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setInverseCumulativeTestPoints(double[])",
      "begin_line": 302,
      "end_line": 304,
      "comment": "\n     * @param inverseCumulativeTestPoints The inverseCumulativeTestPoints to set.\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getInverseCumulativeTestValues()",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\n     * @return Returns the inverseCumulativeTestValues.\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setInverseCumulativeTestValues(int[])",
      "begin_line": 316,
      "end_line": 318,
      "comment": "\n     * @param inverseCumulativeTestValues The inverseCumulativeTestValues to set.\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getTolerance()",
      "begin_line": 323,
      "end_line": 325,
      "comment": "\n     * @return Returns the tolerance.\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setTolerance(double)",
      "begin_line": 330,
      "end_line": 332,
      "comment": "\n     * @param tolerance The tolerance to set.\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 35)"
      ]
    }
  ]
}