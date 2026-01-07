{
  "filepath": "/tmp/Lang-20b/src/test/java/org/apache/commons/lang3/concurrent/BasicThreadFactoryTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BasicThreadFactoryTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 302,
      "comment": "\n * Test class for {@code BasicThreadFactory}.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "PATTERN"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Constant for the test naming pattern. "
    },
    {
      "type": "field",
      "varNames": [
        "builder"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The builder for creating a thread factory. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.setUp()",
      "begin_line": 45,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.checkFactoryDefaults(org.apache.commons.lang3.concurrent.BasicThreadFactory)",
      "begin_line": 55,
      "end_line": 62,
      "comment": "\n     * Tests the default options of a thread factory.\n     *\n     * @param factory the factory to be checked\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 71)",
        "(line 57,col 9)-(line 58,col 48)",
        "(line 59,col 9)-(line 59,col 60)",
        "(line 60,col 9)-(line 60,col 65)",
        "(line 61,col 9)-(line 61,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testBuildDefaults()",
      "begin_line": 67,
      "end_line": 71,
      "comment": "\n     * Tests the default values used by the builder.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 53)",
        "(line 70,col 9)-(line 70,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testBuildNamingPatternNull()",
      "begin_line": 76,
      "end_line": 79,
      "comment": "\n     * Tries to set a null naming pattern.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testBuildWrappedFactoryNull()",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * Tries to set a null wrapped factory.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testBuildUncaughtExceptionHandlerNull()",
      "begin_line": 92,
      "end_line": 95,
      "comment": "\n     * Tries to set a null exception handler.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testBuilderReset()",
      "begin_line": 100,
      "end_line": 115,
      "comment": "\n     * Tests the reset() method of the builder.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 80)",
        "(line 103,col 9)-(line 104,col 67)",
        "(line 105,col 9)-(line 105,col 51)",
        "(line 106,col 9)-(line 108,col 48)",
        "(line 109,col 9)-(line 109,col 24)",
        "(line 110,col 9)-(line 110,col 53)",
        "(line 111,col 9)-(line 111,col 38)",
        "(line 112,col 9)-(line 113,col 38)",
        "(line 114,col 9)-(line 114,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testBuilderResetAfterBuild()",
      "begin_line": 120,
      "end_line": 125,
      "comment": "\n     * Tests whether reset() is automatically called after build().\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 123,col 61)",
        "(line 124,col 9)-(line 124,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testNewThreadNamingPattern()",
      "begin_line": 130,
      "end_line": 148,
      "comment": "\n     * Tests whether the naming pattern is applied to new threads.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 73)",
        "(line 133,col 9)-(line 133,col 57)",
        "(line 134,col 9)-(line 134,col 29)",
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 36)",
        "(line 139,col 9)-(line 140,col 48)",
        "(line 141,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testNewThreadNoNamingPattern()",
      "begin_line": 154,
      "end_line": 166,
      "comment": "\n     * Tests whether the thread name is not modified if no naming pattern is\n     * set.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 73)",
        "(line 157,col 9)-(line 157,col 57)",
        "(line 158,col 9)-(line 158,col 50)",
        "(line 159,col 9)-(line 159,col 36)",
        "(line 160,col 9)-(line 160,col 59)",
        "(line 161,col 9)-(line 161,col 36)",
        "(line 162,col 9)-(line 162,col 77)",
        "(line 163,col 9)-(line 163,col 60)",
        "(line 164,col 9)-(line 164,col 60)",
        "(line 165,col 9)-(line 165,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.checkDaemonFlag(boolean)",
      "begin_line": 173,
      "end_line": 184,
      "comment": "\n     * Helper method for testing whether the daemon flag is taken into account.\n     *\n     * @param flag the value of the flag\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 73)",
        "(line 175,col 9)-(line 175,col 57)",
        "(line 176,col 9)-(line 176,col 32)",
        "(line 177,col 9)-(line 177,col 59)",
        "(line 178,col 9)-(line 178,col 36)",
        "(line 179,col 9)-(line 180,col 30)",
        "(line 181,col 9)-(line 181,col 60)",
        "(line 182,col 9)-(line 182,col 62)",
        "(line 183,col 9)-(line 183,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testNewThreadDaemonTrue()",
      "begin_line": 189,
      "end_line": 192,
      "comment": "\n     * Tests whether daemon threads can be created.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testNewThreadDaemonFalse()",
      "begin_line": 197,
      "end_line": 200,
      "comment": "\n     * Tests whether the daemon status of new threads can be turned off.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testNewThreadNoDaemonFlag()",
      "begin_line": 206,
      "end_line": 223,
      "comment": "\n     * Tests whether the daemon flag is not touched on newly created threads if\n     * it is not specified.\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 73)",
        "(line 209,col 9)-(line 209,col 58)",
        "(line 210,col 9)-(line 210,col 58)",
        "(line 211,col 9)-(line 211,col 33)",
        "(line 212,col 9)-(line 212,col 33)",
        "(line 213,col 9)-(line 213,col 27)",
        "(line 214,col 9)-(line 214,col 61)",
        "(line 215,col 9)-(line 215,col 61)",
        "(line 216,col 9)-(line 216,col 41)",
        "(line 217,col 9)-(line 217,col 77)",
        "(line 218,col 9)-(line 218,col 64)",
        "(line 219,col 9)-(line 219,col 54)",
        "(line 220,col 9)-(line 220,col 64)",
        "(line 221,col 9)-(line 221,col 54)",
        "(line 222,col 9)-(line 222,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testNewThreadPriority()",
      "begin_line": 228,
      "end_line": 241,
      "comment": "\n     * Tests whether the priority is set on newly created threads.\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 73)",
        "(line 231,col 9)-(line 231,col 57)",
        "(line 232,col 9)-(line 232,col 32)",
        "(line 233,col 9)-(line 233,col 59)",
        "(line 234,col 9)-(line 234,col 36)",
        "(line 235,col 9)-(line 235,col 54)",
        "(line 236,col 9)-(line 237,col 34)",
        "(line 238,col 9)-(line 238,col 60)",
        "(line 239,col 9)-(line 239,col 66)",
        "(line 240,col 9)-(line 240,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testNewThreadNoPriority()",
      "begin_line": 247,
      "end_line": 260,
      "comment": "\n     * Tests whether the original priority is not changed if no priority is\n     * specified.\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 73)",
        "(line 250,col 9)-(line 250,col 57)",
        "(line 251,col 9)-(line 251,col 57)",
        "(line 252,col 9)-(line 252,col 32)",
        "(line 253,col 9)-(line 253,col 35)",
        "(line 254,col 9)-(line 254,col 59)",
        "(line 255,col 9)-(line 255,col 36)",
        "(line 256,col 9)-(line 256,col 77)",
        "(line 257,col 9)-(line 257,col 60)",
        "(line 258,col 9)-(line 258,col 69)",
        "(line 259,col 9)-(line 259,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testNewThreadExHandler()",
      "begin_line": 265,
      "end_line": 280,
      "comment": "\n     * Tests whether the exception handler is set if one is provided.\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 73)",
        "(line 268,col 9)-(line 268,col 57)",
        "(line 269,col 9)-(line 270,col 67)",
        "(line 271,col 9)-(line 271,col 32)",
        "(line 272,col 9)-(line 272,col 59)",
        "(line 273,col 9)-(line 273,col 45)",
        "(line 274,col 9)-(line 275,col 59)",
        "(line 276,col 9)-(line 276,col 60)",
        "(line 277,col 9)-(line 278,col 48)",
        "(line 279,col 9)-(line 279,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testNewThreadNoExHandler()",
      "begin_line": 286,
      "end_line": 301,
      "comment": "\n     * Tests whether the original exception hander is not touched if none is\n     * specified.\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 73)",
        "(line 289,col 9)-(line 289,col 57)",
        "(line 290,col 9)-(line 291,col 67)",
        "(line 292,col 9)-(line 292,col 32)",
        "(line 293,col 9)-(line 293,col 47)",
        "(line 294,col 9)-(line 294,col 59)",
        "(line 295,col 9)-(line 295,col 45)",
        "(line 296,col 9)-(line 296,col 77)",
        "(line 297,col 9)-(line 297,col 60)",
        "(line 298,col 9)-(line 299,col 48)",
        "(line 300,col 9)-(line 300,col 45)"
      ]
    }
  ]
}