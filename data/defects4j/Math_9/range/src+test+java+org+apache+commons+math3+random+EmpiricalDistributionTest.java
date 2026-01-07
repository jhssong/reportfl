{
  "filepath": "/tmp/Math-9b/src/test/java/org/apache/commons/math3/random/EmpiricalDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmpiricalDistributionTest",
      "is_interface": false,
      "parent_types": [
        "RealDistributionAbstractTest"
      ],
      "begin_line": 45,
      "end_line": 431,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "empiricalDistribution"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "empiricalDistribution2"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "url"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dataArray"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.setUp()",
      "begin_line": 54,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 22)",
        "(line 57,col 9)-(line 57,col 63)",
        "(line 59,col 9)-(line 59,col 53)",
        "(line 60,col 9)-(line 60,col 63)",
        "(line 61,col 9)-(line 75,col 9)",
        "(line 77,col 9)-(line 77,col 44)",
        "(line 78,col 9)-(line 78,col 18)",
        "(line 79,col 9)-(line 82,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testLoad()",
      "begin_line": 90,
      "end_line": 100,
      "comment": "\n     * Test EmpiricalDistrbution.load() using sample data file.\u003cbr\u003e\n     * Check that the sampleCount, mu and sigma match data in\n     * the sample data file. Also verify that load is idempotent.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 40)",
        "(line 94,col 9)-(line 94,col 28)",
        "(line 97,col 9)-(line 97,col 44)",
        "(line 98,col 9)-(line 98,col 41)",
        "(line 99,col 9)-(line 99,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.checkDistribution()",
      "begin_line": 102,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 86)",
        "(line 107,col 9)-(line 108,col 41)",
        "(line 109,col 9)-(line 110,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testDoubleLoad()",
      "begin_line": 119,
      "end_line": 135,
      "comment": "\n     * Test EmpiricalDistrbution.load(double[]) using data taken from\n     * sample data file.\u003cbr\u003e\n     * Check that the sampleCount, mu and sigma match data in\n     * the sample data file.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 47)",
        "(line 124,col 9)-(line 124,col 87)",
        "(line 126,col 9)-(line 127,col 41)",
        "(line 128,col 9)-(line 129,col 42)",
        "(line 131,col 9)-(line 131,col 75)",
        "(line 132,col 9)-(line 132,col 48)",
        "(line 133,col 9)-(line 133,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testNext()",
      "begin_line": 142,
      "end_line": 146,
      "comment": "\n      * Generate 1000 random values and make sure they look OK.\u003cbr\u003e\n      * Note that there is a non-zero (but very small) probability that\n      * these tests will fail even if the code is working as designed.\n      ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 20)",
        "(line 145,col 9)-(line 145,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testNexFail()",
      "begin_line": 152,
      "end_line": 161,
      "comment": "\n      * Make sure exception thrown if digest getNext is attempted\n      * before loading empiricalDistribution.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 160,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testGridTooFine()",
      "begin_line": 166,
      "end_line": 172,
      "comment": "\n     * Make sure we can handle a grid size that is too fine\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 64)",
        "(line 169,col 9)-(line 169,col 20)",
        "(line 170,col 9)-(line 170,col 65)",
        "(line 171,col 9)-(line 171,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testGridTooFat()",
      "begin_line": 177,
      "end_line": 184,
      "comment": "\n     * How about too fat?\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 61)",
        "(line 180,col 9)-(line 180,col 18)",
        "(line 182,col 9)-(line 182,col 62)",
        "(line 183,col 9)-(line 183,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testBinIndexOverflow()",
      "begin_line": 189,
      "end_line": 193,
      "comment": "\n     * Test bin index overflow problem (BZ 36450)\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 73)",
        "(line 192,col 9)-(line 192,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testSerialization()",
      "begin_line": 195,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 65)",
        "(line 199,col 9)-(line 199,col 98)",
        "(line 200,col 9)-(line 200,col 32)",
        "(line 203,col 9)-(line 203,col 47)",
        "(line 204,col 9)-(line 204,col 94)",
        "(line 205,col 9)-(line 205,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testLoadNullDoubleArray()",
      "begin_line": 208,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 210,col 8)-(line 210,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testLoadNullURL()",
      "begin_line": 213,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testLoadNullFile()",
      "begin_line": 218,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testGetBinUpperBounds()",
      "begin_line": 226,
      "end_line": 236,
      "comment": "\n     * MATH-298\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 69)",
        "(line 229,col 9)-(line 229,col 66)",
        "(line 230,col 9)-(line 230,col 28)",
        "(line 231,col 9)-(line 231,col 59)",
        "(line 232,col 9)-(line 232,col 85)",
        "(line 233,col 9)-(line 233,col 28)",
        "(line 234,col 9)-(line 234,col 83)",
        "(line 235,col 9)-(line 235,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testGeneratorConfig()",
      "begin_line": 238,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 44)",
        "(line 241,col 9)-(line 241,col 81)",
        "(line 243,col 9)-(line 243,col 77)",
        "(line 244,col 9)-(line 244,col 28)",
        "(line 245,col 9)-(line 247,col 9)",
        "(line 250,col 9)-(line 250,col 68)",
        "(line 251,col 9)-(line 251,col 28)",
        "(line 252,col 9)-(line 252,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testReSeed()",
      "begin_line": 255,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 40)",
        "(line 258,col 9)-(line 258,col 42)",
        "(line 259,col 9)-(line 259,col 48)",
        "(line 260,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 42)",
        "(line 264,col 9)-(line 266,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.verifySame(org.apache.commons.math3.random.EmpiricalDistribution, org.apache.commons.math3.random.EmpiricalDistribution)",
      "begin_line": 269,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 58)",
        "(line 271,col 9)-(line 271,col 64)",
        "(line 272,col 9)-(line 272,col 70)",
        "(line 273,col 9)-(line 278,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.tstGen(double)",
      "begin_line": 281,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 40)",
        "(line 283,col 9)-(line 283,col 43)",
        "(line 284,col 9)-(line 284,col 58)",
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 82)",
        "(line 289,col 9)-(line 289,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.tstDoubleGen(double)",
      "begin_line": 292,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 47)",
        "(line 294,col 9)-(line 294,col 44)",
        "(line 295,col 9)-(line 295,col 58)",
        "(line 296,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 299,col 83)",
        "(line 300,col 9)-(line 300,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.makeDistribution()",
      "begin_line": 305,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 54)",
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 65)",
        "(line 313,col 9)-(line 313,col 30)",
        "(line 314,col 9)-(line 314,col 20)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "binMass"
      ],
      "begin_line": 318,
      "end_line": 318,
      "comment": " Uniform bin mass \u003d 10/10001 \u003d\u003d mass of all but the first bin "
    },
    {
      "type": "field",
      "varNames": [
        "firstBinMass"
      ],
      "begin_line": 321,
      "end_line": 321,
      "comment": " Mass of first bin \u003d 11/10001 "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.makeCumulativeTestPoints()",
      "begin_line": 323,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 325,col 8)-(line 325,col 78)",
        "(line 326,col 8)-(line 326,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.makeCumulativeTestValues()",
      "begin_line": 330,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 62)",
        "(line 338,col 9)-(line 338,col 65)",
        "(line 339,col 9)-(line 339,col 103)",
        "(line 340,col 9)-(line 340,col 74)",
        "(line 341,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 354,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.makeDensityTestValues()",
      "begin_line": 357,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 62)",
        "(line 360,col 9)-(line 360,col 69)",
        "(line 361,col 9)-(line 361,col 103)",
        "(line 362,col 9)-(line 362,col 74)",
        "(line 363,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 373,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testDensityIntegrals()",
      "begin_line": 382,
      "end_line": 404,
      "comment": " \n     * Modify test integration bounds from the default. Because the distribution\n     * has discontinuities at bin boundaries, integrals spanning multiple bins\n     * will face convergence problems.  Only test within-bin integrals and spans\n     * across no more than 3 bin boundaries.\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 65)",
        "(line 386,col 9)-(line 386,col 34)",
        "(line 387,col 9)-(line 388,col 70)",
        "(line 389,col 9)-(line 393,col 10)",
        "(line 394,col 9)-(line 394,col 56)",
        "(line 395,col 9)-(line 395,col 58)",
        "(line 396,col 9)-(line 403,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.Anonymous-1f3c6cf9-56d8-4a0f-ac20-484173891d8a.value(double)",
      "begin_line": 390,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 391,col 17)-(line 391,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.findBin(double)",
      "begin_line": 409,
      "end_line": 415,
      "comment": "\n     * Find the bin that x belongs (relative to {@link #makeDistribution()}).\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 49)",
        "(line 412,col 9)-(line 412,col 50)",
        "(line 414,col 9)-(line 414,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.findKernel(double, double)",
      "begin_line": 424,
      "end_line": 430,
      "comment": "\n     * Find the within-bin kernel for the bin with lower bound lower\n     * and upper bound upper. All bins other than the first contain 10 points\n     * exclusive of the lower bound and are centered at (lower + upper + 1) / 2.\n     * The first bin includes its lower bound, 0, so has different mean and\n     * standard deviation.\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 429,col 9)"
      ]
    }
  ]
}