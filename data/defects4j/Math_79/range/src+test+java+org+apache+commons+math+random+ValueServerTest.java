{
  "filepath": "/tmp/Math-79b/src/test/java/org/apache/commons/math/random/ValueServerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ValueServerTest",
      "is_interface": false,
      "parent_types": [
        "RetryTestCase"
      ],
      "begin_line": 34,
      "end_line": 217,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vs"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.ValueServerTest.ValueServerTest(java.lang.String)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.setUp()",
      "begin_line": 42,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 44)",
        "(line 45,col 9)-(line 50,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.suite()",
      "begin_line": 53,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 63)",
        "(line 55,col 9)-(line 55,col 43)",
        "(line 56,col 9)-(line 56,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testNextDigest()",
      "begin_line": 65,
      "end_line": 92,
      "comment": "\n      * Generate 1000 random values and make sure they look OK.\u003cbr\u003e\n      * Note that there is a non-zero (but very small) probability that\n      * these tests will fail even if the code is working as designed.\n      ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 26)",
        "(line 67,col 9)-(line 67,col 31)",
        "(line 68,col 9)-(line 68,col 33)",
        "(line 69,col 9)-(line 70,col 51)",
        "(line 71,col 9)-(line 71,col 58)",
        "(line 72,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 76)",
        "(line 77,col 9)-(line 79,col 23)",
        "(line 81,col 9)-(line 81,col 36)",
        "(line 82,col 9)-(line 82,col 40)",
        "(line 83,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 76)",
        "(line 88,col 9)-(line 90,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testNextDigestFail()",
      "begin_line": 98,
      "end_line": 103,
      "comment": "\n      * Make sure exception thrown if digest getNext is attempted\n      * before loading empiricalDistribution.\n      ",
      "child_ranges": [
        "(line 99,col 9)-(line 102,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testEmptyReplayFile()",
      "begin_line": 105,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 116,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testEmptyDigestFile()",
      "begin_line": 119,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 130,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testReplay()",
      "begin_line": 138,
      "end_line": 159,
      "comment": "\n     * Test ValueServer REPLAY_MODE using values in testData file.\u003cbr\u003e\n     * Check that the values 1,2,1001,1002 match data file values 1 and 2.\n     * the sample data file.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 50)",
        "(line 140,col 9)-(line 140,col 52)",
        "(line 141,col 9)-(line 141,col 34)",
        "(line 142,col 9)-(line 142,col 35)",
        "(line 143,col 9)-(line 143,col 44)",
        "(line 144,col 9)-(line 144,col 29)",
        "(line 145,col 9)-(line 145,col 36)",
        "(line 146,col 9)-(line 146,col 60)",
        "(line 147,col 9)-(line 147,col 36)",
        "(line 148,col 9)-(line 148,col 61)",
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 36)",
        "(line 153,col 9)-(line 153,col 60)",
        "(line 154,col 9)-(line 154,col 36)",
        "(line 155,col 9)-(line 155,col 61)",
        "(line 156,col 9)-(line 156,col 29)",
        "(line 158,col 9)-(line 158,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testModes()",
      "begin_line": 164,
      "end_line": 187,
      "comment": "\n     * Test other ValueServer modes\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 46)",
        "(line 166,col 9)-(line 166,col 20)",
        "(line 167,col 9)-(line 167,col 84)",
        "(line 168,col 9)-(line 168,col 45)",
        "(line 169,col 9)-(line 169,col 20)",
        "(line 170,col 9)-(line 170,col 34)",
        "(line 171,col 9)-(line 171,col 39)",
        "(line 172,col 9)-(line 172,col 23)",
        "(line 173,col 9)-(line 173,col 46)",
        "(line 174,col 9)-(line 174,col 27)",
        "(line 175,col 9)-(line 176,col 50)",
        "(line 177,col 9)-(line 177,col 49)",
        "(line 178,col 9)-(line 178,col 27)",
        "(line 179,col 9)-(line 179,col 28)",
        "(line 180,col 9)-(line 186,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testFill()",
      "begin_line": 192,
      "end_line": 204,
      "comment": "\n     * Test fill\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 46)",
        "(line 194,col 9)-(line 194,col 20)",
        "(line 195,col 9)-(line 195,col 37)",
        "(line 196,col 9)-(line 196,col 21)",
        "(line 197,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 200,col 33)",
        "(line 201,col 9)-(line 203,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testProperties()",
      "begin_line": 209,
      "end_line": 215,
      "comment": "\n     * Test getters to make Clover happy\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 46)",
        "(line 211,col 9)-(line 211,col 73)",
        "(line 212,col 9)-(line 212,col 53)",
        "(line 213,col 9)-(line 213,col 40)",
        "(line 214,col 9)-(line 214,col 82)"
      ]
    }
  ]
}