{
  "filepath": "/tmp/Math-16b/src/test/java/org/apache/commons/math3/random/EmpiricalDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmpiricalDistributionTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 289,
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
      "end_line": 87,
      "comment": "\n     * Test EmpiricalDistrbution.load() using sample data file.\u003cbr\u003e\n     * Check that the sampleCount, mu and sigma match data in\n     * the sample data file. Also verify that load is idempotent.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 40)",
        "(line 81,col 9)-(line 81,col 28)",
        "(line 84,col 9)-(line 84,col 44)",
        "(line 85,col 9)-(line 85,col 41)",
        "(line 86,col 9)-(line 86,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.checkDistribution()",
      "begin_line": 89,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 86)",
        "(line 94,col 9)-(line 95,col 41)",
        "(line 96,col 9)-(line 97,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testDoubleLoad()",
      "begin_line": 106,
      "end_line": 122,
      "comment": "\n     * Test EmpiricalDistrbution.load(double[]) using data taken from\n     * sample data file.\u003cbr\u003e\n     * Check that the sampleCount, mu and sigma match data in\n     * the sample data file.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 47)",
        "(line 111,col 9)-(line 111,col 87)",
        "(line 113,col 9)-(line 114,col 41)",
        "(line 115,col 9)-(line 116,col 42)",
        "(line 118,col 9)-(line 118,col 75)",
        "(line 119,col 9)-(line 119,col 48)",
        "(line 120,col 9)-(line 120,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testNext()",
      "begin_line": 129,
      "end_line": 133,
      "comment": "\n      * Generate 1000 random values and make sure they look OK.\u003cbr\u003e\n      * Note that there is a non-zero (but very small) probability that\n      * these tests will fail even if the code is working as designed.\n      ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 20)",
        "(line 132,col 9)-(line 132,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testNexFail()",
      "begin_line": 139,
      "end_line": 148,
      "comment": "\n      * Make sure exception thrown if digest getNext is attempted\n      * before loading empiricalDistribution.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 147,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testGridTooFine()",
      "begin_line": 153,
      "end_line": 159,
      "comment": "\n     * Make sure we can handle a grid size that is too fine\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 64)",
        "(line 156,col 9)-(line 156,col 20)",
        "(line 157,col 9)-(line 157,col 65)",
        "(line 158,col 9)-(line 158,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testGridTooFat()",
      "begin_line": 164,
      "end_line": 171,
      "comment": "\n     * How about too fat?\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 61)",
        "(line 167,col 9)-(line 167,col 18)",
        "(line 169,col 9)-(line 169,col 62)",
        "(line 170,col 9)-(line 170,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testBinIndexOverflow()",
      "begin_line": 176,
      "end_line": 180,
      "comment": "\n     * Test bin index overflow problem (BZ 36450)\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 73)",
        "(line 179,col 9)-(line 179,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testSerialization()",
      "begin_line": 182,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 65)",
        "(line 186,col 9)-(line 186,col 98)",
        "(line 187,col 9)-(line 187,col 32)",
        "(line 190,col 9)-(line 190,col 47)",
        "(line 191,col 9)-(line 191,col 94)",
        "(line 192,col 9)-(line 192,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testLoadNullDoubleArray()",
      "begin_line": 195,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 197,col 8)-(line 197,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testLoadNullURL()",
      "begin_line": 200,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testLoadNullFile()",
      "begin_line": 205,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testGetBinUpperBounds()",
      "begin_line": 213,
      "end_line": 223,
      "comment": "\n     * MATH-298\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 69)",
        "(line 216,col 9)-(line 216,col 66)",
        "(line 217,col 9)-(line 217,col 28)",
        "(line 218,col 9)-(line 218,col 59)",
        "(line 219,col 9)-(line 219,col 85)",
        "(line 220,col 9)-(line 220,col 28)",
        "(line 221,col 9)-(line 221,col 83)",
        "(line 222,col 9)-(line 222,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testGeneratorConfig()",
      "begin_line": 225,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 44)",
        "(line 228,col 9)-(line 228,col 81)",
        "(line 230,col 9)-(line 230,col 77)",
        "(line 231,col 9)-(line 231,col 28)",
        "(line 232,col 9)-(line 234,col 9)",
        "(line 237,col 9)-(line 237,col 68)",
        "(line 238,col 9)-(line 238,col 28)",
        "(line 239,col 9)-(line 239,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testReSeed()",
      "begin_line": 242,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 40)",
        "(line 245,col 9)-(line 245,col 42)",
        "(line 246,col 9)-(line 246,col 48)",
        "(line 247,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 42)",
        "(line 251,col 9)-(line 253,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.verifySame(org.apache.commons.math3.random.EmpiricalDistribution, org.apache.commons.math3.random.EmpiricalDistribution)",
      "begin_line": 256,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 58)",
        "(line 258,col 9)-(line 258,col 64)",
        "(line 259,col 9)-(line 259,col 70)",
        "(line 260,col 9)-(line 265,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.tstGen(double)",
      "begin_line": 268,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 40)",
        "(line 270,col 9)-(line 270,col 43)",
        "(line 271,col 9)-(line 271,col 58)",
        "(line 272,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 82)",
        "(line 276,col 9)-(line 276,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.tstDoubleGen(double)",
      "begin_line": 279,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 47)",
        "(line 281,col 9)-(line 281,col 44)",
        "(line 282,col 9)-(line 282,col 58)",
        "(line 283,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 286,col 83)",
        "(line 287,col 9)-(line 287,col 100)"
      ]
    }
  ]
}