{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/distribution/IntegerDistributionAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IntegerDistributionAbstractTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 379,
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
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.makeDistribution()",
      "begin_line": 78,
      "end_line": 78,
      "comment": " Creates the default discrete distribution instance to use in tests. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.makeDensityTestPoints()",
      "begin_line": 81,
      "end_line": 81,
      "comment": " Creates the default probability density test input values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.makeDensityTestValues()",
      "begin_line": 84,
      "end_line": 84,
      "comment": " Creates the default probability density test expected values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.makeCumulativeTestPoints()",
      "begin_line": 87,
      "end_line": 87,
      "comment": " Creates the default cumulative probability density test input values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.makeCumulativeTestValues()",
      "begin_line": 90,
      "end_line": 90,
      "comment": " Creates the default cumulative probability density test expected values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.makeInverseCumulativeTestPoints()",
      "begin_line": 93,
      "end_line": 93,
      "comment": " Creates the default inverse cumulative probability test input values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.makeInverseCumulativeTestValues()",
      "begin_line": 96,
      "end_line": 96,
      "comment": " Creates the default inverse cumulative probability density test expected values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.setUp()",
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
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.tearDown()",
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
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.verifyDensities()",
      "begin_line": 134,
      "end_line": 140,
      "comment": "\n     * Verifies that probability density calculations match expected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 139,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.verifyCumulativeProbabilities()",
      "begin_line": 146,
      "end_line": 152,
      "comment": "\n     * Verifies that cumulative probability density calculations match expected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 151,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.verifyInverseCumulativeProbabilities()",
      "begin_line": 159,
      "end_line": 165,
      "comment": "\n     * Verifies that inverse cumulative probability density calculations match expected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 164,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.testDensities()",
      "begin_line": 173,
      "end_line": 176,
      "comment": "\n     * Verifies that probability density calculations match expected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.testCumulativeProbabilities()",
      "begin_line": 182,
      "end_line": 185,
      "comment": "\n     * Verifies that cumulative probability density calculations match expected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.testInverseCumulativeProbabilities()",
      "begin_line": 191,
      "end_line": 194,
      "comment": "\n     * Verifies that inverse cumulative probability density calculations match expected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.testConsistencyAtSupportBounds()",
      "begin_line": 196,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 62)",
        "(line 199,col 9)-(line 200,col 73)",
        "(line 201,col 9)-(line 202,col 103)",
        "(line 203,col 9)-(line 204,col 71)",
        "(line 206,col 9)-(line 206,col 62)",
        "(line 207,col 9)-(line 209,col 73)",
        "(line 210,col 9)-(line 211,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.testIllegalArguments()",
      "begin_line": 217,
      "end_line": 237,
      "comment": "\n     * Verifies that illegal arguments are correctly handled\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 236,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.testSampling()",
      "begin_line": 242,
      "end_line": 264,
      "comment": "\n     * Test sampling\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 54)",
        "(line 245,col 9)-(line 245,col 57)",
        "(line 246,col 9)-(line 246,col 30)",
        "(line 247,col 9)-(line 247,col 85)",
        "(line 248,col 9)-(line 248,col 100)",
        "(line 249,col 9)-(line 249,col 53)",
        "(line 250,col 9)-(line 250,col 49)",
        "(line 251,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 49)",
        "(line 255,col 9)-(line 255,col 55)",
        "(line 256,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.getCumulativeTestPoints()",
      "begin_line": 270,
      "end_line": 272,
      "comment": "\n     * @return Returns the cumulativeTestPoints.\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.setCumulativeTestPoints(int[])",
      "begin_line": 277,
      "end_line": 279,
      "comment": "\n     * @param cumulativeTestPoints The cumulativeTestPoints to set.\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.getCumulativeTestValues()",
      "begin_line": 284,
      "end_line": 286,
      "comment": "\n     * @return Returns the cumulativeTestValues.\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.setCumulativeTestValues(double[])",
      "begin_line": 291,
      "end_line": 293,
      "comment": "\n     * @param cumulativeTestValues The cumulativeTestValues to set.\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.getDensityTestPoints()",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n     * @return Returns the densityTestPoints.\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.setDensityTestPoints(int[])",
      "begin_line": 305,
      "end_line": 307,
      "comment": "\n     * @param densityTestPoints The densityTestPoints to set.\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.getDensityTestValues()",
      "begin_line": 312,
      "end_line": 314,
      "comment": "\n     * @return Returns the densityTestValues.\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.setDensityTestValues(double[])",
      "begin_line": 319,
      "end_line": 321,
      "comment": "\n     * @param densityTestValues The densityTestValues to set.\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.getDistribution()",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\n     * @return Returns the distribution.\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.setDistribution(org.apache.commons.math3.distribution.IntegerDistribution)",
      "begin_line": 333,
      "end_line": 335,
      "comment": "\n     * @param distribution The distribution to set.\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.getInverseCumulativeTestPoints()",
      "begin_line": 340,
      "end_line": 342,
      "comment": "\n     * @return Returns the inverseCumulativeTestPoints.\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.setInverseCumulativeTestPoints(double[])",
      "begin_line": 347,
      "end_line": 349,
      "comment": "\n     * @param inverseCumulativeTestPoints The inverseCumulativeTestPoints to set.\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.getInverseCumulativeTestValues()",
      "begin_line": 354,
      "end_line": 356,
      "comment": "\n     * @return Returns the inverseCumulativeTestValues.\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.setInverseCumulativeTestValues(int[])",
      "begin_line": 361,
      "end_line": 363,
      "comment": "\n     * @param inverseCumulativeTestValues The inverseCumulativeTestValues to set.\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.getTolerance()",
      "begin_line": 368,
      "end_line": 370,
      "comment": "\n     * @return Returns the tolerance.\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistributionAbstractTest.setTolerance(double)",
      "begin_line": 375,
      "end_line": 377,
      "comment": "\n     * @param tolerance The tolerance to set.\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 35)"
      ]
    }
  ]
}