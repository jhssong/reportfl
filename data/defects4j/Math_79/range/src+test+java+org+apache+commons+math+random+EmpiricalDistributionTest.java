{
  "filepath": "/tmp/Math-79b/src/test/java/org/apache/commons/math/random/EmpiricalDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmpiricalDistributionTest",
      "is_interface": false,
      "parent_types": [
        "RetryTestCase"
      ],
      "begin_line": 39,
      "end_line": 276,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "empiricalDistribution"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "empiricalDistribution2"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "url"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dataArray"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.EmpiricalDistributionTest(java.lang.String)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.setUp()",
      "begin_line": 51,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 67)",
        "(line 54,col 9)-(line 54,col 53)",
        "(line 56,col 9)-(line 56,col 68)",
        "(line 57,col 9)-(line 59,col 43)",
        "(line 60,col 9)-(line 60,col 26)",
        "(line 61,col 9)-(line 61,col 57)",
        "(line 62,col 9)-(line 64,col 9)",
        "(line 65,col 9)-(line 65,col 19)",
        "(line 66,col 9)-(line 66,col 18)",
        "(line 68,col 9)-(line 68,col 44)",
        "(line 69,col 9)-(line 69,col 18)",
        "(line 70,col 9)-(line 73,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.suite()",
      "begin_line": 76,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 73)",
        "(line 78,col 9)-(line 78,col 53)",
        "(line 79,col 9)-(line 79,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testLoad()",
      "begin_line": 87,
      "end_line": 99,
      "comment": "\n     * Test EmpiricalDistrbution.load() using sample data file.\u003cbr\u003e\n     * Check that the sampleCount, mu and sigma match data in\n     * the sample data file.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 40)",
        "(line 91,col 9)-(line 91,col 79)",
        "(line 93,col 9)-(line 95,col 41)",
        "(line 96,col 9)-(line 98,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testDoubleLoad()",
      "begin_line": 107,
      "end_line": 124,
      "comment": "\n     * Test EmpiricalDistrbution.load(double[]) using data taken from\n     * sample data file.\u003cbr\u003e\n     * Check that the sampleCount, mu and sigma match data in\n     * the sample data file.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 47)",
        "(line 111,col 9)-(line 111,col 80)",
        "(line 113,col 9)-(line 115,col 41)",
        "(line 116,col 9)-(line 118,col 42)",
        "(line 120,col 9)-(line 120,col 105)",
        "(line 121,col 9)-(line 121,col 41)",
        "(line 122,col 9)-(line 122,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testNext()",
      "begin_line": 131,
      "end_line": 134,
      "comment": "\n      * Generate 1000 random values and make sure they look OK.\u003cbr\u003e\n      * Note that there is a non-zero (but very small) probability that\n      * these tests will fail even if the code is working as designed.\n      ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 20)",
        "(line 133,col 9)-(line 133,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testNexFail()",
      "begin_line": 140,
      "end_line": 150,
      "comment": "\n      * Make sure exception thrown if digest getNext is attempted\n      * before loading empiricalDistribution.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 149,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testGridTooFine()",
      "begin_line": 155,
      "end_line": 160,
      "comment": "\n     * Make sure we can handle a grid size that is too fine\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 68)",
        "(line 157,col 9)-(line 157,col 20)",
        "(line 158,col 9)-(line 158,col 69)",
        "(line 159,col 9)-(line 159,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testGridTooFat()",
      "begin_line": 165,
      "end_line": 171,
      "comment": "\n     * How about too fat?\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 65)",
        "(line 167,col 9)-(line 167,col 18)",
        "(line 169,col 9)-(line 169,col 66)",
        "(line 170,col 9)-(line 170,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testBinIndexOverflow()",
      "begin_line": 176,
      "end_line": 179,
      "comment": "\n     * Test bin index overflow problem (BZ 36450)\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 73)",
        "(line 178,col 9)-(line 178,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testSerialization()",
      "begin_line": 181,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 69)",
        "(line 184,col 9)-(line 184,col 98)",
        "(line 185,col 9)-(line 185,col 32)",
        "(line 188,col 9)-(line 188,col 47)",
        "(line 189,col 9)-(line 189,col 94)",
        "(line 190,col 9)-(line 190,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testLoadNullDoubleArray()",
      "begin_line": 193,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 69)",
        "(line 195,col 9)-(line 202,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testLoadNullURL()",
      "begin_line": 205,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 69)",
        "(line 207,col 9)-(line 214,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testLoadNullFile()",
      "begin_line": 217,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 69)",
        "(line 219,col 9)-(line 226,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testGetBinUpperBounds()",
      "begin_line": 232,
      "end_line": 241,
      "comment": "\n     * MATH-298\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 69)",
        "(line 234,col 9)-(line 234,col 74)",
        "(line 235,col 9)-(line 235,col 28)",
        "(line 236,col 9)-(line 236,col 59)",
        "(line 237,col 9)-(line 237,col 85)",
        "(line 238,col 9)-(line 238,col 28)",
        "(line 239,col 9)-(line 239,col 83)",
        "(line 240,col 9)-(line 240,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.verifySame(org.apache.commons.math.random.EmpiricalDistribution, org.apache.commons.math.random.EmpiricalDistribution)",
      "begin_line": 243,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 51)",
        "(line 245,col 9)-(line 245,col 57)",
        "(line 246,col 9)-(line 246,col 63)",
        "(line 247,col 9)-(line 252,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.tstGen(double)",
      "begin_line": 255,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 40)",
        "(line 257,col 9)-(line 257,col 58)",
        "(line 258,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 261,col 74)",
        "(line 262,col 9)-(line 263,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.tstDoubleGen(double)",
      "begin_line": 266,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 47)",
        "(line 268,col 9)-(line 268,col 58)",
        "(line 269,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 272,col 74)",
        "(line 273,col 9)-(line 274,col 80)"
      ]
    }
  ]
}