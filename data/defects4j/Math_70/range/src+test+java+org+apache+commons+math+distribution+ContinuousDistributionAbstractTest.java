{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/distribution/ContinuousDistributionAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ContinuousDistributionAbstractTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 57,
      "end_line": 353,
      "comment": "\n * Abstract base class for {@link ContinuousDistribution} tests.\n * \u003cp\u003e\n * To create a concrete test class for a continuous distribution\n * implementation, first implement makeDistribution() to return a distribution\n * instance to use in tests. Then implement each of the test data generation\n * methods below.  In each case, the test points and test values arrays\n * returned represent parallel arrays of inputs and expected values for the\n * distribution returned by makeDistribution().  Default implementations\n * are provided for the makeInverseXxx methods that just invert the mapping\n * defined by the arrays returned by the makeCumulativeXxx methods.\n * \u003cp\u003e\n * makeCumulativeTestPoints() -- arguments used to test cumulative probabilities\n * makeCumulativeTestValues() -- expected cumulative probabilites\n * makeDensityTestValues() -- expected density values at cumulativeTestPoints\n * makeInverseCumulativeTestPoints() -- arguments used to test inverse cdf\n * makeInverseCumulativeTestValues() -- expected inverse cdf values\n * \u003cp\u003e\n * To implement additional test cases with different distribution instances and\n * test data, use the setXxx methods for the instance data in test cases and\n * call the verifyXxx methods to verify results.\n * \u003cp\u003e\n * Error tolerance can be overriden by implementing getTolerance().\n * \u003cp\u003e\n * Test data should be validated against reference tables or other packages\n * where possible, and the source of the reference data and/or validation\n * should be documented in the test cases.  A framework for validating\n * distribution data against R is included in the /src/test/R source tree.\n * \u003cp\u003e\n * See {@link NormalDistributionTest} and {@link ChiSquareDistributionTest}\n * for examples.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "distribution"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "  Distribution instance used to perform tests "
    },
    {
      "type": "field",
      "varNames": [
        "tolerance"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Tolerance used in comparing expected and returned values "
    },
    {
      "type": "field",
      "varNames": [
        "cumulativeTestPoints"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Arguments used to test cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "cumulativeTestValues"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Values used to test cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "inverseCumulativeTestPoints"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Arguments used to test inverse cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "inverseCumulativeTestValues"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Values used to test inverse cumulative probability density calculations "
    },
    {
      "type": "field",
      "varNames": [
        "densityTestValues"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Values used to test density calculations "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.ContinuousDistributionAbstractTest(java.lang.String)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Constructor for ContinuousDistributionAbstractTest.\n     * @param name\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.makeDistribution()",
      "begin_line": 94,
      "end_line": 94,
      "comment": " Creates the default continuous distribution instance to use in tests. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.makeCumulativeTestPoints()",
      "begin_line": 97,
      "end_line": 97,
      "comment": " Creates the default cumulative probability test input values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.makeCumulativeTestValues()",
      "begin_line": 100,
      "end_line": 100,
      "comment": " Creates the default cumulative probability test expected values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.makeDensityTestValues()",
      "begin_line": 103,
      "end_line": 103,
      "comment": " Creates the default density test expected values ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.makeInverseCumulativeTestPoints()",
      "begin_line": 108,
      "end_line": 110,
      "comment": " Creates the default inverse cumulative probability test input values ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.makeInverseCumulativeTestValues()",
      "begin_line": 113,
      "end_line": 115,
      "comment": " Creates the default inverse cumulative probability density test expected values ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setUp()",
      "begin_line": 122,
      "end_line": 131,
      "comment": "\n     * Setup sets all test instance data to default values\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 22)",
        "(line 125,col 9)-(line 125,col 42)",
        "(line 126,col 9)-(line 126,col 58)",
        "(line 127,col 9)-(line 127,col 58)",
        "(line 128,col 9)-(line 128,col 72)",
        "(line 129,col 9)-(line 129,col 72)",
        "(line 130,col 9)-(line 130,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.tearDown()",
      "begin_line": 136,
      "end_line": 145,
      "comment": "\n     * Cleans up test instance data\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 25)",
        "(line 139,col 9)-(line 139,col 28)",
        "(line 140,col 9)-(line 140,col 36)",
        "(line 141,col 9)-(line 141,col 36)",
        "(line 142,col 9)-(line 142,col 43)",
        "(line 143,col 9)-(line 143,col 43)",
        "(line 144,col 9)-(line 144,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.verifyCumulativeProbabilities()",
      "begin_line": 153,
      "end_line": 160,
      "comment": "\n     * Verifies that cumulative probability density calculations match expected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 159,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.verifyInverseCumulativeProbabilities()",
      "begin_line": 166,
      "end_line": 173,
      "comment": "\n     * Verifies that inverse cumulative probability density calculations match expected values\n     * using current test instance data\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 172,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.verifyDensities()",
      "begin_line": 178,
      "end_line": 186,
      "comment": "\n     * Verifies that density calculations match expected values\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 185,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.testCumulativeProbabilities()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * Verifies that cumulative probability density calculations match expected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.testInverseCumulativeProbabilities()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n     * Verifies that inverse cumulative probability density calculations match expected values\n     * using default test instance data\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.testDensities()",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\n     * Verifies that density calculations return expected values\n     * for default test instance data\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.testConsistency()",
      "begin_line": 217,
      "end_line": 234,
      "comment": "\n     * Verifies that probability computations are consistent\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 233,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.testIllegalArguments()",
      "begin_line": 239,
      "end_line": 258,
      "comment": "\n     * Verifies that illegal arguments are correctly handled\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 257,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getCumulativeTestPoints()",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\n     * @return Returns the cumulativeTestPoints.\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setCumulativeTestPoints(double[])",
      "begin_line": 271,
      "end_line": 273,
      "comment": "\n     * @param cumulativeTestPoints The cumulativeTestPoints to set.\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getCumulativeTestValues()",
      "begin_line": 278,
      "end_line": 280,
      "comment": "\n     * @return Returns the cumulativeTestValues.\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setCumulativeTestValues(double[])",
      "begin_line": 285,
      "end_line": 287,
      "comment": "\n     * @param cumulativeTestValues The cumulativeTestValues to set.\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getDensityTestValues()",
      "begin_line": 289,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setDensityTestValues(double[])",
      "begin_line": 293,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getDistribution()",
      "begin_line": 300,
      "end_line": 302,
      "comment": "\n     * @return Returns the distribution.\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setDistribution(org.apache.commons.math.distribution.AbstractContinuousDistribution)",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\n     * @param distribution The distribution to set.\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getInverseCumulativeTestPoints()",
      "begin_line": 314,
      "end_line": 316,
      "comment": "\n     * @return Returns the inverseCumulativeTestPoints.\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setInverseCumulativeTestPoints(double[])",
      "begin_line": 321,
      "end_line": 323,
      "comment": "\n     * @param inverseCumulativeTestPoints The inverseCumulativeTestPoints to set.\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getInverseCumulativeTestValues()",
      "begin_line": 328,
      "end_line": 330,
      "comment": "\n     * @return Returns the inverseCumulativeTestValues.\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setInverseCumulativeTestValues(double[])",
      "begin_line": 335,
      "end_line": 337,
      "comment": "\n     * @param inverseCumulativeTestValues The inverseCumulativeTestValues to set.\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.getTolerance()",
      "begin_line": 342,
      "end_line": 344,
      "comment": "\n     * @return Returns the tolerance.\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistributionAbstractTest.setTolerance(double)",
      "begin_line": 349,
      "end_line": 351,
      "comment": "\n     * @param tolerance The tolerance to set.\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 35)"
      ]
    }
  ]
}