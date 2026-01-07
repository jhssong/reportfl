{
  "filepath": "/tmp/Math-59b/src/test/java/org/apache/commons/math/random/EmpiricalDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmpiricalDistributionTest",
      "is_interface": false,
      "parent_types": [
        "RetryTestCase"
      ],
      "begin_line": 36,
      "end_line": 259,
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
      "end_line": 139,
      "comment": "\n      * Make sure exception thrown if digest getNext is attempted\n      * before loading empiricalDistribution.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 138,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testGridTooFine()",
      "begin_line": 144,
      "end_line": 149,
      "comment": "\n     * Make sure we can handle a grid size that is too fine\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 68)",
        "(line 146,col 9)-(line 146,col 20)",
        "(line 147,col 9)-(line 147,col 69)",
        "(line 148,col 9)-(line 148,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testGridTooFat()",
      "begin_line": 154,
      "end_line": 160,
      "comment": "\n     * How about too fat?\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 65)",
        "(line 156,col 9)-(line 156,col 18)",
        "(line 158,col 9)-(line 158,col 66)",
        "(line 159,col 9)-(line 159,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testBinIndexOverflow()",
      "begin_line": 165,
      "end_line": 168,
      "comment": "\n     * Test bin index overflow problem (BZ 36450)\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 73)",
        "(line 167,col 9)-(line 167,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testSerialization()",
      "begin_line": 170,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 69)",
        "(line 173,col 9)-(line 173,col 98)",
        "(line 174,col 9)-(line 174,col 32)",
        "(line 177,col 9)-(line 177,col 47)",
        "(line 178,col 9)-(line 178,col 94)",
        "(line 179,col 9)-(line 179,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testLoadNullDoubleArray()",
      "begin_line": 182,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 69)",
        "(line 184,col 9)-(line 189,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testLoadNullURL()",
      "begin_line": 192,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 69)",
        "(line 194,col 9)-(line 199,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testLoadNullFile()",
      "begin_line": 202,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 69)",
        "(line 204,col 9)-(line 209,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testGetBinUpperBounds()",
      "begin_line": 215,
      "end_line": 224,
      "comment": "\n     * MATH-298\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 69)",
        "(line 217,col 9)-(line 217,col 74)",
        "(line 218,col 9)-(line 218,col 28)",
        "(line 219,col 9)-(line 219,col 59)",
        "(line 220,col 9)-(line 220,col 85)",
        "(line 221,col 9)-(line 221,col 28)",
        "(line 222,col 9)-(line 222,col 83)",
        "(line 223,col 9)-(line 223,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.verifySame(org.apache.commons.math.random.EmpiricalDistribution, org.apache.commons.math.random.EmpiricalDistribution)",
      "begin_line": 226,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 51)",
        "(line 228,col 9)-(line 228,col 57)",
        "(line 229,col 9)-(line 229,col 63)",
        "(line 230,col 9)-(line 235,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.tstGen(double)",
      "begin_line": 238,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 40)",
        "(line 240,col 9)-(line 240,col 58)",
        "(line 241,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 244,col 74)",
        "(line 245,col 9)-(line 246,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.tstDoubleGen(double)",
      "begin_line": 249,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 47)",
        "(line 251,col 9)-(line 251,col 58)",
        "(line 252,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 74)",
        "(line 256,col 9)-(line 257,col 80)"
      ]
    }
  ]
}