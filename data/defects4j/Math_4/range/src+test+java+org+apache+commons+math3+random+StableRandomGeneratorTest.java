{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/random/StableRandomGeneratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StableRandomGeneratorTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 132,
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
      "type": "method",
      "signature": "org.apache.commons.math3.random.StableRandomGeneratorTest.testNextDouble()",
      "begin_line": 42,
      "end_line": 51,
      "comment": "\n     * Run the double nextDouble() method test Due to leptokurtic property the\n     * acceptance range is widened.\n     * \n     * TODO: verify that tolerance this wide is really OK\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 45,col 21)",
        "(line 46,col 9)-(line 46,col 53)",
        "(line 47,col 9)-(line 49,col 9)",
        "(line 50,col 9)-(line 50,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.StableRandomGeneratorTest.testGaussianCase()",
      "begin_line": 56,
      "end_line": 66,
      "comment": "\n     * If alpha \u003d 2, than it must be Gaussian distribution\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 81)",
        "(line 60,col 9)-(line 60,col 49)",
        "(line 61,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 63)",
        "(line 65,col 9)-(line 65,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.StableRandomGeneratorTest.testCauchyCase()",
      "begin_line": 71,
      "end_line": 84,
      "comment": "\n     * If alpha \u003d 1, than it must be Cauchy distribution\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 81)",
        "(line 74,col 9)-(line 74,col 68)",
        "(line 76,col 9)-(line 79,col 9)",
        "(line 82,col 9)-(line 82,col 50)",
        "(line 83,col 9)-(line 83,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.StableRandomGeneratorTest.testAlphaRangeBelowZero()",
      "begin_line": 89,
      "end_line": 98,
      "comment": "\n     * Input parameter range tests\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 97,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.StableRandomGeneratorTest.testAlphaRangeAboveTwo()",
      "begin_line": 100,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 108,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.StableRandomGeneratorTest.testBetaRangeBelowMinusOne()",
      "begin_line": 111,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.StableRandomGeneratorTest.testBetaRangeAboveOne()",
      "begin_line": 122,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 130,col 9)"
      ]
    }
  ]
}