{
  "filepath": "/tmp/Math-42b/src/test/java/org/apache/commons/math/random/RandomGeneratorAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomGeneratorAbstractTest",
      "is_interface": false,
      "parent_types": [
        "RandomDataTest"
      ],
      "begin_line": 44,
      "end_line": 339,
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
      "comment": " \n     * Override this method in subclasses to provide a concrete generator to test.  \n     * Return a generator seeded with a fixed seed.\n     ",
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
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextSecureLong()",
      "begin_line": 72,
      "end_line": 73,
      "comment": " Omit secureXxx tests, since they do not use the provided generator",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextSecureInt()",
      "begin_line": 75,
      "end_line": 76,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextSecureHex()",
      "begin_line": 78,
      "end_line": 79,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextIntDirect()",
      "begin_line": 81,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 77)",
        "(line 97,col 9)-(line 100,col 9)",
        "(line 102,col 9)-(line 102,col 34)",
        "(line 103,col 9)-(line 151,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextIntIAE()",
      "begin_line": 154,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextLongDirect()",
      "begin_line": 165,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 35)",
        "(line 168,col 9)-(line 168,col 26)",
        "(line 169,col 9)-(line 169,col 25)",
        "(line 171,col 9)-(line 171,col 41)",
        "(line 172,col 9)-(line 172,col 21)",
        "(line 173,col 9)-(line 173,col 22)",
        "(line 174,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 38)",
        "(line 189,col 9)-(line 191,col 9)",
        "(line 196,col 9)-(line 197,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextBooleanDirect()",
      "begin_line": 200,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 50)",
        "(line 203,col 9)-(line 203,col 61)",
        "(line 204,col 9)-(line 204,col 38)",
        "(line 205,col 9)-(line 211,col 9)",
        "(line 215,col 9)-(line 216,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextFloatDirect()",
      "begin_line": 219,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 41)",
        "(line 222,col 9)-(line 222,col 22)",
        "(line 223,col 9)-(line 223,col 22)",
        "(line 224,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 237,col 38)",
        "(line 238,col 9)-(line 240,col 9)",
        "(line 245,col 9)-(line 246,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testDoubleDirect()",
      "begin_line": 249,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 59)",
        "(line 252,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 57)",
        "(line 256,col 9)-(line 258,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testFloatDirect()",
      "begin_line": 261,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 59)",
        "(line 264,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 267,col 57)",
        "(line 268,col 9)-(line 270,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextIntNeg()",
      "begin_line": 273,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextInt2()",
      "begin_line": 278,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 21)",
        "(line 281,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextLong2()",
      "begin_line": 291,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 21)",
        "(line 294,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 301,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNexBoolean2()",
      "begin_line": 304,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 21)",
        "(line 307,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 314,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNexBytes()",
      "begin_line": 317,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 37)",
        "(line 320,col 9)-(line 320,col 36)",
        "(line 321,col 9)-(line 321,col 44)",
        "(line 322,col 9)-(line 322,col 38)",
        "(line 324,col 9)-(line 326,col 9)",
        "(line 328,col 9)-(line 333,col 9)",
        "(line 335,col 9)-(line 335,col 64)"
      ]
    }
  ]
}