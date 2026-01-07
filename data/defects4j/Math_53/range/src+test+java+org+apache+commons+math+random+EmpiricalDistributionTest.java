{
  "filepath": "/tmp/Math-53b/src/test/java/org/apache/commons/math/random/EmpiricalDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmpiricalDistributionTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 249,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "empiricalDistribution"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "empiricalDistribution2"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "url"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dataArray"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.setUp()",
      "begin_line": 50,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 67)",
        "(line 53,col 9)-(line 53,col 53)",
        "(line 55,col 9)-(line 55,col 68)",
        "(line 56,col 9)-(line 58,col 43)",
        "(line 59,col 9)-(line 59,col 26)",
        "(line 60,col 9)-(line 60,col 57)",
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
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testLoad()",
      "begin_line": 80,
      "end_line": 91,
      "comment": "\n     * Test EmpiricalDistrbution.load() using sample data file.\u003cbr\u003e\n     * Check that the sampleCount, mu and sigma match data in\n     * the sample data file.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 40)",
        "(line 85,col 9)-(line 85,col 86)",
        "(line 87,col 9)-(line 88,col 41)",
        "(line 89,col 9)-(line 90,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testDoubleLoad()",
      "begin_line": 99,
      "end_line": 115,
      "comment": "\n     * Test EmpiricalDistrbution.load(double[]) using data taken from\n     * sample data file.\u003cbr\u003e\n     * Check that the sampleCount, mu and sigma match data in\n     * the sample data file.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 47)",
        "(line 104,col 9)-(line 104,col 87)",
        "(line 106,col 9)-(line 107,col 41)",
        "(line 108,col 9)-(line 109,col 42)",
        "(line 111,col 9)-(line 111,col 105)",
        "(line 112,col 9)-(line 112,col 48)",
        "(line 113,col 9)-(line 113,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testNext()",
      "begin_line": 122,
      "end_line": 126,
      "comment": "\n      * Generate 1000 random values and make sure they look OK.\u003cbr\u003e\n      * Note that there is a non-zero (but very small) probability that\n      * these tests will fail even if the code is working as designed.\n      ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 20)",
        "(line 125,col 9)-(line 125,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testNexFail()",
      "begin_line": 132,
      "end_line": 141,
      "comment": "\n      * Make sure exception thrown if digest getNext is attempted\n      * before loading empiricalDistribution.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 140,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testGridTooFine()",
      "begin_line": 146,
      "end_line": 152,
      "comment": "\n     * Make sure we can handle a grid size that is too fine\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 68)",
        "(line 149,col 9)-(line 149,col 20)",
        "(line 150,col 9)-(line 150,col 69)",
        "(line 151,col 9)-(line 151,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testGridTooFat()",
      "begin_line": 157,
      "end_line": 164,
      "comment": "\n     * How about too fat?\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 65)",
        "(line 160,col 9)-(line 160,col 18)",
        "(line 162,col 9)-(line 162,col 66)",
        "(line 163,col 9)-(line 163,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testBinIndexOverflow()",
      "begin_line": 169,
      "end_line": 173,
      "comment": "\n     * Test bin index overflow problem (BZ 36450)\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 73)",
        "(line 172,col 9)-(line 172,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testSerialization()",
      "begin_line": 175,
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
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testLoadNullDoubleArray()",
      "begin_line": 188,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 190,col 8)-(line 190,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testLoadNullURL()",
      "begin_line": 193,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testLoadNullFile()",
      "begin_line": 198,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testGetBinUpperBounds()",
      "begin_line": 206,
      "end_line": 216,
      "comment": "\n     * MATH-298\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 69)",
        "(line 209,col 9)-(line 209,col 74)",
        "(line 210,col 9)-(line 210,col 28)",
        "(line 211,col 9)-(line 211,col 59)",
        "(line 212,col 9)-(line 212,col 85)",
        "(line 213,col 9)-(line 213,col 28)",
        "(line 214,col 9)-(line 214,col 83)",
        "(line 215,col 9)-(line 215,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.verifySame(org.apache.commons.math.random.EmpiricalDistribution, org.apache.commons.math.random.EmpiricalDistribution)",
      "begin_line": 218,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 58)",
        "(line 220,col 9)-(line 220,col 64)",
        "(line 221,col 9)-(line 221,col 70)",
        "(line 222,col 9)-(line 227,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.tstGen(double)",
      "begin_line": 230,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 40)",
        "(line 232,col 9)-(line 232,col 58)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 81)",
        "(line 237,col 9)-(line 237,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.tstDoubleGen(double)",
      "begin_line": 240,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 47)",
        "(line 242,col 9)-(line 242,col 58)",
        "(line 243,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 246,col 81)",
        "(line 247,col 9)-(line 247,col 98)"
      ]
    }
  ]
}