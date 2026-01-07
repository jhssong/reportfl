{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/random/RandomGeneratorAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomGeneratorAbstractTest",
      "is_interface": false,
      "parent_types": [
        "RandomDataGeneratorTest"
      ],
      "begin_line": 44,
      "end_line": 432,
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
        "(line 60,col 9)-(line 60,col 56)"
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
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextIntIAE2()",
      "begin_line": 164,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 176,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextLongDirect()",
      "begin_line": 179,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 35)",
        "(line 182,col 9)-(line 182,col 26)",
        "(line 183,col 9)-(line 183,col 25)",
        "(line 185,col 9)-(line 185,col 41)",
        "(line 186,col 9)-(line 186,col 21)",
        "(line 187,col 9)-(line 187,col 22)",
        "(line 188,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 38)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 210,col 9)-(line 211,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextBooleanDirect()",
      "begin_line": 214,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 50)",
        "(line 217,col 9)-(line 217,col 61)",
        "(line 218,col 9)-(line 218,col 38)",
        "(line 219,col 9)-(line 225,col 9)",
        "(line 229,col 9)-(line 230,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextFloatDirect()",
      "begin_line": 233,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 41)",
        "(line 236,col 9)-(line 236,col 22)",
        "(line 237,col 9)-(line 237,col 22)",
        "(line 238,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 38)",
        "(line 252,col 9)-(line 254,col 9)",
        "(line 259,col 9)-(line 260,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testDoubleDirect()",
      "begin_line": 263,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 59)",
        "(line 266,col 9)-(line 266,col 28)",
        "(line 267,col 9)-(line 269,col 9)",
        "(line 270,col 9)-(line 271,col 70)",
        "(line 272,col 9)-(line 273,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testFloatDirect()",
      "begin_line": 276,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 59)",
        "(line 279,col 9)-(line 279,col 27)",
        "(line 280,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 284,col 70)",
        "(line 285,col 9)-(line 286,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextIntNeg()",
      "begin_line": 289,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextInt2()",
      "begin_line": 294,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 21)",
        "(line 297,col 9)-(line 297,col 28)",
        "(line 298,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 307,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextLong2()",
      "begin_line": 310,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 21)",
        "(line 313,col 9)-(line 313,col 27)",
        "(line 314,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 323,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNexBoolean2()",
      "begin_line": 326,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 21)",
        "(line 329,col 9)-(line 329,col 28)",
        "(line 330,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 339,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNexBytes()",
      "begin_line": 342,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 37)",
        "(line 345,col 9)-(line 345,col 36)",
        "(line 346,col 9)-(line 346,col 44)",
        "(line 347,col 9)-(line 347,col 38)",
        "(line 349,col 9)-(line 351,col 9)",
        "(line 353,col 9)-(line 358,col 9)",
        "(line 360,col 9)-(line 360,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.testSeeding()",
      "begin_line": 364,
      "end_line": 376,
      "comment": "",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 46)",
        "(line 368,col 9)-(line 368,col 47)",
        "(line 369,col 9)-(line 369,col 37)",
        "(line 372,col 9)-(line 372,col 25)",
        "(line 373,col 9)-(line 373,col 31)",
        "(line 374,col 9)-(line 374,col 26)",
        "(line 375,col 9)-(line 375,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorAbstractTest.checkSameSequence(org.apache.commons.math3.random.RandomGenerator, org.apache.commons.math3.random.RandomGenerator)",
      "begin_line": 378,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 27)",
        "(line 380,col 9)-(line 380,col 53)",
        "(line 381,col 9)-(line 383,col 9)",
        "(line 384,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 387,col 63)",
        "(line 388,col 9)-(line 390,col 9)",
        "(line 391,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 394,col 63)",
        "(line 395,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 401,col 63)",
        "(line 402,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 408,col 63)",
        "(line 409,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 415,col 63)",
        "(line 416,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 63)",
        "(line 423,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 428,col 9)",
        "(line 429,col 9)-(line 429,col 63)"
      ]
    }
  ]
}