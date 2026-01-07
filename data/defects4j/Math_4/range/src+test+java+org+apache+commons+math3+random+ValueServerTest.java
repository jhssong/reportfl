{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/random/ValueServerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ValueServerTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 241,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vs"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServerTest.setUp()",
      "begin_line": 42,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 44)",
        "(line 45,col 9)-(line 45,col 57)",
        "(line 46,col 9)-(line 46,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServerTest.testNextDigest()",
      "begin_line": 54,
      "end_line": 79,
      "comment": "\n      * Generate 1000 random values and make sure they look OK.\u003cbr\u003e\n      * Note that there is a non-zero (but very small) probability that\n      * these tests will fail even if the code is working as designed.\n      ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 26)",
        "(line 57,col 9)-(line 57,col 31)",
        "(line 58,col 9)-(line 58,col 33)",
        "(line 59,col 9)-(line 60,col 51)",
        "(line 61,col 9)-(line 61,col 58)",
        "(line 62,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 66,col 83)",
        "(line 67,col 9)-(line 68,col 23)",
        "(line 70,col 9)-(line 70,col 36)",
        "(line 71,col 9)-(line 71,col 40)",
        "(line 72,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 83)",
        "(line 77,col 9)-(line 78,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServerTest.testFixedSeed()",
      "begin_line": 85,
      "end_line": 95,
      "comment": "\n     * Verify that when provided with fixed seeds, stochastic modes\n     * generate fixed sequences.  Verifies the fix for MATH-654.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 52)",
        "(line 88,col 9)-(line 88,col 57)",
        "(line 89,col 9)-(line 89,col 42)",
        "(line 90,col 9)-(line 90,col 42)",
        "(line 91,col 9)-(line 91,col 61)",
        "(line 92,col 9)-(line 92,col 66)",
        "(line 93,col 9)-(line 93,col 63)",
        "(line 94,col 9)-(line 94,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServerTest.checkFixedSeed(org.apache.commons.math3.random.ValueServer, int)",
      "begin_line": 101,
      "end_line": 113,
      "comment": "\n     * Do the check for {@link #testFixedSeed()}\n     * @param mode ValueServer mode\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 33)",
        "(line 103,col 9)-(line 103,col 34)",
        "(line 104,col 9)-(line 104,col 47)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 33)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServerTest.testNextDigestFail()",
      "begin_line": 119,
      "end_line": 125,
      "comment": "\n      * Make sure exception thrown if digest getNext is attempted\n      * before loading empiricalDistribution.\n      ",
      "child_ranges": [
        "(line 121,col 9)-(line 124,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServerTest.testEmptyReplayFile()",
      "begin_line": 127,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 137,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServerTest.testEmptyDigestFile()",
      "begin_line": 140,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 150,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServerTest.testReplay()",
      "begin_line": 158,
      "end_line": 180,
      "comment": "\n     * Test ValueServer REPLAY_MODE using values in testData file.\u003cbr\u003e\n     * Check that the values 1,2,1001,1002 match data file values 1 and 2.\n     * the sample data file.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 50)",
        "(line 161,col 9)-(line 161,col 52)",
        "(line 162,col 9)-(line 162,col 34)",
        "(line 163,col 9)-(line 163,col 35)",
        "(line 164,col 9)-(line 164,col 44)",
        "(line 165,col 9)-(line 165,col 29)",
        "(line 166,col 9)-(line 166,col 36)",
        "(line 167,col 9)-(line 167,col 67)",
        "(line 168,col 9)-(line 168,col 36)",
        "(line 169,col 9)-(line 169,col 68)",
        "(line 170,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 36)",
        "(line 174,col 9)-(line 174,col 67)",
        "(line 175,col 9)-(line 175,col 36)",
        "(line 176,col 9)-(line 176,col 68)",
        "(line 177,col 9)-(line 177,col 29)",
        "(line 179,col 9)-(line 179,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServerTest.testModes()",
      "begin_line": 185,
      "end_line": 209,
      "comment": "\n     * Test other ValueServer modes\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 46)",
        "(line 188,col 9)-(line 188,col 20)",
        "(line 189,col 9)-(line 189,col 91)",
        "(line 190,col 9)-(line 190,col 45)",
        "(line 191,col 9)-(line 191,col 20)",
        "(line 192,col 9)-(line 192,col 34)",
        "(line 193,col 9)-(line 193,col 46)",
        "(line 194,col 9)-(line 194,col 23)",
        "(line 195,col 9)-(line 195,col 46)",
        "(line 196,col 9)-(line 196,col 27)",
        "(line 197,col 9)-(line 198,col 50)",
        "(line 199,col 9)-(line 199,col 49)",
        "(line 200,col 9)-(line 200,col 27)",
        "(line 201,col 9)-(line 201,col 35)",
        "(line 202,col 9)-(line 208,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServerTest.testFill()",
      "begin_line": 214,
      "end_line": 227,
      "comment": "\n     * Test fill\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 46)",
        "(line 217,col 9)-(line 217,col 20)",
        "(line 218,col 9)-(line 218,col 37)",
        "(line 219,col 9)-(line 219,col 21)",
        "(line 220,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 33)",
        "(line 224,col 9)-(line 226,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServerTest.testProperties()",
      "begin_line": 232,
      "end_line": 239,
      "comment": "\n     * Test getters to make Clover happy\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 46)",
        "(line 235,col 9)-(line 235,col 80)",
        "(line 236,col 9)-(line 236,col 53)",
        "(line 237,col 9)-(line 237,col 40)",
        "(line 238,col 9)-(line 238,col 89)"
      ]
    }
  ]
}