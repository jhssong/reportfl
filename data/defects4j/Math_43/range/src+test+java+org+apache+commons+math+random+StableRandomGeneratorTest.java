{
  "filepath": "/tmp/Math-43b/src/test/java/org/apache/commons/math/random/StableRandomGeneratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StableRandomGeneratorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 134,
      "comment": "\n * The class \u003ccode\u003eStableRandomGeneratorTest\u003c/code\u003e contains tests for the class\n * {@link StableRandomGenerator}\n * \n * @version $Revision$\n "
    },
    {
      "type": "field",
      "varNames": [
        "rg"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sampleSize"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.StableRandomGeneratorTest.StableRandomGeneratorTest(java.lang.String)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Construct new test instance\n     * \n     * @param name the test name\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.StableRandomGeneratorTest.testNextDouble()",
      "begin_line": 51,
      "end_line": 59,
      "comment": "\n     * Run the double nextDouble() method test Due to leptokurtic property the\n     * acceptance range is widened.\n     * \n     * TODO: verify that tolerance this wide is really OK\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 53,col 21)",
        "(line 54,col 9)-(line 54,col 53)",
        "(line 55,col 9)-(line 57,col 9)",
        "(line 58,col 9)-(line 58,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.StableRandomGeneratorTest.testGaussianCase()",
      "begin_line": 64,
      "end_line": 73,
      "comment": "\n     * If alpha \u003d 2, than it must be Gaussian distribution\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 81)",
        "(line 67,col 9)-(line 67,col 49)",
        "(line 68,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 71,col 56)",
        "(line 72,col 9)-(line 72,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.StableRandomGeneratorTest.testCauchyCase()",
      "begin_line": 78,
      "end_line": 90,
      "comment": "\n     * If alpha \u003d 1, than it must be Cauchy distribution\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 81)",
        "(line 80,col 9)-(line 80,col 68)",
        "(line 82,col 9)-(line 85,col 9)",
        "(line 88,col 9)-(line 88,col 50)",
        "(line 89,col 9)-(line 89,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.StableRandomGeneratorTest.testAlphaRangeBelowZero()",
      "begin_line": 95,
      "end_line": 103,
      "comment": "\n     * Input parameter range tests\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 102,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.StableRandomGeneratorTest.testAlphaRangeAboveTwo()",
      "begin_line": 105,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 112,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.StableRandomGeneratorTest.testBetaRangeBelowMinusOne()",
      "begin_line": 115,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 122,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.StableRandomGeneratorTest.testBetaRangeAboveOne()",
      "begin_line": 125,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 132,col 9)"
      ]
    }
  ]
}