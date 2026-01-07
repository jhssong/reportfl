{
  "filepath": "/tmp/Lang-28b/src/test/java/org/apache/commons/lang3/concurrent/ConcurrentUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConcurrentUtilsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 407,
      "comment": "\n * Test class for {@link ConcurrentUtils}.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentExceptionCauseUnchecked()",
      "begin_line": 40,
      "end_line": 43,
      "comment": "\n     * Tests creating a ConcurrentException with a runtime exception as cause.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentExceptionCauseError()",
      "begin_line": 48,
      "end_line": 51,
      "comment": "\n     * Tests creating a ConcurrentException with an error as cause.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentExceptionCauseNull()",
      "begin_line": 56,
      "end_line": 59,
      "comment": "\n     * Tests creating a ConcurrentException with null as cause.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentRuntimeExceptionCauseUnchecked()",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * Tries to create a ConcurrentRuntimeException with a runtime as cause.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentRuntimeExceptionCauseError()",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Tries to create a ConcurrentRuntimeException with an error as cause.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentRuntimeExceptionCauseNull()",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * Tries to create a ConcurrentRuntimeException with null as cause.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseNull()",
      "begin_line": 88,
      "end_line": 91,
      "comment": "\n     * Tests extractCause() for a null exception.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseNullCause()",
      "begin_line": 96,
      "end_line": 100,
      "comment": "\n     * Tests extractCause() if the cause of the passed in exception is null.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 99,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseError()",
      "begin_line": 105,
      "end_line": 114,
      "comment": "\n     * Tests extractCause() if the cause is an error.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 47)",
        "(line 108,col 9)-(line 113,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedException()",
      "begin_line": 119,
      "end_line": 128,
      "comment": "\n     * Tests extractCause() if the cause is an unchecked exception.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 60)",
        "(line 122,col 9)-(line 127,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseChecked()",
      "begin_line": 133,
      "end_line": 139,
      "comment": "\n     * Tests extractCause() if the cause is a checked exception.\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 45)",
        "(line 136,col 9)-(line 137,col 58)",
        "(line 138,col 9)-(line 138,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedNull()",
      "begin_line": 144,
      "end_line": 147,
      "comment": "\n     * Tests extractCauseUnchecked() for a null exception.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedNullCause()",
      "begin_line": 152,
      "end_line": 156,
      "comment": "\n     * Tests extractCauseUnchecked() if the cause of the passed in exception is null.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 155,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedError()",
      "begin_line": 161,
      "end_line": 170,
      "comment": "\n     * Tests extractCauseUnchecked() if the cause is an error.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 47)",
        "(line 164,col 9)-(line 169,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedUncheckedException()",
      "begin_line": 175,
      "end_line": 184,
      "comment": "\n     * Tests extractCauseUnchecked() if the cause is an unchecked exception.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 60)",
        "(line 178,col 9)-(line 183,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedChecked()",
      "begin_line": 189,
      "end_line": 195,
      "comment": "\n     * Tests extractCauseUnchecked() if the cause is a checked exception.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 45)",
        "(line 192,col 9)-(line 193,col 67)",
        "(line 194,col 9)-(line 194,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseError()",
      "begin_line": 200,
      "end_line": 209,
      "comment": "\n     * Tests handleCause() if the cause is an error.\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 47)",
        "(line 203,col 9)-(line 208,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUncheckedException()",
      "begin_line": 214,
      "end_line": 223,
      "comment": "\n     * Tests handleCause() if the cause is an unchecked exception.\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 60)",
        "(line 217,col 9)-(line 222,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseChecked()",
      "begin_line": 228,
      "end_line": 237,
      "comment": "\n     * Tests handleCause() if the cause is a checked exception.\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 45)",
        "(line 231,col 9)-(line 236,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseNull()",
      "begin_line": 244,
      "end_line": 248,
      "comment": "\n     * Tests handleCause() for a null parameter or a null cause. In this case\n     * the method should do nothing. We can only test that no exception is\n     * thrown.\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 42)",
        "(line 247,col 9)-(line 247,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUncheckedError()",
      "begin_line": 253,
      "end_line": 262,
      "comment": "\n     * Tests handleCauseUnchecked() if the cause is an error.\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 47)",
        "(line 256,col 9)-(line 261,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUncheckedUncheckedException()",
      "begin_line": 267,
      "end_line": 277,
      "comment": "\n     * Tests handleCauseUnchecked() if the cause is an unchecked exception.\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 60)",
        "(line 271,col 9)-(line 276,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUncheckedChecked()",
      "begin_line": 282,
      "end_line": 291,
      "comment": "\n     * Tests handleCauseUnchecked() if the cause is a checked exception.\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 45)",
        "(line 285,col 9)-(line 290,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUncheckedNull()",
      "begin_line": 298,
      "end_line": 303,
      "comment": "\n     * Tests handleCauseUnchecked() for a null parameter or a null cause. In\n     * this case the method should do nothing. We can only test that no\n     * exception is thrown.\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 51)",
        "(line 301,col 9)-(line 302,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testInitializeNull()",
      "begin_line": 309,
      "end_line": 312,
      "comment": "\n     * Tests initialize() for a null argument.\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testInitialize()",
      "begin_line": 317,
      "end_line": 328,
      "comment": "\n     * Tests a successful initialize() operation.\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 321,col 57)",
        "(line 322,col 9)-(line 322,col 43)",
        "(line 323,col 9)-(line 323,col 54)",
        "(line 324,col 9)-(line 324,col 30)",
        "(line 325,col 9)-(line 326,col 35)",
        "(line 327,col 9)-(line 327,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testInitializeUncheckedNull()",
      "begin_line": 333,
      "end_line": 336,
      "comment": "\n     * Tests initializeUnchecked() for a null argument.\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testInitializeUnchecked()",
      "begin_line": 341,
      "end_line": 352,
      "comment": "\n     * Tests a successful initializeUnchecked() operation.\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 345,col 57)",
        "(line 346,col 9)-(line 346,col 43)",
        "(line 347,col 9)-(line 347,col 54)",
        "(line 348,col 9)-(line 348,col 30)",
        "(line 349,col 9)-(line 350,col 44)",
        "(line 351,col 9)-(line 351,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testInitializeUncheckedEx()",
      "begin_line": 357,
      "end_line": 372,
      "comment": "\n     * Tests whether exceptions are correctly handled by initializeUnchecked().\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 361,col 57)",
        "(line 362,col 9)-(line 362,col 48)",
        "(line 363,col 9)-(line 363,col 77)",
        "(line 364,col 9)-(line 364,col 30)",
        "(line 365,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 371,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConstantFuture_Integer()",
      "begin_line": 378,
      "end_line": 389,
      "comment": "\n     * Tests constant future.\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 39)",
        "(line 381,col 9)-(line 381,col 69)",
        "(line 382,col 9)-(line 382,col 42)",
        "(line 383,col 9)-(line 383,col 38)",
        "(line 384,col 9)-(line 384,col 60)",
        "(line 385,col 9)-(line 385,col 48)",
        "(line 386,col 9)-(line 386,col 48)",
        "(line 387,col 9)-(line 387,col 47)",
        "(line 388,col 9)-(line 388,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConstantFuture_null()",
      "begin_line": 394,
      "end_line": 405,
      "comment": "\n     * Tests constant future.\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 29)",
        "(line 397,col 9)-(line 397,col 69)",
        "(line 398,col 9)-(line 398,col 42)",
        "(line 399,col 9)-(line 399,col 38)",
        "(line 400,col 9)-(line 400,col 60)",
        "(line 401,col 9)-(line 401,col 48)",
        "(line 402,col 9)-(line 402,col 48)",
        "(line 403,col 9)-(line 403,col 47)",
        "(line 404,col 9)-(line 404,col 48)"
      ]
    }
  ]
}