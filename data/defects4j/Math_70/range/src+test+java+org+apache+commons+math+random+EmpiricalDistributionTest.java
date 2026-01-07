{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/random/EmpiricalDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmpiricalDistributionTest",
      "is_interface": false,
      "parent_types": [
        "RetryTestCase"
      ],
      "begin_line": 36,
      "end_line": 267,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "empiricalDistribution"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "empiricalDistribution2"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "url"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dataArray"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.EmpiricalDistributionTest(java.lang.String)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.setUp()",
      "begin_line": 48,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 67)",
        "(line 51,col 9)-(line 51,col 53)",
        "(line 53,col 9)-(line 53,col 68)",
        "(line 54,col 9)-(line 56,col 43)",
        "(line 57,col 9)-(line 57,col 26)",
        "(line 58,col 9)-(line 58,col 57)",
        "(line 59,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 62,col 19)",
        "(line 63,col 9)-(line 63,col 18)",
        "(line 65,col 9)-(line 65,col 44)",
        "(line 66,col 9)-(line 66,col 18)",
        "(line 67,col 9)-(line 70,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testLoad()",
      "begin_line": 78,
      "end_line": 90,
      "comment": "\n     * Test EmpiricalDistrbution.load() using sample data file.\u003cbr\u003e\n     * Check that the sampleCount, mu and sigma match data in\n     * the sample data file.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 40)",
        "(line 82,col 9)-(line 82,col 79)",
        "(line 84,col 9)-(line 86,col 41)",
        "(line 87,col 9)-(line 89,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testDoubleLoad()",
      "begin_line": 98,
      "end_line": 115,
      "comment": "\n     * Test EmpiricalDistrbution.load(double[]) using data taken from\n     * sample data file.\u003cbr\u003e\n     * Check that the sampleCount, mu and sigma match data in\n     * the sample data file.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 47)",
        "(line 102,col 9)-(line 102,col 80)",
        "(line 104,col 9)-(line 106,col 41)",
        "(line 107,col 9)-(line 109,col 42)",
        "(line 111,col 9)-(line 111,col 105)",
        "(line 112,col 9)-(line 112,col 41)",
        "(line 113,col 9)-(line 113,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testNext()",
      "begin_line": 122,
      "end_line": 125,
      "comment": "\n      * Generate 1000 random values and make sure they look OK.\u003cbr\u003e\n      * Note that there is a non-zero (but very small) probability that\n      * these tests will fail even if the code is working as designed.\n      ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 20)",
        "(line 124,col 9)-(line 124,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testNexFail()",
      "begin_line": 131,
      "end_line": 141,
      "comment": "\n      * Make sure exception thrown if digest getNext is attempted\n      * before loading empiricalDistribution.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 140,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testGridTooFine()",
      "begin_line": 146,
      "end_line": 151,
      "comment": "\n     * Make sure we can handle a grid size that is too fine\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 68)",
        "(line 148,col 9)-(line 148,col 20)",
        "(line 149,col 9)-(line 149,col 69)",
        "(line 150,col 9)-(line 150,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testGridTooFat()",
      "begin_line": 156,
      "end_line": 162,
      "comment": "\n     * How about too fat?\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 65)",
        "(line 158,col 9)-(line 158,col 18)",
        "(line 160,col 9)-(line 160,col 66)",
        "(line 161,col 9)-(line 161,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testBinIndexOverflow()",
      "begin_line": 167,
      "end_line": 170,
      "comment": "\n     * Test bin index overflow problem (BZ 36450)\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 73)",
        "(line 169,col 9)-(line 169,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testSerialization()",
      "begin_line": 172,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 69)",
        "(line 175,col 9)-(line 175,col 98)",
        "(line 176,col 9)-(line 176,col 32)",
        "(line 179,col 9)-(line 179,col 47)",
        "(line 180,col 9)-(line 180,col 94)",
        "(line 181,col 9)-(line 181,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testLoadNullDoubleArray()",
      "begin_line": 184,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 69)",
        "(line 186,col 9)-(line 193,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testLoadNullURL()",
      "begin_line": 196,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 69)",
        "(line 198,col 9)-(line 205,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testLoadNullFile()",
      "begin_line": 208,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 69)",
        "(line 210,col 9)-(line 217,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testGetBinUpperBounds()",
      "begin_line": 223,
      "end_line": 232,
      "comment": "\n     * MATH-298\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 69)",
        "(line 225,col 9)-(line 225,col 74)",
        "(line 226,col 9)-(line 226,col 28)",
        "(line 227,col 9)-(line 227,col 59)",
        "(line 228,col 9)-(line 228,col 85)",
        "(line 229,col 9)-(line 229,col 28)",
        "(line 230,col 9)-(line 230,col 83)",
        "(line 231,col 9)-(line 231,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.verifySame(org.apache.commons.math.random.EmpiricalDistribution, org.apache.commons.math.random.EmpiricalDistribution)",
      "begin_line": 234,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 51)",
        "(line 236,col 9)-(line 236,col 57)",
        "(line 237,col 9)-(line 237,col 63)",
        "(line 238,col 9)-(line 243,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.tstGen(double)",
      "begin_line": 246,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 40)",
        "(line 248,col 9)-(line 248,col 58)",
        "(line 249,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 74)",
        "(line 253,col 9)-(line 254,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.tstDoubleGen(double)",
      "begin_line": 257,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 47)",
        "(line 259,col 9)-(line 259,col 58)",
        "(line 260,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 74)",
        "(line 264,col 9)-(line 265,col 80)"
      ]
    }
  ]
}