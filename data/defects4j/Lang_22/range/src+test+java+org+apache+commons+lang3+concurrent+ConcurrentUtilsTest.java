{
  "filepath": "/tmp/Lang-22b/src/test/java/org/apache/commons/lang3/concurrent/ConcurrentUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConcurrentUtilsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 408,
      "comment": "\n * Test class for {@link ConcurrentUtils}.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentExceptionCauseUnchecked()",
      "begin_line": 42,
      "end_line": 45,
      "comment": "\n     * Tests creating a ConcurrentException with a runtime exception as cause.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentExceptionCauseError()",
      "begin_line": 50,
      "end_line": 53,
      "comment": "\n     * Tests creating a ConcurrentException with an error as cause.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentExceptionCauseNull()",
      "begin_line": 58,
      "end_line": 61,
      "comment": "\n     * Tests creating a ConcurrentException with null as cause.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentRuntimeExceptionCauseUnchecked()",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * Tries to create a ConcurrentRuntimeException with a runtime as cause.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentRuntimeExceptionCauseError()",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n     * Tries to create a ConcurrentRuntimeException with an error as cause.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentRuntimeExceptionCauseNull()",
      "begin_line": 82,
      "end_line": 85,
      "comment": "\n     * Tries to create a ConcurrentRuntimeException with null as cause.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseNull()",
      "begin_line": 90,
      "end_line": 93,
      "comment": "\n     * Tests extractCause() for a null exception.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseNullCause()",
      "begin_line": 98,
      "end_line": 102,
      "comment": "\n     * Tests extractCause() if the cause of the passed in exception is null.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 101,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseError()",
      "begin_line": 107,
      "end_line": 116,
      "comment": "\n     * Tests extractCause() if the cause is an error.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 47)",
        "(line 110,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedException()",
      "begin_line": 121,
      "end_line": 130,
      "comment": "\n     * Tests extractCause() if the cause is an unchecked exception.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 60)",
        "(line 124,col 9)-(line 129,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseChecked()",
      "begin_line": 135,
      "end_line": 141,
      "comment": "\n     * Tests extractCause() if the cause is a checked exception.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 45)",
        "(line 138,col 9)-(line 139,col 58)",
        "(line 140,col 9)-(line 140,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedNull()",
      "begin_line": 146,
      "end_line": 149,
      "comment": "\n     * Tests extractCauseUnchecked() for a null exception.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedNullCause()",
      "begin_line": 154,
      "end_line": 158,
      "comment": "\n     * Tests extractCauseUnchecked() if the cause of the passed in exception is null.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 157,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedError()",
      "begin_line": 163,
      "end_line": 172,
      "comment": "\n     * Tests extractCauseUnchecked() if the cause is an error.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 47)",
        "(line 166,col 9)-(line 171,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedUncheckedException()",
      "begin_line": 177,
      "end_line": 186,
      "comment": "\n     * Tests extractCauseUnchecked() if the cause is an unchecked exception.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 60)",
        "(line 180,col 9)-(line 185,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedChecked()",
      "begin_line": 191,
      "end_line": 197,
      "comment": "\n     * Tests extractCauseUnchecked() if the cause is a checked exception.\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 45)",
        "(line 194,col 9)-(line 195,col 67)",
        "(line 196,col 9)-(line 196,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseError()",
      "begin_line": 202,
      "end_line": 211,
      "comment": "\n     * Tests handleCause() if the cause is an error.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 47)",
        "(line 205,col 9)-(line 210,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUncheckedException()",
      "begin_line": 216,
      "end_line": 225,
      "comment": "\n     * Tests handleCause() if the cause is an unchecked exception.\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 60)",
        "(line 219,col 9)-(line 224,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseChecked()",
      "begin_line": 230,
      "end_line": 239,
      "comment": "\n     * Tests handleCause() if the cause is a checked exception.\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 45)",
        "(line 233,col 9)-(line 238,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseNull()",
      "begin_line": 246,
      "end_line": 250,
      "comment": "\n     * Tests handleCause() for a null parameter or a null cause. In this case\n     * the method should do nothing. We can only test that no exception is\n     * thrown.\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 42)",
        "(line 249,col 9)-(line 249,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUncheckedError()",
      "begin_line": 255,
      "end_line": 264,
      "comment": "\n     * Tests handleCauseUnchecked() if the cause is an error.\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 47)",
        "(line 258,col 9)-(line 263,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUncheckedUncheckedException()",
      "begin_line": 269,
      "end_line": 278,
      "comment": "\n     * Tests handleCauseUnchecked() if the cause is an unchecked exception.\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 60)",
        "(line 272,col 9)-(line 277,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUncheckedChecked()",
      "begin_line": 283,
      "end_line": 292,
      "comment": "\n     * Tests handleCauseUnchecked() if the cause is a checked exception.\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 45)",
        "(line 286,col 9)-(line 291,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUncheckedNull()",
      "begin_line": 299,
      "end_line": 304,
      "comment": "\n     * Tests handleCauseUnchecked() for a null parameter or a null cause. In\n     * this case the method should do nothing. We can only test that no\n     * exception is thrown.\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 51)",
        "(line 302,col 9)-(line 303,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testInitializeNull()",
      "begin_line": 310,
      "end_line": 313,
      "comment": "\n     * Tests initialize() for a null argument.\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testInitialize()",
      "begin_line": 318,
      "end_line": 329,
      "comment": "\n     * Tests a successful initialize() operation.\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 322,col 57)",
        "(line 323,col 9)-(line 323,col 43)",
        "(line 324,col 9)-(line 324,col 54)",
        "(line 325,col 9)-(line 325,col 30)",
        "(line 326,col 9)-(line 327,col 35)",
        "(line 328,col 9)-(line 328,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testInitializeUncheckedNull()",
      "begin_line": 334,
      "end_line": 337,
      "comment": "\n     * Tests initializeUnchecked() for a null argument.\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testInitializeUnchecked()",
      "begin_line": 342,
      "end_line": 353,
      "comment": "\n     * Tests a successful initializeUnchecked() operation.\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 346,col 57)",
        "(line 347,col 9)-(line 347,col 43)",
        "(line 348,col 9)-(line 348,col 54)",
        "(line 349,col 9)-(line 349,col 30)",
        "(line 350,col 9)-(line 351,col 44)",
        "(line 352,col 9)-(line 352,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testInitializeUncheckedEx()",
      "begin_line": 358,
      "end_line": 373,
      "comment": "\n     * Tests whether exceptions are correctly handled by initializeUnchecked().\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 362,col 57)",
        "(line 363,col 9)-(line 363,col 48)",
        "(line 364,col 9)-(line 364,col 77)",
        "(line 365,col 9)-(line 365,col 30)",
        "(line 366,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 372,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConstantFuture_Integer()",
      "begin_line": 379,
      "end_line": 390,
      "comment": "\n     * Tests constant future.\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 39)",
        "(line 382,col 9)-(line 382,col 69)",
        "(line 383,col 9)-(line 383,col 34)",
        "(line 384,col 9)-(line 384,col 38)",
        "(line 385,col 9)-(line 385,col 60)",
        "(line 386,col 9)-(line 386,col 48)",
        "(line 387,col 9)-(line 387,col 40)",
        "(line 388,col 9)-(line 388,col 39)",
        "(line 389,col 9)-(line 389,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConstantFuture_null()",
      "begin_line": 395,
      "end_line": 406,
      "comment": "\n     * Tests constant future.\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 29)",
        "(line 398,col 9)-(line 398,col 69)",
        "(line 399,col 9)-(line 399,col 34)",
        "(line 400,col 9)-(line 400,col 38)",
        "(line 401,col 9)-(line 401,col 60)",
        "(line 402,col 9)-(line 402,col 48)",
        "(line 403,col 9)-(line 403,col 40)",
        "(line 404,col 9)-(line 404,col 39)",
        "(line 405,col 9)-(line 405,col 40)"
      ]
    }
  ]
}