{
  "filepath": "/tmp/Math-103b/src/test/org/apache/commons/math/random/EmpiricalDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmpiricalDistributionTest",
      "is_interface": false,
      "parent_types": [
        "RetryTestCase"
      ],
      "begin_line": 40,
      "end_line": 222,
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
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 67)",
        "(line 54,col 9)-(line 54,col 53)",
        "(line 56,col 9)-(line 56,col 68)",
        "(line 57,col 9)-(line 59,col 43)",
        "(line 60,col 9)-(line 60,col 26)",
        "(line 61,col 9)-(line 61,col 41)",
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
      "comment": "\n     * Test EmpiricalDistrbution.load() using sample data file.\u003cbr\u003e \n     * Check that the sampleCount, mu and sigma match data in \n     * the sample data file.\n     ",
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
      "comment": "\n     * Test EmpiricalDistrbution.load(double[]) using data taken from\n     * sample data file.\u003cbr\u003e \n     * Check that the sampleCount, mu and sigma match data in \n     * the sample data file.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 47)",
        "(line 111,col 9)-(line 111,col 80)",
        "(line 113,col 9)-(line 115,col 41)",
        "(line 116,col 9)-(line 118,col 42)",
        "(line 120,col 9)-(line 120,col 66)",
        "(line 121,col 9)-(line 121,col 41)",
        "(line 122,col 9)-(line 122,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testNext()",
      "begin_line": 131,
      "end_line": 134,
      "comment": " \n      * Generate 1000 random values and make sure they look OK.\u003cbr\u003e\n      * Note that there is a non-zero (but very small) probability that\n      * these tests will fail even if the code is working as designed.\n      ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 20)",
        "(line 133,col 9)-(line 133,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testNexFail()",
      "begin_line": 140,
      "end_line": 146,
      "comment": "\n      * Make sure exception thrown if digest getNext is attempted\n      * before loading empiricalDistribution.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 145,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testGridTooFine()",
      "begin_line": 151,
      "end_line": 156,
      "comment": "\n     * Make sure we can handle a grid size that is too fine\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 68)",
        "(line 153,col 9)-(line 153,col 20)",
        "(line 154,col 9)-(line 154,col 69)",
        "(line 155,col 9)-(line 155,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testGridTooFat()",
      "begin_line": 161,
      "end_line": 167,
      "comment": "\n     * How about too fat?\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 65)",
        "(line 163,col 9)-(line 163,col 18)",
        "(line 165,col 9)-(line 165,col 66)",
        "(line 166,col 9)-(line 166,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testBinIndexOverflow()",
      "begin_line": 172,
      "end_line": 175,
      "comment": "\n     * Test bin index overflow problem (BZ 36450)\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 73)",
        "(line 174,col 9)-(line 174,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testSerialization()",
      "begin_line": 177,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 69)",
        "(line 180,col 9)-(line 180,col 98)",
        "(line 181,col 9)-(line 181,col 32)",
        "(line 184,col 9)-(line 184,col 47)",
        "(line 185,col 9)-(line 185,col 94)",
        "(line 186,col 9)-(line 186,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.verifySame(org.apache.commons.math.random.EmpiricalDistribution, org.apache.commons.math.random.EmpiricalDistribution)",
      "begin_line": 189,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 51)",
        "(line 191,col 9)-(line 191,col 57)",
        "(line 192,col 9)-(line 192,col 63)",
        "(line 193,col 9)-(line 198,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.tstGen(double)",
      "begin_line": 201,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 40)",
        "(line 203,col 9)-(line 203,col 66)",
        "(line 204,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 207,col 74)",
        "(line 208,col 9)-(line 209,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.tstDoubleGen(double)",
      "begin_line": 212,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 47)",
        "(line 214,col 9)-(line 214,col 66)",
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 74)",
        "(line 219,col 9)-(line 220,col 80)"
      ]
    }
  ]
}