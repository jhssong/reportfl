{
  "filepath": "/tmp/Math-55b/src/test/java/org/apache/commons/math/random/EmpiricalDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmpiricalDistributionTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 266,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "empiricalDistribution"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "empiricalDistribution2"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "url"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dataArray"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.setUp()",
      "begin_line": 49,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 67)",
        "(line 52,col 9)-(line 52,col 53)",
        "(line 54,col 9)-(line 54,col 68)",
        "(line 55,col 9)-(line 57,col 43)",
        "(line 58,col 9)-(line 58,col 26)",
        "(line 59,col 9)-(line 59,col 57)",
        "(line 60,col 9)-(line 62,col 9)",
        "(line 63,col 9)-(line 63,col 19)",
        "(line 64,col 9)-(line 64,col 18)",
        "(line 66,col 9)-(line 66,col 44)",
        "(line 67,col 9)-(line 67,col 18)",
        "(line 68,col 9)-(line 71,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testLoad()",
      "begin_line": 79,
      "end_line": 90,
      "comment": "\n     * Test EmpiricalDistrbution.load() using sample data file.\u003cbr\u003e\n     * Check that the sampleCount, mu and sigma match data in\n     * the sample data file.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 40)",
        "(line 84,col 9)-(line 84,col 86)",
        "(line 86,col 9)-(line 87,col 41)",
        "(line 88,col 9)-(line 89,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testDoubleLoad()",
      "begin_line": 98,
      "end_line": 114,
      "comment": "\n     * Test EmpiricalDistrbution.load(double[]) using data taken from\n     * sample data file.\u003cbr\u003e\n     * Check that the sampleCount, mu and sigma match data in\n     * the sample data file.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 47)",
        "(line 103,col 9)-(line 103,col 87)",
        "(line 105,col 9)-(line 106,col 41)",
        "(line 107,col 9)-(line 108,col 42)",
        "(line 110,col 9)-(line 110,col 105)",
        "(line 111,col 9)-(line 111,col 48)",
        "(line 112,col 9)-(line 112,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testNext()",
      "begin_line": 121,
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
      "end_line": 140,
      "comment": "\n      * Make sure exception thrown if digest getNext is attempted\n      * before loading empiricalDistribution.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 139,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testGridTooFine()",
      "begin_line": 145,
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
      "end_line": 163,
      "comment": "\n     * How about too fat?\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 65)",
        "(line 159,col 9)-(line 159,col 18)",
        "(line 161,col 9)-(line 161,col 66)",
        "(line 162,col 9)-(line 162,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testBinIndexOverflow()",
      "begin_line": 168,
      "end_line": 172,
      "comment": "\n     * Test bin index overflow problem (BZ 36450)\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 73)",
        "(line 171,col 9)-(line 171,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testSerialization()",
      "begin_line": 174,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 69)",
        "(line 178,col 9)-(line 178,col 98)",
        "(line 179,col 9)-(line 179,col 32)",
        "(line 182,col 9)-(line 182,col 47)",
        "(line 183,col 9)-(line 183,col 94)",
        "(line 184,col 9)-(line 184,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testLoadNullDoubleArray()",
      "begin_line": 187,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 69)",
        "(line 190,col 9)-(line 195,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testLoadNullURL()",
      "begin_line": 198,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 69)",
        "(line 201,col 9)-(line 206,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testLoadNullFile()",
      "begin_line": 209,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 69)",
        "(line 212,col 9)-(line 217,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.testGetBinUpperBounds()",
      "begin_line": 223,
      "end_line": 233,
      "comment": "\n     * MATH-298\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 69)",
        "(line 226,col 9)-(line 226,col 74)",
        "(line 227,col 9)-(line 227,col 28)",
        "(line 228,col 9)-(line 228,col 59)",
        "(line 229,col 9)-(line 229,col 85)",
        "(line 230,col 9)-(line 230,col 28)",
        "(line 231,col 9)-(line 231,col 83)",
        "(line 232,col 9)-(line 232,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.verifySame(org.apache.commons.math.random.EmpiricalDistribution, org.apache.commons.math.random.EmpiricalDistribution)",
      "begin_line": 235,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 58)",
        "(line 237,col 9)-(line 237,col 64)",
        "(line 238,col 9)-(line 238,col 70)",
        "(line 239,col 9)-(line 244,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.tstGen(double)",
      "begin_line": 247,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 40)",
        "(line 249,col 9)-(line 249,col 58)",
        "(line 250,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 253,col 81)",
        "(line 254,col 9)-(line 254,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.EmpiricalDistributionTest.tstDoubleGen(double)",
      "begin_line": 257,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 47)",
        "(line 259,col 9)-(line 259,col 58)",
        "(line 260,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 81)",
        "(line 264,col 9)-(line 264,col 98)"
      ]
    }
  ]
}