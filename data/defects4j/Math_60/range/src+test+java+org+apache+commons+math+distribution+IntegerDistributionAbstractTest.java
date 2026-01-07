{
  "filepath": "/tmp/Math-60b/src/test/java/org/apache/commons/math/distribution/IntegerDistributionAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IntegerDistributionAbstractTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 46,
      "end_line": 415,
      "comment": "\n * Abstract base class for {@link IntegerDistribution} tests.\n * \u003cp\u003e\n * To create a concrete test class for an integer distribution implementation,\n *  implement makeDistribution() to return a distribution instance to use in\n *  tests and each of the test data generation methods below.  In each case, the\n *  test points and test values arrays returned represent parallel arrays of\n *  inputs and expected values for the distribution returned by makeDistribution().\n *  \u003cp\u003e\n *  makeDensityTestPoints() -- arguments used to test probability density calculation\n *  makeDensityTestValues() -- expected probability densities\n *  makeCumulativeTestPoints() -- arguments used to test cumulative probabilities\n *  makeCumulativeTestValues() -- expected cumulative probabilites\n *  makeInverseCumulativeTestPoints() -- arguments used to test inverse cdf evaluation\n *  makeInverseCumulativeTestValues() -- expected inverse cdf values\n * \u003cp\u003e\n *  To implement additional test cases with different distribution instances and test data,\n *  use the setXxx methods for the instance data in test cases and call the verifyXxx methods\n *  to verify results.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "distribution"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Discrete distribution instance used to perform tests "
    },
    {
      "type": "field",
      "varNames": [
        "tolerance"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Tolerance used in comparing expected and returned values "
    },
    {
      "type": "field",
      "varNames": [
        "densityTestPoints"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Arguments used to test probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "densityTestValues"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Values used to test probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "cumulativeTestPoints"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Arguments used to test cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "cumulativeTestValues"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Values used to test cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "inverseCumulativeTestPoints"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Arguments used to test inverse cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "inverseCumulativeTestValues"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Values used to test inverse cumulative probability density calculations "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.IntegerDistributionAbstractTest(java.lang.String)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Constructor for IntegerDistributionAbstractTest.\n     * @param name\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.makeDistribution()",
      "begin_line": 86,
      "end_line": 86,
      "comment": " Creates the default discrete distribution instance to use in tests. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.makeDensityTestPoints()",
      "begin_line": 89,
      "end_line": 89,
      "comment": " Creates the default probability density test input values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.makeDensityTestValues()",
      "begin_line": 92,
      "end_line": 92,
      "comment": " Creates the default probability density test expected values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.makeCumulativeTestPoints()",
      "begin_line": 95,
      "end_line": 95,
      "comment": " Creates the default cumulative probability density test input values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.makeCumulativeTestValues()",
      "begin_line": 98,
      "end_line": 98,
      "comment": " Creates the default cumulative probability density test expected values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.makeInverseCumulativeTestPoints()",
      "begin_line": 101,
      "end_line": 101,
      "comment": " Creates the default inverse cumulative probability test input values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.makeInverseCumulativeTestValues()",
      "begin_line": 104,
      "end_line": 104,
      "comment": " Creates the default inverse cumulative probability density test expected values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setUp()",
      "begin_line": 111,
      "end_line": 121,
      "comment": "\n     * Setup sets all test instance data to default values\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 22)",
        "(line 114,col 9)-(line 114,col 42)",
        "(line 115,col 9)-(line 115,col 52)",
        "(line 116,col 9)-(line 116,col 52)",
        "(line 117,col 9)-(line 117,col 58)",
        "(line 118,col 9)-(line 118,col 58)",
        "(line 119,col 9)-(line 119,col 72)",
        "(line 120,col 9)-(line 120,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.tearDown()",
      "begin_line": 126,
      "end_line": 136,
      "comment": "\n     * Cleans up test instance data\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 25)",
        "(line 129,col 9)-(line 129,col 28)",
        "(line 130,col 9)-(line 130,col 33)",
        "(line 131,col 9)-(line 131,col 33)",
        "(line 132,col 9)-(line 132,col 36)",
        "(line 133,col 9)-(line 133,col 36)",
        "(line 134,col 9)-(line 134,col 43)",
        "(line 135,col 9)-(line 135,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.verifyDensities()",
      "begin_line": 144,
      "end_line": 150,
      "comment": "\n     * Verifies that probability density calculations match expected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 149,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.verifyCumulativeProbabilities()",
      "begin_line": 156,
      "end_line": 162,
      "comment": "\n     * Verifies that cumulative probability density calculations match expected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.verifyInverseCumulativeProbabilities()",
      "begin_line": 169,
      "end_line": 175,
      "comment": "\n     * Verifies that inverse cumulative probability density calculations match expected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 174,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.testDensities()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * Verifies that probability density calculations match expected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.testCumulativeProbabilities()",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n     * Verifies that cumulative probability density calculations match expected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.testFloatingPointArguments()",
      "begin_line": 200,
      "end_line": 242,
      "comment": "\n     * Verifies that floating point arguments are correctly handled by\n     * cumulativeProbablility(-,-)\n     * JIRA: MATH-184\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 20)",
        "(line 227,col 9)-(line 227,col 21)",
        "(line 228,col 9)-(line 228,col 20)",
        "(line 229,col 9)-(line 229,col 26)",
        "(line 230,col 9)-(line 230,col 26)",
        "(line 231,col 9)-(line 231,col 26)",
        "(line 232,col 9)-(line 233,col 75)",
        "(line 234,col 9)-(line 236,col 48)",
        "(line 237,col 9)-(line 238,col 75)",
        "(line 239,col 9)-(line 241,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.testInverseCumulativeProbabilities()",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n     * Verifies that inverse cumulative probability density calculations match expected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.testIllegalArguments()",
      "begin_line": 255,
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
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.testSampling()",
      "begin_line": 279,
      "end_line": 300,
      "comment": "\n     * Test sampling\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 54)",
        "(line 281,col 9)-(line 281,col 57)",
        "(line 282,col 9)-(line 282,col 30)",
        "(line 283,col 9)-(line 283,col 85)",
        "(line 284,col 9)-(line 284,col 100)",
        "(line 285,col 9)-(line 285,col 53)",
        "(line 286,col 9)-(line 286,col 49)",
        "(line 287,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 290,col 49)",
        "(line 291,col 9)-(line 291,col 55)",
        "(line 292,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 299,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getCumulativeTestPoints()",
      "begin_line": 306,
      "end_line": 308,
      "comment": "\n     * @return Returns the cumulativeTestPoints.\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setCumulativeTestPoints(int[])",
      "begin_line": 313,
      "end_line": 315,
      "comment": "\n     * @param cumulativeTestPoints The cumulativeTestPoints to set.\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getCumulativeTestValues()",
      "begin_line": 320,
      "end_line": 322,
      "comment": "\n     * @return Returns the cumulativeTestValues.\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setCumulativeTestValues(double[])",
      "begin_line": 327,
      "end_line": 329,
      "comment": "\n     * @param cumulativeTestValues The cumulativeTestValues to set.\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getDensityTestPoints()",
      "begin_line": 334,
      "end_line": 336,
      "comment": "\n     * @return Returns the densityTestPoints.\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setDensityTestPoints(int[])",
      "begin_line": 341,
      "end_line": 343,
      "comment": "\n     * @param densityTestPoints The densityTestPoints to set.\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getDensityTestValues()",
      "begin_line": 348,
      "end_line": 350,
      "comment": "\n     * @return Returns the densityTestValues.\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setDensityTestValues(double[])",
      "begin_line": 355,
      "end_line": 357,
      "comment": "\n     * @param densityTestValues The densityTestValues to set.\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getDistribution()",
      "begin_line": 362,
      "end_line": 364,
      "comment": "\n     * @return Returns the distribution.\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setDistribution(org.apache.commons.math.distribution.IntegerDistribution)",
      "begin_line": 369,
      "end_line": 371,
      "comment": "\n     * @param distribution The distribution to set.\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getInverseCumulativeTestPoints()",
      "begin_line": 376,
      "end_line": 378,
      "comment": "\n     * @return Returns the inverseCumulativeTestPoints.\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setInverseCumulativeTestPoints(double[])",
      "begin_line": 383,
      "end_line": 385,
      "comment": "\n     * @param inverseCumulativeTestPoints The inverseCumulativeTestPoints to set.\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getInverseCumulativeTestValues()",
      "begin_line": 390,
      "end_line": 392,
      "comment": "\n     * @return Returns the inverseCumulativeTestValues.\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setInverseCumulativeTestValues(int[])",
      "begin_line": 397,
      "end_line": 399,
      "comment": "\n     * @param inverseCumulativeTestValues The inverseCumulativeTestValues to set.\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.getTolerance()",
      "begin_line": 404,
      "end_line": 406,
      "comment": "\n     * @return Returns the tolerance.\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistributionAbstractTest.setTolerance(double)",
      "begin_line": 411,
      "end_line": 413,
      "comment": "\n     * @param tolerance The tolerance to set.\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 35)"
      ]
    }
  ]
}