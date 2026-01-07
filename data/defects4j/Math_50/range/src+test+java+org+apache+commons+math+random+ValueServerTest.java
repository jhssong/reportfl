{
  "filepath": "/tmp/Math-50b/src/test/java/org/apache/commons/math/random/ValueServerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ValueServerTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 206,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vs"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.setUp()",
      "begin_line": 40,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 44)",
        "(line 43,col 9)-(line 43,col 57)",
        "(line 44,col 9)-(line 44,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testNextDigest()",
      "begin_line": 52,
      "end_line": 78,
      "comment": "\n      * Generate 1000 random values and make sure they look OK.\u003cbr\u003e\n      * Note that there is a non-zero (but very small) probability that\n      * these tests will fail even if the code is working as designed.\n      ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 26)",
        "(line 55,col 9)-(line 55,col 31)",
        "(line 56,col 9)-(line 56,col 33)",
        "(line 57,col 9)-(line 58,col 51)",
        "(line 59,col 9)-(line 59,col 58)",
        "(line 60,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 83)",
        "(line 65,col 9)-(line 66,col 23)",
        "(line 68,col 9)-(line 68,col 36)",
        "(line 69,col 9)-(line 69,col 40)",
        "(line 70,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 74,col 83)",
        "(line 75,col 9)-(line 76,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testNextDigestFail()",
      "begin_line": 84,
      "end_line": 90,
      "comment": "\n      * Make sure exception thrown if digest getNext is attempted\n      * before loading empiricalDistribution.\n      ",
      "child_ranges": [
        "(line 86,col 9)-(line 89,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testEmptyReplayFile()",
      "begin_line": 92,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 102,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testEmptyDigestFile()",
      "begin_line": 105,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testReplay()",
      "begin_line": 123,
      "end_line": 145,
      "comment": "\n     * Test ValueServer REPLAY_MODE using values in testData file.\u003cbr\u003e\n     * Check that the values 1,2,1001,1002 match data file values 1 and 2.\n     * the sample data file.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 50)",
        "(line 126,col 9)-(line 126,col 52)",
        "(line 127,col 9)-(line 127,col 34)",
        "(line 128,col 9)-(line 128,col 35)",
        "(line 129,col 9)-(line 129,col 44)",
        "(line 130,col 9)-(line 130,col 29)",
        "(line 131,col 9)-(line 131,col 36)",
        "(line 132,col 9)-(line 132,col 67)",
        "(line 133,col 9)-(line 133,col 36)",
        "(line 134,col 9)-(line 134,col 68)",
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 36)",
        "(line 139,col 9)-(line 139,col 67)",
        "(line 140,col 9)-(line 140,col 36)",
        "(line 141,col 9)-(line 141,col 68)",
        "(line 142,col 9)-(line 142,col 29)",
        "(line 144,col 9)-(line 144,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testModes()",
      "begin_line": 150,
      "end_line": 174,
      "comment": "\n     * Test other ValueServer modes\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 46)",
        "(line 153,col 9)-(line 153,col 20)",
        "(line 154,col 9)-(line 154,col 91)",
        "(line 155,col 9)-(line 155,col 45)",
        "(line 156,col 9)-(line 156,col 20)",
        "(line 157,col 9)-(line 157,col 34)",
        "(line 158,col 9)-(line 158,col 46)",
        "(line 159,col 9)-(line 159,col 23)",
        "(line 160,col 9)-(line 160,col 46)",
        "(line 161,col 9)-(line 161,col 27)",
        "(line 162,col 9)-(line 163,col 50)",
        "(line 164,col 9)-(line 164,col 49)",
        "(line 165,col 9)-(line 165,col 27)",
        "(line 166,col 9)-(line 166,col 35)",
        "(line 167,col 9)-(line 173,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testFill()",
      "begin_line": 179,
      "end_line": 192,
      "comment": "\n     * Test fill\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 46)",
        "(line 182,col 9)-(line 182,col 20)",
        "(line 183,col 9)-(line 183,col 37)",
        "(line 184,col 9)-(line 184,col 21)",
        "(line 185,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 33)",
        "(line 189,col 9)-(line 191,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testProperties()",
      "begin_line": 197,
      "end_line": 204,
      "comment": "\n     * Test getters to make Clover happy\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 46)",
        "(line 200,col 9)-(line 200,col 80)",
        "(line 201,col 9)-(line 201,col 53)",
        "(line 202,col 9)-(line 202,col 40)",
        "(line 203,col 9)-(line 203,col 89)"
      ]
    }
  ]
}