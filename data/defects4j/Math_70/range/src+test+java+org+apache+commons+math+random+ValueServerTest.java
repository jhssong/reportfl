{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/random/ValueServerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ValueServerTest",
      "is_interface": false,
      "parent_types": [
        "RetryTestCase"
      ],
      "begin_line": 31,
      "end_line": 207,
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
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 44)",
        "(line 42,col 9)-(line 47,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testNextDigest()",
      "begin_line": 55,
      "end_line": 82,
      "comment": "\n      * Generate 1000 random values and make sure they look OK.\u003cbr\u003e\n      * Note that there is a non-zero (but very small) probability that\n      * these tests will fail even if the code is working as designed.\n      ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 26)",
        "(line 57,col 9)-(line 57,col 31)",
        "(line 58,col 9)-(line 58,col 33)",
        "(line 59,col 9)-(line 60,col 51)",
        "(line 61,col 9)-(line 61,col 58)",
        "(line 62,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 66,col 76)",
        "(line 67,col 9)-(line 69,col 23)",
        "(line 71,col 9)-(line 71,col 36)",
        "(line 72,col 9)-(line 72,col 40)",
        "(line 73,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 76)",
        "(line 78,col 9)-(line 80,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testNextDigestFail()",
      "begin_line": 88,
      "end_line": 93,
      "comment": "\n      * Make sure exception thrown if digest getNext is attempted\n      * before loading empiricalDistribution.\n      ",
      "child_ranges": [
        "(line 89,col 9)-(line 92,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testEmptyReplayFile()",
      "begin_line": 95,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 106,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testEmptyDigestFile()",
      "begin_line": 109,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 120,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testReplay()",
      "begin_line": 128,
      "end_line": 149,
      "comment": "\n     * Test ValueServer REPLAY_MODE using values in testData file.\u003cbr\u003e\n     * Check that the values 1,2,1001,1002 match data file values 1 and 2.\n     * the sample data file.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 50)",
        "(line 130,col 9)-(line 130,col 52)",
        "(line 131,col 9)-(line 131,col 34)",
        "(line 132,col 9)-(line 132,col 35)",
        "(line 133,col 9)-(line 133,col 44)",
        "(line 134,col 9)-(line 134,col 29)",
        "(line 135,col 9)-(line 135,col 36)",
        "(line 136,col 9)-(line 136,col 60)",
        "(line 137,col 9)-(line 137,col 36)",
        "(line 138,col 9)-(line 138,col 61)",
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 36)",
        "(line 143,col 9)-(line 143,col 60)",
        "(line 144,col 9)-(line 144,col 36)",
        "(line 145,col 9)-(line 145,col 61)",
        "(line 146,col 9)-(line 146,col 29)",
        "(line 148,col 9)-(line 148,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testModes()",
      "begin_line": 154,
      "end_line": 177,
      "comment": "\n     * Test other ValueServer modes\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 46)",
        "(line 156,col 9)-(line 156,col 20)",
        "(line 157,col 9)-(line 157,col 84)",
        "(line 158,col 9)-(line 158,col 45)",
        "(line 159,col 9)-(line 159,col 20)",
        "(line 160,col 9)-(line 160,col 34)",
        "(line 161,col 9)-(line 161,col 39)",
        "(line 162,col 9)-(line 162,col 23)",
        "(line 163,col 9)-(line 163,col 46)",
        "(line 164,col 9)-(line 164,col 27)",
        "(line 165,col 9)-(line 166,col 50)",
        "(line 167,col 9)-(line 167,col 49)",
        "(line 168,col 9)-(line 168,col 27)",
        "(line 169,col 9)-(line 169,col 28)",
        "(line 170,col 9)-(line 176,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testFill()",
      "begin_line": 182,
      "end_line": 194,
      "comment": "\n     * Test fill\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 46)",
        "(line 184,col 9)-(line 184,col 20)",
        "(line 185,col 9)-(line 185,col 37)",
        "(line 186,col 9)-(line 186,col 21)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 33)",
        "(line 191,col 9)-(line 193,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testProperties()",
      "begin_line": 199,
      "end_line": 205,
      "comment": "\n     * Test getters to make Clover happy\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 46)",
        "(line 201,col 9)-(line 201,col 73)",
        "(line 202,col 9)-(line 202,col 53)",
        "(line 203,col 9)-(line 203,col 40)",
        "(line 204,col 9)-(line 204,col 82)"
      ]
    }
  ]
}