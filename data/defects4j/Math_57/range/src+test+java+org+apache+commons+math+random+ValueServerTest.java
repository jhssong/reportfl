{
  "filepath": "/tmp/Math-57b/src/test/java/org/apache/commons/math/random/ValueServerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ValueServerTest",
      "is_interface": false,
      "parent_types": [
        "RetryTestCase"
      ],
      "begin_line": 31,
      "end_line": 199,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vs"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.ValueServerTest.ValueServerTest(java.lang.String)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.setUp()",
      "begin_line": 39,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 44)",
        "(line 42,col 9)-(line 42,col 57)",
        "(line 43,col 9)-(line 43,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testNextDigest()",
      "begin_line": 51,
      "end_line": 78,
      "comment": "\n      * Generate 1000 random values and make sure they look OK.\u003cbr\u003e\n      * Note that there is a non-zero (but very small) probability that\n      * these tests will fail even if the code is working as designed.\n      ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 26)",
        "(line 53,col 9)-(line 53,col 31)",
        "(line 54,col 9)-(line 54,col 33)",
        "(line 55,col 9)-(line 56,col 51)",
        "(line 57,col 9)-(line 57,col 58)",
        "(line 58,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 62,col 76)",
        "(line 63,col 9)-(line 65,col 23)",
        "(line 67,col 9)-(line 67,col 36)",
        "(line 68,col 9)-(line 68,col 40)",
        "(line 69,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 73,col 76)",
        "(line 74,col 9)-(line 76,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testNextDigestFail()",
      "begin_line": 84,
      "end_line": 89,
      "comment": "\n      * Make sure exception thrown if digest getNext is attempted\n      * before loading empiricalDistribution.\n      ",
      "child_ranges": [
        "(line 85,col 9)-(line 88,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testEmptyReplayFile()",
      "begin_line": 91,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 100,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testEmptyDigestFile()",
      "begin_line": 103,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 112,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testReplay()",
      "begin_line": 120,
      "end_line": 141,
      "comment": "\n     * Test ValueServer REPLAY_MODE using values in testData file.\u003cbr\u003e\n     * Check that the values 1,2,1001,1002 match data file values 1 and 2.\n     * the sample data file.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 50)",
        "(line 122,col 9)-(line 122,col 52)",
        "(line 123,col 9)-(line 123,col 34)",
        "(line 124,col 9)-(line 124,col 35)",
        "(line 125,col 9)-(line 125,col 44)",
        "(line 126,col 9)-(line 126,col 29)",
        "(line 127,col 9)-(line 127,col 36)",
        "(line 128,col 9)-(line 128,col 60)",
        "(line 129,col 9)-(line 129,col 36)",
        "(line 130,col 9)-(line 130,col 61)",
        "(line 131,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 36)",
        "(line 135,col 9)-(line 135,col 60)",
        "(line 136,col 9)-(line 136,col 36)",
        "(line 137,col 9)-(line 137,col 61)",
        "(line 138,col 9)-(line 138,col 29)",
        "(line 140,col 9)-(line 140,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testModes()",
      "begin_line": 146,
      "end_line": 169,
      "comment": "\n     * Test other ValueServer modes\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 46)",
        "(line 148,col 9)-(line 148,col 20)",
        "(line 149,col 9)-(line 149,col 84)",
        "(line 150,col 9)-(line 150,col 45)",
        "(line 151,col 9)-(line 151,col 20)",
        "(line 152,col 9)-(line 152,col 34)",
        "(line 153,col 9)-(line 153,col 39)",
        "(line 154,col 9)-(line 154,col 23)",
        "(line 155,col 9)-(line 155,col 46)",
        "(line 156,col 9)-(line 156,col 27)",
        "(line 157,col 9)-(line 158,col 50)",
        "(line 159,col 9)-(line 159,col 49)",
        "(line 160,col 9)-(line 160,col 27)",
        "(line 161,col 9)-(line 161,col 28)",
        "(line 162,col 9)-(line 168,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testFill()",
      "begin_line": 174,
      "end_line": 186,
      "comment": "\n     * Test fill\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 46)",
        "(line 176,col 9)-(line 176,col 20)",
        "(line 177,col 9)-(line 177,col 37)",
        "(line 178,col 9)-(line 178,col 21)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 33)",
        "(line 183,col 9)-(line 185,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testProperties()",
      "begin_line": 191,
      "end_line": 197,
      "comment": "\n     * Test getters to make Clover happy\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 46)",
        "(line 193,col 9)-(line 193,col 73)",
        "(line 194,col 9)-(line 194,col 53)",
        "(line 195,col 9)-(line 195,col 40)",
        "(line 196,col 9)-(line 196,col 82)"
      ]
    }
  ]
}