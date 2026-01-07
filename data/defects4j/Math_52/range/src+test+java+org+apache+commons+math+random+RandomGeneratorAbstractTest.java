{
  "filepath": "/tmp/Math-52b/src/test/java/org/apache/commons/math/random/RandomGeneratorAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomGeneratorAbstractTest",
      "is_interface": false,
      "parent_types": [
        "RandomDataTest"
      ],
      "begin_line": 42,
      "end_line": 280,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " RandomGenerator under test "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.makeGenerator()",
      "begin_line": 51,
      "end_line": 51,
      "comment": " \n     * Override this method in subclasses to provide a concrete generator to test.  \n     * Return a generator seeded with a fixed seed.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.RandomGeneratorAbstractTest()",
      "begin_line": 56,
      "end_line": 59,
      "comment": "\n     * Initialize generator and randomData instance in superclass.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 36)",
        "(line 58,col 9)-(line 58,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.setUp()",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * Set a fixed seed for the tests\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextSecureLong()",
      "begin_line": 70,
      "end_line": 71,
      "comment": " Omit secureXxx tests, since they do not use the provided generator",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextSecureInt()",
      "begin_line": 73,
      "end_line": 74,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextSecureHex()",
      "begin_line": 76,
      "end_line": 77,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextIntDirect()",
      "begin_line": 79,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 41)",
        "(line 88,col 9)-(line 88,col 22)",
        "(line 89,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 38)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 102,col 9)-(line 103,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextLongDirect()",
      "begin_line": 106,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 35)",
        "(line 109,col 9)-(line 109,col 26)",
        "(line 110,col 9)-(line 110,col 25)",
        "(line 112,col 9)-(line 112,col 41)",
        "(line 113,col 9)-(line 113,col 21)",
        "(line 114,col 9)-(line 114,col 22)",
        "(line 115,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 38)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 137,col 9)-(line 138,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextBooleanDirect()",
      "begin_line": 141,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 50)",
        "(line 144,col 9)-(line 144,col 61)",
        "(line 145,col 9)-(line 145,col 38)",
        "(line 146,col 9)-(line 152,col 9)",
        "(line 156,col 9)-(line 157,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextFloatDirect()",
      "begin_line": 160,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 41)",
        "(line 163,col 9)-(line 163,col 22)",
        "(line 164,col 9)-(line 164,col 22)",
        "(line 165,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 38)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 186,col 9)-(line 187,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testDoubleDirect()",
      "begin_line": 190,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 59)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 57)",
        "(line 197,col 9)-(line 199,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testFloatDirect()",
      "begin_line": 202,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 59)",
        "(line 205,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 208,col 57)",
        "(line 209,col 9)-(line 211,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextIntNeg()",
      "begin_line": 214,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextInt2()",
      "begin_line": 219,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 21)",
        "(line 222,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNextLong2()",
      "begin_line": 232,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 21)",
        "(line 235,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 242,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNexBoolean2()",
      "begin_line": 245,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 21)",
        "(line 248,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGeneratorAbstractTest.testNexBytes()",
      "begin_line": 258,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 37)",
        "(line 261,col 9)-(line 261,col 36)",
        "(line 262,col 9)-(line 262,col 44)",
        "(line 263,col 9)-(line 263,col 38)",
        "(line 265,col 9)-(line 267,col 9)",
        "(line 269,col 9)-(line 274,col 9)",
        "(line 276,col 9)-(line 276,col 64)"
      ]
    }
  ]
}