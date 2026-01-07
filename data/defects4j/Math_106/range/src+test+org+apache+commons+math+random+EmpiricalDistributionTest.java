{
  "filepath": "/tmp/Math-106b/src/test/org/apache/commons/math/random/EmpiricalDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmpiricalDistributionTest",
      "is_interface": false,
      "parent_types": [
        "RetryTestCase"
      ],
      "begin_line": 39,
      "end_line": 221,
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
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 67)",
        "(line 53,col 9)-(line 53,col 53)",
        "(line 55,col 9)-(line 55,col 68)",
        "(line 56,col 9)-(line 58,col 43)",
        "(line 59,col 9)-(line 59,col 26)",
        "(line 60,col 9)-(line 60,col 41)",
        "(line 61,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 19)",
        "(line 65,col 9)-(line 65,col 18)",
        "(line 67,col 9)-(line 67,col 44)",
        "(line 68,col 9)-(line 68,col 18)",
        "(line 69,col 9)-(line 72,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.suite()",
      "begin_line": 75,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 73)",
        "(line 77,col 9)-(line 77,col 53)",
        "(line 78,col 9)-(line 78,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testLoad()",
      "begin_line": 86,
      "end_line": 98,
      "comment": "\n     * Test EmpiricalDistrbution.load() using sample data file.\u003cbr\u003e \n     * Check that the sampleCount, mu and sigma match data in \n     * the sample data file.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 40)",
        "(line 90,col 9)-(line 90,col 79)",
        "(line 92,col 9)-(line 94,col 41)",
        "(line 95,col 9)-(line 97,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testDoubleLoad()",
      "begin_line": 106,
      "end_line": 123,
      "comment": "\n     * Test EmpiricalDistrbution.load(double[]) using data taken from\n     * sample data file.\u003cbr\u003e \n     * Check that the sampleCount, mu and sigma match data in \n     * the sample data file.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 47)",
        "(line 110,col 9)-(line 110,col 80)",
        "(line 112,col 9)-(line 114,col 41)",
        "(line 115,col 9)-(line 117,col 42)",
        "(line 119,col 9)-(line 119,col 66)",
        "(line 120,col 9)-(line 120,col 41)",
        "(line 121,col 9)-(line 121,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testNext()",
      "begin_line": 130,
      "end_line": 133,
      "comment": " \n      * Generate 1000 random values and make sure they look OK.\u003cbr\u003e\n      * Note that there is a non-zero (but very small) probability that\n      * these tests will fail even if the code is working as designed.\n      ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 20)",
        "(line 132,col 9)-(line 132,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testNexFail()",
      "begin_line": 139,
      "end_line": 145,
      "comment": "\n      * Make sure exception thrown if digest getNext is attempted\n      * before loading empiricalDistribution.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 144,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testGridTooFine()",
      "begin_line": 150,
      "end_line": 155,
      "comment": "\n     * Make sure we can handle a grid size that is too fine\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 68)",
        "(line 152,col 9)-(line 152,col 20)",
        "(line 153,col 9)-(line 153,col 69)",
        "(line 154,col 9)-(line 154,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testGridTooFat()",
      "begin_line": 160,
      "end_line": 166,
      "comment": "\n     * How about too fat?\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 65)",
        "(line 162,col 9)-(line 162,col 18)",
        "(line 164,col 9)-(line 164,col 66)",
        "(line 165,col 9)-(line 165,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testBinIndexOverflow()",
      "begin_line": 171,
      "end_line": 174,
      "comment": "\n     * Test bin index overflow problem (BZ 36450)\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 73)",
        "(line 173,col 9)-(line 173,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testSerialization()",
      "begin_line": 176,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 69)",
        "(line 179,col 9)-(line 179,col 98)",
        "(line 180,col 9)-(line 180,col 32)",
        "(line 183,col 9)-(line 183,col 47)",
        "(line 184,col 9)-(line 184,col 94)",
        "(line 185,col 9)-(line 185,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.verifySame(org.apache.commons.math.random.EmpiricalDistribution, org.apache.commons.math.random.EmpiricalDistribution)",
      "begin_line": 188,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 51)",
        "(line 190,col 9)-(line 190,col 57)",
        "(line 191,col 9)-(line 191,col 63)",
        "(line 192,col 9)-(line 197,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.tstGen(double)",
      "begin_line": 200,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 40)",
        "(line 202,col 9)-(line 202,col 66)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 206,col 74)",
        "(line 207,col 9)-(line 208,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.tstDoubleGen(double)",
      "begin_line": 211,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 47)",
        "(line 213,col 9)-(line 213,col 66)",
        "(line 214,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 74)",
        "(line 218,col 9)-(line 219,col 80)"
      ]
    }
  ]
}