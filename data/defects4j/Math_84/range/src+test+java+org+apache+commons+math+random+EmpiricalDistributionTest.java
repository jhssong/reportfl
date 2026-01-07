{
  "filepath": "/tmp/Math-84b/src/test/java/org/apache/commons/math/random/EmpiricalDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmpiricalDistributionTest",
      "is_interface": false,
      "parent_types": [
        "RetryTestCase"
      ],
      "begin_line": 40,
      "end_line": 263,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "empiricalDistribution"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "empiricalDistribution2"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "url"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dataArray"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.EmpiricalDistributionTest(java.lang.String)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.setUp()",
      "begin_line": 52,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 67)",
        "(line 55,col 9)-(line 55,col 53)",
        "(line 57,col 9)-(line 57,col 68)",
        "(line 58,col 9)-(line 60,col 43)",
        "(line 61,col 9)-(line 61,col 26)",
        "(line 62,col 9)-(line 62,col 57)",
        "(line 63,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 66,col 19)",
        "(line 67,col 9)-(line 67,col 18)",
        "(line 69,col 9)-(line 69,col 44)",
        "(line 70,col 9)-(line 70,col 18)",
        "(line 71,col 9)-(line 74,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.suite()",
      "begin_line": 77,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 73)",
        "(line 79,col 9)-(line 79,col 53)",
        "(line 80,col 9)-(line 80,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testLoad()",
      "begin_line": 88,
      "end_line": 100,
      "comment": "\n     * Test EmpiricalDistrbution.load() using sample data file.\u003cbr\u003e \n     * Check that the sampleCount, mu and sigma match data in \n     * the sample data file.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 40)",
        "(line 92,col 9)-(line 92,col 79)",
        "(line 94,col 9)-(line 96,col 41)",
        "(line 97,col 9)-(line 99,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testDoubleLoad()",
      "begin_line": 108,
      "end_line": 125,
      "comment": "\n     * Test EmpiricalDistrbution.load(double[]) using data taken from\n     * sample data file.\u003cbr\u003e \n     * Check that the sampleCount, mu and sigma match data in \n     * the sample data file.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 47)",
        "(line 112,col 9)-(line 112,col 80)",
        "(line 114,col 9)-(line 116,col 41)",
        "(line 117,col 9)-(line 119,col 42)",
        "(line 121,col 9)-(line 121,col 66)",
        "(line 122,col 9)-(line 122,col 41)",
        "(line 123,col 9)-(line 123,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testNext()",
      "begin_line": 132,
      "end_line": 135,
      "comment": " \n      * Generate 1000 random values and make sure they look OK.\u003cbr\u003e\n      * Note that there is a non-zero (but very small) probability that\n      * these tests will fail even if the code is working as designed.\n      ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 20)",
        "(line 134,col 9)-(line 134,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testNexFail()",
      "begin_line": 141,
      "end_line": 151,
      "comment": "\n      * Make sure exception thrown if digest getNext is attempted\n      * before loading empiricalDistribution.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 150,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testGridTooFine()",
      "begin_line": 156,
      "end_line": 161,
      "comment": "\n     * Make sure we can handle a grid size that is too fine\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 68)",
        "(line 158,col 9)-(line 158,col 20)",
        "(line 159,col 9)-(line 159,col 69)",
        "(line 160,col 9)-(line 160,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testGridTooFat()",
      "begin_line": 166,
      "end_line": 172,
      "comment": "\n     * How about too fat?\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 65)",
        "(line 168,col 9)-(line 168,col 18)",
        "(line 170,col 9)-(line 170,col 66)",
        "(line 171,col 9)-(line 171,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testBinIndexOverflow()",
      "begin_line": 177,
      "end_line": 180,
      "comment": "\n     * Test bin index overflow problem (BZ 36450)\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 73)",
        "(line 179,col 9)-(line 179,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testSerialization()",
      "begin_line": 182,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 69)",
        "(line 185,col 9)-(line 185,col 98)",
        "(line 186,col 9)-(line 186,col 32)",
        "(line 189,col 9)-(line 189,col 47)",
        "(line 190,col 9)-(line 190,col 94)",
        "(line 191,col 9)-(line 191,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testLoadNullDoubleArray()",
      "begin_line": 194,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 69)",
        "(line 196,col 9)-(line 203,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testLoadNullURL()",
      "begin_line": 206,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 69)",
        "(line 208,col 9)-(line 215,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testLoadNullFile()",
      "begin_line": 218,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 69)",
        "(line 220,col 9)-(line 227,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.verifySame(org.apache.commons.math.random.EmpiricalDistribution, org.apache.commons.math.random.EmpiricalDistribution)",
      "begin_line": 230,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 51)",
        "(line 232,col 9)-(line 232,col 57)",
        "(line 233,col 9)-(line 233,col 63)",
        "(line 234,col 9)-(line 239,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.tstGen(double)",
      "begin_line": 242,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 40)",
        "(line 244,col 9)-(line 244,col 58)",
        "(line 245,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 248,col 74)",
        "(line 249,col 9)-(line 250,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.tstDoubleGen(double)",
      "begin_line": 253,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 47)",
        "(line 255,col 9)-(line 255,col 58)",
        "(line 256,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 74)",
        "(line 260,col 9)-(line 261,col 80)"
      ]
    }
  ]
}