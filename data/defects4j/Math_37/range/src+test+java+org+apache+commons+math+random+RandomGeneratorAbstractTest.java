{
  "filepath": "/tmp/Math-37b/src/test/java/org/apache/commons/math/random/RandomGeneratorAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomGeneratorAbstractTest",
      "is_interface": false,
      "parent_types": [
        "RandomDataTest"
      ],
      "begin_line": 44,
      "end_line": 428,
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
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.makeGenerator()",
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Override this method in subclasses to provide a concrete generator to test.\n     * Return a generator seeded with a fixed seed.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.RandomGeneratorAbstractTest()",
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
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.setUp()",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * Set a fixed seed for the tests\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextSecureLongIAE()",
      "begin_line": 72,
      "end_line": 73,
      "comment": " Omit secureXxx tests, since they do not use the provided generator",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextSecureLongNegativeToPositiveRange()",
      "begin_line": 74,
      "end_line": 75,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextSecureLongNegativeRange()",
      "begin_line": 76,
      "end_line": 77,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextSecureLongPositiveRange()",
      "begin_line": 78,
      "end_line": 79,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextSecureIntIAE()",
      "begin_line": 80,
      "end_line": 81,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextSecureIntNegativeToPositiveRange()",
      "begin_line": 82,
      "end_line": 83,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextSecureIntNegativeRange()",
      "begin_line": 84,
      "end_line": 85,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextSecureIntPositiveRange()",
      "begin_line": 86,
      "end_line": 87,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextSecureHex()",
      "begin_line": 88,
      "end_line": 89,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextIntDirect()",
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
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextIntIAE()",
      "begin_line": 164,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextLongDirect()",
      "begin_line": 175,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 35)",
        "(line 178,col 9)-(line 178,col 26)",
        "(line 179,col 9)-(line 179,col 25)",
        "(line 181,col 9)-(line 181,col 41)",
        "(line 182,col 9)-(line 182,col 21)",
        "(line 183,col 9)-(line 183,col 22)",
        "(line 184,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 38)",
        "(line 199,col 9)-(line 201,col 9)",
        "(line 206,col 9)-(line 207,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextBooleanDirect()",
      "begin_line": 210,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 50)",
        "(line 213,col 9)-(line 213,col 61)",
        "(line 214,col 9)-(line 214,col 38)",
        "(line 215,col 9)-(line 221,col 9)",
        "(line 225,col 9)-(line 226,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextFloatDirect()",
      "begin_line": 229,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 41)",
        "(line 232,col 9)-(line 232,col 22)",
        "(line 233,col 9)-(line 233,col 22)",
        "(line 234,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 38)",
        "(line 248,col 9)-(line 250,col 9)",
        "(line 255,col 9)-(line 256,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testDoubleDirect()",
      "begin_line": 259,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 59)",
        "(line 262,col 9)-(line 262,col 28)",
        "(line 263,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 267,col 70)",
        "(line 268,col 9)-(line 269,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testFloatDirect()",
      "begin_line": 272,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 59)",
        "(line 275,col 9)-(line 275,col 27)",
        "(line 276,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 280,col 70)",
        "(line 281,col 9)-(line 282,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextIntNeg()",
      "begin_line": 285,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextInt2()",
      "begin_line": 290,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 21)",
        "(line 293,col 9)-(line 293,col 28)",
        "(line 294,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 303,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextLong2()",
      "begin_line": 306,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 21)",
        "(line 309,col 9)-(line 309,col 27)",
        "(line 310,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 319,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNexBoolean2()",
      "begin_line": 322,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 21)",
        "(line 325,col 9)-(line 325,col 28)",
        "(line 326,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 335,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNexBytes()",
      "begin_line": 338,
      "end_line": 358,
      "comment": "",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 37)",
        "(line 341,col 9)-(line 341,col 36)",
        "(line 342,col 9)-(line 342,col 44)",
        "(line 343,col 9)-(line 343,col 38)",
        "(line 345,col 9)-(line 347,col 9)",
        "(line 349,col 9)-(line 354,col 9)",
        "(line 356,col 9)-(line 356,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testSeeding()",
      "begin_line": 360,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 46)",
        "(line 364,col 9)-(line 364,col 47)",
        "(line 365,col 9)-(line 365,col 37)",
        "(line 368,col 9)-(line 368,col 25)",
        "(line 369,col 9)-(line 369,col 31)",
        "(line 370,col 9)-(line 370,col 26)",
        "(line 371,col 9)-(line 371,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.checkSameSequence(org.apache.commons.math.random.RandomGenerator, org.apache.commons.math.random.RandomGenerator)",
      "begin_line": 374,
      "end_line": 426,
      "comment": "",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 27)",
        "(line 376,col 9)-(line 376,col 53)",
        "(line 377,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 383,col 63)",
        "(line 384,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 390,col 63)",
        "(line 391,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 397,col 63)",
        "(line 398,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 403,col 9)",
        "(line 404,col 9)-(line 404,col 63)",
        "(line 405,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 411,col 63)",
        "(line 412,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 418,col 63)",
        "(line 419,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 425,col 63)"
      ]
    }
  ]
}