{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/distribution/TriangularDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TriangularDistributionTest",
      "is_interface": false,
      "parent_types": [
        "RealDistributionAbstractTest"
      ],
      "begin_line": 29,
      "end_line": 193,
      "comment": "\n * Test cases for {@link TriangularDistribution}. See class javadoc for\n * {@link RealDistributionAbstractTest} for further details.\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistributionTest.setUp()",
      "begin_line": 33,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 22)",
        "(line 36,col 9)-(line 36,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistributionTest.makeDistribution()",
      "begin_line": 44,
      "end_line": 48,
      "comment": "\n     * Creates the default triangular distribution instance to use in tests.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistributionTest.makeCumulativeTestPoints()",
      "begin_line": 54,
      "end_line": 64,
      "comment": "\n     * Creates the default cumulative probability distribution test input\n     * values.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 63,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistributionTest.makeCumulativeTestValues()",
      "begin_line": 69,
      "end_line": 89,
      "comment": "\n     * Creates the default cumulative probability density test expected values.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 31)",
        "(line 78,col 9)-(line 78,col 28)",
        "(line 79,col 9)-(line 79,col 28)",
        "(line 80,col 9)-(line 88,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistributionTest.makeInverseCumulativeTestPoints()",
      "begin_line": 95,
      "end_line": 105,
      "comment": "\n     * Creates the default inverse cumulative probability distribution test\n     * input values.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 53)",
        "(line 101,col 9)-(line 101,col 55)",
        "(line 102,col 9)-(line 102,col 64)",
        "(line 103,col 9)-(line 103,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistributionTest.makeInverseCumulativeTestValues()",
      "begin_line": 111,
      "end_line": 121,
      "comment": "\n     * Creates the default inverse cumulative probability density test expected\n     * values.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 53)",
        "(line 117,col 9)-(line 117,col 55)",
        "(line 118,col 9)-(line 118,col 64)",
        "(line 119,col 9)-(line 119,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistributionTest.makeDensityTestValues()",
      "begin_line": 124,
      "end_line": 134,
      "comment": " Creates the default probability density test expected values. ",
      "child_ranges": [
        "(line 126,col 9)-(line 133,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistributionTest.testGetLowerBound()",
      "begin_line": 139,
      "end_line": 143,
      "comment": " Test lower bound getter. ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 65)",
        "(line 142,col 9)-(line 142,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistributionTest.testGetUpperBound()",
      "begin_line": 146,
      "end_line": 150,
      "comment": " Test upper bound getter. ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 65)",
        "(line 149,col 9)-(line 149,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistributionTest.testPreconditions1()",
      "begin_line": 153,
      "end_line": 156,
      "comment": " Test pre-condition for equal lower/upper limit. ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistributionTest.testPreconditions2()",
      "begin_line": 159,
      "end_line": 162,
      "comment": " Test pre-condition for lower limit larger than upper limit. ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistributionTest.testPreconditions3()",
      "begin_line": 165,
      "end_line": 168,
      "comment": " Test pre-condition for mode larger than upper limit. ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistributionTest.testPreconditions4()",
      "begin_line": 171,
      "end_line": 174,
      "comment": " Test pre-condition for mode smaller than lower limit. ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TriangularDistributionTest.testMeanVariance()",
      "begin_line": 177,
      "end_line": 192,
      "comment": " Test mean/variance. ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 36)",
        "(line 181,col 9)-(line 181,col 55)",
        "(line 182,col 9)-(line 182,col 61)",
        "(line 183,col 9)-(line 183,col 70)",
        "(line 185,col 9)-(line 185,col 51)",
        "(line 186,col 9)-(line 186,col 65)",
        "(line 187,col 9)-(line 187,col 70)",
        "(line 189,col 9)-(line 189,col 53)",
        "(line 190,col 9)-(line 190,col 71)",
        "(line 191,col 9)-(line 191,col 72)"
      ]
    }
  ]
}