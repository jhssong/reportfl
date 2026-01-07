{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/distribution/UniformRealDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UniformRealDistributionTest",
      "is_interface": false,
      "parent_types": [
        "RealDistributionAbstractTest"
      ],
      "begin_line": 28,
      "end_line": 124,
      "comment": "\n * Test cases for UniformRealDistribution. See class javadoc for\n * {@link RealDistributionAbstractTest} for further details.\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistributionTest.setUp()",
      "begin_line": 32,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 22)",
        "(line 35,col 9)-(line 35,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistributionTest.makeDistribution()",
      "begin_line": 41,
      "end_line": 44,
      "comment": " Creates the default uniform real distribution instance to use in tests. ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistributionTest.makeCumulativeTestPoints()",
      "begin_line": 47,
      "end_line": 51,
      "comment": " Creates the default cumulative probability distribution test input values ",
      "child_ranges": [
        "(line 49,col 9)-(line 50,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistributionTest.makeCumulativeTestValues()",
      "begin_line": 54,
      "end_line": 59,
      "comment": " Creates the default cumulative probability density test expected values ",
      "child_ranges": [
        "(line 56,col 9)-(line 58,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistributionTest.makeDensityTestValues()",
      "begin_line": 62,
      "end_line": 66,
      "comment": " Creates the default probability density test expected values ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 28)",
        "(line 65,col 9)-(line 65,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistributionTest.testGetLowerBound()",
      "begin_line": 71,
      "end_line": 75,
      "comment": " Test lower bound getter. ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 66)",
        "(line 74,col 9)-(line 74,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistributionTest.testGetUpperBound()",
      "begin_line": 78,
      "end_line": 82,
      "comment": " Test upper bound getter. ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 66)",
        "(line 81,col 9)-(line 81,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistributionTest.testPreconditions1()",
      "begin_line": 85,
      "end_line": 88,
      "comment": " Test pre-condition for equal lower/upper bound. ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistributionTest.testPreconditions2()",
      "begin_line": 91,
      "end_line": 94,
      "comment": " Test pre-condition for lower bound larger than upper bound. ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistributionTest.testMeanVariance()",
      "begin_line": 97,
      "end_line": 112,
      "comment": " Test mean/variance. ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 37)",
        "(line 101,col 9)-(line 101,col 49)",
        "(line 102,col 9)-(line 102,col 61)",
        "(line 103,col 9)-(line 103,col 68)",
        "(line 105,col 9)-(line 105,col 54)",
        "(line 106,col 9)-(line 106,col 63)",
        "(line 107,col 9)-(line 107,col 68)",
        "(line 109,col 9)-(line 109,col 55)",
        "(line 110,col 9)-(line 110,col 63)",
        "(line 111,col 9)-(line 111,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistributionTest.testInverseCumulativeDistribution()",
      "begin_line": 118,
      "end_line": 123,
      "comment": " \n     * Check accuracy of analytical inverse CDF. Fails if a solver is used \n     * with the default accuracy. \n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 76)",
        "(line 122,col 9)-(line 122,col 81)"
      ]
    }
  ]
}