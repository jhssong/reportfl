{
  "filepath": "/tmp/Math-19b/src/test/java/org/apache/commons/math3/random/EmpiricalDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmpiricalDistributionTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 279,
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
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.setUp()",
      "begin_line": 47,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 63)",
        "(line 50,col 9)-(line 50,col 53)",
        "(line 52,col 9)-(line 52,col 64)",
        "(line 53,col 9)-(line 55,col 43)",
        "(line 56,col 9)-(line 56,col 26)",
        "(line 57,col 9)-(line 57,col 57)",
        "(line 58,col 9)-(line 60,col 9)",
        "(line 61,col 9)-(line 61,col 19)",
        "(line 62,col 9)-(line 62,col 18)",
        "(line 64,col 9)-(line 64,col 44)",
        "(line 65,col 9)-(line 65,col 18)",
        "(line 66,col 9)-(line 69,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testLoad()",
      "begin_line": 77,
      "end_line": 88,
      "comment": "\n     * Test EmpiricalDistrbution.load() using sample data file.\u003cbr\u003e\n     * Check that the sampleCount, mu and sigma match data in\n     * the sample data file.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 40)",
        "(line 82,col 9)-(line 82,col 86)",
        "(line 84,col 9)-(line 85,col 41)",
        "(line 86,col 9)-(line 87,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testDoubleLoad()",
      "begin_line": 96,
      "end_line": 112,
      "comment": "\n     * Test EmpiricalDistrbution.load(double[]) using data taken from\n     * sample data file.\u003cbr\u003e\n     * Check that the sampleCount, mu and sigma match data in\n     * the sample data file.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 47)",
        "(line 101,col 9)-(line 101,col 87)",
        "(line 103,col 9)-(line 104,col 41)",
        "(line 105,col 9)-(line 106,col 42)",
        "(line 108,col 9)-(line 108,col 75)",
        "(line 109,col 9)-(line 109,col 48)",
        "(line 110,col 9)-(line 110,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testNext()",
      "begin_line": 119,
      "end_line": 123,
      "comment": "\n      * Generate 1000 random values and make sure they look OK.\u003cbr\u003e\n      * Note that there is a non-zero (but very small) probability that\n      * these tests will fail even if the code is working as designed.\n      ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 20)",
        "(line 122,col 9)-(line 122,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testNexFail()",
      "begin_line": 129,
      "end_line": 138,
      "comment": "\n      * Make sure exception thrown if digest getNext is attempted\n      * before loading empiricalDistribution.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 137,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testGridTooFine()",
      "begin_line": 143,
      "end_line": 149,
      "comment": "\n     * Make sure we can handle a grid size that is too fine\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 64)",
        "(line 146,col 9)-(line 146,col 20)",
        "(line 147,col 9)-(line 147,col 65)",
        "(line 148,col 9)-(line 148,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testGridTooFat()",
      "begin_line": 154,
      "end_line": 161,
      "comment": "\n     * How about too fat?\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 61)",
        "(line 157,col 9)-(line 157,col 18)",
        "(line 159,col 9)-(line 159,col 62)",
        "(line 160,col 9)-(line 160,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testBinIndexOverflow()",
      "begin_line": 166,
      "end_line": 170,
      "comment": "\n     * Test bin index overflow problem (BZ 36450)\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 73)",
        "(line 169,col 9)-(line 169,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testSerialization()",
      "begin_line": 172,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 65)",
        "(line 176,col 9)-(line 176,col 98)",
        "(line 177,col 9)-(line 177,col 32)",
        "(line 180,col 9)-(line 180,col 47)",
        "(line 181,col 9)-(line 181,col 94)",
        "(line 182,col 9)-(line 182,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testLoadNullDoubleArray()",
      "begin_line": 185,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 187,col 8)-(line 187,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testLoadNullURL()",
      "begin_line": 190,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testLoadNullFile()",
      "begin_line": 195,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testGetBinUpperBounds()",
      "begin_line": 203,
      "end_line": 213,
      "comment": "\n     * MATH-298\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 69)",
        "(line 206,col 9)-(line 206,col 66)",
        "(line 207,col 9)-(line 207,col 28)",
        "(line 208,col 9)-(line 208,col 59)",
        "(line 209,col 9)-(line 209,col 85)",
        "(line 210,col 9)-(line 210,col 28)",
        "(line 211,col 9)-(line 211,col 83)",
        "(line 212,col 9)-(line 212,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testGeneratorConfig()",
      "begin_line": 215,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 44)",
        "(line 218,col 9)-(line 218,col 81)",
        "(line 220,col 9)-(line 220,col 77)",
        "(line 221,col 9)-(line 221,col 28)",
        "(line 222,col 9)-(line 224,col 9)",
        "(line 227,col 9)-(line 227,col 68)",
        "(line 228,col 9)-(line 228,col 28)",
        "(line 229,col 9)-(line 229,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testReSeed()",
      "begin_line": 232,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 40)",
        "(line 235,col 9)-(line 235,col 42)",
        "(line 236,col 9)-(line 236,col 48)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 42)",
        "(line 241,col 9)-(line 243,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.verifySame(org.apache.commons.math3.random.EmpiricalDistribution, org.apache.commons.math3.random.EmpiricalDistribution)",
      "begin_line": 246,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 58)",
        "(line 248,col 9)-(line 248,col 64)",
        "(line 249,col 9)-(line 249,col 70)",
        "(line 250,col 9)-(line 255,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.tstGen(double)",
      "begin_line": 258,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 40)",
        "(line 260,col 9)-(line 260,col 43)",
        "(line 261,col 9)-(line 261,col 58)",
        "(line 262,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 265,col 82)",
        "(line 266,col 9)-(line 266,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.tstDoubleGen(double)",
      "begin_line": 269,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 47)",
        "(line 271,col 9)-(line 271,col 44)",
        "(line 272,col 9)-(line 272,col 58)",
        "(line 273,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 276,col 83)",
        "(line 277,col 9)-(line 277,col 100)"
      ]
    }
  ]
}