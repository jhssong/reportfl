{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/distribution/IntegerDistributionAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IntegerDistributionAbstractTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 43,
      "end_line": 386,
      "comment": "\n * Abstract base class for {@link IntegerDistribution} tests.\n * \u003cp\u003e\n * To create a concrete test class for an integer distribution implementation,\n *  implement makeDistribution() to return a distribution instance to use in\n *  tests and each of the test data generation methods below.  In each case, the\n *  test points and test values arrays returned represent parallel arrays of\n *  inputs and expected values for the distribution returned by makeDistribution().\n *  \u003cp\u003e\n *  makeDensityTestPoints() -- arguments used to test probability density calculation\n *  makeDensityTestValues() -- expected probability densities\n *  makeCumulativeTestPoints() -- arguments used to test cumulative probabilities\n *  makeCumulativeTestValues() -- expected cumulative probabilites\n *  makeInverseCumulativeTestPoints() -- arguments used to test inverse cdf evaluation\n *  makeInverseCumulativeTestValues() -- expected inverse cdf values\n * \u003cp\u003e\n *  To implement additional test cases with different distribution instances and test data,\n *  use the setXxx methods for the instance data in test cases and call the verifyXxx methods\n *  to verify results.\n *\n * @version $Revision$ $Date$\n "
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
      "end_line": 118,
      "comment": "\n     * Setup sets all test instance data to default values\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 22)",
        "(line 111,col 9)-(line 111,col 42)",
        "(line 112,col 9)-(line 112,col 52)",
        "(line 113,col 9)-(line 113,col 52)",
        "(line 114,col 9)-(line 114,col 58)",
        "(line 115,col 9)-(line 115,col 58)",
        "(line 116,col 9)-(line 116,col 72)",
        "(line 117,col 9)-(line 117,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.tearDown()",
      "begin_line": 123,
      "end_line": 133,
      "comment": "\n     * Cleans up test instance data\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 25)",
        "(line 126,col 9)-(line 126,col 28)",
        "(line 127,col 9)-(line 127,col 33)",
        "(line 128,col 9)-(line 128,col 33)",
        "(line 129,col 9)-(line 129,col 36)",
        "(line 130,col 9)-(line 130,col 36)",
        "(line 131,col 9)-(line 131,col 43)",
        "(line 132,col 9)-(line 132,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.verifyDensities()",
      "begin_line": 141,
      "end_line": 147,
      "comment": "\n     * Verifies that probability density calculations match expected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 146,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.verifyCumulativeProbabilities()",
      "begin_line": 153,
      "end_line": 159,
      "comment": "\n     * Verifies that cumulative probability density calculations match expected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 158,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.verifyInverseCumulativeProbabilities()",
      "begin_line": 166,
      "end_line": 172,
      "comment": "\n     * Verifies that inverse cumulative probability density calculations match expected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 171,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.testDensities()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * Verifies that probability density calculations match expected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.testCumulativeProbabilities()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * Verifies that cumulative probability density calculations match expected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.testFloatingPointArguments()",
      "begin_line": 197,
      "end_line": 239,
      "comment": "\n     * Verifies that floating point arguments are correctly handled by\n     * cumulativeProbablility(-,-)\n     * JIRA: MATH-184\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 20)",
        "(line 224,col 9)-(line 224,col 21)",
        "(line 225,col 9)-(line 225,col 20)",
        "(line 226,col 9)-(line 226,col 26)",
        "(line 227,col 9)-(line 227,col 26)",
        "(line 228,col 9)-(line 228,col 26)",
        "(line 229,col 9)-(line 230,col 75)",
        "(line 231,col 9)-(line 233,col 48)",
        "(line 234,col 9)-(line 235,col 75)",
        "(line 236,col 9)-(line 238,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.testInverseCumulativeProbabilities()",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\n     * Verifies that inverse cumulative probability density calculations match expected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.testIllegalArguments()",
      "begin_line": 252,
      "end_line": 271,
      "comment": "\n     * Verifies that illegal arguments are correctly handled\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 270,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getCumulativeTestPoints()",
      "begin_line": 277,
      "end_line": 279,
      "comment": "\n     * @return Returns the cumulativeTestPoints.\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setCumulativeTestPoints(int[])",
      "begin_line": 284,
      "end_line": 286,
      "comment": "\n     * @param cumulativeTestPoints The cumulativeTestPoints to set.\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getCumulativeTestValues()",
      "begin_line": 291,
      "end_line": 293,
      "comment": "\n     * @return Returns the cumulativeTestValues.\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setCumulativeTestValues(double[])",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n     * @param cumulativeTestValues The cumulativeTestValues to set.\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getDensityTestPoints()",
      "begin_line": 305,
      "end_line": 307,
      "comment": "\n     * @return Returns the densityTestPoints.\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setDensityTestPoints(int[])",
      "begin_line": 312,
      "end_line": 314,
      "comment": "\n     * @param densityTestPoints The densityTestPoints to set.\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getDensityTestValues()",
      "begin_line": 319,
      "end_line": 321,
      "comment": "\n     * @return Returns the densityTestValues.\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setDensityTestValues(double[])",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\n     * @param densityTestValues The densityTestValues to set.\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getDistribution()",
      "begin_line": 333,
      "end_line": 335,
      "comment": "\n     * @return Returns the distribution.\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setDistribution(org.apache.commons.math.distribution.IntegerDistribution)",
      "begin_line": 340,
      "end_line": 342,
      "comment": "\n     * @param distribution The distribution to set.\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getInverseCumulativeTestPoints()",
      "begin_line": 347,
      "end_line": 349,
      "comment": "\n     * @return Returns the inverseCumulativeTestPoints.\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setInverseCumulativeTestPoints(double[])",
      "begin_line": 354,
      "end_line": 356,
      "comment": "\n     * @param inverseCumulativeTestPoints The inverseCumulativeTestPoints to set.\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getInverseCumulativeTestValues()",
      "begin_line": 361,
      "end_line": 363,
      "comment": "\n     * @return Returns the inverseCumulativeTestValues.\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setInverseCumulativeTestValues(int[])",
      "begin_line": 368,
      "end_line": 370,
      "comment": "\n     * @param inverseCumulativeTestValues The inverseCumulativeTestValues to set.\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getTolerance()",
      "begin_line": 375,
      "end_line": 377,
      "comment": "\n     * @return Returns the tolerance.\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setTolerance(double)",
      "begin_line": 382,
      "end_line": 384,
      "comment": "\n     * @param tolerance The tolerance to set.\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 35)"
      ]
    }
  ]
}