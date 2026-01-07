{
  "filepath": "/tmp/Math-98b/src/test/org/apache/commons/math/random/ValueServerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ValueServerTest",
      "is_interface": false,
      "parent_types": [
        "RetryTestCase"
      ],
      "begin_line": 34,
      "end_line": 216,
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
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 44)",
        "(line 44,col 9)-(line 49,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.suite()",
      "begin_line": 52,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 63)",
        "(line 54,col 9)-(line 54,col 43)",
        "(line 55,col 9)-(line 55,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testNextDigest()",
      "begin_line": 64,
      "end_line": 91,
      "comment": " \n      * Generate 1000 random values and make sure they look OK.\u003cbr\u003e\n      * Note that there is a non-zero (but very small) probability that\n      * these tests will fail even if the code is working as designed.\n      ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 26)",
        "(line 66,col 9)-(line 66,col 31)",
        "(line 67,col 9)-(line 67,col 33)",
        "(line 68,col 9)-(line 69,col 51)",
        "(line 70,col 9)-(line 70,col 58)",
        "(line 71,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 76)",
        "(line 76,col 9)-(line 78,col 23)",
        "(line 80,col 9)-(line 80,col 36)",
        "(line 81,col 9)-(line 81,col 40)",
        "(line 82,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 76)",
        "(line 87,col 9)-(line 89,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testNextDigestFail()",
      "begin_line": 97,
      "end_line": 102,
      "comment": "\n      * Make sure exception thrown if digest getNext is attempted\n      * before loading empiricalDistribution.\n      ",
      "child_ranges": [
        "(line 98,col 9)-(line 101,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testEmptyReplayFile()",
      "begin_line": 104,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testEmptyDigestFile()",
      "begin_line": 118,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 129,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testReplay()",
      "begin_line": 137,
      "end_line": 158,
      "comment": "\n     * Test ValueServer REPLAY_MODE using values in testData file.\u003cbr\u003e \n     * Check that the values 1,2,1001,1002 match data file values 1 and 2.\n     * the sample data file.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 50)",
        "(line 139,col 9)-(line 139,col 52)",
        "(line 140,col 9)-(line 140,col 34)",
        "(line 141,col 9)-(line 141,col 35)",
        "(line 142,col 9)-(line 142,col 44)",
        "(line 143,col 9)-(line 143,col 29)",
        "(line 144,col 9)-(line 144,col 36)",
        "(line 145,col 9)-(line 145,col 60)",
        "(line 146,col 9)-(line 146,col 36)",
        "(line 147,col 9)-(line 147,col 61)",
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 36)",
        "(line 152,col 9)-(line 152,col 60)",
        "(line 153,col 9)-(line 153,col 36)",
        "(line 154,col 9)-(line 154,col 61)",
        "(line 155,col 9)-(line 155,col 29)",
        "(line 157,col 9)-(line 157,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testModes()",
      "begin_line": 163,
      "end_line": 186,
      "comment": " \n     * Test other ValueServer modes\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 46)",
        "(line 165,col 9)-(line 165,col 20)",
        "(line 166,col 9)-(line 166,col 84)",
        "(line 167,col 9)-(line 167,col 45)",
        "(line 168,col 9)-(line 168,col 20)",
        "(line 169,col 9)-(line 169,col 34)",
        "(line 170,col 9)-(line 170,col 39)",
        "(line 171,col 9)-(line 171,col 23)",
        "(line 172,col 9)-(line 172,col 46)",
        "(line 173,col 9)-(line 173,col 27)",
        "(line 174,col 9)-(line 175,col 50)",
        "(line 176,col 9)-(line 176,col 49)",
        "(line 177,col 9)-(line 177,col 27)",
        "(line 178,col 9)-(line 178,col 28)",
        "(line 179,col 9)-(line 185,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testFill()",
      "begin_line": 191,
      "end_line": 203,
      "comment": "\n     * Test fill\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 46)",
        "(line 193,col 9)-(line 193,col 20)",
        "(line 194,col 9)-(line 194,col 37)",
        "(line 195,col 9)-(line 195,col 21)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 33)",
        "(line 200,col 9)-(line 202,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testProperties()",
      "begin_line": 208,
      "end_line": 214,
      "comment": "\n     * Test getters to make Clover happy\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 46)",
        "(line 210,col 9)-(line 210,col 73)",
        "(line 211,col 9)-(line 211,col 53)",
        "(line 212,col 9)-(line 212,col 40)",
        "(line 213,col 9)-(line 213,col 82)"
      ]
    }
  ]
}