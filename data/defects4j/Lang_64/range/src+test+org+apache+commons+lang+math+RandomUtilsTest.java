{
  "filepath": "/tmp/Lang-64b/src/test/org/apache/commons/lang/math/RandomUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 339,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.RandomUtilsTest(java.lang.String)",
      "begin_line": 33,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.setUp()",
      "begin_line": 37,
      "end_line": 38,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.suite()",
      "begin_line": 40,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 63)",
        "(line 42,col 9)-(line 42,col 43)",
        "(line 43,col 9)-(line 43,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.testNextInt()",
      "begin_line": 47,
      "end_line": 51,
      "comment": " test distribution of nextInt() ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 25)",
        "(line 50,col 9)-(line 50,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.testNextInt2()",
      "begin_line": 54,
      "end_line": 58,
      "comment": " test distribution of nextInt(Random) ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 34)",
        "(line 56,col 9)-(line 56,col 48)",
        "(line 57,col 9)-(line 57,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.testJvmRandomNextInt()",
      "begin_line": 61,
      "end_line": 63,
      "comment": " test distribution of JVMRandom.nextInt() ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.tstNextInt(java.util.Random)",
      "begin_line": 72,
      "end_line": 105,
      "comment": " \n     * Generate 1000 values for nextInt(bound) and compare\n     * the observed frequency counts to expected counts using\n     * a chi-square test.\n     * @param rnd Random to use if not null\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 22)",
        "(line 74,col 9)-(line 74,col 23)",
        "(line 76,col 9)-(line 76,col 34)",
        "(line 77,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 82,col 60)",
        "(line 83,col 9)-(line 83,col 54)",
        "(line 86,col 9)-(line 86,col 18)",
        "(line 87,col 9)-(line 87,col 53)",
        "(line 88,col 9)-(line 88,col 45)",
        "(line 89,col 9)-(line 98,col 9)",
        "(line 102,col 9)-(line 104,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.testNextLong()",
      "begin_line": 108,
      "end_line": 110,
      "comment": " test distribution of nextLong() ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.testNextLong2()",
      "begin_line": 115,
      "end_line": 119,
      "comment": " test distribution of nextLong(Random) BROKEN\n     *  contract of nextLong(Random) is different from\n     * nextLong() ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 34)",
        "(line 117,col 9)-(line 117,col 48)",
        "(line 118,col 9)-(line 118,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.tstNextLong(java.util.Random)",
      "begin_line": 127,
      "end_line": 150,
      "comment": " \n     * Generate 1000 values for nextLong and check that\n     * p(value \u003c long.MAXVALUE/2) ~ 0.5. Use chi-square test\n     * with df \u003d 2-1 \u003d 1  \n     * @param rnd Random to use if not null\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 45)",
        "(line 129,col 9)-(line 129,col 41)",
        "(line 130,col 9)-(line 130,col 24)",
        "(line 131,col 9)-(line 131,col 41)",
        "(line 132,col 9)-(line 143,col 9)",
        "(line 147,col 9)-(line 149,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.testNextBoolean()",
      "begin_line": 154,
      "end_line": 156,
      "comment": " test distribution of nextBoolean() ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.testNextBoolean2()",
      "begin_line": 159,
      "end_line": 163,
      "comment": " test distribution of nextBoolean(Random) ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 34)",
        "(line 161,col 9)-(line 161,col 48)",
        "(line 162,col 9)-(line 162,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.tstNextBoolean(java.util.Random)",
      "begin_line": 171,
      "end_line": 193,
      "comment": " \n     * Generate 1000 values for nextBoolean and check that\n     * p(value \u003d false) ~ 0.5. Use chi-square test\n     * with df \u003d 2-1 \u003d 1  \n     * @param rnd Random to use if not null\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 45)",
        "(line 173,col 9)-(line 173,col 41)",
        "(line 174,col 9)-(line 174,col 31)",
        "(line 175,col 9)-(line 186,col 9)",
        "(line 190,col 9)-(line 192,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.testNextFloat()",
      "begin_line": 196,
      "end_line": 198,
      "comment": " test distribution of nextFloat() ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.testNextFloat2()",
      "begin_line": 201,
      "end_line": 205,
      "comment": " test distribution of nextFloat(Random) ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 34)",
        "(line 203,col 9)-(line 203,col 48)",
        "(line 204,col 9)-(line 204,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.tstNextFloat(java.util.Random)",
      "begin_line": 213,
      "end_line": 235,
      "comment": " \n     * Generate 1000 values for nextFloat and check that\n     * p(value \u003c 0.5) ~ 0.5. Use chi-square test\n     * with df \u003d 2-1 \u003d 1  \n     * @param rnd Random to use if not null\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 45)",
        "(line 215,col 9)-(line 215,col 41)",
        "(line 216,col 9)-(line 216,col 25)",
        "(line 217,col 9)-(line 228,col 9)",
        "(line 232,col 9)-(line 234,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.testNextDouble()",
      "begin_line": 238,
      "end_line": 240,
      "comment": " test distribution of nextDouble() ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.testNextDouble2()",
      "begin_line": 243,
      "end_line": 247,
      "comment": " test distribution of nextDouble(Random) ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 34)",
        "(line 245,col 9)-(line 245,col 48)",
        "(line 246,col 9)-(line 246,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.tstNextDouble(java.util.Random)",
      "begin_line": 255,
      "end_line": 277,
      "comment": " \n     * Generate 1000 values for nextFloat and check that\n     * p(value \u003c 0.5) ~ 0.5. Use chi-square test\n     * with df \u003d 2-1 \u003d 1  \n     * @param rnd Random to use if not null\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 45)",
        "(line 257,col 9)-(line 257,col 41)",
        "(line 258,col 9)-(line 258,col 26)",
        "(line 259,col 9)-(line 270,col 9)",
        "(line 274,col 9)-(line 276,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.testUnimplementedMethods()",
      "begin_line": 280,
      "end_line": 303,
      "comment": " make sure that unimplemented methods fail ",
      "child_ranges": [
        "(line 282,col 9)-(line 287,col 9)",
        "(line 289,col 9)-(line 294,col 9)",
        "(line 296,col 9)-(line 301,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.testIllegalArguments()",
      "begin_line": 306,
      "end_line": 322,
      "comment": " make sure that illegal arguments fail ",
      "child_ranges": [
        "(line 308,col 9)-(line 313,col 9)",
        "(line 315,col 9)-(line 320,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.chiSquare(int[], int[])",
      "begin_line": 329,
      "end_line": 337,
      "comment": "\n     * Computes Chi-Square statistic given observed and expected counts\n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 28)",
        "(line 331,col 9)-(line 331,col 26)",
        "(line 332,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 336,col 21)"
      ]
    }
  ]
}