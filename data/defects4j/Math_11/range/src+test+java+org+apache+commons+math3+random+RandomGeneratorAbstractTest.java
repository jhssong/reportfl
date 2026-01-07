{
  "filepath": "/tmp/Math-11b/src/test/java/org/apache/commons/math3/random/RandomGeneratorAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomGeneratorAbstractTest",
      "is_interface": false,
      "parent_types": [
        "RandomDataTest"
      ],
      "begin_line": 44,
      "end_line": 429,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " RandomGenerator under test "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.makeGenerator()",
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Override this method in subclasses to provide a concrete generator to test.\n     * Return a generator seeded with a fixed seed.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.RandomGeneratorAbstractTest()",
      "begin_line": 58,
      "end_line": 61,
      "comment": "\n     * Initialize generator and randomData instance in superclass.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 36)",
        "(line 60,col 9)-(line 60,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.setUp()",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * Set a fixed seed for the tests\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextSecureLongIAE()",
      "begin_line": 72,
      "end_line": 73,
      "comment": " Omit secureXxx tests, since they do not use the provided generator",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextSecureLongNegativeToPositiveRange()",
      "begin_line": 74,
      "end_line": 75,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextSecureLongNegativeRange()",
      "begin_line": 76,
      "end_line": 77,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextSecureLongPositiveRange()",
      "begin_line": 78,
      "end_line": 79,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextSecureIntIAE()",
      "begin_line": 80,
      "end_line": 81,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextSecureIntNegativeToPositiveRange()",
      "begin_line": 82,
      "end_line": 83,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextSecureIntNegativeRange()",
      "begin_line": 84,
      "end_line": 85,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextSecureIntPositiveRange()",
      "begin_line": 86,
      "end_line": 87,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextSecureHex()",
      "begin_line": 88,
      "end_line": 89,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextIntDirect()",
      "begin_line": 91,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 77)",
        "(line 107,col 9)-(line 110,col 9)",
        "(line 112,col 9)-(line 112,col 34)",
        "(line 113,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextIntIAE()",
      "begin_line": 164,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 167,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextLongDirect()",
      "begin_line": 176,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 35)",
        "(line 179,col 9)-(line 179,col 26)",
        "(line 180,col 9)-(line 180,col 25)",
        "(line 182,col 9)-(line 182,col 41)",
        "(line 183,col 9)-(line 183,col 21)",
        "(line 184,col 9)-(line 184,col 22)",
        "(line 185,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 38)",
        "(line 200,col 9)-(line 202,col 9)",
        "(line 207,col 9)-(line 208,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextBooleanDirect()",
      "begin_line": 211,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 50)",
        "(line 214,col 9)-(line 214,col 61)",
        "(line 215,col 9)-(line 215,col 38)",
        "(line 216,col 9)-(line 222,col 9)",
        "(line 226,col 9)-(line 227,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextFloatDirect()",
      "begin_line": 230,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 41)",
        "(line 233,col 9)-(line 233,col 22)",
        "(line 234,col 9)-(line 234,col 22)",
        "(line 235,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 248,col 38)",
        "(line 249,col 9)-(line 251,col 9)",
        "(line 256,col 9)-(line 257,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testDoubleDirect()",
      "begin_line": 260,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 59)",
        "(line 263,col 9)-(line 263,col 28)",
        "(line 264,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 268,col 70)",
        "(line 269,col 9)-(line 270,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testFloatDirect()",
      "begin_line": 273,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 59)",
        "(line 276,col 9)-(line 276,col 27)",
        "(line 277,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 281,col 70)",
        "(line 282,col 9)-(line 283,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextIntNeg()",
      "begin_line": 286,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextInt2()",
      "begin_line": 291,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 21)",
        "(line 294,col 9)-(line 294,col 28)",
        "(line 295,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 304,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextLong2()",
      "begin_line": 307,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 21)",
        "(line 310,col 9)-(line 310,col 27)",
        "(line 311,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 320,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNexBoolean2()",
      "begin_line": 323,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 21)",
        "(line 326,col 9)-(line 326,col 28)",
        "(line 327,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 336,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNexBytes()",
      "begin_line": 339,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 37)",
        "(line 342,col 9)-(line 342,col 36)",
        "(line 343,col 9)-(line 343,col 44)",
        "(line 344,col 9)-(line 344,col 38)",
        "(line 346,col 9)-(line 348,col 9)",
        "(line 350,col 9)-(line 355,col 9)",
        "(line 357,col 9)-(line 357,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testSeeding()",
      "begin_line": 361,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 46)",
        "(line 365,col 9)-(line 365,col 47)",
        "(line 366,col 9)-(line 366,col 37)",
        "(line 369,col 9)-(line 369,col 25)",
        "(line 370,col 9)-(line 370,col 31)",
        "(line 371,col 9)-(line 371,col 26)",
        "(line 372,col 9)-(line 372,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.checkSameSequence(org.apache.commons.math3.random.RandomGenerator, org.apache.commons.math3.random.RandomGenerator)",
      "begin_line": 375,
      "end_line": 427,
      "comment": "",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 27)",
        "(line 377,col 9)-(line 377,col 53)",
        "(line 378,col 9)-(line 380,col 9)",
        "(line 381,col 9)-(line 383,col 9)",
        "(line 384,col 9)-(line 384,col 63)",
        "(line 385,col 9)-(line 387,col 9)",
        "(line 388,col 9)-(line 390,col 9)",
        "(line 391,col 9)-(line 391,col 63)",
        "(line 392,col 9)-(line 394,col 9)",
        "(line 395,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 398,col 63)",
        "(line 399,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 405,col 63)",
        "(line 406,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 412,col 63)",
        "(line 413,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 419,col 63)",
        "(line 420,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 426,col 63)"
      ]
    }
  ]
}